import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public record eto(jj<czj> b, List<Float> c) implements etz {
   public static final MapCodec<eto> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(czj.b.fieldOf("enchantment").forGetter(eto::c), axm.a(Codec.FLOAT.listOf()).fieldOf("chances").forGetter(eto::d)).apply($$0, eto::new)
   );

   @Override
   public eua b() {
      return eub.k;
   }

   @Override
   public Set<eth<?>> a() {
      return ImmutableSet.of(etk.i);
   }

   public boolean a(eqo $$0) {
      cua $$1 = $$0.c(etk.i);
      int $$2 = $$1 != null ? czl.a(this.b, $$1) : 0;
      float $$3 = this.c.get(Math.min($$2, this.c.size() - 1));
      return $$0.b().i() < $$3;
   }

   public static etz.a a(jj<czj> $$0, float... $$1) {
      List<Float> $$2 = new ArrayList<>($$1.length);

      for (float $$3 : $$1) {
         $$2.add($$3);
      }

      return () -> new eto($$0, $$2);
   }

   public jj<czj> c() {
      return this.b;
   }

   public List<Float> d() {
      return this.c;
   }
}
