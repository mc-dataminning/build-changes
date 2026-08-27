import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public record efx(ib<cot> b, List<Float> c) implements egh {
   public static final Codec<efx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jy.g.r().fieldOf("enchantment").forGetter(efx::c), Codec.FLOAT.listOf().fieldOf("chances").forGetter(efx::d)).apply($$0, efx::new)
   );

   @Override
   public egi b() {
      return egj.l;
   }

   @Override
   public Set<efq<?>> a() {
      return ImmutableSet.of(eft.i);
   }

   public boolean a(edi $$0) {
      ckj $$1 = $$0.c(eft.i);
      int $$2 = $$1 != null ? cov.a(this.b.a(), $$1) : 0;
      float $$3 = this.c.get(Math.min($$2, this.c.size() - 1));
      return $$0.b().i() < $$3;
   }

   public static egh.a a(cot $$0, float... $$1) {
      List<Float> $$2 = new ArrayList<>($$1.length);

      for (float $$3 : $$1) {
         $$2.add($$3);
      }

      return () -> new efx($$0.j(), $$2);
   }

   public ib<cot> c() {
      return this.b;
   }

   public List<Float> d() {
      return this.c;
   }
}
