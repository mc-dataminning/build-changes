import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class dra extends dqa<dst> {
   public dra(Codec<dst> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dqc<dst> $$0) {
      dst $$1 = $$0.f();
      csz $$2 = $$0.b();
      atw $$3 = $$0.d();
      cvf $$4 = $$1.b.b();
      hx $$5 = a($$2, $$0.e().j().a(ib.a.b, $$2.J_() + 1, $$2.ak() - 1), $$4);
      if ($$5 == null) {
         return false;
      } else {
         int $$6 = $$1.a().a($$3);
         int $$7 = $$1.a().a($$3);
         int $$8 = $$1.a().a($$3);
         int $$9 = Math.max($$6, Math.max($$7, $$8));
         boolean $$10 = false;

         for (hx $$11 : hx.a($$5, $$6, $$7, $$8)) {
            if ($$11.k($$5) > $$9) {
               break;
            }

            dhn $$12 = $$2.a_($$11);
            if ($$12.a($$4)) {
               this.a($$2, $$11, $$1.c);
               $$10 = true;
            }
         }

         return $$10;
      }
   }

   @Nullable
   private static hx a(csg $$0, hx.a $$1, cvf $$2) {
      while ($$1.v() > $$0.J_() + 1) {
         dhn $$3 = $$0.a_($$1);
         if ($$3.a($$2)) {
            return $$1;
         }

         $$1.c(ib.a);
      }

      return null;
   }
}
