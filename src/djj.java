import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class djj extends dnj implements djo, dqr {
   public static final MapCodec<djj> a = b(djj::new);
   private static final dxn f = dxm.J;
   private static final int g = 6;
   protected static final fbt b = djl.a(5.0, 0.0, 9.0, 11.0, 16.0, 15.0);
   protected static final fbt c = djl.a(5.0, 0.0, 1.0, 11.0, 16.0, 7.0);
   protected static final fbt d = djl.a(1.0, 0.0, 5.0, 7.0, 16.0, 11.0);
   protected static final fbt e = djl.a(9.0, 0.0, 5.0, 15.0, 16.0, 11.0);

   @Override
   public MapCodec<djj> a() {
      return a;
   }

   protected djj(dwv.d $$0) {
      super($$0);
      this.l(this.F.b().b(f, Boolean.valueOf(false)).b(aF, jn.c));
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
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
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(f, aF);
   }

   @Override
   protected esy b_(dww $$0) {
      return $$0.c(f) ? esz.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dww $$0, dgk $$1, ji $$2) {
      ji $$3 = $$2.e();
      dww $$4 = $$1.a_($$3);
      dww $$5 = $$1.a_($$2.d());
      return ($$4.a(this) || $$4.a(awp.bA)) && ($$5.a(this) || $$5.a(djn.tf));
   }

   protected static boolean a(dgi $$0, ji $$1, esy $$2, jn $$3) {
      dww $$4 = djn.tg.m().b(f, Boolean.valueOf($$2.a(esz.c))).b(aF, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      if (($$4 == jn.a || $$4 == jn.b) && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      if ($$0.c(f)) {
         $$2.a($$3, esz.c, esz.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dww $$0, ard $$1, ji $$2, azh $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean a(dgk $$0, ji $$1, dww $$2) {
      Optional<ji> $$3 = l.a($$0, $$1, $$2.b(), jn.b, djn.tf);
      if ($$3.isEmpty()) {
         return false;
      } else {
         ji $$4 = $$3.get().d();
         dww $$5 = $$0.a_($$4);
         return dji.a((dgj)$$0, $$4, $$5);
      }
   }

   @Override
   public boolean a(dgh $$0, azh $$1, ji $$2, dww $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dww $$3) {
      Optional<ji> $$4 = l.a($$0, $$2, $$3.b(), jn.b, djn.tf);
      if (!$$4.isEmpty()) {
         ji $$5 = $$4.get();
         ji $$6 = $$5.d();
         jn $$7 = $$3.c(aF);
         a($$0, $$5, $$0.b_($$5), $$7);
         dji.a($$0, $$6, $$0.b_($$6), $$7);
      }
   }

   @Override
   protected cwo a(dgk $$0, ji $$1, dww $$2, boolean $$3) {
      return new cwo(djn.tf);
   }
}
