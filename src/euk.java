import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public record euk(ja<dad> b, List<Float> c) implements euu {
   public static final Codec<euk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(lh.f.r().fieldOf("enchantment").forGetter(euk::c), Codec.FLOAT.listOf().fieldOf("chances").forGetter(euk::d)).apply($$0, euk::new)
   );

   @Override
   public euv b() {
      return euw.m;
   }

   @Override
   public Set<eud<?>> a() {
      return ImmutableSet.of(eug.i);
   }

   public boolean a(erp $$0) {
      cuh $$1 = $$0.c(eug.i);
      int $$2 = $$1 != null ? dae.a(this.b.a(), $$1) : 0;
      float $$3 = this.c.get(Math.min($$2, this.c.size() - 1));
      return $$0.b().i() < $$3;
   }

   public static euu.a a(dad $$0, float... $$1) {
      List<Float> $$2 = new ArrayList<>($$1.length);

      for (float $$3 : $$1) {
         $$2.add($$3);
      }

      return () -> new euk($$0.l(), $$2);
   }

   public ja<dad> c() {
      return this.b;
   }

   public List<Float> d() {
      return this.c;
   }
}
