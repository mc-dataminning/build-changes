import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public record etw(jj<czm> b, List<Float> c) implements euh {
   public static final MapCodec<etw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(czm.c.fieldOf("enchantment").forGetter(etw::c), axo.a(Codec.FLOAT.listOf()).fieldOf("chances").forGetter(etw::d)).apply($$0, etw::new)
   );

   @Override
   public eui b() {
      return euj.k;
   }

   @Override
   public Set<etp<?>> a() {
      return ImmutableSet.of(ets.i);
   }

   public boolean a(eqw $$0) {
      cud $$1 = $$0.c(ets.i);
      int $$2 = $$1 != null ? czo.a(this.b, $$1) : 0;
      float $$3 = this.c.get(Math.min($$2, this.c.size() - 1));
      return $$0.b().i() < $$3;
   }

   public static euh.a a(jj<czm> $$0, float... $$1) {
      List<Float> $$2 = new ArrayList<>($$1.length);

      for (float $$3 : $$1) {
         $$2.add($$3);
      }

      return () -> new etw($$0, $$2);
   }

   public jj<czm> c() {
      return this.b;
   }

   public List<Float> d() {
      return this.c;
   }
}
