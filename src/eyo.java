import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public record eyo(jr<dcy> b, List<Float> c) implements eyz {
   public static final MapCodec<eyo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dcy.c.fieldOf("enchantment").forGetter(eyo::c), ayi.b(Codec.FLOAT.listOf()).fieldOf("chances").forGetter(eyo::d)).apply($$0, eyo::new)
   );

   @Override
   public eza b() {
      return ezb.k;
   }

   @Override
   public Set<bai<?>> a() {
      return Set.of(eyk.i);
   }

   public boolean a(evq $$0) {
      cwo $$1 = $$0.c(eyk.i);
      int $$2 = $$1 != null ? dda.a(this.b, $$1) : 0;
      float $$3 = this.c.get(Math.min($$2, this.c.size() - 1));
      return $$0.b().i() < $$3;
   }

   public static eyz.a a(jr<dcy> $$0, float... $$1) {
      List<Float> $$2 = new ArrayList<>($$1.length);

      for (float $$3 : $$1) {
         $$2.add($$3);
      }

      return () -> new eyo($$0, $$2);
   }

   public jr<dcy> c() {
      return this.b;
   }

   public List<Float> d() {
      return this.c;
   }
}
