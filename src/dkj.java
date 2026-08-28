import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class dkj extends doj implements dko, drp {
   public static final MapCodec<dkj> a = b(dkj::new);
   private static final dyl f = dyk.D;
   private static final int g = 6;
   protected static final fcr b = dkl.a(5.0, 0.0, 9.0, 11.0, 16.0, 15.0);
   protected static final fcr c = dkl.a(5.0, 0.0, 1.0, 11.0, 16.0, 7.0);
   protected static final fcr d = dkl.a(1.0, 0.0, 5.0, 7.0, 16.0, 11.0);
   protected static final fcr e = dkl.a(9.0, 0.0, 5.0, 15.0, 16.0, 11.0);

   @Override
   public MapCodec<dkj> a() {
      return a;
   }

   protected dkj(dxt.d $$0) {
      super($$0);
      this.l(this.F.b().b(f, Boolean.valueOf(false)).b(aF, jm.c));
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      switch ((jm)$$0.c(aF)) {
         case d:
            return c;
         case c:
         default:
            return b;
         case e:
            return e;
         case f:
            return d;
      }
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(f, aF);
   }

   @Override
   protected etw b_(dxu $$0) {
      return $$0.c(f) ? etx.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dxu $$0, dhk $$1, jh $$2) {
      jh $$3 = $$2.e();
      dxu $$4 = $$1.a_($$3);
      dxu $$5 = $$1.a_($$2.d());
      return ($$4.a(this) || $$4.a(axu.bA)) && ($$5.a(this) || $$5.a(dkn.sY));
   }

   protected static boolean a(dhi $$0, jh $$1, etw $$2, jm $$3) {
      dxu $$4 = dkn.sZ.m().b(f, Boolean.valueOf($$2.a(etx.c))).b(aF, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      if (($$4 == jm.a || $$4 == jm.b) && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      if ($$0.c(f)) {
         $$2.a($$3, etx.c, etx.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dxu $$0, ash $$1, jh $$2, bam $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean b(dhk $$0, jh $$1, dxu $$2) {
      Optional<jh> $$3 = l.a($$0, $$1, $$2.b(), jm.b, dkn.sY);
      if ($$3.isEmpty()) {
         return false;
      } else {
         jh $$4 = $$3.get().d();
         dxu $$5 = $$0.a_($$4);
         return dki.a($$0, $$4, $$5);
      }
   }

   @Override
   public boolean a(dhh $$0, bam $$1, jh $$2, dxu $$3) {
      return true;
   }

   @Override
   public void a(ash $$0, bam $$1, jh $$2, dxu $$3) {
      Optional<jh> $$4 = l.a($$0, $$2, $$3.b(), jm.b, dkn.sY);
      if (!$$4.isEmpty()) {
         jh $$5 = $$4.get();
         jh $$6 = $$5.d();
         jm $$7 = $$3.c(aF);
         a($$0, $$5, $$0.b_($$5), $$7);
         dki.a($$0, $$6, $$0.b_($$6), $$7);
      }
   }

   @Override
   public cxo a(dhk $$0, jh $$1, dxu $$2) {
      return new cxo(dkn.sY);
   }
}
