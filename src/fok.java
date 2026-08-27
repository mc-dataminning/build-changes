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

public class fok {
   private static final fok a = new fok("") {
      @Override
      public void a(ero $$0) {
      }

      @Override
      public void a(fok.c $$0, String $$1, String $$2) {
      }
   };
   private static final Logger b = LogUtils.getLogger();
   private static final Gson c = new GsonBuilder().create();
   private final Path d;
   @Nullable
   private fok.b e;

   fok(String $$0) {
      this.d = ero.O().p.toPath().resolve($$0);
   }

   public static fok a(@Nullable String $$0) {
      return $$0 == null ? a : new fok($$0);
   }

   public void a(fok.c $$0, String $$1, String $$2) {
      this.e = new fok.b($$0, $$1, $$2);
   }

   public void a(ero $$0) {
      if ($$0.q != null && this.e != null) {
         ac.g().execute(() -> {
            try {
               Files.deleteIfExists(this.d);
            } catch (IOException var3) {
               b.error("Failed to delete quickplay log file {}", this.d, var3);
            }

            fok.a $$2 = new fok.a(this.e, Instant.now(), $$0.q.l());
            Codec.list(fok.a.a).encodeStart(JsonOps.INSTANCE, List.of($$2)).resultOrPartial(ac.a("Quick Play: ", b::error)).ifPresent($$0xx -> {
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

   static record a(fok.b b, Instant c, cqw d) {
      public static final Codec<fok.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fok.b.a.forGetter(fok.a::a), asg.m.fieldOf("lastPlayedTime").forGetter(fok.a::b), cqw.f.fieldOf("gamemode").forGetter(fok.a::c))
               .apply($$0, fok.a::new)
      );

      public fok.b a() {
         return this.b;
      }

      public Instant b() {
         return this.c;
      }

      public cqw c() {
         return this.d;
      }
   }

   static record b(fok.c b, String c, String d) {
      public static final MapCodec<fok.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  fok.c.d.fieldOf("type").forGetter(fok.b::a), asg.o.fieldOf("id").forGetter(fok.b::b), Codec.STRING.fieldOf("name").forGetter(fok.b::c)
               )
               .apply($$0, fok.b::new)
      );

      public fok.c a() {
         return this.b;
      }

      public String b() {
         return this.c;
      }

      public String c() {
         return this.d;
      }
   }

   public static enum c implements atr {
      a("singleplayer"),
      b("multiplayer"),
      c("realms");

      static final Codec<fok.c> d = atr.a(fok.c::values);
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
