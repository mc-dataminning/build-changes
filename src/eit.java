import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public record eit(ie<cqs> b, List<Float> c) implements ejd {
   public static final Codec<eit> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(kb.f.r().fieldOf("enchantment").forGetter(eit::c), Codec.FLOAT.listOf().fieldOf("chances").forGetter(eit::d)).apply($$0, eit::new)
   );

   @Override
   public eje b() {
      return ejf.l;
   }

   @Override
   public Set<eim<?>> a() {
      return ImmutableSet.of(eip.i);
   }

   public boolean a(ege $$0) {
      cmh $$1 = $$0.c(eip.i);
      int $$2 = $$1 != null ? cqu.a(this.b.a(), $$1) : 0;
      float $$3 = this.c.get(Math.min($$2, this.c.size() - 1));
      return $$0.b().i() < $$3;
   }

   public static ejd.a a(cqs $$0, float... $$1) {
      List<Float> $$2 = new ArrayList<>($$1.length);

      for (float $$3 : $$1) {
         $$2.add($$3);
      }

      return () -> new eit($$0.j(), $$2);
   }

   public ie<cqs> c() {
      return this.b;
   }

   public List<Float> d() {
      return this.c;
   }
}
