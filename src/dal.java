import javax.annotation.Nullable;

public class dal extends crz implements cvq {
   public static final dfy<dgk> a = dfq.bj;

   protected dal(dez.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, dgk.b));
   }

   @Override
   public dcm a(gu $$0, dfa $$1) {
      return new ddz($$0, $$1);
   }

   @Override
   public bgq a(dfa $$0, cpm $$1, gu $$2, cbn $$3, bgp $$4, eha $$5) {
      dcm $$6 = $$1.c_($$2);
      if ($$6 instanceof ddz) {
         return ((ddz)$$6).a($$3) ? bgq.a($$1.B) : bgq.d;
      } else {
         return bgq.d;
      }
   }

   @Override
   public void a(cpm $$0, gu $$1, dfa $$2, @Nullable biy $$3, ciy $$4) {
      if (!$$0.B) {
         if ($$3 != null) {
            dcm $$5 = $$0.c_($$1);
            if ($$5 instanceof ddz) {
               ((ddz)$$5).a($$3);
            }
         }
      }
   }

   @Override
   public cyr b_(dfa $$0) {
      return cyr.c;
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(a);
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, csm $$3, gu $$4, boolean $$5) {
      if ($$1 instanceof akk) {
         if ($$1.c_($$2) instanceof ddz $$7) {
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

   private void a(akk $$0, ddz $$1) {
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
