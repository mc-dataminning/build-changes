import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;

public class epg extends epf {
   public static final MapCodec<epg> g = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, epg::new));
   protected final List<ebq> h;

   protected static <P extends epg> P4<Mu<P>, Long, exd.a, Float, List<ebq>> b(Instance<P> $$0) {
      return a($$0).and(azg.b(ebq.a.listOf()).fieldOf("states").forGetter($$0x -> $$0x.h));
   }

   public epg(long $$0, exd.a $$1, float $$2, List<ebq> $$3) {
      super($$0, $$1, $$2);
      this.h = $$3;
   }

   @Override
   protected epd<?> a() {
      return epd.d;
   }

   @Override
   public ebq a(bai $$0, iw $$1) {
      return this.a(this.h, $$1, (double)this.e);
   }

   protected ebq a(List<ebq> $$0, iw $$1, double $$2) {
      double $$3 = this.a($$1, $$2);
      return this.a($$0, $$3);
   }

   protected ebq a(List<ebq> $$0, double $$1) {
      double $$2 = azz.a((1.0 + $$1) / 2.0, 0.0, 0.9999);
      return $$0.get((int)($$2 * (double)$$0.size()));
   }
}
