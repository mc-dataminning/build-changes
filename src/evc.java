import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record evc(dah b, jm<daa> c) implements euw {
   public static final MapCodec<evc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dah.b.fieldOf("chance").forGetter(evc::c), daa.c.fieldOf("enchantment").forGetter(evc::d)).apply($$0, evc::new)
   );

   @Override
   public eux b() {
      return euy.e;
   }

   @Override
   public Set<eue<?>> a() {
      return ImmutableSet.of(euh.d);
   }

   public boolean a(erl $$0) {
      bsq $$1 = $$0.c(euh.d);
      int $$3;
      if ($$1 instanceof btl $$2) {
         $$3 = dac.a(this.c, $$2);
      } else {
         $$3 = 0;
      }

      return $$0.b().i() < this.b.a($$3);
   }

   public static euw.a a(jo.a $$0, float $$1, float $$2) {
      jo.b<daa> $$3 = $$0.b(lu.aL);
      return () -> new evc(new dah.e($$1 + $$2, $$2), $$3.b(daf.s));
   }

   public dah c() {
      return this.b;
   }

   public jm<daa> d() {
      return this.c;
   }
}
