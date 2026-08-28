import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class djk extends dnk implements djp, dqs {
   public static final MapCodec<djk> a = b(djk::new);
   private static final dxo f = dxn.J;
   private static final int g = 6;
   protected static final fbu b = djm.a(5.0, 0.0, 9.0, 11.0, 16.0, 15.0);
   protected static final fbu c = djm.a(5.0, 0.0, 1.0, 11.0, 16.0, 7.0);
   protected static final fbu d = djm.a(1.0, 0.0, 5.0, 7.0, 16.0, 11.0);
   protected static final fbu e = djm.a(9.0, 0.0, 5.0, 15.0, 16.0, 11.0);

   @Override
   public MapCodec<djk> a() {
      return a;
   }

   protected djk(dww.d $$0) {
      super($$0);
      this.l(this.F.b().b(f, Boolean.valueOf(false)).b(aF, jn.c));
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
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
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(f, aF);
   }

   @Override
   protected esz b_(dwx $$0) {
      return $$0.c(f) ? eta.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dwx $$0, dgl $$1, ji $$2) {
      ji $$3 = $$2.e();
      dwx $$4 = $$1.a_($$3);
      dwx $$5 = $$1.a_($$2.d());
      return ($$4.a(this) || $$4.a(awp.bA)) && ($$5.a(this) || $$5.a(djo.tf));
   }

   protected static boolean a(dgj $$0, ji $$1, esz $$2, jn $$3) {
      dwx $$4 = djo.tg.m().b(f, Boolean.valueOf($$2.a(eta.c))).b(aF, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      if (($$4 == jn.a || $$4 == jn.b) && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      if ($$0.c(f)) {
         $$2.a($$3, eta.c, eta.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dwx $$0, ard $$1, ji $$2, azh $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean a(dgl $$0, ji $$1, dwx $$2) {
      Optional<ji> $$3 = l.a($$0, $$1, $$2.b(), jn.b, djo.tf);
      if ($$3.isEmpty()) {
         return false;
      } else {
         ji $$4 = $$3.get().d();
         dwx $$5 = $$0.a_($$4);
         return djj.a((dgk)$$0, $$4, $$5);
      }
   }

   @Override
   public boolean a(dgi $$0, azh $$1, ji $$2, dwx $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dwx $$3) {
      Optional<ji> $$4 = l.a($$0, $$2, $$3.b(), jn.b, djo.tf);
      if (!$$4.isEmpty()) {
         ji $$5 = $$4.get();
         ji $$6 = $$5.d();
         jn $$7 = $$3.c(aF);
         a($$0, $$5, $$0.b_($$5), $$7);
         djj.a($$0, $$6, $$0.b_($$6), $$7);
      }
   }

   @Override
   protected cwp a(dgl $$0, ji $$1, dwx $$2, boolean $$3) {
      return new cwp(djo.tf);
   }
}
