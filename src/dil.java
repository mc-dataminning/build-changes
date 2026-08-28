import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dil extends dfo implements dfi {
   public static final MapCodec<dil> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(akj.a(lr.aH).fieldOf("feature").forGetter($$0x -> $$0x.e), lq.e.r().fieldOf("grows_on").forGetter($$0x -> $$0x.d), u())
            .apply($$0, dil::new)
   );
   protected static final ews b = dff.a(4.0, 0.0, 4.0, 12.0, 9.0, 12.0);
   private static final double c = 0.4;
   private final dff d;
   private final akj<ear<?, ?>> e;

   @Override
   public MapCodec<dil> a() {
      return a;
   }

   protected dil(akj<ear<?, ?>> $$0, dff $$1, dsg.d $$2) {
      super($$2);
      this.e = $$0;
      this.d = $$1;
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return b;
   }

   @Override
   protected boolean b(dsh $$0, dbj $$1, ja $$2) {
      return $$0.a(avu.aL) || $$0.a(dfh.fl) || $$0.a(dfh.dX) || super.b($$0, $$1, $$2);
   }

   private Optional<? extends jj<ear<?, ?>>> a(dcg $$0) {
      return $$0.H_().d(lr.aH).b(this.e);
   }

   @Override
   public boolean b(dcg $$0, ja $$1, dsh $$2) {
      dsh $$3 = $$0.a_($$1.d());
      return $$3.a(this.d);
   }

   @Override
   public boolean a(dcd $$0, aym $$1, ja $$2, dsh $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(aqk $$0, aym $$1, ja $$2, dsh $$3) {
      this.a($$0).ifPresent($$3x -> ((ear)$$3x.a()).a($$0, $$0.l().g(), $$1, $$2));
   }
}
