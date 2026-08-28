import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public record fcr(jf<dga> b, List<Float> c) implements fdc {
   public static final MapCodec<fcr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dga.c.fieldOf("enchantment").forGetter(fcr::c), ayu.b(Codec.FLOAT.listOf()).fieldOf("chances").forGetter(fcr::d)).apply($$0, fcr::new)
   );

   @Override
   public fdd b() {
      return fde.k;
   }

   @Override
   public Set<bax<?>> a() {
      return Set.of(fcn.i);
   }

   public boolean a(ezt $$0) {
      czn $$1 = $$0.c(fcn.i);
      int $$2 = $$1 != null ? dgc.a(this.b, $$1) : 0;
      float $$3 = this.c.get(Math.min($$2, this.c.size() - 1));
      return $$0.b().i() < $$3;
   }

   public static fdc.a a(jf<dga> $$0, float... $$1) {
      List<Float> $$2 = new ArrayList<>($$1.length);

      for (float $$3 : $$1) {
         $$2.add($$3);
      }

      return () -> new fcr($$0, $$2);
   }

   public jf<dga> c() {
      return this.b;
   }

   public List<Float> d() {
      return this.c;
   }
}
