import javax.annotation.Nullable;

public class cwk extends crx {
   public static final dfp a = dfo.n;

   protected cwk(dex.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Boolean.valueOf(false)));
   }

   @Override
   public void a(cpk $$0, gv $$1, dey $$2, @Nullable biw $$3, ciw $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      qs $$5 = cgp.a($$4);
      if ($$5 != null && $$5.e("RecordItem")) {
         $$0.a($$1, $$2.a(a, Boolean.valueOf(true)), 2);
      }
   }

   @Override
   public bgo a(dey $$0, cpk $$1, gv $$2, cbl $$3, bgn $$4, ehb $$5) {
      if ($$0.c(a) && $$1.c_($$2) instanceof ddk $$6) {
         $$6.i();
         return bgo.a($$1.B);
      } else {
         return bgo.d;
      }
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, dey $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof ddk $$5) {
            $$5.i();
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dck a(gv $$0, dey $$1) {
      return new ddk($$0, $$1);
   }

   @Override
   public boolean f_(dey $$0) {
      return true;
   }

   @Override
   public int a(dey $$0, coq $$1, gv $$2, hb $$3) {
      if ($$1.c_($$2) instanceof ddk $$4 && $$4.f()) {
         return 15;
      }

      return 0;
   }

   @Override
   public boolean d_(dey $$0) {
      return true;
   }

   @Override
   public int a(dey $$0, cpk $$1, gv $$2) {
      if ($$1.c_($$2) instanceof ddk $$3 && $$3.ar_().d() instanceof cjo $$4) {
         return $$4.h();
      }

      return 0;
   }

   @Override
   public cyp b_(dey $$0) {
      return cyp.c;
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(a);
   }

   @Nullable
   @Override
   public <T extends dck> dcl<T> a(cpk $$0, dey $$1, dcm<T> $$2) {
      return $$1.c(a) ? a($$2, dcm.e, ddk::a) : null;
   }
}
