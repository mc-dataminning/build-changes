import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Instant;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fmq {
   private static final fmq a = new fmq("") {
      @Override
      public void a(eqn $$0) {
      }

      @Override
      public void a(fmq.c $$0, String $$1, String $$2) {
      }
   };
   private static final Logger b = LogUtils.getLogger();
   private static final Gson c = new GsonBuilder().create();
   private final Path d;
   @Nullable
   private fmq.b e;

   fmq(String $$0) {
      this.d = eqn.N().p.toPath().resolve($$0);
   }

   public static fmq a(@Nullable String $$0) {
      return $$0 == null ? a : new fmq($$0);
   }

   public void a(fmq.c $$0, String $$1, String $$2) {
      this.e = new fmq.b($$0, $$1, $$2);
   }

   public void a(eqn $$0) {
      if ($$0.r != null && this.e != null) {
         ac.g().execute(() -> {
            try {
               Files.deleteIfExists(this.d);
            } catch (IOException var3) {
               b.error("Failed to delete quickplay log file {}", this.d, var3);
            }

            fmq.a $$2 = new fmq.a(this.e, Instant.now(), $$0.r.l());
            Codec.list(fmq.a.a).encodeStart(JsonOps.INSTANCE, List.of($$2)).resultOrPartial(ac.a("Quick Play: ", b::error)).ifPresent($$0xx -> {
               try {
                  Files.createDirectories(this.d.getParent());
                  Files.writeString(this.d, c.toJson($$0xx));
               } catch (IOException var3x) {
                  b.error("Failed to write to quickplay log file {}", this.d, var3x);
               }
            });
         });
      } else {
         b.error("Failed to log session for quickplay. Missing world data or gamemode");
      }
   }

   static record a(fmq.b b, Instant c, cph d) {
      public static final Codec<fmq.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fmq.b.a.forGetter(fmq.a::a), aqw.m.fieldOf("lastPlayedTime").forGetter(fmq.a::b), cph.f.fieldOf("gamemode").forGetter(fmq.a::c))
               .apply($$0, fmq.a::new)
      );

      public fmq.b a() {
         return this.b;
      }

      public Instant b() {
         return this.c;
      }

      public cph c() {
         return this.d;
      }
   }

   static record b(fmq.c b, String c, String d) {
      public static final MapCodec<fmq.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  fmq.c.d.fieldOf("type").forGetter(fmq.b::a), Codec.STRING.fieldOf("id").forGetter(fmq.b::b), Codec.STRING.fieldOf("name").forGetter(fmq.b::c)
               )
               .apply($$0, fmq.b::new)
      );

      public fmq.c a() {
         return this.b;
      }

      public String b() {
         return this.c;
      }

      public String c() {
         return this.d;
      }
   }

   public static enum c implements asf {
      a("singleplayer"),
      b("multiplayer"),
      c("realms");

      static final Codec<fmq.c> d = asf.a(fmq.c::values);
      private final String e;

      private c(String $$0) {
         this.e = $$0;
      }

      @Override
      public String c() {
         return this.e;
      }
   }
}
