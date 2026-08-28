import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public record etg(ji<czy> b, List<Float> c) implements etq {
   public static final MapCodec<etg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lp.f.r().fieldOf("enchantment").forGetter(etg::c), ayf.a(Codec.FLOAT.listOf()).fieldOf("chances").forGetter(etg::d))
            .apply($$0, etg::new)
   );

   @Override
   public etr b() {
      return ets.m;
   }

   @Override
   public Set<esz<?>> a() {
      return ImmutableSet.of(etc.i);
   }

   public boolean a(eqg $$0) {
      cun $$1 = $$0.c(etc.i);
      int $$2 = $$1 != null ? czz.a(this.b.a(), $$1) : 0;
      float $$3 = this.c.get(Math.min($$2, this.c.size() - 1));
      return $$0.b().i() < $$3;
   }

   public static etq.a a(czy $$0, float... $$1) {
      List<Float> $$2 = new ArrayList<>($$1.length);

      for (float $$3 : $$1) {
         $$2.add($$3);
      }

      return () -> new etg($$0.m(), $$2);
   }

   public ji<czy> c() {
      return this.b;
   }

   public List<Float> d() {
      return this.c;
   }
}
