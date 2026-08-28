import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;

public class enn extends enm {
   public static final MapCodec<enn> g = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, enn::new));
   protected final List<dzz> h;

   protected static <P extends enn> P4<Mu<P>, Long, evj.a, Float, List<dzz>> b(Instance<P> $$0) {
      return a($$0).and(ayu.b(dzz.a.listOf()).fieldOf("states").forGetter($$0x -> $$0x.h));
   }

   public enn(long $$0, evj.a $$1, float $$2, List<dzz> $$3) {
      super($$0, $$1, $$2);
      this.h = $$3;
   }

   @Override
   protected enk<?> a() {
      return enk.d;
   }

   @Override
   public dzz a(azv $$0, iu $$1) {
      return this.a(this.h, $$1, (double)this.e);
   }

   protected dzz a(List<dzz> $$0, iu $$1, double $$2) {
      double $$3 = this.a($$1, $$2);
      return this.a($$0, $$3);
   }

   protected dzz a(List<dzz> $$0, double $$1) {
      double $$2 = azm.a((1.0 + $$1) / 2.0, 0.0, 0.9999);
      return $$0.get((int)($$2 * (double)$$0.size()));
   }
}
