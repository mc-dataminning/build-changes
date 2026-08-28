import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public record eti(ji<daa> b, List<Float> c) implements ets {
   public static final MapCodec<eti> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lp.f.r().fieldOf("enchantment").forGetter(eti::c), ayh.a(Codec.FLOAT.listOf()).fieldOf("chances").forGetter(eti::d))
            .apply($$0, eti::new)
   );

   @Override
   public ett b() {
      return etu.m;
   }

   @Override
   public Set<etb<?>> a() {
      return ImmutableSet.of(ete.i);
   }

   public boolean a(eqi $$0) {
      cup $$1 = $$0.c(ete.i);
      int $$2 = $$1 != null ? dab.a(this.b.a(), $$1) : 0;
      float $$3 = this.c.get(Math.min($$2, this.c.size() - 1));
      return $$0.b().i() < $$3;
   }

   public static ets.a a(daa $$0, float... $$1) {
      List<Float> $$2 = new ArrayList<>($$1.length);

      for (float $$3 : $$1) {
         $$2.add($$3);
      }

      return () -> new eti($$0.m(), $$2);
   }

   public ji<daa> c() {
      return this.b;
   }

   public List<Float> d() {
      return this.c;
   }
}
