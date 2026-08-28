import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public record etu(jj<czl> b, List<Float> c) implements euf {
   public static final MapCodec<etu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(czl.b.fieldOf("enchantment").forGetter(etu::c), axo.a(Codec.FLOAT.listOf()).fieldOf("chances").forGetter(etu::d)).apply($$0, etu::new)
   );

   @Override
   public eug b() {
      return euh.k;
   }

   @Override
   public Set<etn<?>> a() {
      return ImmutableSet.of(etq.i);
   }

   public boolean a(equ $$0) {
      cuc $$1 = $$0.c(etq.i);
      int $$2 = $$1 != null ? czn.a(this.b, $$1) : 0;
      float $$3 = this.c.get(Math.min($$2, this.c.size() - 1));
      return $$0.b().i() < $$3;
   }

   public static euf.a a(jj<czl> $$0, float... $$1) {
      List<Float> $$2 = new ArrayList<>($$1.length);

      for (float $$3 : $$1) {
         $$2.add($$3);
      }

      return () -> new etu($$0, $$2);
   }

   public jj<czl> c() {
      return this.b;
   }

   public List<Float> d() {
      return this.c;
   }
}
