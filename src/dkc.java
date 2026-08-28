import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class dkc extends doc implements dkh, dri {
   public static final MapCodec<dkc> a = b(dkc::new);
   private static final dye f = dyd.D;
   private static final int g = 6;
   protected static final fcm b = dke.a(5.0, 0.0, 9.0, 11.0, 16.0, 15.0);
   protected static final fcm c = dke.a(5.0, 0.0, 1.0, 11.0, 16.0, 7.0);
   protected static final fcm d = dke.a(1.0, 0.0, 5.0, 7.0, 16.0, 11.0);
   protected static final fcm e = dke.a(9.0, 0.0, 5.0, 15.0, 16.0, 11.0);

   @Override
   public MapCodec<dkc> a() {
      return a;
   }

   protected dkc(dxm.d $$0) {
      super($$0);
      this.l(this.F.b().b(f, Boolean.valueOf(false)).b(aF, jm.c));
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
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
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(f, aF);
   }

   @Override
   protected etp b_(dxn $$0) {
      return $$0.c(f) ? etq.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dxn $$0, dhd $$1, jh $$2) {
      jh $$3 = $$2.e();
      dxn $$4 = $$1.a_($$3);
      dxn $$5 = $$1.a_($$2.d());
      return ($$4.a(this) || $$4.a(axu.bA)) && ($$5.a(this) || $$5.a(dkg.sY));
   }

   protected static boolean a(dhb $$0, jh $$1, etp $$2, jm $$3) {
      dxn $$4 = dkg.sZ.m().b(f, Boolean.valueOf($$2.a(etq.c))).b(aF, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      if (($$4 == jm.a || $$4 == jm.b) && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      if ($$0.c(f)) {
         $$2.a($$3, etq.c, etq.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dxn $$0, ash $$1, jh $$2, bam $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean b(dhd $$0, jh $$1, dxn $$2) {
      Optional<jh> $$3 = l.a($$0, $$1, $$2.b(), jm.b, dkg.sY);
      if ($$3.isEmpty()) {
         return false;
      } else {
         jh $$4 = $$3.get().d();
         dxn $$5 = $$0.a_($$4);
         return dkb.a($$0, $$4, $$5);
      }
   }

   @Override
   public boolean a(dha $$0, bam $$1, jh $$2, dxn $$3) {
      return true;
   }

   @Override
   public void a(ash $$0, bam $$1, jh $$2, dxn $$3) {
      Optional<jh> $$4 = l.a($$0, $$2, $$3.b(), jm.b, dkg.sY);
      if (!$$4.isEmpty()) {
         jh $$5 = $$4.get();
         jh $$6 = $$5.d();
         jm $$7 = $$3.c(aF);
         a($$0, $$5, $$0.b_($$5), $$7);
         dkb.a($$0, $$6, $$0.b_($$6), $$7);
      }
   }

   @Override
   public cxk a(dhd $$0, jh $$1, dxn $$2) {
      return new cxk(dkg.sY);
   }
}
