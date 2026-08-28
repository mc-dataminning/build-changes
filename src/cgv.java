import java.util.UUID;
import javax.annotation.Nullable;

public class cgv extends cgd implements bus {
   private static final akh<Boolean> bY = akl.a(cgv.class, akj.k);
   private static final float bZ = 6.0F;
   private float ca;
   private float cc;
   private int cd;
   private static final brd ce = bag.a(20, 39);
   private int cf;
   @Nullable
   private UUID cg;

   public cgv(bty<? extends cgv> $$0, dej $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public btk a(arj $$0, btk $$1) {
      return bty.aD.a($$0, btx.e);
   }

   @Override
   public boolean n(cvs $$0) {
      return false;
   }

   @Override
   protected void D() {
      super.D();
      this.bS.a(0, new cbe(this));
      this.bS.a(1, new cgv.c());
      this.bS.a(1, new ccd(this, 2.0, $$0 -> $$0.p_() ? awx.F : awx.G));
      this.bS.a(4, new cbj(this, 1.25));
      this.bS.a(5, new cch(this, 1.0));
      this.bS.a(6, new cbs(this, cnx.class, 6.0F));
      this.bS.a(7, new ccf(this));
      this.bT.a(1, new cgv.b());
      this.bT.a(2, new cgv.a());
      this.bT.a(3, new cdd<>(this, cnx.class, 10, true, false, this::a_));
      this.bT.a(4, new cdd<>(this, cgn.class, 10, true, true, null));
      this.bT.a(5, new cdj<>(this, false));
   }

   public static bvt.a q() {
      return cgd.gt().a(bvu.s, 30.0).a(bvu.m, 20.0).a(bvu.v, 0.25).a(bvu.c, 6.0);
   }

   public static boolean c(bty<cgv> $$0, dek $$1, btx $$2, jf $$3, azn $$4) {
      jo<dfk> $$5 = $$1.t($$3);
      return !$$5.a(awu.ao) ? b($$0, $$1, $$2, $$3, $$4) : a($$1, $$3) && $$1.a_($$3.e()).a(awv.cd);
   }

   @Override
   public void a(ug $$0) {
      super.a($$0);
      this.a(this.dS(), $$0);
   }

   @Override
   public void b(ug $$0) {
      super.b($$0);
      this.a_($$0);
   }

   @Override
   public void c() {
      this.a(ce.a(this.af));
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
   protected awf w() {
      return this.p_() ? awg.uy : awg.ux;
   }

   @Override
   protected awf d(bsj $$0) {
      return awg.uA;
   }

   @Override
   protected awf o_() {
      return awg.uz;
   }

   @Override
   protected void b(jf $$0, dus $$1) {
      this.a(awg.uB, 0.15F, 1.0F);
   }

   protected void t() {
      if (this.cd <= 0) {
         this.b(awg.uC);
         this.cd = 40;
      }
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(bY, false);
   }

   @Override
   public void l() {
      super.l();
      if (this.dS().B) {
         if (this.cc != this.ca) {
            this.j_();
         }

         this.ca = this.cc;
         if (this.y()) {
            this.cc = azf.a(this.cc + 1.0F, 0.0F, 6.0F);
         } else {
            this.cc = azf.a(this.cc - 1.0F, 0.0F, 6.0F);
         }
      }

      if (this.cd > 0) {
         this.cd--;
      }

      if (!this.dS().B) {
         this.a((arj)this.dS(), true);
      }
   }

   @Override
   public btu e(buz $$0) {
      if (this.cc > 0.0F) {
         float $$1 = this.cc / 6.0F;
         float $$2 = 1.0F + $$1;
         return super.e($$0).a(1.0F, $$2);
      } else {
         return super.e($$0);
      }
   }

   public boolean y() {
      return this.am.a(bY);
   }

   public void x(boolean $$0) {
      this.am.a(bY, $$0);
   }

   public float J(float $$0) {
      return azf.h($$0, this.ca, this.cc) / 6.0F;
   }

   @Override
   protected float fj() {
      return 0.98F;
   }

   @Override
   public bvf a(dez $$0, brq $$1, btx $$2, @Nullable bvf $$3) {
      if ($$3 == null) {
         $$3 = new btk.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   class a extends cdd<cnx> {
      public a() {
         super(cgv.this, cnx.class, 20, true, true, null);
      }

      @Override
      public boolean b() {
         if (cgv.this.p_()) {
            return false;
         } else {
            if (super.b()) {
               for (cgv $$1 : cgv.this.dS().a(cgv.class, cgv.this.cO().c(8.0, 4.0, 8.0))) {
                  if ($$1.p_()) {
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

   class b extends cdc {
      public b() {
         super(cgv.this);
      }

      @Override
      public void d() {
         super.d();
         if (cgv.this.p_()) {
            this.h();
            this.e();
         }
      }

      @Override
      protected void a(bup $$0, bun $$1) {
         if ($$0 instanceof cgv && !$$0.p_()) {
            super.a($$0, $$1);
         }
      }
   }

   class c extends cbu {
      public c() {
         super(cgv.this, 1.25, true);
      }

      @Override
      protected void a(bun $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.E($$0);
            cgv.this.x(false);
         } else if (this.a.g((btr)$$0) < (double)(($$0.dn() + 3.0F) * ($$0.dn() + 3.0F))) {
            if (this.i()) {
               cgv.this.x(false);
               this.h();
            }

            if (this.k() <= 10) {
               cgv.this.x(true);
               cgv.this.t();
            }
         } else {
            this.h();
            cgv.this.x(false);
         }
      }

      @Override
      public void e() {
         cgv.this.x(false);
         super.e();
      }
   }
}
