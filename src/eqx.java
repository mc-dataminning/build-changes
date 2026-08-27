import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public record eqx(iv<cxn> b, List<Float> c) implements erh {
   public static final Codec<eqx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(lc.f.r().fieldOf("enchantment").forGetter(eqx::c), Codec.FLOAT.listOf().fieldOf("chances").forGetter(eqx::d)).apply($$0, eqx::new)
   );

   @Override
   public eri b() {
      return erj.l;
   }

   @Override
   public Set<eqq<?>> a() {
      return ImmutableSet.of(eqt.i);
   }

   public boolean a(eoa $$0) {
      csd $$1 = $$0.c(eqt.i);
      int $$2 = $$1 != null ? cxo.a(this.b.a(), $$1) : 0;
      float $$3 = this.c.get(Math.min($$2, this.c.size() - 1));
      return $$0.b().i() < $$3;
   }

   public static erh.a a(cxn $$0, float... $$1) {
      List<Float> $$2 = new ArrayList<>($$1.length);

      for (float $$3 : $$1) {
         $$2.add($$3);
      }

      return () -> new eqx($$0.k(), $$2);
   }

   public iv<cxn> c() {
      return this.b;
   }

   public List<Float> d() {
      return this.c;
   }
}
