import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public record fdf(jf<dgl> b, List<Float> c) implements fdq {
   public static final MapCodec<fdf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dgl.c.fieldOf("enchantment").forGetter(fdf::c), ayw.b(Codec.FLOAT.listOf()).fieldOf("chances").forGetter(fdf::d)).apply($$0, fdf::new)
   );

   @Override
   public fdr b() {
      return fds.k;
   }

   @Override
   public Set<baz<?>> a() {
      return Set.of(fdb.i);
   }

   public boolean a(fah $$0) {
      czy $$1 = $$0.c(fdb.i);
      int $$2 = $$1 != null ? dgn.a(this.b, $$1) : 0;
      float $$3 = this.c.get(Math.min($$2, this.c.size() - 1));
      return $$0.b().i() < $$3;
   }

   public static fdq.a a(jf<dgl> $$0, float... $$1) {
      List<Float> $$2 = new ArrayList<>($$1.length);

      for (float $$3 : $$1) {
         $$2.add($$3);
      }

      return () -> new fdf($$0, $$2);
   }

   public jf<dgl> c() {
      return this.b;
   }

   public List<Float> d() {
      return this.c;
   }
}
