import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public class dsu extends dru<dun> {
   public dsu(Codec<dun> $$0) {
      super($$0);
   }

   @Override
   public boolean a(drw<dun> $$0) {
      dun $$1 = $$0.f();
      cuk $$2 = $$0.b();
      auv $$3 = $$0.d();
      cwq $$4 = $$1.b.b();
      hx $$5 = a($$2, $$0.e().j().a(ic.a.b, $$2.J_() + 1, $$2.al() - 1), $$4);
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

            djh $$12 = $$2.a_($$11);
            if ($$12.a($$4)) {
               this.a($$2, $$11, $$1.c);
               $$10 = true;
            }
         }

         return $$10;
      }
   }

   @Nullable
   private static hx a(ctq $$0, hx.a $$1, cwq $$2) {
      while ($$1.v() > $$0.J_() + 1) {
         djh $$3 = $$0.a_($$1);
         if ($$3.a($$2)) {
            return $$1;
         }

         $$1.c(ic.a);
      }

      return null;
   }
}
