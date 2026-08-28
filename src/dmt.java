import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dmt extends djw implements djp {
   public static final MapCodec<dmt> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(akt.a(mc.aL).fieldOf("feature").forGetter($$0x -> $$0x.e), mb.e.q().fieldOf("grows_on").forGetter($$0x -> $$0x.d), t())
            .apply($$0, dmt::new)
   );
   protected static final fbu b = djm.a(4.0, 0.0, 4.0, 12.0, 9.0, 12.0);
   private static final double c = 0.4;
   private final djm d;
   private final akt<efk<?, ?>> e;

   @Override
   public MapCodec<dmt> a() {
      return a;
   }

   protected dmt(akt<efk<?, ?>> $$0, djm $$1, dww.d $$2) {
      super($$2);
      this.e = $$0;
      this.d = $$1;
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return b;
   }

   @Override
   protected boolean b(dwx $$0, dfn $$1, ji $$2) {
      return $$0.a(awp.aO) || $$0.a(djo.fA) || $$0.a(djo.ek) || super.b($$0, $$1, $$2);
   }

   private Optional<? extends jr<efk<?, ?>>> a(dgl $$0) {
      return $$0.K_().e(mc.aL).a(this.e);
   }

   @Override
   public boolean a(dgl $$0, ji $$1, dwx $$2) {
      dwx $$3 = $$0.a_($$1.e());
      return $$3.a(this.d);
   }

   @Override
   public boolean a(dgi $$0, azh $$1, ji $$2, dwx $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(arc $$0, azh $$1, ji $$2, dwx $$3) {
      this.a($$0).ifPresent($$3x -> ((efk)$$3x.a()).a($$0, $$0.m().g(), $$1, $$2));
   }
}
