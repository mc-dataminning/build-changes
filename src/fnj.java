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

public class fnj {
   private static final fnj a = new fnj("") {
      @Override
      public void a(eqq $$0) {
      }

      @Override
      public void a(fnj.c $$0, String $$1, String $$2) {
      }
   };
   private static final Logger b = LogUtils.getLogger();
   private static final Gson c = new GsonBuilder().create();
   private final Path d;
   @Nullable
   private fnj.b e;

   fnj(String $$0) {
      this.d = eqq.O().p.toPath().resolve($$0);
   }

   public static fnj a(@Nullable String $$0) {
      return $$0 == null ? a : new fnj($$0);
   }

   public void a(fnj.c $$0, String $$1, String $$2) {
      this.e = new fnj.b($$0, $$1, $$2);
   }

   public void a(eqq $$0) {
      if ($$0.q != null && this.e != null) {
         ac.g().execute(() -> {
            try {
               Files.deleteIfExists(this.d);
            } catch (IOException var3) {
               b.error("Failed to delete quickplay log file {}", this.d, var3);
            }

            fnj.a $$2 = new fnj.a(this.e, Instant.now(), $$0.q.l());
            Codec.list(fnj.a.a).encodeStart(JsonOps.INSTANCE, List.of($$2)).resultOrPartial(ac.a("Quick Play: ", b::error)).ifPresent($$0xx -> {
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

   static record a(fnj.b b, Instant c, cpn d) {
      public static final Codec<fnj.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fnj.b.a.forGetter(fnj.a::a), arb.m.fieldOf("lastPlayedTime").forGetter(fnj.a::b), cpn.f.fieldOf("gamemode").forGetter(fnj.a::c))
               .apply($$0, fnj.a::new)
      );

      public fnj.b a() {
         return this.b;
      }

      public Instant b() {
         return this.c;
      }

      public cpn c() {
         return this.d;
      }
   }

   static record b(fnj.c b, String c, String d) {
      public static final MapCodec<fnj.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  fnj.c.d.fieldOf("type").forGetter(fnj.b::a), Codec.STRING.fieldOf("id").forGetter(fnj.b::b), Codec.STRING.fieldOf("name").forGetter(fnj.b::c)
               )
               .apply($$0, fnj.b::new)
      );

      public fnj.c a() {
         return this.b;
      }

      public String b() {
         return this.c;
      }

      public String c() {
         return this.d;
      }
   }

   public static enum c implements ask {
      a("singleplayer"),
      b("multiplayer"),
      c("realms");

      static final Codec<fnj.c> d = ask.a(fnj.c::values);
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
