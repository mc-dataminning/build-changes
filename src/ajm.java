import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

public record ajm(wx b, Optional<ajm.b> c, Optional<ajm.c> d, Optional<ajm.a> e, boolean f) {
   public static final Codec<ajm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               wz.a.lenientOptionalFieldOf("description", ww.a).forGetter(ajm::a),
               ajm.b.a.lenientOptionalFieldOf("players").forGetter(ajm::b),
               ajm.c.a.lenientOptionalFieldOf("version").forGetter(ajm::c),
               ajm.a.a.lenientOptionalFieldOf("favicon").forGetter(ajm::d),
               Codec.BOOL.lenientOptionalFieldOf("enforcesSecureChat", false).forGetter(ajm::e)
            )
            .apply($$0, ajm::new)
   );

   public wx a() {
      return this.b;
   }

   public Optional<ajm.b> b() {
      return this.c;
   }

   public Optional<ajm.c> c() {
      return this.d;
   }

   public Optional<ajm.a> d() {
      return this.e;
   }

   public boolean e() {
      return this.f;
   }

   public static record a(byte[] b) {
      private static final String c = "data:image/png;base64,";
      public static final Codec<ajm.a> a = Codec.STRING.comapFlatMap($$0 -> {
         if (!$$0.startsWith("data:image/png;base64,")) {
            return DataResult.error(() -> "Unknown format");
         } else {
            try {
               String $$1 = $$0.substring("data:image/png;base64,".length()).replaceAll("\n", "");
               byte[] $$2 = Base64.getDecoder().decode($$1.getBytes(StandardCharsets.UTF_8));
               return DataResult.success(new ajm.a($$2));
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
         $$0 -> $$0.group(jr.d.fieldOf("id").forGetter(GameProfile::getId), Codec.STRING.fieldOf("name").forGetter(GameProfile::getName))
               .apply($$0, GameProfile::new)
      );
      public static final Codec<ajm.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.INT.fieldOf("max").forGetter(ajm.b::a),
                  Codec.INT.fieldOf("online").forGetter(ajm.b::b),
                  e.listOf().lenientOptionalFieldOf("sample", List.of()).forGetter(ajm.b::c)
               )
               .apply($$0, ajm.b::new)
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
      public static final Codec<ajm.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(ajm.c::b), Codec.INT.fieldOf("protocol").forGetter(ajm.c::c)).apply($$0, ajm.c::new)
      );

      public static ajm.c a() {
         ad $$0 = aa.b();
         return new ajm.c($$0.c(), $$0.e());
      }
   }
}
