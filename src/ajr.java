import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

public record ajr(wo b, Optional<ajr.b> c, Optional<ajr.c> d, Optional<ajr.a> e, boolean f) {
   public static final Codec<ajr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               wq.a.lenientOptionalFieldOf("description", wn.a).forGetter(ajr::a),
               ajr.b.a.lenientOptionalFieldOf("players").forGetter(ajr::b),
               ajr.c.a.lenientOptionalFieldOf("version").forGetter(ajr::c),
               ajr.a.a.lenientOptionalFieldOf("favicon").forGetter(ajr::d),
               Codec.BOOL.lenientOptionalFieldOf("enforcesSecureChat", false).forGetter(ajr::e)
            )
            .apply($$0, ajr::new)
   );

   public wo a() {
      return this.b;
   }

   public Optional<ajr.b> b() {
      return this.c;
   }

   public Optional<ajr.c> c() {
      return this.d;
   }

   public Optional<ajr.a> d() {
      return this.e;
   }

   public boolean e() {
      return this.f;
   }

   public static record a(byte[] b) {
      private static final String c = "data:image/png;base64,";
      public static final Codec<ajr.a> a = Codec.STRING.comapFlatMap($$0 -> {
         if (!$$0.startsWith("data:image/png;base64,")) {
            return DataResult.error(() -> "Unknown format");
         } else {
            try {
               String $$1 = $$0.substring("data:image/png;base64,".length()).replaceAll("\n", "");
               byte[] $$2 = Base64.getDecoder().decode($$1.getBytes(StandardCharsets.UTF_8));
               return DataResult.success(new ajr.a($$2));
            } catch (IllegalArgumentException var3) {
               return DataResult.error(() -> "Malformed base64 server icon");
            }
         }
      }, $$0 -> "data:image/png;base64," + new String(Base64.getEncoder().encode($$0.b), StandardCharsets.UTF_8));

      public byte[] a() {
         return this.b;
      }
   }

   public static record b(int b, int c, List<GameProfile> d) {
      private static final Codec<GameProfile> e = RecordCodecBuilder.create(
         $$0 -> $$0.group(kl.d.fieldOf("id").forGetter(GameProfile::getId), Codec.STRING.fieldOf("name").forGetter(GameProfile::getName))
               .apply($$0, GameProfile::new)
      );
      public static final Codec<ajr.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.INT.fieldOf("max").forGetter(ajr.b::a),
                  Codec.INT.fieldOf("online").forGetter(ajr.b::b),
                  e.listOf().lenientOptionalFieldOf("sample", List.of()).forGetter(ajr.b::c)
               )
               .apply($$0, ajr.b::new)
      );

      public int a() {
         return this.b;
      }

      public int b() {
         return this.c;
      }

      public List<GameProfile> c() {
         return this.d;
      }
   }

   public static record c(String b, int c) {
      public static final Codec<ajr.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(ajr.c::b), Codec.INT.fieldOf("protocol").forGetter(ajr.c::c)).apply($$0, ajr.c::new)
      );

      public static ajr.c a() {
         ag $$0 = ab.b();
         return new ajr.c($$0.c(), $$0.e());
      }
   }
}
