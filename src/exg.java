import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public record exg(jq<dbw> b, List<Float> c) implements exr {
   public static final MapCodec<exg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dbw.c.fieldOf("enchantment").forGetter(exg::c), ayw.a(Codec.FLOAT.listOf()).fieldOf("chances").forGetter(exg::d)).apply($$0, exg::new)
   );

   @Override
   public exs b() {
      return ext.k;
   }

   @Override
   public Set<ewz<?>> a() {
      return ImmutableSet.of(exc.i);
   }

   public boolean a(eug $$0) {
      cwf $$1 = $$0.c(exc.i);
      int $$2 = $$1 != null ? dby.a(this.b, $$1) : 0;
      float $$3 = this.c.get(Math.min($$2, this.c.size() - 1));
      return $$0.b().i() < $$3;
   }

   public static exr.a a(jq<dbw> $$0, float... $$1) {
      List<Float> $$2 = new ArrayList<>($$1.length);

      for (float $$3 : $$1) {
         $$2.add($$3);
      }

      return () -> new exg($$0, $$2);
   }

   public jq<dbw> c() {
      return this.b;
   }

   public List<Float> d() {
      return this.c;
   }
}
