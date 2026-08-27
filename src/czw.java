import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class czw extends cwz implements cwt {
   public static final MapCodec<czw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ahf.a(ke.aw).fieldOf("feature").forGetter($$0x -> $$0x.e), kd.e.q().fieldOf("grows_on").forGetter($$0x -> $$0x.d), u())
            .apply($$0, czw::new)
   );
   protected static final emm b = cwq.a(4.0, 0.0, 4.0, 12.0, 9.0, 12.0);
   private static final double c = 0.4;
   private final cwq d;
   private final ahf<drh<?, ?>> e;

   @Override
   public MapCodec<czw> a() {
      return a;
   }

   protected czw(ahf<drh<?, ?>> $$0, cwq $$1, djg.d $$2) {
      super($$2);
      this.e = $$0;
      this.d = $$1;
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      return b;
   }

   @Override
   protected boolean b(djh $$0, csv $$1, hx $$2) {
      return $$0.a(ash.aK) || $$0.a(cws.fl) || $$0.a(cws.dX) || super.b($$0, $$1, $$2);
   }

   private Optional<? extends ih<drh<?, ?>>> a(cts $$0) {
      return $$0.I_().d(ke.aw).b(this.e);
   }

   @Override
   public boolean b(cts $$0, hx $$1, djh $$2) {
      djh $$3 = $$0.a_($$1.d());
      return $$3.a(this.d);
   }

   @Override
   public boolean a(ctp $$0, auv $$1, hx $$2, djh $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(and $$0, auv $$1, hx $$2, djh $$3) {
      this.a($$0).ifPresent($$3x -> ((drh)$$3x.a()).a($$0, $$0.l().g(), $$1, $$2));
   }
}
