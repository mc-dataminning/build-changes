import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class din extends dfq implements dfk {
   public static final MapCodec<din> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(akj.a(lr.aH).fieldOf("feature").forGetter($$0x -> $$0x.e), lq.e.r().fieldOf("grows_on").forGetter($$0x -> $$0x.d), u())
            .apply($$0, din::new)
   );
   protected static final ewy b = dfh.a(4.0, 0.0, 4.0, 12.0, 9.0, 12.0);
   private static final double c = 0.4;
   private final dfh d;
   private final akj<eax<?, ?>> e;

   @Override
   public MapCodec<din> a() {
      return a;
   }

   protected din(akj<eax<?, ?>> $$0, dfh $$1, dsj.d $$2) {
      super($$2);
      this.e = $$0;
      this.d = $$1;
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return b;
   }

   @Override
   protected boolean b(dsk $$0, dbl $$1, ja $$2) {
      return $$0.a(avw.aL) || $$0.a(dfj.fl) || $$0.a(dfj.dX) || super.b($$0, $$1, $$2);
   }

   private Optional<? extends jj<eax<?, ?>>> a(dci $$0) {
      return $$0.H_().d(lr.aH).b(this.e);
   }

   @Override
   public boolean b(dci $$0, ja $$1, dsk $$2) {
      dsk $$3 = $$0.a_($$1.d());
      return $$3.a(this.d);
   }

   @Override
   public boolean a(dcf $$0, ayo $$1, ja $$2, dsk $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(aqm $$0, ayo $$1, ja $$2, dsk $$3) {
      this.a($$0).ifPresent($$3x -> ((eax)$$3x.a()).a($$0, $$0.l().g(), $$1, $$2));
   }
}
