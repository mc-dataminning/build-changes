import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

public record aki(xl b, Optional<aki.b> c, Optional<aki.c> d, Optional<aki.a> e, boolean f) {
   public static final Codec<aki> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               xn.a.lenientOptionalFieldOf("description", xk.a).forGetter(aki::a),
               aki.b.a.lenientOptionalFieldOf("players").forGetter(aki::b),
               aki.c.a.lenientOptionalFieldOf("version").forGetter(aki::c),
               aki.a.a.lenientOptionalFieldOf("favicon").forGetter(aki::d),
               Codec.BOOL.lenientOptionalFieldOf("enforcesSecureChat", false).forGetter(aki::e)
            )
            .apply($$0, aki::new)
   );

   public xl a() {
      return this.b;
   }

   public Optional<aki.b> b() {
      return this.c;
   }

   public Optional<aki.c> c() {
      return this.d;
   }

   public Optional<aki.a> d() {
      return this.e;
   }

   public boolean e() {
      return this.f;
   }

   public static record a(byte[] b) {
      private static final String c = "data:image/png;base64,";
      public static final Codec<aki.a> a = Codec.STRING.comapFlatMap($$0 -> {
         if (!$$0.startsWith("data:image/png;base64,")) {
            return DataResult.error(() -> "Unknown format");
         } else {
            try {
               String $$1 = $$0.substring("data:image/png;base64,".length()).replaceAll("\n", "");
               byte[] $$2 = Base64.getDecoder().decode($$1.getBytes(StandardCharsets.UTF_8));
               return DataResult.success(new aki.a($$2));
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
         $$0 -> $$0.group(kk.d.fieldOf("id").forGetter(GameProfile::getId), Codec.STRING.fieldOf("name").forGetter(GameProfile::getName))
               .apply($$0, GameProfile::new)
      );
      public static final Codec<aki.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.INT.fieldOf("max").forGetter(aki.b::a),
                  Codec.INT.fieldOf("online").forGetter(aki.b::b),
                  e.listOf().lenientOptionalFieldOf("sample", List.of()).forGetter(aki.b::c)
               )
               .apply($$0, aki.b::new)
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
      public static final Codec<aki.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(aki.c::b), Codec.INT.fieldOf("protocol").forGetter(aki.c::c)).apply($$0, aki.c::new)
      );

      public static aki.c a() {
         af $$0 = ab.b();
         return new aki.c($$0.c(), $$0.e());
      }
   }
}
