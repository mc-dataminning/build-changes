import javax.annotation.Nullable;

public class cwm extends crz {
   public static final dfr a = dfq.n;

   protected cwm(dez.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Boolean.valueOf(false)));
   }

   @Override
   public void a(cpm $$0, gu $$1, dfa $$2, @Nullable biy $$3, ciy $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      qr $$5 = cgr.a($$4);
      if ($$5 != null && $$5.e("RecordItem")) {
         $$0.a($$1, $$2.a(a, Boolean.valueOf(true)), 2);
      }
   }

   @Override
   public bgq a(dfa $$0, cpm $$1, gu $$2, cbn $$3, bgp $$4, eha $$5) {
      if ($$0.c(a) && $$1.c_($$2) instanceof ddm $$6) {
         $$6.i();
         return bgq.a($$1.B);
      } else {
         return bgq.d;
      }
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, dfa $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof ddm $$5) {
            $$5.i();
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dcm a(gu $$0, dfa $$1) {
      return new ddm($$0, $$1);
   }

   @Override
   public boolean f_(dfa $$0) {
      return true;
   }

   @Override
   public int a(dfa $$0, cos $$1, gu $$2, ha $$3) {
      if ($$1.c_($$2) instanceof ddm $$4 && $$4.f()) {
         return 15;
      }

      return 0;
   }

   @Override
   public boolean d_(dfa $$0) {
      return true;
   }

   @Override
   public int a(dfa $$0, cpm $$1, gu $$2) {
      if ($$1.c_($$2) instanceof ddm $$3 && $$3.ar_().d() instanceof cjq $$4) {
         return $$4.h();
      }

      return 0;
   }

   @Override
   public cyr b_(dfa $$0) {
      return cyr.c;
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(a);
   }

   @Nullable
   @Override
   public <T extends dcm> dcn<T> a(cpm $$0, dfa $$1, dco<T> $$2) {
      return $$1.c(a) ? a($$2, dco.e, ddm::a) : null;
   }
}
