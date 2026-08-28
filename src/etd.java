import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public record etd(ji<czv> b, List<Float> c) implements etn {
   public static final MapCodec<etd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lp.f.r().fieldOf("enchantment").forGetter(etd::c), Codec.FLOAT.listOf().fieldOf("chances").forGetter(etd::d)).apply($$0, etd::new)
   );

   @Override
   public eto b() {
      return etp.m;
   }

   @Override
   public Set<esw<?>> a() {
      return ImmutableSet.of(esz.i);
   }

   public boolean a(eqd $$0) {
      cuk $$1 = $$0.c(esz.i);
      int $$2 = $$1 != null ? czw.a(this.b.a(), $$1) : 0;
      float $$3 = this.c.get(Math.min($$2, this.c.size() - 1));
      return $$0.b().i() < $$3;
   }

   public static etn.a a(czv $$0, float... $$1) {
      List<Float> $$2 = new ArrayList<>($$1.length);

      for (float $$3 : $$1) {
         $$2.add($$3);
      }

      return () -> new etd($$0.m(), $$2);
   }

   public ji<czv> c() {
      return this.b;
   }

   public List<Float> d() {
      return this.c;
   }
}
