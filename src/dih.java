import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dih extends dfk implements dfe {
   public static final MapCodec<dih> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ale.a(lq.aC).fieldOf("feature").forGetter($$0x -> $$0x.e), lp.e.q().fieldOf("grows_on").forGetter($$0x -> $$0x.d), u())
            .apply($$0, dih::new)
   );
   protected static final ewm b = dfb.a(4.0, 0.0, 4.0, 12.0, 9.0, 12.0);
   private static final double c = 0.4;
   private final dfb d;
   private final ale<ean<?, ?>> e;

   @Override
   public MapCodec<dih> a() {
      return a;
   }

   protected dih(ale<ean<?, ?>> $$0, dfb $$1, dsd.d $$2) {
      super($$2);
      this.e = $$0;
      this.d = $$1;
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return b;
   }

   @Override
   protected boolean b(dse $$0, dbg $$1, iz $$2) {
      return $$0.a(awp.aL) || $$0.a(dfd.fl) || $$0.a(dfd.dX) || super.b($$0, $$1, $$2);
   }

   private Optional<? extends ji<ean<?, ?>>> a(dcd $$0) {
      return $$0.H_().d(lq.aC).b(this.e);
   }

   @Override
   public boolean b(dcd $$0, iz $$1, dse $$2) {
      dse $$3 = $$0.a_($$1.d());
      return $$3.a(this.d);
   }

   @Override
   public boolean a(dca $$0, azh $$1, iz $$2, dse $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(arf $$0, azh $$1, iz $$2, dse $$3) {
      this.a($$0).ifPresent($$3x -> ((ean)$$3x.a()).a($$0, $$0.l().g(), $$1, $$2));
   }
}
