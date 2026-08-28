import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public record fdr(jg<dgx> b, List<Float> c) implements fec {
   public static final MapCodec<fdr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dgx.c.fieldOf("enchantment").forGetter(fdr::c), azg.b(Codec.FLOAT.listOf()).fieldOf("chances").forGetter(fdr::d)).apply($$0, fdr::new)
   );

   @Override
   public fed b() {
      return fee.k;
   }

   @Override
   public Set<bbk<?>> a() {
      return Set.of(fdn.i);
   }

   public boolean a(fat $$0) {
      dak $$1 = $$0.c(fdn.i);
      int $$2 = $$1 != null ? dgz.a(this.b, $$1) : 0;
      float $$3 = this.c.get(Math.min($$2, this.c.size() - 1));
      return $$0.b().i() < $$3;
   }

   public static fec.a a(jg<dgx> $$0, float... $$1) {
      List<Float> $$2 = new ArrayList<>($$1.length);

      for (float $$3 : $$1) {
         $$2.add($$3);
      }

      return () -> new fdr($$0, $$2);
   }

   public jg<dgx> c() {
      return this.b;
   }

   public List<Float> d() {
      return this.c;
   }
}
