import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public record eyn(jr<dcx> b, List<Float> c) implements eyy {
   public static final MapCodec<eyn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dcx.c.fieldOf("enchantment").forGetter(eyn::c), ayh.b(Codec.FLOAT.listOf()).fieldOf("chances").forGetter(eyn::d)).apply($$0, eyn::new)
   );

   @Override
   public eyz b() {
      return eza.k;
   }

   @Override
   public Set<bah<?>> a() {
      return Set.of(eyj.i);
   }

   public boolean a(evp $$0) {
      cwn $$1 = $$0.c(eyj.i);
      int $$2 = $$1 != null ? dcz.a(this.b, $$1) : 0;
      float $$3 = this.c.get(Math.min($$2, this.c.size() - 1));
      return $$0.b().i() < $$3;
   }

   public static eyy.a a(jr<dcx> $$0, float... $$1) {
      List<Float> $$2 = new ArrayList<>($$1.length);

      for (float $$3 : $$1) {
         $$2.add($$3);
      }

      return () -> new eyn($$0, $$2);
   }

   public jr<dcx> c() {
      return this.b;
   }

   public List<Float> d() {
      return this.c;
   }
}
