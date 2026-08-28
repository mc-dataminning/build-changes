import java.util.UUID;
import javax.annotation.Nullable;

public class cgs extends cga implements bup {
   private static final akg<Boolean> bY = akk.a(cgs.class, aki.k);
   private static final float bZ = 6.0F;
   private float ca;
   private float cc;
   private int cd;
   private static final bra ce = bae.a(20, 39);
   private int cf;
   @Nullable
   private UUID cg;

   public cgs(btv<? extends cgs> $$0, deg $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public bth a(arh $$0, bth $$1) {
      return btv.aD.a($$0, btu.e);
   }

   @Override
   public boolean n(cvp $$0) {
      return false;
   }

   @Override
   protected void D() {
      super.D();
      this.bS.a(0, new cbb(this));
      this.bS.a(1, new cgs.c());
      this.bS.a(1, new cca(this, 2.0, $$0 -> $$0.o_() ? awv.F : awv.G));
      this.bS.a(4, new cbg(this, 1.25));
      this.bS.a(5, new cce(this, 1.0));
      this.bS.a(6, new cbp(this, cnu.class, 6.0F));
      this.bS.a(7, new ccc(this));
      this.bT.a(1, new cgs.b());
      this.bT.a(2, new cgs.a());
      this.bT.a(3, new cda<>(this, cnu.class, 10, true, false, this::a_));
      this.bT.a(4, new cda<>(this, cgk.class, 10, true, true, null));
      this.bT.a(5, new cdg<>(this, false));
   }

   public static bvq.a q() {
      return cga.gu().a(bvr.s, 30.0).a(bvr.m, 20.0).a(bvr.v, 0.25).a(bvr.c, 6.0);
   }

   public static boolean c(btv<cgs> $$0, deh $$1, btu $$2, je $$3, azl $$4) {
      jn<dfh> $$5 = $$1.t($$3);
      return !$$5.a(aws.ao) ? b($$0, $$1, $$2, $$3, $$4) : a($$1, $$3) && $$1.a_($$3.e()).a(awt.cd);
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      this.a(this.dS(), $$0);
   }

   @Override
   public void b(uf $$0) {
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
   protected awd w() {
      return this.o_() ? awe.uy : awe.ux;
   }

   @Override
   protected awd d(bsg $$0) {
      return awe.uA;
   }

   @Override
   protected awd n_() {
      return awe.uz;
   }

   @Override
   protected void b(je $$0, duo $$1) {
      this.a(awe.uB, 0.15F, 1.0F);
   }

   protected void t() {
      if (this.cd <= 0) {
         this.b(awe.uC);
         this.cd = 40;
      }
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(bY, false);
   }

   @Override
   public void l() {
      super.l();
      if (this.dS().B) {
         if (this.cc != this.ca) {
            this.i_();
         }

         this.ca = this.cc;
         if (this.y()) {
            this.cc = azd.a(this.cc + 1.0F, 0.0F, 6.0F);
         } else {
            this.cc = azd.a(this.cc - 1.0F, 0.0F, 6.0F);
         }
      }

      if (this.cd > 0) {
         this.cd--;
      }

      if (!this.dS().B) {
         this.a((arh)this.dS(), true);
      }
   }

   @Override
   public btr e(buw $$0) {
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
      return azd.h($$0, this.ca, this.cc) / 6.0F;
   }

   @Override
   protected float fj() {
      return 0.98F;
   }

   @Override
   public bvc a(dew $$0, brn $$1, btu $$2, @Nullable bvc $$3) {
      if ($$3 == null) {
         $$3 = new bth.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   class a extends cda<cnu> {
      public a() {
         super(cgs.this, cnu.class, 20, true, true, null);
      }

      @Override
      public boolean b() {
         if (cgs.this.o_()) {
            return false;
         } else {
            if (super.b()) {
               for (cgs $$1 : cgs.this.dS().a(cgs.class, cgs.this.cO().c(8.0, 4.0, 8.0))) {
                  if ($$1.o_()) {
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

   class b extends ccz {
      public b() {
         super(cgs.this);
      }

      @Override
      public void d() {
         super.d();
         if (cgs.this.o_()) {
            this.h();
            this.e();
         }
      }

      @Override
      protected void a(bum $$0, buk $$1) {
         if ($$0 instanceof cgs && !$$0.o_()) {
            super.a($$0, $$1);
         }
      }
   }

   class c extends cbr {
      public c() {
         super(cgs.this, 1.25, true);
      }

      @Override
      protected void a(buk $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.E($$0);
            cgs.this.x(false);
         } else if (this.a.g((bto)$$0) < (double)(($$0.dn() + 3.0F) * ($$0.dn() + 3.0F))) {
            if (this.i()) {
               cgs.this.x(false);
               this.h();
            }

            if (this.k() <= 10) {
               cgs.this.x(true);
               cgs.this.t();
            }
         } else {
            this.h();
            cgs.this.x(false);
         }
      }

      @Override
      public void e() {
         cgs.this.x(false);
         super.e();
      }
   }
}
