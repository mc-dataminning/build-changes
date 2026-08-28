import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class dkk extends dok implements dkp, drq {
   public static final MapCodec<dkk> a = b(dkk::new);
   private static final dym f = dyl.D;
   private static final int g = 6;
   protected static final fcs b = dkm.a(5.0, 0.0, 9.0, 11.0, 16.0, 15.0);
   protected static final fcs c = dkm.a(5.0, 0.0, 1.0, 11.0, 16.0, 7.0);
   protected static final fcs d = dkm.a(1.0, 0.0, 5.0, 7.0, 16.0, 11.0);
   protected static final fcs e = dkm.a(9.0, 0.0, 5.0, 15.0, 16.0, 11.0);

   @Override
   public MapCodec<dkk> a() {
      return a;
   }

   protected dkk(dxu.d $$0) {
      super($$0);
      this.l(this.F.b().b(f, Boolean.valueOf(false)).b(aF, jm.c));
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
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
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(f, aF);
   }

   @Override
   protected etx b_(dxv $$0) {
      return $$0.c(f) ? ety.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dxv $$0, dhl $$1, jh $$2) {
      jh $$3 = $$2.e();
      dxv $$4 = $$1.a_($$3);
      dxv $$5 = $$1.a_($$2.d());
      return ($$4.a(this) || $$4.a(axu.bA)) && ($$5.a(this) || $$5.a(dko.sY));
   }

   protected static boolean a(dhj $$0, jh $$1, etx $$2, jm $$3) {
      dxv $$4 = dko.sZ.m().b(f, Boolean.valueOf($$2.a(ety.c))).b(aF, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      if (($$4 == jm.a || $$4 == jm.b) && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      if ($$0.c(f)) {
         $$2.a($$3, ety.c, ety.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dxv $$0, ash $$1, jh $$2, bam $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean b(dhl $$0, jh $$1, dxv $$2) {
      Optional<jh> $$3 = l.a($$0, $$1, $$2.b(), jm.b, dko.sY);
      if ($$3.isEmpty()) {
         return false;
      } else {
         jh $$4 = $$3.get().d();
         dxv $$5 = $$0.a_($$4);
         return dkj.a($$0, $$4, $$5);
      }
   }

   @Override
   public boolean a(dhi $$0, bam $$1, jh $$2, dxv $$3) {
      return true;
   }

   @Override
   public void a(ash $$0, bam $$1, jh $$2, dxv $$3) {
      Optional<jh> $$4 = l.a($$0, $$2, $$3.b(), jm.b, dko.sY);
      if (!$$4.isEmpty()) {
         jh $$5 = $$4.get();
         jh $$6 = $$5.d();
         jm $$7 = $$3.c(aF);
         a($$0, $$5, $$0.b_($$5), $$7);
         dkj.a($$0, $$6, $$0.b_($$6), $$7);
      }
   }

   @Override
   public cxp a(dhl $$0, jh $$1, dxv $$2) {
      return new cxp(dko.sY);
   }
}
