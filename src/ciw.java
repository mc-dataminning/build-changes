import com.google.common.annotations.VisibleForTesting;
import java.util.EnumSet;
import javax.annotation.Nullable;

public class ciw extends bsc implements cif {
   private static final ajm<Integer> bY = ajq.a(ciw.class, ajo.b);
   public static final int b = 1;
   public static final int c = 127;
   public float d;
   public float e;
   public float bX;
   private boolean bZ;

   public ciw(brn<? extends ciw> $$0, dad $$1) {
      super($$0, $$1);
      this.cE();
      this.bP = new ciw.d(this);
   }

   @Override
   protected void z() {
      this.bS.a(1, new ciw.b(this));
      this.bS.a(2, new ciw.a(this));
      this.bS.a(3, new ciw.e(this));
      this.bS.a(5, new ciw.c(this));
      this.bT.a(1, new caq<>(this, clh.class, 10, true, false, $$0 -> Math.abs($$0.du() - this.du()) <= 4.0));
      this.bT.a(3, new caq<>(this, ceb.class, true));
   }

   @Override
   public avd dc() {
      return avd.f;
   }

   @Override
   protected void a(ajq.a $$0) {
      super.a($$0);
      $$0.a(bY, 1);
   }

   @VisibleForTesting
   public void a(int $$0, boolean $$1) {
      int $$2 = axz.a($$0, 1, 127);
      this.ao.a(bY, $$2);
      this.ar();
      this.j_();
      this.f(bth.q).a((double)($$2 * $$2));
      this.f(bth.r).a((double)(0.2F + 0.1F * (float)$$2));
      this.f(bth.c).a((double)$$2);
      if ($$1) {
         this.t(this.eP());
      }

      this.bN = $$2;
   }

   public int gq() {
      return this.ao.a(bY);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("Size", this.gq() - 1);
      $$0.a("wasOnGround", this.bZ);
   }

   @Override
   public void a(ua $$0) {
      this.a($$0.h("Size") + 1, false);
      super.a($$0);
      this.bZ = $$0.q("wasOnGround");
   }

   public boolean gr() {
      return this.gq() <= 1;
   }

   protected kv u() {
      return kx.S;
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
            float $$5 = axz.a($$3) * $$1 * $$4;
            float $$6 = axz.b($$3) * $$1 * $$4;
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
   public void a(ajm<?> $$0) {
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
   public brn<? extends ciw> ai() {
      return (brn<? extends ciw>)super.ai();
   }

   @Override
   public void a(brh.c $$0) {
      int $$1 = this.gq();
      if (!this.dN().B && $$1 > 1 && this.ez()) {
         wu $$2 = this.af();
         boolean $$3 = this.gf();
         float $$4 = this.a(this.ap()).a();
         float $$5 = $$4 / 2.0F;
         int $$6 = $$1 / 2;
         int $$7 = 2 + this.ah.a(3);

         for (int $$8 = 0; $$8 < $$7; $$8++) {
            float $$9 = ((float)($$8 % 2) - 0.5F) * $$5;
            float $$10 = ((float)($$8 / 2) - 0.5F) * $$5;
            ciw $$11 = this.ai().a(this.dN());
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
   public void h(brh $$0) {
      super.h($$0);
      if ($$0 instanceof ceb && this.gm()) {
         this.j((bsa)$$0);
      }
   }

   @Override
   public void b_(clh $$0) {
      if (this.gm()) {
         this.j($$0);
      }
   }

   protected void j(bsa $$0) {
      if (this.bB()) {
         int $$1 = this.gq();
         if (this.g((brh)$$0) < 0.6 * (double)$$1 * 0.6 * (double)$$1 && this.E($$0) && $$0.a(this.dO().b((bsa)this), this.gn())) {
            this.a(avc.xb, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
            this.a(this, $$0);
         }
      }
   }

   @Override
   protected etp a(brh $$0, brk $$1, float $$2) {
      return new etp(0.0, (double)$$1.b() - 0.015625 * (double)this.gq() * (double)$$2, 0.0);
   }

   protected boolean gm() {
      return !this.gr() && this.cZ();
   }

   protected float gn() {
      return (float)this.g(bth.c);
   }

   @Override
   protected avb d(bqf $$0) {
      return this.gr() ? avc.xS : avc.xd;
   }

   @Override
   protected avb o_() {
      return this.gr() ? avc.xR : avc.xc;
   }

   protected avb go() {
      return this.gr() ? avc.xU : avc.xf;
   }

   public static boolean c(brn<ciw> $$0, dae $$1, bse $$2, in $$3, ayg $$4) {
      if (bse.a($$2)) {
         return a($$0, $$1, $$2, $$3, $$4);
      } else {
         if ($$1.ak() != bpj.a) {
            if ($$2 == bse.c) {
               return a($$0, $$1, $$2, $$3, $$4);
            }

            if ($$1.t($$3).a(avq.aq) && $$3.v() > 50 && $$3.v() < 70 && $$4.i() < 0.5F && $$4.i() < $$1.ap() && $$1.A($$3) <= $$4.a(8)) {
               return a($$0, $$1, $$2, $$3, $$4);
            }

            if (!($$1 instanceof day)) {
               return false;
            }

            czk $$5 = new czk($$3);
            boolean $$6 = dwy.a($$5.e, $$5.f, ((day)$$1).C(), 987234911L).a(10) == 0;
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
      etp $$0 = this.dq();
      this.o($$0.c, (double)this.ff(), $$0.e);
      this.av = true;
   }

   @Nullable
   @Override
   public bss a(das $$0, bpk $$1, bse $$2, @Nullable bss $$3) {
      ayg $$4 = $$0.E_();
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

   protected avb gp() {
      return this.gr() ? avc.xT : avc.xe;
   }

   @Override
   public brk e(bsl $$0) {
      return super.e($$0).a((float)this.gq());
   }

   static class a extends byx {
      private final ciw a;
      private int b;

      public a(ciw $$0) {
         this.a = $$0;
         this.a(EnumSet.of(byx.a.b));
      }

      @Override
      public boolean a() {
         bsa $$0 = this.a.p();
         if ($$0 == null) {
            return false;
         } else {
            return !this.a.c($$0) ? false : this.a.H() instanceof ciw.d;
         }
      }

      @Override
      public void c() {
         this.b = b(300);
         super.c();
      }

      @Override
      public boolean b() {
         bsa $$0 = this.a.p();
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
         bsa $$0 = this.a.p();
         if ($$0 != null) {
            this.a.a($$0, 10.0F, 10.0F);
         }

         if (this.a.H() instanceof ciw.d $$1) {
            $$1.a(this.a.dD(), this.a.gm());
         }
      }
   }

   static class b extends byx {
      private final ciw a;

      public b(ciw $$0) {
         this.a = $$0;
         this.a(EnumSet.of(byx.a.c, byx.a.a));
         $$0.K().a(true);
      }

      @Override
      public boolean a() {
         return (this.a.bc() || this.a.bq()) && this.a.H() instanceof ciw.d;
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

         if (this.a.H() instanceof ciw.d $$0) {
            $$0.a(1.2);
         }
      }
   }

   static class c extends byx {
      private final ciw a;

      public c(ciw $$0) {
         this.a = $$0;
         this.a(EnumSet.of(byx.a.c, byx.a.a));
      }

      @Override
      public boolean a() {
         return !this.a.bP();
      }

      @Override
      public void e() {
         if (this.a.H() instanceof ciw.d $$0) {
            $$0.a(1.0);
         }
      }
   }

   static class d extends bya {
      private float l;
      private int m;
      private final ciw n;
      private boolean o;

      public d(ciw $$0) {
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
         this.k = bya.a.b;
      }

      @Override
      public void a() {
         this.d.r(this.a(this.d.dD(), this.l, 90.0F));
         this.d.bb = this.d.dD();
         this.d.aZ = this.d.dD();
         if (this.k != bya.a.b) {
            this.d.C(0.0F);
         } else {
            this.k = bya.a.a;
            if (this.d.aC()) {
               this.d.y((float)(this.h * this.d.g(bth.r)));
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
               this.d.y((float)(this.h * this.d.g(bth.r)));
            }
         }
      }
   }

   static class e extends byx {
      private final ciw a;
      private float b;
      private int c;

      public e(ciw $$0) {
         this.a = $$0;
         this.a(EnumSet.of(byx.a.b));
      }

      @Override
      public boolean a() {
         return this.a.p() == null && (this.a.aC() || this.a.bc() || this.a.bq() || this.a.b(bqv.y)) && this.a.H() instanceof ciw.d;
      }

      @Override
      public void e() {
         if (--this.c <= 0) {
            this.c = this.a(40 + this.a.ej().a(60));
            this.b = (float)this.a.ej().a(360);
         }

         if (this.a.H() instanceof ciw.d $$0) {
            $$0.a(this.b, false);
         }
      }
   }
}
