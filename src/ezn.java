import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public record ezn(jq<ddz> b, List<Float> c) implements ezy {
   public static final MapCodec<ezn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ddz.c.fieldOf("enchantment").forGetter(ezn::c), azn.a(Codec.FLOAT.listOf()).fieldOf("chances").forGetter(ezn::d)).apply($$0, ezn::new)
   );

   @Override
   public ezz b() {
      return faa.k;
   }

   @Override
   public Set<bbn<?>> a() {
      return Set.of(ezj.i);
   }

   public boolean a(ewp $$0) {
      cxp $$1 = $$0.c(ezj.i);
      int $$2 = $$1 != null ? deb.a(this.b, $$1) : 0;
      float $$3 = this.c.get(Math.min($$2, this.c.size() - 1));
      return $$0.b().i() < $$3;
   }

   public static ezy.a a(jq<ddz> $$0, float... $$1) {
      List<Float> $$2 = new ArrayList<>($$1.length);

      for (float $$3 : $$1) {
         $$2.add($$3);
      }

      return () -> new ezn($$0, $$2);
   }

   public jq<ddz> c() {
      return this.b;
   }

   public List<Float> d() {
      return this.c;
   }
}
