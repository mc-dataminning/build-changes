import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dmr extends dju implements djn {
   public static final MapCodec<dmr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(akt.a(mc.aL).fieldOf("feature").forGetter($$0x -> $$0x.e), mb.e.q().fieldOf("grows_on").forGetter($$0x -> $$0x.d), t())
            .apply($$0, dmr::new)
   );
   protected static final fbs b = djk.a(4.0, 0.0, 4.0, 12.0, 9.0, 12.0);
   private static final double c = 0.4;
   private final djk d;
   private final akt<efi<?, ?>> e;

   @Override
   public MapCodec<dmr> a() {
      return a;
   }

   protected dmr(akt<efi<?, ?>> $$0, djk $$1, dwu.d $$2) {
      super($$2);
      this.e = $$0;
      this.d = $$1;
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return b;
   }

   @Override
   protected boolean b(dwv $$0, dfl $$1, ji $$2) {
      return $$0.a(awo.aO) || $$0.a(djm.fA) || $$0.a(djm.ek) || super.b($$0, $$1, $$2);
   }

   private Optional<? extends jr<efi<?, ?>>> a(dgj $$0) {
      return $$0.K_().e(mc.aL).a(this.e);
   }

   @Override
   public boolean a(dgj $$0, ji $$1, dwv $$2) {
      dwv $$3 = $$0.a_($$1.e());
      return $$3.a(this.d);
   }

   @Override
   public boolean a(dgg $$0, azg $$1, ji $$2, dwv $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(arc $$0, azg $$1, ji $$2, dwv $$3) {
      this.a($$0).ifPresent($$3x -> ((efi)$$3x.a()).a($$0, $$0.m().g(), $$1, $$2));
   }
}
