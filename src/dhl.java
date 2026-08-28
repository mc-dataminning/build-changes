import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhl extends dfk implements dna {
   public static final MapCodec<dhl> a = b(dhl::new);
   public static final dtt b = dts.C;
   private static final int d = 3;
   protected static final exv c = dfy.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<dhl> a() {
      return a;
   }

   public dhl(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(b);
   }

   @Override
   public dqh a(jd $$0, dtc $$1) {
      return new dqt($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dqh> dqi<T> a(dcw $$0, dtc $$1, dqj<T> $$2) {
      return a($$2, dqj.z, $$0.B ? dqt::a : dqt::b);
   }

   @Override
   protected dmf a_(dtc $$0) {
      return dmf.b;
   }

   @Override
   protected epe b_(dtc $$0) {
      return $$0.c(b) ? epf.c.a(false) : super.b_($$0);
   }

   @Override
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, epf.c, epf.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected exv a(dtc $$0, dcc $$1, jd $$2, exh $$3) {
      return c;
   }

   @Nullable
   @Override
   public dtc a(cyd $$0) {
      epe $$1 = $$0.q().b_($$0.a());
      return this.o().a(b, Boolean.valueOf($$1.a(awk.a) && $$1.e() == 8));
   }

   @Override
   protected boolean a(dtc $$0, ept $$1) {
      return false;
   }
}
