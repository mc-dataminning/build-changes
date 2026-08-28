import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public record etj(ji<dab> b, List<Float> c) implements ett {
   public static final MapCodec<etj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lp.f.r().fieldOf("enchantment").forGetter(etj::c), ayh.a(Codec.FLOAT.listOf()).fieldOf("chances").forGetter(etj::d))
            .apply($$0, etj::new)
   );

   @Override
   public etu b() {
      return etv.m;
   }

   @Override
   public Set<etc<?>> a() {
      return ImmutableSet.of(etf.i);
   }

   public boolean a(eqj $$0) {
      cuq $$1 = $$0.c(etf.i);
      int $$2 = $$1 != null ? dac.a(this.b.a(), $$1) : 0;
      float $$3 = this.c.get(Math.min($$2, this.c.size() - 1));
      return $$0.b().i() < $$3;
   }

   public static ett.a a(dab $$0, float... $$1) {
      List<Float> $$2 = new ArrayList<>($$1.length);

      for (float $$3 : $$1) {
         $$2.add($$3);
      }

      return () -> new etj($$0.m(), $$2);
   }

   public ji<dab> c() {
      return this.b;
   }

   public List<Float> d() {
      return this.c;
   }
}
