import javax.annotation.Nullable;

public class cod extends cob {
   public static final int cb = 8;
   private int cc;
   @Nullable
   jh cd;

   public cod(bvr<? extends cob> $$0, dhi $$1) {
      super($$0, $$1);
   }

   public void h(jh $$0) {
      this.cd = $$0;
   }

   @Override
   public boolean a(ash $$0, bua $$1, float $$2) {
      if (this.dW().C) {
         return super.a($$0, $$1, $$2);
      } else if ($$1.a(axw.d)) {
         return super.a($$0, $$1, $$2);
      } else if (!this.a($$0, $$1) && this.cc <= 0) {
         this.cc = 8;
         this.dW().a(this, (byte)66);
         if (this.dW().c_(this.cd) instanceof dvm $$3 && $$3.a(this)) {
            if ($$1.d() instanceof cpx) {
               $$3.c();
            }

            this.f($$1);
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public void d_() {
      if (this.cc > 0) {
         this.cc--;
      }

      super.d_();
   }

   @Override
   public void h() {
      if (this.dW().C || this.cd != null && this.dW().c_(this.cd) instanceof dvm $$0 && $$0.a(this)) {
         super.h();
         if (this.dW().C) {
            this.go();
         }
      } else {
         this.c(bvk.d.b);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 66) {
         this.cc = 8;
         this.f(this.dX().p());
      } else {
         super.b($$0);
      }
   }

   private void go() {
      this.ca.a(this.cc > 0, this.af);
   }

   public void h(@Nullable bua $$0) {
      if (this.dW() instanceof ash $$1) {
         fbt $$2 = this.cR();
         fby $$3 = $$2.f();
         double $$4 = $$2.b() * 0.3;
         double $$5 = $$2.c() * 0.3;
         double $$6 = $$2.d() * 0.3;
         $$1.a(new lk(ls.bg, dko.u.m()), $$3.d, $$3.e, $$3.f, 100, $$4, $$5, $$6, 0.0);
         $$1.a(new lk(ls.bg, dko.cB.m().b(dmi.c, dmi.a.c)), $$3.d, $$3.e, $$3.f, 10, $$4, $$5, $$6, 0.0);
      }

      this.b(this.o_());
      if (this.bl >= 0 && $$0 != null && $$0.d() instanceof bwg $$7) {
         $$7.a(this, this.bl, $$0);
      }

      this.a(bvk.d.b);
   }

   @Override
   protected boolean r(bvk $$0) {
      return false;
   }

   @Override
   protected boolean bR() {
      return false;
   }

   @Override
   protected void p(bvk $$0) {
      throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
   }

   @Override
   public boolean o(boolean $$0) {
      return false;
   }

   @Override
   protected cfs b(dhi $$0) {
      return new cod.a(this, $$0);
   }

   class a extends cfr {
      a(final cob $$0, final dhi $$1) {
         super($$0, $$1);
      }

      @Override
      public void c() {
         if (cod.this.p()) {
            super.c();
         }
      }

      @Override
      protected eun a(int $$0) {
         this.o = cod.this.new b();
         return new eun(this.o, $$0);
      }
   }

   class b extends eut {
      private static final int m = 1024;

      @Override
      public euo a(euq $$0, int $$1, int $$2, int $$3) {
         jh $$4 = cod.this.cd;
         if ($$4 == null) {
            return super.a($$0, $$1, $$2, $$3);
         } else {
            double $$5 = $$4.j(new kl($$1, $$2, $$3));
            return $$5 > 1024.0 && $$5 >= $$4.j($$0.b()) ? euo.a : super.a($$0, $$1, $$2, $$3);
         }
      }
   }
}
