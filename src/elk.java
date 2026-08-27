import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public record elk(ij<cti> b, List<Float> c) implements elu {
   public static final Codec<elk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(kf.f.r().fieldOf("enchantment").forGetter(elk::c), Codec.FLOAT.listOf().fieldOf("chances").forGetter(elk::d)).apply($$0, elk::new)
   );

   @Override
   public elv b() {
      return elw.l;
   }

   @Override
   public Set<eld<?>> a() {
      return ImmutableSet.of(elg.i);
   }

   public boolean a(eiv $$0) {
      coz $$1 = $$0.c(elg.i);
      int $$2 = $$1 != null ? ctj.a(this.b.a(), $$1) : 0;
      float $$3 = this.c.get(Math.min($$2, this.c.size() - 1));
      return $$0.b().i() < $$3;
   }

   public static elu.a a(cti $$0, float... $$1) {
      List<Float> $$2 = new ArrayList<>($$1.length);

      for (float $$3 : $$1) {
         $$2.add($$3);
      }

      return () -> new elk($$0.k(), $$2);
   }

   public ij<cti> c() {
      return this.b;
   }

   public List<Float> d() {
      return this.c;
   }
}
