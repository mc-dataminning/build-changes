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

public class fsj {
   private static final fsj a = new fsj("") {
      @Override
      public void a(eva $$0) {
      }

      @Override
      public void a(fsj.c $$0, String $$1, String $$2) {
      }
   };
   private static final Logger b = LogUtils.getLogger();
   private static final Gson c = new GsonBuilder().create();
   private final Path d;
   @Nullable
   private fsj.b e;

   fsj(String $$0) {
      this.d = eva.N().p.toPath().resolve($$0);
   }

   public static fsj a(@Nullable String $$0) {
      return $$0 == null ? a : new fsj($$0);
   }

   public void a(fsj.c $$0, String $$1, String $$2) {
      this.e = new fsj.b($$0, $$1, $$2);
   }

   public void a(eva $$0) {
      if ($$0.q != null && this.e != null) {
         ac.g().execute(() -> {
            try {
               Files.deleteIfExists(this.d);
            } catch (IOException var3) {
               b.error("Failed to delete quickplay log file {}", this.d, var3);
            }

            fsj.a $$2 = new fsj.a(this.e, Instant.now(), $$0.q.l());
            Codec.list(fsj.a.a).encodeStart(JsonOps.INSTANCE, List.of($$2)).resultOrPartial(ac.a("Quick Play: ", b::error)).ifPresent($$0xx -> {
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

   static record a(fsj.b b, Instant c, ctf d) {
      public static final Codec<fsj.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fsj.b.a.forGetter(fsj.a::a), atq.m.fieldOf("lastPlayedTime").forGetter(fsj.a::b), ctf.f.fieldOf("gamemode").forGetter(fsj.a::c))
               .apply($$0, fsj.a::new)
      );

      public fsj.b a() {
         return this.b;
      }

      public Instant b() {
         return this.c;
      }

      public ctf c() {
         return this.d;
      }
   }

   static record b(fsj.c b, String c, String d) {
      public static final MapCodec<fsj.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  fsj.c.d.fieldOf("type").forGetter(fsj.b::a), atq.o.fieldOf("id").forGetter(fsj.b::b), Codec.STRING.fieldOf("name").forGetter(fsj.b::c)
               )
               .apply($$0, fsj.b::new)
      );

      public fsj.c a() {
         return this.b;
      }

      public String b() {
         return this.c;
      }

      public String c() {
         return this.d;
      }
   }

   public static enum c implements ave {
      a("singleplayer"),
      b("multiplayer"),
      c("realms");

      static final Codec<fsj.c> d = ave.a(fsj.c::values);
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
