import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public record eyp(jr<dcz> b, List<Float> c) implements eza {
   public static final MapCodec<eyp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dcz.c.fieldOf("enchantment").forGetter(eyp::c), ayi.b(Codec.FLOAT.listOf()).fieldOf("chances").forGetter(eyp::d)).apply($$0, eyp::new)
   );

   @Override
   public ezb b() {
      return ezc.k;
   }

   @Override
   public Set<bai<?>> a() {
      return Set.of(eyl.i);
   }

   public boolean a(evr $$0) {
      cwp $$1 = $$0.c(eyl.i);
      int $$2 = $$1 != null ? ddb.a(this.b, $$1) : 0;
      float $$3 = this.c.get(Math.min($$2, this.c.size() - 1));
      return $$0.b().i() < $$3;
   }

   public static eza.a a(jr<dcz> $$0, float... $$1) {
      List<Float> $$2 = new ArrayList<>($$1.length);

      for (float $$3 : $$1) {
         $$2.add($$3);
      }

      return () -> new eyp($$0, $$2);
   }

   public jr<dcz> c() {
      return this.b;
   }

   public List<Float> d() {
      return this.c;
   }
}
