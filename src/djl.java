import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class djl extends dnl implements djq, dqt {
   public static final MapCodec<djl> a = b(djl::new);
   private static final dxp f = dxo.J;
   private static final int g = 6;
   protected static final fbv b = djn.a(5.0, 0.0, 9.0, 11.0, 16.0, 15.0);
   protected static final fbv c = djn.a(5.0, 0.0, 1.0, 11.0, 16.0, 7.0);
   protected static final fbv d = djn.a(1.0, 0.0, 5.0, 7.0, 16.0, 11.0);
   protected static final fbv e = djn.a(9.0, 0.0, 5.0, 15.0, 16.0, 11.0);

   @Override
   public MapCodec<djl> a() {
      return a;
   }

   protected djl(dwx.d $$0) {
      super($$0);
      this.l(this.F.b().b(f, Boolean.valueOf(false)).b(aF, jn.c));
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      switch ((jn)$$0.c(aF)) {
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
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(f, aF);
   }

   @Override
   protected eta b_(dwy $$0) {
      return $$0.c(f) ? etb.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dwy $$0, dgm $$1, ji $$2) {
      ji $$3 = $$2.e();
      dwy $$4 = $$1.a_($$3);
      dwy $$5 = $$1.a_($$2.d());
      return ($$4.a(this) || $$4.a(awp.bA)) && ($$5.a(this) || $$5.a(djp.tf));
   }

   protected static boolean a(dgk $$0, ji $$1, eta $$2, jn $$3) {
      dwy $$4 = djp.tg.m().b(f, Boolean.valueOf($$2.a(etb.c))).b(aF, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      if (($$4 == jn.a || $$4 == jn.b) && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      if ($$0.c(f)) {
         $$2.a($$3, etb.c, etb.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dwy $$0, ard $$1, ji $$2, azh $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean a(dgm $$0, ji $$1, dwy $$2) {
      Optional<ji> $$3 = l.a($$0, $$1, $$2.b(), jn.b, djp.tf);
      if ($$3.isEmpty()) {
         return false;
      } else {
         ji $$4 = $$3.get().d();
         dwy $$5 = $$0.a_($$4);
         return djk.a((dgl)$$0, $$4, $$5);
      }
   }

   @Override
   public boolean a(dgj $$0, azh $$1, ji $$2, dwy $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dwy $$3) {
      Optional<ji> $$4 = l.a($$0, $$2, $$3.b(), jn.b, djp.tf);
      if (!$$4.isEmpty()) {
         ji $$5 = $$4.get();
         ji $$6 = $$5.d();
         jn $$7 = $$3.c(aF);
         a($$0, $$5, $$0.b_($$5), $$7);
         djk.a($$0, $$6, $$0.b_($$6), $$7);
      }
   }

   @Override
   protected cwq a(dgm $$0, ji $$1, dwy $$2, boolean $$3) {
      return new cwq(djp.tf);
   }
}
