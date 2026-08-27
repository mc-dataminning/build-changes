import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

public record adu(tf b, Optional<adu.b> c, Optional<adu.c> d, Optional<adu.a> e, boolean f) {
   public static final Codec<adu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               aqy.b.optionalFieldOf("description", te.a).forGetter(adu::a),
               adu.b.a.optionalFieldOf("players").forGetter(adu::b),
               adu.c.a.optionalFieldOf("version").forGetter(adu::c),
               adu.a.a.optionalFieldOf("favicon").forGetter(adu::d),
               Codec.BOOL.optionalFieldOf("enforcesSecureChat", false).forGetter(adu::e)
            )
            .apply($$0, adu::new)
   );

   public tf a() {
      return this.b;
   }

   public Optional<adu.b> b() {
      return this.c;
   }

   public Optional<adu.c> c() {
      return this.d;
   }

   public Optional<adu.a> d() {
      return this.e;
   }

   public boolean e() {
      return this.f;
   }

   public static record a(byte[] b) {
      private static final String c = "data:image/png;base64,";
      public static final Codec<adu.a> a = Codec.STRING.comapFlatMap($$0 -> {
         if (!$$0.startsWith("data:image/png;base64,")) {
            return DataResult.error(() -> "Unknown format");
         } else {
            try {
               String $$1 = $$0.substring("data:image/png;base64,".length()).replaceAll("\n", "");
               byte[] $$2 = Base64.getDecoder().decode($$1.getBytes(StandardCharsets.UTF_8));
               return DataResult.success(new adu.a($$2));
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
         $$0 -> $$0.group(hy.b.fieldOf("id").forGetter(GameProfile::getId), Codec.STRING.fieldOf("name").forGetter(GameProfile::getName))
               .apply($$0, GameProfile::new)
      );
      public static final Codec<adu.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.INT.fieldOf("max").forGetter(adu.b::a),
                  Codec.INT.fieldOf("online").forGetter(adu.b::b),
                  e.listOf().optionalFieldOf("sample", List.of()).forGetter(adu.b::c)
               )
               .apply($$0, adu.b::new)
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
      public static final Codec<adu.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(adu.c::b), Codec.INT.fieldOf("protocol").forGetter(adu.c::c)).apply($$0, adu.c::new)
      );

      public static adu.c a() {
         ad $$0 = aa.b();
         return new adu.c($$0.c(), $$0.e());
      }
   }
}
