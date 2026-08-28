import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dcx(tx d, Optional<dcx.a> e, Optional<bsp> f) {
   public static final String a = "entity";
   public static final Codec<dcx> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               tx.a.fieldOf("entity").forGetter($$0x -> $$0x.d),
               dcx.a.a.optionalFieldOf("custom_spawn_rules").forGetter($$0x -> $$0x.e),
               bsp.b.optionalFieldOf("equipment").forGetter($$0x -> $$0x.f)
            )
            .apply($$0, dcx::new)
   );
   public static final Codec<boq<dcx>> c = boq.a(b);

   public dcx() {
      this(new tx(), Optional.empty(), Optional.empty());
   }

   public dcx(tx d, Optional<dcx.a> e, Optional<bsp> f) {
      if (d.e("id")) {
         akk $$3 = akk.a(d.l("id"));
         if ($$3 != null) {
            d.a("id", $$3.toString());
         } else {
            d.r("id");
         }
      }

      this.d = d;
      this.e = e;
      this.f = f;
   }

   public tx a() {
      return this.d;
   }

   public Optional<dcx.a> b() {
      return this.e;
   }

   public Optional<bsp> c() {
      return this.f;
   }

   public static record a(axy<Integer> b, axy<Integer> c) {
      private static final axy<Integer> d = new axy<>(0, 15);
      public static final Codec<dcx.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(a("block_light_limit").forGetter($$0x -> $$0x.b), a("sky_light_limit").forGetter($$0x -> $$0x.c)).apply($$0, dcx.a::new)
      );

      private static DataResult<axy<Integer>> a(axy<Integer> $$0) {
         return !d.a($$0) ? DataResult.error(() -> "Light values must be withing range " + d) : DataResult.success($$0);
      }

      private static MapCodec<axy<Integer>> a(String $$0) {
         return axy.a.lenientOptionalFieldOf($$0, d).validate(dcx.a::a);
      }

      public boolean a(ja $$0, aqm $$1) {
         return this.b.a($$1.a(dco.b, $$0)) && this.c.a($$1.a(dco.a, $$0));
      }

      public axy<Integer> a() {
         return this.b;
      }

      public axy<Integer> b() {
         return this.c;
      }
   }
}
