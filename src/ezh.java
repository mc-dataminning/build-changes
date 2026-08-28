import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public record ezh(jq<ddr> b, List<Float> c) implements ezs {
   public static final MapCodec<ezh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ddr.c.fieldOf("enchantment").forGetter(ezh::c), azn.a(Codec.FLOAT.listOf()).fieldOf("chances").forGetter(ezh::d)).apply($$0, ezh::new)
   );

   @Override
   public ezt b() {
      return ezu.k;
   }

   @Override
   public Set<eza<?>> a() {
      return ImmutableSet.of(ezd.i);
   }

   public boolean a(ewh $$0) {
      cxk $$1 = $$0.c(ezd.i);
      int $$2 = $$1 != null ? ddt.a(this.b, $$1) : 0;
      float $$3 = this.c.get(Math.min($$2, this.c.size() - 1));
      return $$0.b().i() < $$3;
   }

   public static ezs.a a(jq<ddr> $$0, float... $$1) {
      List<Float> $$2 = new ArrayList<>($$1.length);

      for (float $$3 : $$1) {
         $$2.add($$3);
      }

      return () -> new ezh($$0, $$2);
   }

   public jq<ddr> c() {
      return this.b;
   }

   public List<Float> d() {
      return this.c;
   }
}
