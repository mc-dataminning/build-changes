import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

public record akh(xc b, Optional<akh.b> c, Optional<akh.c> d, Optional<akh.a> e, boolean f) {
   public static final Codec<akh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               xe.a.lenientOptionalFieldOf("description", xb.a).forGetter(akh::a),
               akh.b.a.lenientOptionalFieldOf("players").forGetter(akh::b),
               akh.c.a.lenientOptionalFieldOf("version").forGetter(akh::c),
               akh.a.a.lenientOptionalFieldOf("favicon").forGetter(akh::d),
               Codec.BOOL.lenientOptionalFieldOf("enforcesSecureChat", false).forGetter(akh::e)
            )
            .apply($$0, akh::new)
   );

   public xc a() {
      return this.b;
   }

   public Optional<akh.b> b() {
      return this.c;
   }

   public Optional<akh.c> c() {
      return this.d;
   }

   public Optional<akh.a> d() {
      return this.e;
   }

   public boolean e() {
      return this.f;
   }

   public static record a(byte[] b) {
      private static final String c = "data:image/png;base64,";
      public static final Codec<akh.a> a = Codec.STRING.comapFlatMap($$0 -> {
         if (!$$0.startsWith("data:image/png;base64,")) {
            return DataResult.error(() -> "Unknown format");
         } else {
            try {
               String $$1 = $$0.substring("data:image/png;base64,".length()).replaceAll("\n", "");
               byte[] $$2 = Base64.getDecoder().decode($$1.getBytes(StandardCharsets.UTF_8));
               return DataResult.success(new akh.a($$2));
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
         $$0 -> $$0.group(ka.d.fieldOf("id").forGetter(GameProfile::getId), Codec.STRING.fieldOf("name").forGetter(GameProfile::getName))
               .apply($$0, GameProfile::new)
      );
      public static final Codec<akh.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.INT.fieldOf("max").forGetter(akh.b::a),
                  Codec.INT.fieldOf("online").forGetter(akh.b::b),
                  e.listOf().lenientOptionalFieldOf("sample", List.of()).forGetter(akh.b::c)
               )
               .apply($$0, akh.b::new)
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
      public static final Codec<akh.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(akh.c::b), Codec.INT.fieldOf("protocol").forGetter(akh.c::c)).apply($$0, akh.c::new)
      );

      public static akh.c a() {
         ah $$0 = ac.b();
         return new akh.c($$0.c(), $$0.e());
      }
   }
}
