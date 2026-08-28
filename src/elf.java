import com.mojang.datafixers.Products.P4;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;

public class elf extends ele {
   public static final MapCodec<elf> g = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, elf::new));
   protected final List<dxv> h;

   protected static <P extends elf> P4<Mu<P>, Long, eta.a, Float, List<dxv>> b(Instance<P> $$0) {
      return a($$0).and(Codec.list(dxv.a).fieldOf("states").forGetter($$0x -> $$0x.h));
   }

   public elf(long $$0, eta.a $$1, float $$2, List<dxv> $$3) {
      super($$0, $$1, $$2);
      this.h = $$3;
   }

   @Override
   protected elc<?> a() {
      return elc.d;
   }

   @Override
   public dxv a(bam $$0, jh $$1) {
      return this.a(this.h, $$1, (double)this.e);
   }

   protected dxv a(List<dxv> $$0, jh $$1, double $$2) {
      double $$3 = this.a($$1, $$2);
      return this.a($$0, $$3);
   }

   protected dxv a(List<dxv> $$0, double $$1) {
      double $$2 = bae.a((1.0 + $$1) / 2.0, 0.0, 0.9999);
      return $$0.get((int)($$2 * (double)$$0.size()));
   }
}
