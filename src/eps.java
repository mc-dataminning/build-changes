import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public record eps(il<cwq> b, List<Float> c) implements eqc {
   public static final Codec<eps> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(kr.f.r().fieldOf("enchantment").forGetter(eps::c), Codec.FLOAT.listOf().fieldOf("chances").forGetter(eps::d)).apply($$0, eps::new)
   );

   @Override
   public eqd b() {
      return eqe.l;
   }

   @Override
   public Set<epl<?>> a() {
      return ImmutableSet.of(epo.i);
   }

   public boolean a(enb $$0) {
      crj $$1 = $$0.c(epo.i);
      int $$2 = $$1 != null ? cwr.a(this.b.a(), $$1) : 0;
      float $$3 = this.c.get(Math.min($$2, this.c.size() - 1));
      return $$0.b().i() < $$3;
   }

   public static eqc.a a(cwq $$0, float... $$1) {
      List<Float> $$2 = new ArrayList<>($$1.length);

      for (float $$3 : $$1) {
         $$2.add($$3);
      }

      return () -> new eps($$0.k(), $$2);
   }

   public il<cwq> c() {
      return this.b;
   }

   public List<Float> d() {
      return this.c;
   }
}
