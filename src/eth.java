import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public record eth(ji<czz> b, List<Float> c) implements etr {
   public static final MapCodec<eth> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lp.f.r().fieldOf("enchantment").forGetter(eth::c), ayg.a(Codec.FLOAT.listOf()).fieldOf("chances").forGetter(eth::d))
            .apply($$0, eth::new)
   );

   @Override
   public ets b() {
      return ett.m;
   }

   @Override
   public Set<eta<?>> a() {
      return ImmutableSet.of(etd.i);
   }

   public boolean a(eqh $$0) {
      cuo $$1 = $$0.c(etd.i);
      int $$2 = $$1 != null ? daa.a(this.b.a(), $$1) : 0;
      float $$3 = this.c.get(Math.min($$2, this.c.size() - 1));
      return $$0.b().i() < $$3;
   }

   public static etr.a a(czz $$0, float... $$1) {
      List<Float> $$2 = new ArrayList<>($$1.length);

      for (float $$3 : $$1) {
         $$2.add($$3);
      }

      return () -> new eth($$0.m(), $$2);
   }

   public ji<czz> c() {
      return this.b;
   }

   public List<Float> d() {
      return this.c;
   }
}
