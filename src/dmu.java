import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dmu extends djx implements djq {
   public static final MapCodec<dmu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(aku.a(mc.aL).fieldOf("feature").forGetter($$0x -> $$0x.e), mb.e.q().fieldOf("grows_on").forGetter($$0x -> $$0x.d), t())
            .apply($$0, dmu::new)
   );
   protected static final fbv b = djn.a(4.0, 0.0, 4.0, 12.0, 9.0, 12.0);
   private static final double c = 0.4;
   private final djn d;
   private final aku<efl<?, ?>> e;

   @Override
   public MapCodec<dmu> a() {
      return a;
   }

   protected dmu(aku<efl<?, ?>> $$0, djn $$1, dwx.d $$2) {
      super($$2);
      this.e = $$0;
      this.d = $$1;
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return b;
   }

   @Override
   protected boolean b(dwy $$0, dfo $$1, ji $$2) {
      return $$0.a(awp.aO) || $$0.a(djp.fA) || $$0.a(djp.ek) || super.b($$0, $$1, $$2);
   }

   private Optional<? extends jr<efl<?, ?>>> a(dgm $$0) {
      return $$0.K_().e(mc.aL).a(this.e);
   }

   @Override
   public boolean a(dgm $$0, ji $$1, dwy $$2) {
      dwy $$3 = $$0.a_($$1.e());
      return $$3.a(this.d);
   }

   @Override
   public boolean a(dgj $$0, azh $$1, ji $$2, dwy $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dwy $$3) {
      this.a($$0).ifPresent($$3x -> ((efl)$$3x.a()).a($$0, $$0.m().g(), $$1, $$2));
   }
}
