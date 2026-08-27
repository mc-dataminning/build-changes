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

public class ftd {
   private static final ftd a = new ftd("") {
      @Override
      public void a(evr $$0) {
      }

      @Override
      public void a(ftd.c $$0, String $$1, String $$2) {
      }
   };
   private static final Logger b = LogUtils.getLogger();
   private static final Gson c = new GsonBuilder().create();
   private final Path d;
   @Nullable
   private ftd.b e;

   ftd(String $$0) {
      this.d = evr.O().p.toPath().resolve($$0);
   }

   public static ftd a(@Nullable String $$0) {
      return $$0 == null ? a : new ftd($$0);
   }

   public void a(ftd.c $$0, String $$1, String $$2) {
      this.e = new ftd.b($$0, $$1, $$2);
   }

   public void a(evr $$0) {
      if ($$0.q != null && this.e != null) {
         ac.g().execute(() -> {
            try {
               Files.deleteIfExists(this.d);
            } catch (IOException var3) {
               b.error("Failed to delete quickplay log file {}", this.d, var3);
            }

            ftd.a $$2 = new ftd.a(this.e, Instant.now(), $$0.q.j());
            Codec.list(ftd.a.a).encodeStart(JsonOps.INSTANCE, List.of($$2)).resultOrPartial(ac.a("Quick Play: ", b::error)).ifPresent($$0xx -> {
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

   static record a(ftd.b b, Instant c, ctu d) {
      public static final Codec<ftd.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ftd.b.a.forGetter(ftd.a::a), atx.m.fieldOf("lastPlayedTime").forGetter(ftd.a::b), ctu.f.fieldOf("gamemode").forGetter(ftd.a::c))
               .apply($$0, ftd.a::new)
      );

      public ftd.b a() {
         return this.b;
      }

      public Instant b() {
         return this.c;
      }

      public ctu c() {
         return this.d;
      }
   }

   static record b(ftd.c b, String c, String d) {
      public static final MapCodec<ftd.b> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  ftd.c.d.fieldOf("type").forGetter(ftd.b::a), atx.o.fieldOf("id").forGetter(ftd.b::b), Codec.STRING.fieldOf("name").forGetter(ftd.b::c)
               )
               .apply($$0, ftd.b::new)
      );

      public ftd.c a() {
         return this.b;
      }

      public String b() {
         return this.c;
      }

      public String c() {
         return this.d;
      }
   }

   public static enum c implements avl {
      a("singleplayer"),
      b("multiplayer"),
      c("realms");

      static final Codec<ftd.c> d = avl.a(ftd.c::values);
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
