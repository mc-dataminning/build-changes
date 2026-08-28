import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eun(czt b, jj<czm> c) implements euh {
   public static final MapCodec<eun> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(czt.b.fieldOf("chance").forGetter(eun::c), czm.c.fieldOf("enchantment").forGetter(eun::d)).apply($$0, eun::new)
   );

   @Override
   public eui b() {
      return euj.e;
   }

   @Override
   public Set<etp<?>> a() {
      return ImmutableSet.of(ets.d);
   }

   public boolean a(eqw $$0) {
      bsh $$1 = $$0.c(ets.d);
      int $$3;
      if ($$1 instanceof btc $$2) {
         $$3 = czo.a(this.c, $$2);
      } else {
         $$3 = 0;
      }

      return $$0.b().i() < this.b.a($$3);
   }

   public static euh.a a(jl.a $$0, float $$1, float $$2) {
      jl.b<czm> $$3 = $$0.b(lr.aK);
      return () -> new eun(new czt.e($$1 + $$2, $$2), $$3.b(czr.s));
   }

   public czt c() {
      return this.b;
   }

   public jj<czm> d() {
      return this.c;
   }
}
