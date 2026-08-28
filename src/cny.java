import javax.annotation.Nullable;

public class cny extends cnw {
   public static final int cb = 8;
   private int cc;
   @Nullable
   jh cd;

   public cny(bvm<? extends cnw> $$0, dha $$1) {
      super($$0, $$1);
   }

   public void h(jh $$0) {
      this.cd = $$0;
   }

   @Override
   public boolean a(ash $$0, btv $$1, float $$2) {
      if (this.dV().C) {
         return super.a($$0, $$1, $$2);
      } else if ($$1.a(axw.d)) {
         return super.a($$0, $$1, $$2);
      } else if (!this.a($$0, $$1) && this.cc <= 0 && $$1.d() instanceof cps) {
         this.cc = 8;
         this.dV().a(this, (byte)66);
         if (this.dV().c_(this.cd) instanceof dve $$3 && $$3.a(this)) {
            $$3.c();
            this.f($$1);
         }

         return true;
      } else {
         return true;
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
      if (this.dV().C || this.cd != null && this.dV().c_(this.cd) instanceof dve $$0 && $$0.a(this)) {
         super.h();
         if (this.dV().C) {
            this.gm();
         }
      } else {
         this.c(bvf.c.b);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 66) {
         this.cc = 8;
         this.f(this.dW().p());
      } else {
         super.b($$0);
      }
   }

   private void gm() {
      this.ca.a(this.cc > 0, this.af);
   }

   public void h(@Nullable btv $$0) {
      if (this.dV() instanceof ash $$1) {
         fbn $$2 = this.cR();
         fbs $$3 = $$2.f();
         double $$4 = $$2.b() * 0.3;
         double $$5 = $$2.c() * 0.3;
         double $$6 = $$2.d() * 0.3;
         $$1.a(new lk(ls.bg, dkg.u.m()), $$3.d, $$3.e, $$3.f, 100, $$4, $$5, $$6, 0.0);
         $$1.a(new lk(ls.bg, dkg.cB.m().b(dma.c, dma.a.c)), $$3.d, $$3.e, $$3.f, 10, $$4, $$5, $$6, 0.0);
      }

      this.b(this.o_());
      if (this.bl >= 0 && $$0 != null && $$0.d() instanceof bwb $$7) {
         $$7.a(this, this.bl, $$0);
      }

      this.a(bvf.c.b);
   }

   @Override
   protected boolean r(bvf $$0) {
      return false;
   }

   @Override
   protected boolean bR() {
      return false;
   }

   @Override
   protected void p(bvf $$0) {
      throw new IllegalStateException("Should never addPassenger without checking couldAcceptPassenger()");
   }

   @Override
   public boolean o(boolean $$0) {
      return false;
   }

   @Override
   protected cfn b(dha $$0) {
      return new cny.a(this, $$0);
   }

   class a extends cfm {
      a(final cnw $$0, final dha $$1) {
         super($$0, $$1);
      }

      @Override
      public void c() {
         if (cny.this.p()) {
            super.c();
         }
      }

      @Override
      protected euf a(int $$0) {
         this.o = cny.this.new b();
         return new euf(this.o, $$0);
      }
   }

   class b extends eul {
      @Override
      public eug a(eui $$0, int $$1, int $$2, int $$3) {
         jh $$4 = cny.this.cd;
         if ($$4 == null) {
            return super.a($$0, $$1, $$2, $$3);
         } else {
            double $$5 = $$4.j(new kl($$1, $$2, $$3));
            return $$5 > 1024.0 && $$5 >= $$4.j($$0.b()) ? eug.a : super.a($$0, $$1, $$2, $$3);
         }
      }
   }
}
