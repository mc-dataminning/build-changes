import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public record ehm(ib<cpu> b, List<Float> c) implements ehw {
   public static final Codec<ehm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jy.g.r().fieldOf("enchantment").forGetter(ehm::c), Codec.FLOAT.listOf().fieldOf("chances").forGetter(ehm::d)).apply($$0, ehm::new)
   );

   @Override
   public ehx b() {
      return ehy.l;
   }

   @Override
   public Set<ehf<?>> a() {
      return ImmutableSet.of(ehi.i);
   }

   public boolean a(eex $$0) {
      clj $$1 = $$0.c(ehi.i);
      int $$2 = $$1 != null ? cpw.a(this.b.a(), $$1) : 0;
      float $$3 = this.c.get(Math.min($$2, this.c.size() - 1));
      return $$0.b().i() < $$3;
   }

   public static ehw.a a(cpu $$0, float... $$1) {
      List<Float> $$2 = new ArrayList<>($$1.length);

      for (float $$3 : $$1) {
         $$2.add($$3);
      }

      return () -> new ehm($$0.j(), $$2);
   }

   public ib<cpu> c() {
      return this.b;
   }

   public List<Float> d() {
      return this.c;
   }
}
