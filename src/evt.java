import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public record evt(jn<daw> b, List<Float> c) implements ewe {
   public static final MapCodec<evt> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(daw.c.fieldOf("enchantment").forGetter(evt::c), ayl.a(Codec.FLOAT.listOf()).fieldOf("chances").forGetter(evt::d)).apply($$0, evt::new)
   );

   @Override
   public ewf b() {
      return ewg.k;
   }

   @Override
   public Set<evm<?>> a() {
      return ImmutableSet.of(evp.i);
   }

   public boolean a(est $$0) {
      cvl $$1 = $$0.c(evp.i);
      int $$2 = $$1 != null ? day.a(this.b, $$1) : 0;
      float $$3 = this.c.get(Math.min($$2, this.c.size() - 1));
      return $$0.b().i() < $$3;
   }

   public static ewe.a a(jn<daw> $$0, float... $$1) {
      List<Float> $$2 = new ArrayList<>($$1.length);

      for (float $$3 : $$1) {
         $$2.add($$3);
      }

      return () -> new evt($$0, $$2);
   }

   public jn<daw> c() {
      return this.b;
   }

   public List<Float> d() {
      return this.c;
   }
}
