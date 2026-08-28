import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class djc extends dgf implements dfz {
   public static final MapCodec<djc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(akp.a(lu.aI).fieldOf("feature").forGetter($$0x -> $$0x.e), lt.e.r().fieldOf("grows_on").forGetter($$0x -> $$0x.d), u())
            .apply($$0, djc::new)
   );
   protected static final exp b = dfw.a(4.0, 0.0, 4.0, 12.0, 9.0, 12.0);
   private static final double c = 0.4;
   private final dfw d;
   private final akp<ebn<?, ?>> e;

   @Override
   public MapCodec<djc> a() {
      return a;
   }

   protected djc(akp<ebn<?, ?>> $$0, dfw $$1, dsz.d $$2) {
      super($$2);
      this.e = $$0;
      this.d = $$1;
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      return b;
   }

   @Override
   protected boolean b(dta $$0, dca $$1, jd $$2) {
      return $$0.a(awd.aL) || $$0.a(dfy.fl) || $$0.a(dfy.dX) || super.b($$0, $$1, $$2);
   }

   private Optional<? extends jm<ebn<?, ?>>> a(dcx $$0) {
      return $$0.H_().d(lu.aI).b(this.e);
   }

   @Override
   public boolean b(dcx $$0, jd $$1, dta $$2) {
      dta $$3 = $$0.a_($$1.d());
      return $$3.a(this.d);
   }

   @Override
   public boolean a(dcu $$0, ayv $$1, jd $$2, dta $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(aqt $$0, ayv $$1, jd $$2, dta $$3) {
      this.a($$0).ifPresent($$3x -> ((ebn)$$3x.a()).a($$0, $$0.l().g(), $$1, $$2));
   }
}
