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

public class fmv {
   private static final fmv a = new fmv("") {
      @Override
      public void a(eqm $$0) {
      }

      @Override
      public void a(fmv.c $$0, String $$1, String $$2) {
      }
   };
   private static final Logger b = LogUtils.getLogger();
   private static final Gson c = new GsonBuilder().create();
   private final Path d;
   @Nullable
   private fmv.b e;

   fmv(String $$0) {
      this.d = eqm.O().p.toPath().resolve($$0);
   }

   public static fmv a(@Nullable String $$0) {
      return $$0 == null ? a : new fmv($$0);
   }

   public void a(fmv.c $$0, String $$1, String $$2) {
      this.e = new fmv.b($$0, $$1, $$2);
   }

   public void a(eqm $$0) {
      if ($$0.t != null && this.e != null) {
         ac.g().execute(() -> {
            try {
               Files.deleteIfExists(this.d);
            } catch (IOException var3) {
               b.error("Failed to delete quickplay log file {}", this.d, var3);
            }

            fmv.a $$2 = new fmv.a(this.e, Instant.now(), $$0.t.l());
            Codec.list(fmv.a.a).encodeStart(JsonOps.INSTANCE, List.of($$2)).resultOrPartial(ac.a("Quick Play: ", b::error)).ifPresent($$0xx -> {
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

   static record a(fmv.b b, Instant c, cpj d) {
      public static final Codec<fmv.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fmv.b.a.forGetter(fmv.a::a), aqy.m.fieldOf("lastPlayedTime").forGetter(fmv.a::b), cpj.f.fieldOf("gamemode").forGetter(fmv.a::c))
               .apply($$0, fmv.a::new)
      );

      public fmv.b a() {
         return this.b;
      }

      public Instant b() {
         return this.c;
      }

      public cpj c() {
         return this.d;
      }
   }

   static record b(fmv.c b, String c, String d) {
      public static final MapCodec<fmv.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  fmv.c.d.fieldOf("type").forGetter(fmv.b::a), Codec.STRING.fieldOf("id").forGetter(fmv.b::b), Codec.STRING.fieldOf("name").forGetter(fmv.b::c)
               )
               .apply($$0, fmv.b::new)
      );

      public fmv.c a() {
         return this.b;
      }

      public String b() {
         return this.c;
      }

      public String c() {
         return this.d;
      }
   }

   public static enum c implements ash {
      a("singleplayer"),
      b("multiplayer"),
      c("realms");

      static final Codec<fmv.c> d = ash.a(fmv.c::values);
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
