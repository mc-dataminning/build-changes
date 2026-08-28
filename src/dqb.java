import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dqb extends dwd implements dmu {
   public static final MapCodec<dqb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alf.a(mh.aL).fieldOf("feature").forGetter($$0x -> $$0x.e), mg.e.q().fieldOf("grows_on").forGetter($$0x -> $$0x.d), t())
            .apply($$0, dqb::new)
   );
   private static final double b = 0.4;
   private static final ffw c = dmr.b(8.0, 0.0, 9.0);
   private final dmr d;
   private final alf<ejk<?, ?>> e;

   @Override
   public MapCodec<dqb> a() {
      return a;
   }

   protected dqb(alf<ejk<?, ?>> $$0, dmr $$1, eas.d $$2) {
      super($$2);
      this.e = $$0;
      this.d = $$1;
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return c;
   }

   @Override
   protected boolean b(eat $$0, diq $$1, iv $$2) {
      return $$0.a(axc.aO) || $$0.a(dmt.fE) || $$0.a(dmt.eo) || super.b($$0, $$1, $$2);
   }

   private Optional<? extends jf<ejk<?, ?>>> a(djp $$0) {
      return $$0.F_().f(mh.aL).a(this.e);
   }

   @Override
   public boolean a(djp $$0, iv $$1, eat $$2) {
      eat $$3 = $$0.a_($$1.e());
      return $$3.a(this.d);
   }

   @Override
   public boolean a(djm $$0, azv $$1, iv $$2, eat $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(arq $$0, azv $$1, iv $$2, eat $$3) {
      this.a($$0).ifPresent($$3x -> ((ejk)$$3x.a()).a($$0, $$0.m().g(), $$1, $$2));
   }
}
