import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public record exn(jq<dcd> b, List<Float> c) implements exy {
   public static final MapCodec<exn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dcd.c.fieldOf("enchantment").forGetter(exn::c), ayv.a(Codec.FLOAT.listOf()).fieldOf("chances").forGetter(exn::d)).apply($$0, exn::new)
   );

   @Override
   public exz b() {
      return eya.k;
   }

   @Override
   public Set<exg<?>> a() {
      return ImmutableSet.of(exj.i);
   }

   public boolean a(eun $$0) {
      cwm $$1 = $$0.c(exj.i);
      int $$2 = $$1 != null ? dcf.a(this.b, $$1) : 0;
      float $$3 = this.c.get(Math.min($$2, this.c.size() - 1));
      return $$0.b().i() < $$3;
   }

   public static exy.a a(jq<dcd> $$0, float... $$1) {
      List<Float> $$2 = new ArrayList<>($$1.length);

      for (float $$3 : $$1) {
         $$2.add($$3);
      }

      return () -> new exn($$0, $$2);
   }

   public jq<dcd> c() {
      return this.b;
   }

   public List<Float> d() {
      return this.c;
   }
}
