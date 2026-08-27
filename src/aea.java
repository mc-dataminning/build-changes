import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

public record aea(tl b, Optional<aea.b> c, Optional<aea.c> d, Optional<aea.a> e, boolean f) {
   public static final Codec<aea> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               tn.a.optionalFieldOf("description", tk.a).forGetter(aea::a),
               aea.b.a.optionalFieldOf("players").forGetter(aea::b),
               aea.c.a.optionalFieldOf("version").forGetter(aea::c),
               aea.a.a.optionalFieldOf("favicon").forGetter(aea::d),
               Codec.BOOL.optionalFieldOf("enforcesSecureChat", false).forGetter(aea::e)
            )
            .apply($$0, aea::new)
   );

   public tl a() {
      return this.b;
   }

   public Optional<aea.b> b() {
      return this.c;
   }

   public Optional<aea.c> c() {
      return this.d;
   }

   public Optional<aea.a> d() {
      return this.e;
   }

   public boolean e() {
      return this.f;
   }

   public static record a(byte[] b) {
      private static final String c = "data:image/png;base64,";
      public static final Codec<aea.a> a = Codec.STRING.comapFlatMap($$0 -> {
         if (!$$0.startsWith("data:image/png;base64,")) {
            return DataResult.error(() -> "Unknown format");
         } else {
            try {
               String $$1 = $$0.substring("data:image/png;base64,".length()).replaceAll("\n", "");
               byte[] $$2 = Base64.getDecoder().decode($$1.getBytes(StandardCharsets.UTF_8));
               return DataResult.success(new aea.a($$2));
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
         $$0 -> $$0.group(hx.b.fieldOf("id").forGetter(GameProfile::getId), Codec.STRING.fieldOf("name").forGetter(GameProfile::getName))
               .apply($$0, GameProfile::new)
      );
      public static final Codec<aea.b> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
                  Codec.INT.fieldOf("max").forGetter(aea.b::a),
                  Codec.INT.fieldOf("online").forGetter(aea.b::b),
                  e.listOf().optionalFieldOf("sample", List.of()).forGetter(aea.b::c)
               )
               .apply($$0, aea.b::new)
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
      public static final Codec<aea.c> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.STRING.fieldOf("name").forGetter(aea.c::b), Codec.INT.fieldOf("protocol").forGetter(aea.c::c)).apply($$0, aea.c::new)
      );

      public static aea.c a() {
         ad $$0 = aa.b();
         return new aea.c($$0.c(), $$0.e());
      }
   }
}
