import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public record esb(ix<cyz> b, List<Float> c) implements esl {
   public static final MapCodec<esb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(le.f.r().fieldOf("enchantment").forGetter(esb::c), Codec.FLOAT.listOf().fieldOf("chances").forGetter(esb::d)).apply($$0, esb::new)
   );

   @Override
   public esm b() {
      return esn.m;
   }

   @Override
   public Set<eru<?>> a() {
      return ImmutableSet.of(erx.i);
   }

   public boolean a(epf $$0) {
      cto $$1 = $$0.c(erx.i);
      int $$2 = $$1 != null ? cza.a(this.b.a(), $$1) : 0;
      float $$3 = this.c.get(Math.min($$2, this.c.size() - 1));
      return $$0.b().i() < $$3;
   }

   public static esl.a a(cyz $$0, float... $$1) {
      List<Float> $$2 = new ArrayList<>($$1.length);

      for (float $$3 : $$1) {
         $$2.add($$3);
      }

      return () -> new esb($$0.m(), $$2);
   }

   public ix<cyz> c() {
      return this.b;
   }

   public List<Float> d() {
      return this.c;
   }
}
