import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;

public class eeg extends eef {
   public static final MapCodec<eeg> g = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, eeg::new));
   protected final List<drb> h;

   protected static <P extends eeg> P4<Mu<P>, Long, elx.a, Float, List<drb>> b(Instance<P> $$0) {
      return a($$0).and(Codec.list(drb.b).fieldOf("states").forGetter($$0x -> $$0x.h));
   }

   public eeg(long $$0, elx.a $$1, float $$2, List<drb> $$3) {
      super($$0, $$1, $$2);
      this.h = $$3;
   }

   @Override
   protected eed<?> a() {
      return eed.d;
   }

   @Override
   public drb a(ayk $$0, io $$1) {
      return this.a(this.h, $$1, (double)this.e);
   }

   protected drb a(List<drb> $$0, io $$1, double $$2) {
      double $$3 = this.a($$1, $$2);
      return this.a($$0, $$3);
   }

   protected drb a(List<drb> $$0, double $$1) {
      double $$2 = ayd.a((1.0 + $$1) / 2.0, 0.0, 0.9999);
      return $$0.get((int)($$2 * (double)$$0.size()));
   }
}
