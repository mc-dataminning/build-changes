import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public record fdh(jg<dgn> b, List<Float> c) implements fds {
   public static final MapCodec<fdh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dgn.c.fieldOf("enchantment").forGetter(fdh::c), ayy.b(Codec.FLOAT.listOf()).fieldOf("chances").forGetter(fdh::d)).apply($$0, fdh::new)
   );

   @Override
   public fdt b() {
      return fdu.k;
   }

   @Override
   public Set<bbb<?>> a() {
      return Set.of(fdd.i);
   }

   public boolean a(faj $$0) {
      daa $$1 = $$0.c(fdd.i);
      int $$2 = $$1 != null ? dgp.a(this.b, $$1) : 0;
      float $$3 = this.c.get(Math.min($$2, this.c.size() - 1));
      return $$0.b().i() < $$3;
   }

   public static fds.a a(jg<dgn> $$0, float... $$1) {
      List<Float> $$2 = new ArrayList<>($$1.length);

      for (float $$3 : $$1) {
         $$2.add($$3);
      }

      return () -> new fdh($$0, $$2);
   }

   public jg<dgn> c() {
      return this.b;
   }

   public List<Float> d() {
      return this.c;
   }
}
