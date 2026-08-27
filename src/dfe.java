import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dfe extends dch implements dcb {
   public static final MapCodec<dfe> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ajs.a(ks.ay).fieldOf("feature").forGetter($$0x -> $$0x.e), kr.e.q().fieldOf("grows_on").forGetter($$0x -> $$0x.d), u())
            .apply($$0, dfe::new)
   );
   protected static final est b = dby.a(4.0, 0.0, 4.0, 12.0, 9.0, 12.0);
   private static final double c = 0.4;
   private final dby d;
   private final ajs<dxi<?, ?>> e;

   @Override
   public MapCodec<dfe> a() {
      return a;
   }

   protected dfe(ajs<dxi<?, ?>> $$0, dby $$1, doy.d $$2) {
      super($$2);
      this.e = $$0;
      this.d = $$1;
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return b;
   }

   @Override
   protected boolean b(doz $$0, cyd $$1, ib $$2) {
      return $$0.a(avc.aL) || $$0.a(dca.fl) || $$0.a(dca.dX) || super.b($$0, $$1, $$2);
   }

   private Optional<? extends il<dxi<?, ?>>> a(cza $$0) {
      return $$0.H_().d(ks.ay).b(this.e);
   }

   @Override
   public boolean b(cza $$0, ib $$1, doz $$2) {
      doz $$3 = $$0.a_($$1.d());
      return $$3.a(this.d);
   }

   @Override
   public boolean a(cyx $$0, axr $$1, ib $$2, doz $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(aps $$0, axr $$1, ib $$2, doz $$3) {
      this.a($$0).ifPresent($$3x -> ((dxi)$$3x.a()).a($$0, $$0.l().g(), $$1, $$2));
   }
}
