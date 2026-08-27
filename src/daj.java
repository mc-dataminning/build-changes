import javax.annotation.Nullable;

public class daj extends crx implements cvo {
   public static final dfw<dgi> a = dfo.bj;

   protected daj(dex.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, dgi.b));
   }

   @Override
   public dck a(gv $$0, dey $$1) {
      return new ddx($$0, $$1);
   }

   @Override
   public bgo a(dey $$0, cpk $$1, gv $$2, cbl $$3, bgn $$4, ehb $$5) {
      dck $$6 = $$1.c_($$2);
      if ($$6 instanceof ddx) {
         return ((ddx)$$6).a($$3) ? bgo.a($$1.B) : bgo.d;
      } else {
         return bgo.d;
      }
   }

   @Override
   public void a(cpk $$0, gv $$1, dey $$2, @Nullable biw $$3, ciw $$4) {
      if (!$$0.B) {
         if ($$3 != null) {
            dck $$5 = $$0.c_($$1);
            if ($$5 instanceof ddx) {
               ((ddx)$$5).a($$3);
            }
         }
      }
   }

   @Override
   public cyp b_(dey $$0) {
      return cyp.c;
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(a);
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, csk $$3, gv $$4, boolean $$5) {
      if ($$1 instanceof aki) {
         if ($$1.c_($$2) instanceof ddx $$7) {
            boolean $$8 = $$1.B($$2);
            boolean $$9 = $$7.G();
            if ($$8 && !$$9) {
               $$7.c(true);
               this.a((aki)$$1, $$7);
            } else if (!$$8 && $$9) {
               $$7.c(false);
            }
         }
      }
   }

   private void a(aki $$0, ddx $$1) {
      switch ($$1.y()) {
         case a:
            $$1.b(false);
            break;
         case b:
            $$1.a($$0, false);
            break;
         case c:
            $$1.E();
         case d:
      }
   }
}
