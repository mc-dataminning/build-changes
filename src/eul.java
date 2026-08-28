import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eul(czs b, jj<czl> c) implements euf {
   public static final MapCodec<eul> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(czs.b.fieldOf("chance").forGetter(eul::c), czl.b.fieldOf("enchantment").forGetter(eul::d)).apply($$0, eul::new)
   );

   @Override
   public eug b() {
      return euh.e;
   }

   @Override
   public Set<etn<?>> a() {
      return ImmutableSet.of(etq.d);
   }

   public boolean a(equ $$0) {
      bsg $$1 = $$0.c(etq.d);
      int $$3;
      if ($$1 instanceof btb $$2) {
         $$3 = czn.a(this.c, $$2);
      } else {
         $$3 = 0;
      }

      return $$0.b().i() < this.b.a($$3);
   }

   public static euf.a a(jl.a $$0, float $$1, float $$2) {
      jl.b<czl> $$3 = $$0.b(lr.aK);
      return () -> new eul(new czs.e($$1 + $$2, $$2), $$3.b(czq.s));
   }

   public czs c() {
      return this.b;
   }

   public jj<czl> d() {
      return this.c;
   }
}
