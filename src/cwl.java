import javax.annotation.Nullable;

public class cwl extends cry {
   public static final dfq a = dfp.n;

   protected cwl(dey.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Boolean.valueOf(false)));
   }

   @Override
   public void a(cpl $$0, gu $$1, dez $$2, @Nullable biy $$3, cix $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      qr $$5 = cgq.a($$4);
      if ($$5 != null && $$5.e("RecordItem")) {
         $$0.a($$1, $$2.a(a, Boolean.valueOf(true)), 2);
      }
   }

   @Override
   public bgq a(dez $$0, cpl $$1, gu $$2, cbm $$3, bgp $$4, egz $$5) {
      if ($$0.c(a) && $$1.c_($$2) instanceof ddl $$6) {
         $$6.i();
         return bgq.a($$1.B);
      } else {
         return bgq.d;
      }
   }

   @Override
   public void a(dez $$0, cpl $$1, gu $$2, dez $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof ddl $$5) {
            $$5.i();
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dcl a(gu $$0, dez $$1) {
      return new ddl($$0, $$1);
   }

   @Override
   public boolean f_(dez $$0) {
      return true;
   }

   @Override
   public int a(dez $$0, cor $$1, gu $$2, ha $$3) {
      if ($$1.c_($$2) instanceof ddl $$4 && $$4.f()) {
         return 15;
      }

      return 0;
   }

   @Override
   public boolean d_(dez $$0) {
      return true;
   }

   @Override
   public int a(dez $$0, cpl $$1, gu $$2) {
      if ($$1.c_($$2) instanceof ddl $$3 && $$3.aq_().d() instanceof cjp $$4) {
         return $$4.h();
      }

      return 0;
   }

   @Override
   public cyq b_(dez $$0) {
      return cyq.c;
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(a);
   }

   @Nullable
   @Override
   public <T extends dcl> dcm<T> a(cpl $$0, dez $$1, dcn<T> $$2) {
      return $$1.c(a) ? a($$2, dcn.e, ddl::a) : null;
   }
}
