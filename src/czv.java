import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class czv extends cwy implements cws {
   public static final MapCodec<czv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ahf.a(ke.aw).fieldOf("feature").forGetter($$0x -> $$0x.e), kd.e.q().fieldOf("grows_on").forGetter($$0x -> $$0x.d), u())
            .apply($$0, czv::new)
   );
   protected static final eml b = cwp.a(4.0, 0.0, 4.0, 12.0, 9.0, 12.0);
   private static final double c = 0.4;
   private final cwp d;
   private final ahf<drg<?, ?>> e;

   @Override
   public MapCodec<czv> a() {
      return a;
   }

   protected czv(ahf<drg<?, ?>> $$0, cwp $$1, djf.d $$2) {
      super($$2);
      this.e = $$0;
      this.d = $$1;
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      return b;
   }

   @Override
   protected boolean b(djg $$0, csu $$1, hx $$2) {
      return $$0.a(asg.aK) || $$0.a(cwr.fl) || $$0.a(cwr.dX) || super.b($$0, $$1, $$2);
   }

   private Optional<? extends ih<drg<?, ?>>> a(ctr $$0) {
      return $$0.I_().d(ke.aw).b(this.e);
   }

   @Override
   public boolean b(ctr $$0, hx $$1, djg $$2) {
      djg $$3 = $$0.a_($$1.d());
      return $$3.a(this.d);
   }

   @Override
   public boolean a(cto $$0, auu $$1, hx $$2, djg $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(and $$0, auu $$1, hx $$2, djg $$3) {
      this.a($$0).ifPresent($$3x -> ((drg)$$3x.a()).a($$0, $$0.l().g(), $$1, $$2));
   }
}
