import javax.annotation.Nullable;

public class dap extends csd implements cvu {
   public static final dgc<dgo> a = dfu.bj;

   protected dap(dfd.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, dgo.b));
   }

   @Override
   public dcq a(gw $$0, dfe $$1) {
      return new ded($$0, $$1);
   }

   @Override
   public bgt a(dfe $$0, cpq $$1, gw $$2, cbp $$3, bgs $$4, ehe $$5) {
      dcq $$6 = $$1.c_($$2);
      if ($$6 instanceof ded) {
         return ((ded)$$6).a($$3) ? bgt.a($$1.B) : bgt.d;
      } else {
         return bgt.d;
      }
   }

   @Override
   public void a(cpq $$0, gw $$1, dfe $$2, @Nullable bjb $$3, cja $$4) {
      if (!$$0.B) {
         if ($$3 != null) {
            dcq $$5 = $$0.c_($$1);
            if ($$5 instanceof ded) {
               ((ded)$$5).a($$3);
            }
         }
      }
   }

   @Override
   public cyv b_(dfe $$0) {
      return cyv.c;
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(a);
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, csq $$3, gw $$4, boolean $$5) {
      if ($$1 instanceof akn) {
         if ($$1.c_($$2) instanceof ded $$7) {
            boolean $$8 = $$1.B($$2);
            boolean $$9 = $$7.G();
            if ($$8 && !$$9) {
               $$7.c(true);
               this.a((akn)$$1, $$7);
            } else if (!$$8 && $$9) {
               $$7.c(false);
            }
         }
      }
   }

   private void a(akn $$0, ded $$1) {
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
