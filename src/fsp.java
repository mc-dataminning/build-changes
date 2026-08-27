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

public class fsp {
   private static final fsp a = new fsp("") {
      @Override
      public void a(evg $$0) {
      }

      @Override
      public void a(fsp.c $$0, String $$1, String $$2) {
      }
   };
   private static final Logger b = LogUtils.getLogger();
   private static final Gson c = new GsonBuilder().create();
   private final Path d;
   @Nullable
   private fsp.b e;

   fsp(String $$0) {
      this.d = evg.O().p.toPath().resolve($$0);
   }

   public static fsp a(@Nullable String $$0) {
      return $$0 == null ? a : new fsp($$0);
   }

   public void a(fsp.c $$0, String $$1, String $$2) {
      this.e = new fsp.b($$0, $$1, $$2);
   }

   public void a(evg $$0) {
      if ($$0.q != null && this.e != null) {
         ac.g().execute(() -> {
            try {
               Files.deleteIfExists(this.d);
            } catch (IOException var3) {
               b.error("Failed to delete quickplay log file {}", this.d, var3);
            }

            fsp.a $$2 = new fsp.a(this.e, Instant.now(), $$0.q.l());
            Codec.list(fsp.a.a).encodeStart(JsonOps.INSTANCE, List.of($$2)).resultOrPartial(ac.a("Quick Play: ", b::error)).ifPresent($$0xx -> {
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

   static record a(fsp.b b, Instant c, ctl d) {
      public static final Codec<fsp.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fsp.b.a.forGetter(fsp.a::a), atv.m.fieldOf("lastPlayedTime").forGetter(fsp.a::b), ctl.f.fieldOf("gamemode").forGetter(fsp.a::c))
               .apply($$0, fsp.a::new)
      );

      public fsp.b a() {
         return this.b;
      }

      public Instant b() {
         return this.c;
      }

      public ctl c() {
         return this.d;
      }
   }

   static record b(fsp.c b, String c, String d) {
      public static final MapCodec<fsp.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  fsp.c.d.fieldOf("type").forGetter(fsp.b::a), atv.o.fieldOf("id").forGetter(fsp.b::b), Codec.STRING.fieldOf("name").forGetter(fsp.b::c)
               )
               .apply($$0, fsp.b::new)
      );

      public fsp.c a() {
         return this.b;
      }

      public String b() {
         return this.c;
      }

      public String c() {
         return this.d;
      }
   }

   public static enum c implements avj {
      a("singleplayer"),
      b("multiplayer"),
      c("realms");

      static final Codec<fsp.c> d = avj.a(fsp.c::values);
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
