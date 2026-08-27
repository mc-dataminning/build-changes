import com.google.common.annotations.VisibleForTesting;
import java.util.EnumSet;
import javax.annotation.Nullable;

public class cia extends brg implements chj {
   private static final ajk<Integer> bY = ajo.a(cia.class, ajm.b);
   public static final int b = 1;
   public static final int c = 127;
   public float d;
   public float e;
   public float bX;
   private boolean bZ;

   public cia(bqr<? extends cia> $$0, czu $$1) {
      super($$0, $$1);
      this.cE();
      this.bP = new cia.d(this);
   }

   @Override
   protected void z() {
      this.bS.a(1, new cia.b(this));
      this.bS.a(2, new cia.a(this));
      this.bS.a(3, new cia.e(this));
      this.bS.a(5, new cia.c(this));
      this.bT.a(1, new bzu<>(this, ckl.class, 10, true, false, $$0 -> Math.abs($$0.du() - this.du()) <= 4.0));
      this.bT.a(3, new bzu<>(this, cdf.class, true));
   }

   @Override
   public ava dc() {
      return ava.f;
   }

   @Override
   protected void a(ajo.a $$0) {
      super.a($$0);
      $$0.a(bY, 1);
   }

   @VisibleForTesting
   public void a(int $$0, boolean $$1) {
      int $$2 = axw.a($$0, 1, 127);
      this.ao.a(bY, $$2);
      this.ar();
      this.j_();
      this.f(bsl.q).a((double)($$2 * $$2));
      this.f(bsl.r).a((double)(0.2F + 0.1F * (float)$$2));
      this.f(bsl.c).a((double)$$2);
      if ($$1) {
         this.t(this.eP());
      }

      this.bN = $$2;
   }

   public int gq() {
      return this.ao.a(bY);
   }

   @Override
   public void b(ty $$0) {
      super.b($$0);
      $$0.a("Size", this.gq() - 1);
      $$0.a("wasOnGround", this.bZ);
   }

   @Override
   public void a(ty $$0) {
      this.a($$0.h("Size") + 1, false);
      super.a($$0);
      this.bZ = $$0.q("wasOnGround");
   }

   public boolean gr() {
      return this.gq() <= 1;
   }

   protected ku u() {
      return kw.S;
   }

   @Override
   protected boolean W() {
      return this.gq() > 0;
   }

   @Override
   public void l() {
      this.e = this.e + (this.d - this.e) * 0.5F;
      this.bX = this.e;
      super.l();
      if (this.aC() && !this.bZ) {
         float $$0 = this.a(this.ap()).a() * 2.0F;
         float $$1 = $$0 / 2.0F;

         for (int $$2 = 0; (float)$$2 < $$0 * 16.0F; $$2++) {
            float $$3 = this.ah.i() * (float) (Math.PI * 2);
            float $$4 = this.ah.i() * 0.5F + 0.5F;
            float $$5 = axw.a($$3) * $$1 * $$4;
            float $$6 = axw.b($$3) * $$1 * $$4;
            this.dN().a(this.u(), this.ds() + (double)$$5, this.du(), this.dy() + (double)$$6, 0.0, 0.0, 0.0);
         }

         this.a(this.go(), this.fc(), ((this.ah.i() - this.ah.i()) * 0.2F + 1.0F) / 0.8F);
         this.d = -0.5F;
      } else if (!this.aC() && this.bZ) {
         this.d = 1.0F;
      }

      this.bZ = this.aC();
      this.gl();
   }

   @Override
   protected void gl() {
      this.d *= 0.6F;
   }

   protected int y() {
      return this.ah.a(20) + 10;
   }

   @Override
   public void j_() {
      double $$0 = this.ds();
      double $$1 = this.du();
      double $$2 = this.dy();
      super.j_();
      this.a_($$0, $$1, $$2);
   }

   @Override
   public void a(ajk<?> $$0) {
      if (bY.equals($$0)) {
         this.j_();
         this.r(this.bb);
         this.aZ = this.bb;
         if (this.bc() && this.ah.a(20) == 0) {
            this.bl();
         }
      }

      super.a($$0);
   }

   @Override
   public bqr<? extends cia> ai() {
      return (bqr<? extends cia>)super.ai();
   }

   @Override
   public void a(bql.c $$0) {
      int $$1 = this.gq();
      if (!this.dN().B && $$1 > 1 && this.ez()) {
         ws $$2 = this.af();
         boolean $$3 = this.gf();
         float $$4 = this.a(this.ap()).a();
         float $$5 = $$4 / 2.0F;
         int $$6 = $$1 / 2;
         int $$7 = 2 + this.ah.a(3);

         for (int $$8 = 0; $$8 < $$7; $$8++) {
            float $$9 = ((float)($$8 % 2) - 0.5F) * $$5;
            float $$10 = ((float)($$8 / 2) - 0.5F) * $$5;
            cia $$11 = this.ai().a(this.dN());
            if ($$11 != null) {
               if (this.fV()) {
                  $$11.fT();
               }

               $$11.b($$2);
               $$11.t($$3);
               $$11.n(this.cs());
               $$11.a($$6, true);
               $$11.b(this.ds() + (double)$$9, this.du() + 0.5, this.dy() + (double)$$10, this.ah.i() * 360.0F, 0.0F);
               this.dN().b($$11);
            }
         }
      }

      super.a($$0);
   }

   @Override
   public void h(bql $$0) {
      super.h($$0);
      if ($$0 instanceof cdf && this.gm()) {
         this.j((bre)$$0);
      }
   }

   @Override
   public void b_(ckl $$0) {
      if (this.gm()) {
         this.j($$0);
      }
   }

   protected void j(bre $$0) {
      if (this.bB()) {
         int $$1 = this.gq();
         if (this.g((bql)$$0) < 0.6 * (double)$$1 * 0.6 * (double)$$1 && this.E($$0) && $$0.a(this.dO().b((bre)this), this.gn())) {
            this.a(auz.xa, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
            this.a(this, $$0);
         }
      }
   }

   @Override
   protected etf a(bql $$0, bqo $$1, float $$2) {
      return new etf(0.0, (double)$$1.b() - 0.015625 * (double)this.gq() * (double)$$2, 0.0);
   }

   protected boolean gm() {
      return !this.gr() && this.cZ();
   }

   protected float gn() {
      return (float)this.g(bsl.c);
   }

   @Override
   protected auy d(bpj $$0) {
      return this.gr() ? auz.xR : auz.xc;
   }

   @Override
   protected auy o_() {
      return this.gr() ? auz.xQ : auz.xb;
   }

   protected auy go() {
      return this.gr() ? auz.xT : auz.xe;
   }

   public static boolean c(bqr<cia> $$0, czv $$1, bri $$2, im $$3, ayd $$4) {
      if (bri.a($$2)) {
         return a($$0, $$1, $$2, $$3, $$4);
      } else {
         if ($$1.ak() != bon.a) {
            if ($$2 == bri.c) {
               return a($$0, $$1, $$2, $$3, $$4);
            }

            if ($$1.t($$3).a(avn.aq) && $$3.v() > 50 && $$3.v() < 70 && $$4.i() < 0.5F && $$4.i() < $$1.ap() && $$1.A($$3) <= $$4.a(8)) {
               return a($$0, $$1, $$2, $$3, $$4);
            }

            if (!($$1 instanceof dap)) {
               return false;
            }

            czb $$5 = new czb($$3);
            boolean $$6 = dwp.a($$5.e, $$5.f, ((dap)$$1).C(), 987234911L).a(10) == 0;
            if ($$4.a(10) == 0 && $$6 && $$3.v() < 40) {
               return a($$0, $$1, $$2, $$3, $$4);
            }
         }

         return false;
      }
   }

   @Override
   protected float fc() {
      return 0.4F * (float)this.gq();
   }

   @Override
   public int Z() {
      return 0;
   }

   protected boolean gs() {
      return this.gq() > 0;
   }

   @Override
   protected void fh() {
      etf $$0 = this.dq();
      this.o($$0.c, (double)this.ff(), $$0.e);
      this.av = true;
   }

   @Nullable
   @Override
   public brw a(daj $$0, boo $$1, bri $$2, @Nullable brw $$3) {
      ayd $$4 = $$0.E_();
      int $$5 = $$4.a(3);
      if ($$5 < 2 && $$4.i() < 0.5F * $$1.d()) {
         $$5++;
      }

      int $$6 = 1 << $$5;
      this.a($$6, true);
      return super.a($$0, $$1, $$2, $$3);
   }

   float r() {
      float $$0 = this.gr() ? 1.4F : 0.8F;
      return ((this.ah.i() - this.ah.i()) * 0.2F + 1.0F) * $$0;
   }

   protected auy gp() {
      return this.gr() ? auz.xS : auz.xd;
   }

   @Override
   public bqo e(brp $$0) {
      return super.e($$0).a((float)this.gq());
   }

   static class a extends byb {
      private final cia a;
      private int b;

      public a(cia $$0) {
         this.a = $$0;
         this.a(EnumSet.of(byb.a.b));
      }

      @Override
      public boolean a() {
         bre $$0 = this.a.p();
         if ($$0 == null) {
            return false;
         } else {
            return !this.a.c($$0) ? false : this.a.H() instanceof cia.d;
         }
      }

      @Override
      public void c() {
         this.b = b(300);
         super.c();
      }

      @Override
      public boolean b() {
         bre $$0 = this.a.p();
         if ($$0 == null) {
            return false;
         } else {
            return !this.a.c($$0) ? false : --this.b > 0;
         }
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void e() {
         bre $$0 = this.a.p();
         if ($$0 != null) {
            this.a.a($$0, 10.0F, 10.0F);
         }

         if (this.a.H() instanceof cia.d $$1) {
            $$1.a(this.a.dD(), this.a.gm());
         }
      }
   }

   static class b extends byb {
      private final cia a;

      public b(cia $$0) {
         this.a = $$0;
         this.a(EnumSet.of(byb.a.c, byb.a.a));
         $$0.K().a(true);
      }

      @Override
      public boolean a() {
         return (this.a.bc() || this.a.bq()) && this.a.H() instanceof cia.d;
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void e() {
         if (this.a.ej().i() < 0.8F) {
            this.a.I().a();
         }

         if (this.a.H() instanceof cia.d $$0) {
            $$0.a(1.2);
         }
      }
   }

   static class c extends byb {
      private final cia a;

      public c(cia $$0) {
         this.a = $$0;
         this.a(EnumSet.of(byb.a.c, byb.a.a));
      }

      @Override
      public boolean a() {
         return !this.a.bP();
      }

      @Override
      public void e() {
         if (this.a.H() instanceof cia.d $$0) {
            $$0.a(1.0);
         }
      }
   }

   static class d extends bxe {
      private float l;
      private int m;
      private final cia n;
      private boolean o;

      public d(cia $$0) {
         super($$0);
         this.n = $$0;
         this.l = 180.0F * $$0.dD() / (float) Math.PI;
      }

      public void a(float $$0, boolean $$1) {
         this.l = $$0;
         this.o = $$1;
      }

      public void a(double $$0) {
         this.h = $$0;
         this.k = bxe.a.b;
      }

      @Override
      public void a() {
         this.d.r(this.a(this.d.dD(), this.l, 90.0F));
         this.d.bb = this.d.dD();
         this.d.aZ = this.d.dD();
         if (this.k != bxe.a.b) {
            this.d.C(0.0F);
         } else {
            this.k = bxe.a.a;
            if (this.d.aC()) {
               this.d.y((float)(this.h * this.d.g(bsl.r)));
               if (this.m-- <= 0) {
                  this.m = this.n.y();
                  if (this.o) {
                     this.m /= 3;
                  }

                  this.n.I().a();
                  if (this.n.gs()) {
                     this.n.a(this.n.gp(), this.n.fc(), this.n.r());
                  }
               } else {
                  this.n.bp = 0.0F;
                  this.n.br = 0.0F;
                  this.d.y(0.0F);
               }
            } else {
               this.d.y((float)(this.h * this.d.g(bsl.r)));
            }
         }
      }
   }

   static class e extends byb {
      private final cia a;
      private float b;
      private int c;

      public e(cia $$0) {
         this.a = $$0;
         this.a(EnumSet.of(byb.a.b));
      }

      @Override
      public boolean a() {
         return this.a.p() == null && (this.a.aC() || this.a.bc() || this.a.bq() || this.a.b(bpz.y)) && this.a.H() instanceof cia.d;
      }

      @Override
      public void e() {
         if (--this.c <= 0) {
            this.c = this.a(40 + this.a.ej().a(60));
            this.b = (float)this.a.ej().a(360);
         }

         if (this.a.H() instanceof cia.d $$0) {
            $$0.a(this.b, false);
         }
      }
   }
}
