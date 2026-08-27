import javax.annotation.Nullable;

public class cwx extends csk {
   public static final dgc a = dgb.n;

   protected cwx(dfk.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Boolean.valueOf(false)));
   }

   @Override
   public void a(cpx $$0, gw $$1, dfl $$2, @Nullable bji $$3, cjh $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      qy $$5 = cha.a($$4);
      if ($$5 != null && $$5.e("RecordItem")) {
         $$0.a($$1, $$2.a(a, Boolean.valueOf(true)), 2);
      }
   }

   @Override
   public bha a(dfl $$0, cpx $$1, gw $$2, cbw $$3, bgz $$4, ehl $$5) {
      if ($$0.c(a) && $$1.c_($$2) instanceof ddx $$6) {
         $$6.i();
         return bha.a($$1.B);
      } else {
         return bha.d;
      }
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, dfl $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$1.c_($$2) instanceof ddx $$5) {
            $$5.i();
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public dcx a(gw $$0, dfl $$1) {
      return new ddx($$0, $$1);
   }

   @Override
   public boolean f_(dfl $$0) {
      return true;
   }

   @Override
   public int a(dfl $$0, cpd $$1, gw $$2, hc $$3) {
      if ($$1.c_($$2) instanceof ddx $$4 && $$4.f()) {
         return 15;
      }

      return 0;
   }

   @Override
   public boolean d_(dfl $$0) {
      return true;
   }

   @Override
   public int a(dfl $$0, cpx $$1, gw $$2) {
      if ($$1.c_($$2) instanceof ddx $$3 && $$3.av_().d() instanceof cjz $$4) {
         return $$4.h();
      }

      return 0;
   }

   @Override
   public czc b_(dfl $$0) {
      return czc.c;
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(a);
   }

   @Nullable
   @Override
   public <T extends dcx> dcy<T> a(cpx $$0, dfl $$1, dcz<T> $$2) {
      return $$1.c(a) ? a($$2, dcz.e, ddx::a) : null;
   }
}
