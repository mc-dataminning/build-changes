import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

public record ako(xg b, Optional<ako.b> c, Optional<ako.c> d, Optional<ako.a> e, boolean f) {
   public static final Codec<ako> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               xi.a.lenientOptionalFieldOf("description", xf.a).forGetter(ako::a),
               ako.b.a.lenientOptionalFieldOf("players").forGetter(ako::b),
               ako.c.a.lenientOptionalFieldOf("version").forGetter(ako::c),
               ako.a.a.lenientOptionalFieldOf("favicon").forGetter(ako::d),
               Codec.BOOL.lenientOptionalFieldOf("enforcesSecureChat", false).forGetter(ako::e)
            )
            .apply($$0, ako::new)
   );

   public xg a() {
      return this.b;
   }

   public Optional<ako.b> b() {
      return this.c;
   }

   public Optional<ako.c> c() {
      return this.d;
   }

   public Optional<ako.a> d() {
      return this.e;
   }

   public boolean e() {
      return this.f;
   }

   public static record a(byte[] b) {
      private static final String c = "data:image/png;base64,";
      public static final Codec<ako.a> a = Codec.STRING.comapFlatMap($$0 -> {
         if (!$$0.startsWith("data:image/png;base64,")) {
            return DataResult.error(() -> "Unknown format");
         } else {
            try {
               String $$1 = $$0.substring("data:image/png;base64,".length()).replaceAll("\n", "");
               byte[] $$2 = Base64.getDecoder().decode($$1.getBytes(StandardCharsets.UTF_8));
               return DataResult.success(new ako.a($$2));
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
      public static final Codec<ako.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.INT.fieldOf("max").forGetter(ako.b::a),
                  Codec.INT.fieldOf("online").forGetter(ako.b::b),
                  e.listOf().lenientOptionalFieldOf("sample", List.of()).forGetter(ako.b::c)
               )
               .apply($$0, ako.b::new)
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
      public static final Codec<ako.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(ako.c::b), Codec.INT.fieldOf("protocol").forGetter(ako.c::c)).apply($$0, ako.c::new)
      );

      public static ako.c a() {
         ah $$0 = ac.b();
         return new ako.c($$0.c(), $$0.e());
      }
   }
}
