import javax.annotation.Nullable;

public class dak extends cry implements cvp {
   public static final dfx<dgj> a = dfp.bj;

   protected dak(dey.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, dgj.b));
   }

   @Override
   public dcl a(gu $$0, dez $$1) {
      return new ddy($$0, $$1);
   }

   @Override
   public bgq a(dez $$0, cpl $$1, gu $$2, cbm $$3, bgp $$4, egz $$5) {
      dcl $$6 = $$1.c_($$2);
      if ($$6 instanceof ddy) {
         return ((ddy)$$6).a($$3) ? bgq.a($$1.B) : bgq.d;
      } else {
         return bgq.d;
      }
   }

   @Override
   public void a(cpl $$0, gu $$1, dez $$2, @Nullable biy $$3, cix $$4) {
      if (!$$0.B) {
         if ($$3 != null) {
            dcl $$5 = $$0.c_($$1);
            if ($$5 instanceof ddy) {
               ((ddy)$$5).a($$3);
            }
         }
      }
   }

   @Override
   public cyq b_(dez $$0) {
      return cyq.c;
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(a);
   }

   @Override
   public void a(dez $$0, cpl $$1, gu $$2, csl $$3, gu $$4, boolean $$5) {
      if ($$1 instanceof akk) {
         if ($$1.c_($$2) instanceof ddy $$7) {
            boolean $$8 = $$1.B($$2);
            boolean $$9 = $$7.G();
            if ($$8 && !$$9) {
               $$7.c(true);
               this.a((akk)$$1, $$7);
            } else if (!$$8 && $$9) {
               $$7.c(false);
            }
         }
      }
   }

   private void a(akk $$0, ddy $$1) {
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
