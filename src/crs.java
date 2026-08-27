import javax.annotation.Nullable;

public class crs extends cry {
   public static final dft a = dfp.P;
   public static final dfq b = dfp.u;

   public crs(dey.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, ha.c).a(b, Boolean.valueOf(false)));
   }

   @Override
   public bgq a(dez $$0, cpl $$1, gu $$2, cbm $$3, bgp $$4, egz $$5) {
      if ($$1.B) {
         return bgq.a;
      } else {
         dcl $$6 = $$1.c_($$2);
         if ($$6 instanceof dce) {
            $$3.a((dce)$$6);
            $$3.a(apg.ar);
            cad.a($$3, true);
         }

         return bgq.b;
      }
   }

   @Override
   public void a(dez $$0, cpl $$1, gu $$2, dez $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         dcl $$5 = $$1.c_($$2);
         if ($$5 instanceof bgj) {
            bgm.a($$1, $$2, (bgj)$$5);
            $$1.c($$2, this);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(dez $$0, akk $$1, gu $$2, aru $$3) {
      dcl $$4 = $$1.c_($$2);
      if ($$4 instanceof dce) {
         ((dce)$$4).i();
      }
   }

   @Nullable
   @Override
   public dcl a(gu $$0, dez $$1) {
      return new dce($$0, $$1);
   }

   @Override
   public cyq b_(dez $$0) {
      return cyq.c;
   }

   @Override
   public void a(cpl $$0, gu $$1, dez $$2, @Nullable biy $$3, cix $$4) {
      if ($$4.A()) {
         dcl $$5 = $$0.c_($$1);
         if ($$5 instanceof dce) {
            ((dce)$$5).a($$4.y());
         }
      }
   }

   @Override
   public boolean d_(dez $$0) {
      return true;
   }

   @Override
   public int a(dez $$0, cpl $$1, gu $$2) {
      return ced.a($$1.c_($$2));
   }

   @Override
   public dez a(dez $$0, cyx $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dez a(dez $$0, cxg $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(a, b);
   }

   @Override
   public dez a(clf $$0) {
      return this.n().a(a, $$0.d().g());
   }
}
