import javax.annotation.Nullable;

public class daw extends csk implements cwb {
   public static final dgj<dgv> a = dgb.bj;

   protected daw(dfk.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, dgv.b));
   }

   @Override
   public dcx a(gw $$0, dfl $$1) {
      return new dek($$0, $$1);
   }

   @Override
   public bha a(dfl $$0, cpx $$1, gw $$2, cbw $$3, bgz $$4, ehl $$5) {
      dcx $$6 = $$1.c_($$2);
      if ($$6 instanceof dek) {
         return ((dek)$$6).a($$3) ? bha.a($$1.B) : bha.d;
      } else {
         return bha.d;
      }
   }

   @Override
   public void a(cpx $$0, gw $$1, dfl $$2, @Nullable bji $$3, cjh $$4) {
      if (!$$0.B) {
         if ($$3 != null) {
            dcx $$5 = $$0.c_($$1);
            if ($$5 instanceof dek) {
               ((dek)$$5).a($$3);
            }
         }
      }
   }

   @Override
   public czc b_(dfl $$0) {
      return czc.c;
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(a);
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, csx $$3, gw $$4, boolean $$5) {
      if ($$1 instanceof aks) {
         if ($$1.c_($$2) instanceof dek $$7) {
            boolean $$8 = $$1.B($$2);
            boolean $$9 = $$7.G();
            if ($$8 && !$$9) {
               $$7.c(true);
               this.a((aks)$$1, $$7);
            } else if (!$$8 && $$9) {
               $$7.c(false);
            }
         }
      }
   }

   private void a(aks $$0, dek $$1) {
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
