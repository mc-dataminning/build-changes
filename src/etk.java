import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public record etk(ji<dac> b, List<Float> c) implements etu {
   public static final MapCodec<etk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lp.f.r().fieldOf("enchantment").forGetter(etk::c), ayh.a(Codec.FLOAT.listOf()).fieldOf("chances").forGetter(etk::d))
            .apply($$0, etk::new)
   );

   @Override
   public etv b() {
      return etw.m;
   }

   @Override
   public Set<etd<?>> a() {
      return ImmutableSet.of(etg.i);
   }

   public boolean a(eqk $$0) {
      cur $$1 = $$0.c(etg.i);
      int $$2 = $$1 != null ? dad.a(this.b.a(), $$1) : 0;
      float $$3 = this.c.get(Math.min($$2, this.c.size() - 1));
      return $$0.b().i() < $$3;
   }

   public static etu.a a(dac $$0, float... $$1) {
      List<Float> $$2 = new ArrayList<>($$1.length);

      for (float $$3 : $$1) {
         $$2.add($$3);
      }

      return () -> new etk($$0.m(), $$2);
   }

   public ji<dac> c() {
      return this.b;
   }

   public List<Float> d() {
      return this.c;
   }
}
