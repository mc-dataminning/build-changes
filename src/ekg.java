import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;

public class ekg extends ekf {
   public static final MapCodec<ekg> g = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, ekg::new));
   protected final List<dww> h;

   protected static <P extends ekg> P4<Mu<P>, Long, esb.a, Float, List<dww>> b(Instance<P> $$0) {
      return a($$0).and(ayi.b(dww.a.listOf()).fieldOf("states").forGetter($$0x -> $$0x.h));
   }

   public ekg(long $$0, esb.a $$1, float $$2, List<dww> $$3) {
      super($$0, $$1, $$2);
      this.h = $$3;
   }

   @Override
   protected ekd<?> a() {
      return ekd.d;
   }

   @Override
   public dww a(azh $$0, ji $$1) {
      return this.a(this.h, $$1, (double)this.e);
   }

   protected dww a(List<dww> $$0, ji $$1, double $$2) {
      double $$3 = this.a($$1, $$2);
      return this.a($$0, $$3);
   }

   protected dww a(List<dww> $$0, double $$1) {
      double $$2 = ayz.a((1.0 + $$1) / 2.0, 0.0, 0.9999);
      return $$0.get((int)($$2 * (double)$$0.size()));
   }
}
