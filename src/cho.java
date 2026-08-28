import java.util.UUID;
import javax.annotation.Nullable;

public class cho extends cgw implements bvk {
   private static final ajx<Boolean> bY = akb.a(cho.class, ajz.k);
   private static final float bZ = 6.0F;
   private float ca;
   private float cc;
   private int cd;
   private static final brt ce = baa.a(20, 39);
   private int cf;
   @Nullable
   private UUID cg;

   public cho(buq<? extends cho> $$0, dgg $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public bua a(arc $$0, bua $$1) {
      return buq.aU.a($$0, bup.e);
   }

   @Override
   public boolean j(cwn $$0) {
      return false;
   }

   @Override
   protected void B() {
      super.B();
      this.bS.a(0, new cbx(this));
      this.bS.a(1, new cho.c());
      this.bS.a(1, new ccw(this, 2.0, $$0 -> $$0.e_() ? awq.F : awq.G));
      this.bS.a(4, new ccc(this, 1.25));
      this.bS.a(5, new cda(this, 1.0));
      this.bS.a(6, new ccl(this, cov.class, 6.0F));
      this.bS.a(7, new ccy(this));
      this.bT.a(1, new cho.b());
      this.bT.a(2, new cho.a());
      this.bT.a(3, new cdw<>(this, cov.class, 10, true, false, this::a));
      this.bT.a(4, new cdw<>(this, chg.class, 10, true, true, null));
      this.bT.a(5, new cec<>(this, false));
   }

   public static bwm.a p() {
      return cgw.gu().a(bwn.s, 30.0).a(bwn.m, 20.0).a(bwn.v, 0.25).a(bwn.c, 6.0);
   }

   public static boolean c(buq<cho> $$0, dgh $$1, bup $$2, ji $$3, azg $$4) {
      jr<dhi> $$5 = $$1.t($$3);
      return !$$5.a(awn.ao) ? b($$0, $$1, $$2, $$3, $$4) : a($$1, $$3) && $$1.a_($$3.e()).a(awo.ce);
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.a(this.dW(), $$0);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      this.a_($$0);
   }

   @Override
   public void c() {
      this.a(ce.a(this.ae));
   }

   @Override
   public void a(int $$0) {
      this.cf = $$0;
   }

   @Override
   public int a() {
      return this.cf;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cg = $$0;
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cg;
   }

   @Override
   protected avy u() {
      return this.e_() ? avz.uX : avz.uW;
   }

   @Override
   protected avy e(bsz $$0) {
      return avz.uZ;
   }

   @Override
   protected avy o_() {
      return avz.uY;
   }

   @Override
   protected void b(ji $$0, dwv $$1) {
      this.a(avz.va, 0.15F, 1.0F);
   }

   protected void t() {
      if (this.cd <= 0) {
         this.b(avz.vb);
         this.cd = 40;
      }
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(bY, false);
   }

   @Override
   public void h() {
      super.h();
      if (this.dW().C) {
         if (this.cc != this.ca) {
            this.m_();
         }

         this.ca = this.cc;
         if (this.x()) {
            this.cc = ayy.a(this.cc + 1.0F, 0.0F, 6.0F);
         } else {
            this.cc = ayy.a(this.cc - 1.0F, 0.0F, 6.0F);
         }
      }

      if (this.cd > 0) {
         this.cd--;
      }

      if (!this.dW().C) {
         this.a((arc)this.dW(), true);
      }
   }

   @Override
   public bum e(bvr $$0) {
      if (this.cc > 0.0F) {
         float $$1 = this.cc / 6.0F;
         float $$2 = 1.0F + $$1;
         return super.e($$0).a(1.0F, $$2);
      } else {
         return super.e($$0);
      }
   }

   public boolean x() {
      return this.al.a(bY);
   }

   public void x(boolean $$0) {
      this.al.a(bY, $$0);
   }

   public float J(float $$0) {
      return ayy.h($$0, this.ca, this.cc) / 6.0F;
   }

   @Override
   protected float fm() {
      return 0.98F;
   }

   @Override
   public bvy a(dgx $$0, bsg $$1, bup $$2, @Nullable bvy $$3) {
      if ($$3 == null) {
         $$3 = new bua.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   class a extends cdw<cov> {
      public a() {
         super(cho.this, cov.class, 20, true, true, null);
      }

      @Override
      public boolean b() {
         if (cho.this.e_()) {
            return false;
         } else {
            if (super.b()) {
               for (cho $$1 : cho.this.dW().a(cho.class, cho.this.cR().c(8.0, 4.0, 8.0))) {
                  if ($$1.e_()) {
                     return true;
                  }
               }
            }

            return false;
         }
      }

      @Override
      protected double l() {
         return super.l() * 0.5;
      }
   }

   class b extends cdv {
      public b() {
         super(cho.this);
      }

      @Override
      public void d() {
         super.d();
         if (cho.this.e_()) {
            this.h();
            this.e();
         }
      }

      @Override
      protected void a(bvh $$0, bvf $$1) {
         if ($$0 instanceof cho && !$$0.e_()) {
            super.a($$0, $$1);
         }
      }
   }

   class c extends ccn {
      public c() {
         super(cho.this, 1.25, true);
      }

      @Override
      protected void a(bvf $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.c(a(this.a), $$0);
            cho.this.x(false);
         } else if (this.a.g((buj)$$0) < (double)(($$0.dr() + 3.0F) * ($$0.dr() + 3.0F))) {
            if (this.i()) {
               cho.this.x(false);
               this.h();
            }

            if (this.k() <= 10) {
               cho.this.x(true);
               cho.this.t();
            }
         } else {
            this.h();
            cho.this.x(false);
         }
      }

      @Override
      public void e() {
         cho.this.x(false);
         super.e();
      }
   }
}
