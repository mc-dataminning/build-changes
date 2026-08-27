import javax.annotation.Nullable;

public class daw extends csm {
   public static final dfr a = dfq.B;

   public daw(dez.d $$0) {
      super($$0);
      this.k(this.n().a(a, Boolean.valueOf(false)));
   }

   @Override
   public void b(dfa $$0, cpm $$1, gu $$2, dfa $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if ($$1.B($$2)) {
            a($$1, $$2);
            $$1.a($$2, false);
         }
      }
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, csm $$3, gu $$4, boolean $$5) {
      if ($$1.B($$2)) {
         a($$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   public void a(cpm $$0, gu $$1, dfa $$2, cbn $$3) {
      if (!$$0.r_() && !$$3.f() && $$2.c(a)) {
         a($$0, $$1);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cpm $$0, gu $$1, cpe $$2) {
      if (!$$0.B) {
         byh $$3 = new byh($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.e());
         int $$4 = $$3.m();
         $$3.b((short)($$0.z.a($$4 / 4) + $$4 / 8));
         $$0.b($$3);
      }
   }

   public static void a(cpm $$0, gu $$1) {
      a($$0, $$1, null);
   }

   private static void a(cpm $$0, gu $$1, @Nullable biy $$2) {
      if (!$$0.B) {
         byh $$3 = new byh($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2);
         $$0.b($$3);
         $$0.a(null, $$3.dp(), $$3.dr(), $$3.dv(), aow.xG, aox.e, 1.0F, 1.0F);
         $$0.a($$2, djk.I, $$1);
      }
   }

   @Override
   public bgq a(dfa $$0, cpm $$1, gu $$2, cbn $$3, bgp $$4, eha $$5) {
      ciy $$6 = $$3.b($$4);
      if (!$$6.a(cjb.nE) && !$$6.a(cjb.tf)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         a($$1, $$2, $$3);
         $$1.a($$2, csn.a.n(), 11);
         cit $$7 = $$6.d();
         if (!$$3.f()) {
            if ($$6.a(cjb.nE)) {
               $$6.a(1, $$3, $$1x -> $$1x.d($$4));
            } else {
               $$6.h(1);
            }
         }

         $$3.b(apg.c.b($$7));
         return bgq.a($$1.B);
      }
   }

   @Override
   public void a(cpm $$0, dfa $$1, eha $$2, ccf $$3) {
      if (!$$0.B) {
         gu $$4 = $$2.a();
         bii $$5 = $$3.v();
         if ($$3.bM() && $$3.a($$0, $$4)) {
            a($$0, $$4, $$5 instanceof biy ? (biy)$$5 : null);
            $$0.a($$4, false);
         }
      }
   }

   @Override
   public boolean a(cpe $$0) {
      return false;
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(a);
   }
}
