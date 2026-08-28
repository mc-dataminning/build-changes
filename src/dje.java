import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dje extends dgh implements dgb {
   public static final MapCodec<dje> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(akq.a(lu.aI).fieldOf("feature").forGetter($$0x -> $$0x.e), lt.e.r().fieldOf("grows_on").forGetter($$0x -> $$0x.d), u())
            .apply($$0, dje::new)
   );
   protected static final exv b = dfy.a(4.0, 0.0, 4.0, 12.0, 9.0, 12.0);
   private static final double c = 0.4;
   private final dfy d;
   private final akq<ebq<?, ?>> e;

   @Override
   public MapCodec<dje> a() {
      return a;
   }

   protected dje(akq<ebq<?, ?>> $$0, dfy $$1, dtb.d $$2) {
      super($$2);
      this.e = $$0;
      this.d = $$1;
   }

   @Override
   protected exv a(dtc $$0, dcc $$1, jd $$2, exh $$3) {
      return b;
   }

   @Override
   protected boolean b(dtc $$0, dcc $$1, jd $$2) {
      return $$0.a(awe.aM) || $$0.a(dga.fl) || $$0.a(dga.dX) || super.b($$0, $$1, $$2);
   }

   private Optional<? extends jm<ebq<?, ?>>> a(dcz $$0) {
      return $$0.H_().d(lu.aI).b(this.e);
   }

   @Override
   public boolean b(dcz $$0, jd $$1, dtc $$2) {
      dtc $$3 = $$0.a_($$1.e());
      return $$3.a(this.d);
   }

   @Override
   public boolean a(dcw $$0, ayw $$1, jd $$2, dtc $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(aqu $$0, ayw $$1, jd $$2, dtc $$3) {
      this.a($$0).ifPresent($$3x -> ((ebq)$$3x.a()).a($$0, $$0.l().g(), $$1, $$2));
   }
}
