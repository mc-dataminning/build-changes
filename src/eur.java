import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public record eur(jm<dac> b, List<Float> c) implements evc {
   public static final MapCodec<eur> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dac.c.fieldOf("enchantment").forGetter(eur::c), axw.a(Codec.FLOAT.listOf()).fieldOf("chances").forGetter(eur::d)).apply($$0, eur::new)
   );

   @Override
   public evd b() {
      return eve.k;
   }

   @Override
   public Set<euk<?>> a() {
      return ImmutableSet.of(eun.i);
   }

   public boolean a(err $$0) {
      cuq $$1 = $$0.c(eun.i);
      int $$2 = $$1 != null ? dae.a(this.b, $$1) : 0;
      float $$3 = this.c.get(Math.min($$2, this.c.size() - 1));
      return $$0.b().i() < $$3;
   }

   public static evc.a a(jm<dac> $$0, float... $$1) {
      List<Float> $$2 = new ArrayList<>($$1.length);

      for (float $$3 : $$1) {
         $$2.add($$3);
      }

      return () -> new eur($$0, $$2);
   }

   public jm<dac> c() {
      return this.b;
   }

   public List<Float> d() {
      return this.c;
   }
}
