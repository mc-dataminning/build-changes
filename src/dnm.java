import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dnm extends dko implements dkh {
   public static final MapCodec<dnm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(akt.a(mc.aM).fieldOf("feature").forGetter($$0x -> $$0x.e), mb.e.q().fieldOf("grows_on").forGetter($$0x -> $$0x.d), t())
            .apply($$0, dnm::new)
   );
   private static final double b = 0.4;
   private static final fcr c = dke.b(8.0, 0.0, 9.0);
   private final dke d;
   private final akt<egg<?, ?>> e;

   @Override
   public MapCodec<dnm> a() {
      return a;
   }

   protected dnm(akt<egg<?, ?>> $$0, dke $$1, dxp.d $$2) {
      super($$2);
      this.e = $$0;
      this.d = $$1;
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return c;
   }

   @Override
   protected boolean b(dxq $$0, dgf $$1, ji $$2) {
      return $$0.a(awp.aO) || $$0.a(dkg.fA) || $$0.a(dkg.ek) || super.b($$0, $$1, $$2);
   }

   private Optional<? extends jr<egg<?, ?>>> a(dhc $$0) {
      return $$0.F_().e(mc.aM).a(this.e);
   }

   @Override
   public boolean a(dhc $$0, ji $$1, dxq $$2) {
      dxq $$3 = $$0.a_($$1.e());
      return $$3.a(this.d);
   }

   @Override
   public boolean a(dgz $$0, azh $$1, ji $$2, dxq $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dxq $$3) {
      this.a($$0).ifPresent($$3x -> ((egg)$$3x.a()).a($$0, $$0.m().g(), $$1, $$2));
   }
}
