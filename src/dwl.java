import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;

public class dwl extends dwk {
   public static final Codec<dwl> g = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, dwl::new));
   protected final List<djp> h;

   protected static <P extends dwl> P4<Mu<P>, Long, eec.a, Float, List<djp>> b(Instance<P> $$0) {
      return a($$0).and(Codec.list(djp.b).fieldOf("states").forGetter($$0x -> $$0x.h));
   }

   public dwl(long $$0, eec.a $$1, float $$2, List<djp> $$3) {
      super($$0, $$1, $$2);
      this.h = $$3;
   }

   @Override
   protected dwi<?> a() {
      return dwi.d;
   }

   @Override
   public djp a(auw $$0, hx $$1) {
      return this.a(this.h, $$1, (double)this.e);
   }

   protected djp a(List<djp> $$0, hx $$1, double $$2) {
      double $$3 = this.a($$1, $$2);
      return this.a($$0, $$3);
   }

   protected djp a(List<djp> $$0, double $$1) {
      double $$2 = aup.a((1.0 + $$1) / 2.0, 0.0, 0.9999);
      return $$0.get((int)($$2 * (double)$$0.size()));
   }
}
