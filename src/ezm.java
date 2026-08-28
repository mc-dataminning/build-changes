import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public record ezm(jr<ddr> b, List<Float> c) implements ezx {
   public static final MapCodec<ezm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ddr.c.fieldOf("enchantment").forGetter(ezm::c), ayi.b(Codec.FLOAT.listOf()).fieldOf("chances").forGetter(ezm::d)).apply($$0, ezm::new)
   );

   @Override
   public ezy b() {
      return ezz.k;
   }

   @Override
   public Set<bai<?>> a() {
      return Set.of(ezi.i);
   }

   public boolean a(ewo $$0) {
      cxh $$1 = $$0.c(ezi.i);
      int $$2 = $$1 != null ? ddt.a(this.b, $$1) : 0;
      float $$3 = this.c.get(Math.min($$2, this.c.size() - 1));
      return $$0.b().i() < $$3;
   }

   public static ezx.a a(jr<ddr> $$0, float... $$1) {
      List<Float> $$2 = new ArrayList<>($$1.length);

      for (float $$3 : $$1) {
         $$2.add($$3);
      }

      return () -> new ezm($$0, $$2);
   }

   public jr<ddr> c() {
      return this.b;
   }

   public List<Float> d() {
      return this.c;
   }
}
