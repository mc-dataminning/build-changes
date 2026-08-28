import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class dkb extends dob implements dkg, drj {
   public static final MapCodec<dkb> a = b(dkb::new);
   private static final dyf f = dye.J;
   private static final int g = 6;
   protected static final fcl b = dkd.a(5.0, 0.0, 9.0, 11.0, 16.0, 15.0);
   protected static final fcl c = dkd.a(5.0, 0.0, 1.0, 11.0, 16.0, 7.0);
   protected static final fcl d = dkd.a(1.0, 0.0, 5.0, 7.0, 16.0, 11.0);
   protected static final fcl e = dkd.a(9.0, 0.0, 5.0, 15.0, 16.0, 11.0);

   @Override
   public MapCodec<dkb> a() {
      return a;
   }

   protected dkb(dxn.d $$0) {
      super($$0);
      this.l(this.F.b().b(f, Boolean.valueOf(false)).b(aF, jm.c));
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
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
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(f, aF);
   }

   @Override
   protected etq b_(dxo $$0) {
      return $$0.c(f) ? etr.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dxo $$0, dhc $$1, jh $$2) {
      jh $$3 = $$2.e();
      dxo $$4 = $$1.a_($$3);
      dxo $$5 = $$1.a_($$2.d());
      return ($$4.a(this) || $$4.a(axk.bA)) && ($$5.a(this) || $$5.a(dkf.tf));
   }

   protected static boolean a(dha $$0, jh $$1, etq $$2, jm $$3) {
      dxo $$4 = dkf.tg.m().b(f, Boolean.valueOf($$2.a(etr.c))).b(aF, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      if (($$4 == jm.a || $$4 == jm.b) && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      if ($$0.c(f)) {
         $$2.a($$3, etr.c, etr.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dxo $$0, arx $$1, jh $$2, bac $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean b(dhc $$0, jh $$1, dxo $$2) {
      Optional<jh> $$3 = l.a($$0, $$1, $$2.b(), jm.b, dkf.tf);
      if ($$3.isEmpty()) {
         return false;
      } else {
         jh $$4 = $$3.get().d();
         dxo $$5 = $$0.a_($$4);
         return dka.a($$0, $$4, $$5);
      }
   }

   @Override
   public boolean a(dgz $$0, bac $$1, jh $$2, dxo $$3) {
      return true;
   }

   @Override
   public void a(arx $$0, bac $$1, jh $$2, dxo $$3) {
      Optional<jh> $$4 = l.a($$0, $$2, $$3.b(), jm.b, dkf.tf);
      if (!$$4.isEmpty()) {
         jh $$5 = $$4.get();
         jh $$6 = $$5.d();
         jm $$7 = $$3.c(aF);
         a($$0, $$5, $$0.b_($$5), $$7);
         dka.a($$0, $$6, $$0.b_($$6), $$7);
      }
   }

   @Override
   protected cxg a(dhc $$0, jh $$1, dxo $$2) {
      return new cxg(dkf.tf);
   }
}
