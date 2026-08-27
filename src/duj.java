import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;

public class duj extends dui {
   public static final Codec<duj> g = RecordCodecBuilder.create($$0 -> b($$0).apply($$0, duj::new));
   protected final List<dhn> h;

   protected static <P extends duj> P4<Mu<P>, Long, eca.a, Float, List<dhn>> b(Instance<P> $$0) {
      return a($$0).and(Codec.list(dhn.b).fieldOf("states").forGetter($$0x -> $$0x.h));
   }

   public duj(long $$0, eca.a $$1, float $$2, List<dhn> $$3) {
      super($$0, $$1, $$2);
      this.h = $$3;
   }

   @Override
   protected dug<?> a() {
      return dug.d;
   }

   @Override
   public dhn a(atw $$0, hx $$1) {
      return this.a(this.h, $$1, (double)this.e);
   }

   protected dhn a(List<dhn> $$0, hx $$1, double $$2) {
      double $$3 = this.a($$1, $$2);
      return this.a($$0, $$3);
   }

   protected dhn a(List<dhn> $$0, double $$1) {
      double $$2 = atq.a((1.0 + $$1) / 2.0, 0.0, 0.9999);
      return $$0.get((int)($$2 * (double)$$0.size()));
   }
}
