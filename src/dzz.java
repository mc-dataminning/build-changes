import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;

public class dzz extends dzy {
   public static final Codec<dzz> g = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, dzz::new));
   protected final List<dmz> h;

   protected static <P extends dzz> P4<Mu<P>, Long, ehq.a, Float, List<dmz>> b(Instance<P> $$0) {
      return a($$0).and(Codec.list(dmz.b).fieldOf("states").forGetter($$0x -> $$0x.h));
   }

   public dzz(long $$0, ehq.a $$1, float $$2, List<dmz> $$3) {
      super($$0, $$1, $$2);
      this.h = $$3;
   }

   @Override
   protected dzw<?> a() {
      return dzw.d;
   }

   @Override
   public dmz a(axd $$0, ib $$1) {
      return this.a(this.h, $$1, (double)this.e);
   }

   protected dmz a(List<dmz> $$0, ib $$1, double $$2) {
      double $$3 = this.a($$1, $$2);
      return this.a($$0, $$3);
   }

   protected dmz a(List<dmz> $$0, double $$1) {
      double $$2 = aww.a((1.0 + $$1) / 2.0, 0.0, 0.9999);
      return $$0.get((int)($$2 * (double)$$0.size()));
   }
}
