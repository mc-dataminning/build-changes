import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class die extends dfh implements dfb {
   public static final MapCodec<die> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ald.a(lq.aC).fieldOf("feature").forGetter($$0x -> $$0x.e), lp.e.q().fieldOf("grows_on").forGetter($$0x -> $$0x.d), u())
            .apply($$0, die::new)
   );
   protected static final ewj b = dey.a(4.0, 0.0, 4.0, 12.0, 9.0, 12.0);
   private static final double c = 0.4;
   private final dey d;
   private final ald<eak<?, ?>> e;

   @Override
   public MapCodec<die> a() {
      return a;
   }

   protected die(ald<eak<?, ?>> $$0, dey $$1, dsa.d $$2) {
      super($$2);
      this.e = $$0;
      this.d = $$1;
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return b;
   }

   @Override
   protected boolean b(dsb $$0, dbd $$1, iz $$2) {
      return $$0.a(awo.aL) || $$0.a(dfa.fl) || $$0.a(dfa.dX) || super.b($$0, $$1, $$2);
   }

   private Optional<? extends ji<eak<?, ?>>> a(dca $$0) {
      return $$0.H_().d(lq.aC).b(this.e);
   }

   @Override
   public boolean b(dca $$0, iz $$1, dsb $$2) {
      dsb $$3 = $$0.a_($$1.d());
      return $$3.a(this.d);
   }

   @Override
   public boolean a(dbx $$0, azg $$1, iz $$2, dsb $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(are $$0, azg $$1, iz $$2, dsb $$3) {
      this.a($$0).ifPresent($$3x -> ((eak)$$3x.a()).a($$0, $$0.l().g(), $$1, $$2));
   }
}
