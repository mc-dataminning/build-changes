import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dal(ty d, Optional<dal.a> e) {
   public static final String a = "entity";
   public static final Codec<dal> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(ty.a.fieldOf("entity").forGetter($$0x -> $$0x.d), dal.a.a.optionalFieldOf("custom_spawn_rules").forGetter($$0x -> $$0x.e))
            .apply($$0, dal::new)
   );
   public static final Codec<bna<dal>> c = bna.a(b);

   public dal() {
      this(new ty(), Optional.empty());
   }

   public dal(ty d, Optional<dal.a> e) {
      if (d.e("id")) {
         akf $$2 = akf.a(d.l("id"));
         if ($$2 != null) {
            d.a("id", $$2.toString());
         } else {
            d.r("id");
         }
      }

      this.d = d;
      this.e = e;
   }

   public ty a() {
      return this.d;
   }

   public Optional<dal.a> b() {
      return this.e;
   }

   public ty c() {
      return this.d;
   }

   public Optional<dal.a> d() {
      return this.e;
   }

   public static record a(axo<Integer> b, axo<Integer> c) {
      private static final axo<Integer> d = new axo<>(0, 15);
      public static final Codec<dal.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(a("block_light_limit").forGetter($$0x -> $$0x.b), a("sky_light_limit").forGetter($$0x -> $$0x.c)).apply($$0, dal.a::new)
      );

      private static DataResult<axo<Integer>> a(axo<Integer> $$0) {
         return !d.a($$0) ? DataResult.error(() -> "Light values must be withing range " + d) : DataResult.success($$0);
      }

      private static MapCodec<axo<Integer>> a(String $$0) {
         return axe.a(axo.a.optionalFieldOf($$0, d), dal.a::a);
      }

      public boolean a(im $$0, aqe $$1) {
         return this.b.a($$1.a(dad.b, $$0)) && this.c.a($$1.a(dad.a, $$0));
      }

      public axo<Integer> a() {
         return this.b;
      }

      public axo<Integer> b() {
         return this.c;
      }
   }
}
