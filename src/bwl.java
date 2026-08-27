import com.google.common.annotations.VisibleForTesting;
import java.util.EnumSet;
import javax.annotation.Nullable;

public class bwl extends bgb implements bvu {
   private static final aby<Integer> bT = acb.a(bwl.class, aca.b);
   public static final int b = 1;
   public static final int c = 127;
   public float d;
   public float e;
   public float bS;
   private boolean bU;

   public bwl(bfn<? extends bwl> $$0, cmm $$1) {
      super($$0, $$1);
      this.cA();
      this.bL = new bwl.d(this);
   }

   @Override
   protected void x() {
      this.bO.a(1, new bwl.b(this));
      this.bO.a(2, new bwl.a(this));
      this.bO.a(3, new bwl.e(this));
      this.bO.a(5, new bwl.c(this));
      this.bP.a(1, new boo<>(this, byo.class, 10, true, false, $$0 -> Math.abs($$0.dp() - this.dp()) <= 4.0));
      this.bP.a(3, new boo<>(this, brx.class, true));
   }

   @Override
   protected void a_() {
      super.a_();
      this.am.a(bT, 1);
   }

   @VisibleForTesting
   public void a(int $$0, boolean $$1) {
      int $$2 = apa.a($$0, 1, 127);
      this.am.b(bT, $$2);
      this.an();
      this.d_();
      this.a(bhg.a).a((double)($$2 * $$2));
      this.a(bhg.d).a((double)(0.2F + 0.1F * (float)$$2));
      this.a(bhg.f).a((double)$$2);
      if ($$1) {
         this.t(this.eI());
      }

      this.bJ = $$2;
   }

   public int ga() {
      return this.am.b(bT);
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      $$0.a("Size", this.ga() - 1);
      $$0.a("wasOnGround", this.bU);
   }

   @Override
   public void a(qr $$0) {
      this.a($$0.h("Size") + 1, false);
      super.a($$0);
      this.bU = $$0.q("wasOnGround");
   }

   public boolean gb() {
      return this.ga() <= 1;
   }

   protected it r() {
      return iv.Q;
   }

   @Override
   protected boolean U() {
      return this.ga() > 0;
   }

   @Override
   public void l() {
      this.e = this.e + (this.d - this.e) * 0.5F;
      this.bS = this.e;
      super.l();
      if (this.ay() && !this.bU) {
         int $$0 = this.ga();

         for (int $$1 = 0; $$1 < $$0 * 8; $$1++) {
            float $$2 = this.af.i() * (float) (Math.PI * 2);
            float $$3 = this.af.i() * 0.5F + 0.5F;
            float $$4 = apa.a($$2) * (float)$$0 * 0.5F * $$3;
            float $$5 = apa.b($$2) * (float)$$0 * 0.5F * $$3;
            this.dI().a(this.r(), this.dn() + (double)$$4, this.dp(), this.dt() + (double)$$5, 0.0, 0.0, 0.0);
         }

         this.a(this.fY(), this.eR(), ((this.af.i() - this.af.i()) * 0.2F + 1.0F) / 0.8F);
         this.d = -0.5F;
      } else if (!this.ay() && this.bU) {
         this.d = 1.0F;
      }

      this.bU = this.ay();
      this.fV();
   }

   @Override
   protected void fV() {
      this.d *= 0.6F;
   }

   protected int w() {
      return this.af.a(20) + 10;
   }

   @Override
   public void d_() {
      double $$0 = this.dn();
      double $$1 = this.dp();
      double $$2 = this.dt();
      super.d_();
      this.e($$0, $$1, $$2);
   }

   @Override
   public void a(aby<?> $$0) {
      if (bT.equals($$0)) {
         this.d_();
         this.a_(this.aX);
         this.aV = this.aX;
         if (this.aV() && this.af.a(20) == 0) {
            this.bd();
         }
      }

      super.a($$0);
   }

   @Override
   public bfn<? extends bwl> ae() {
      return (bfn<? extends bwl>)super.ae();
   }

   @Override
   public void a(bfj.c $$0) {
      int $$1 = this.ga();
      if (!this.dI().B && $$1 > 1 && this.es()) {
         sw $$2 = this.ab();
         boolean $$3 = this.fQ();
         float $$4 = (float)$$1 / 4.0F;
         int $$5 = $$1 / 2;
         int $$6 = 2 + this.af.a(3);

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            float $$8 = ((float)($$7 % 2) - 0.5F) * $$4;
            float $$9 = ((float)($$7 / 2) - 0.5F) * $$4;
            bwl $$10 = this.ae().a(this.dI());
            if ($$10 != null) {
               if (this.fH()) {
                  $$10.fF();
               }

               $$10.b($$2);
               $$10.t($$3);
               $$10.m(this.co());
               $$10.a($$5, true);
               $$10.b(this.dn() + (double)$$8, this.dp() + 0.5, this.dt() + (double)$$9, this.af.i() * 360.0F, 0.0F);
               this.dI().b($$10);
            }
         }
      }

      super.a($$0);
   }

   @Override
   public void g(bfj $$0) {
      super.g($$0);
      if ($$0 instanceof brx && this.fW()) {
         this.l((bfz)$$0);
      }
   }

   @Override
   public void b_(byo $$0) {
      if (this.fW()) {
         this.l($$0);
      }
   }

   protected void l(bfz $$0) {
      if (this.bs()) {
         int $$1 = this.ga();
         if (this.f((bfj)$$0) < 0.6 * (double)$$1 * 0.6 * (double)$$1 && this.B($$0) && $$0.a(this.dJ().b((bfz)this), this.fX())) {
            this.a(amh.vC, 1.0F, (this.af.i() - this.af.i()) * 0.2F + 1.0F);
            this.a(this, $$0);
         }
      }
   }

   @Override
   protected float b(bgl $$0, bfk $$1) {
      return 0.625F * $$1.b;
   }

   protected boolean fW() {
      return !this.gb() && this.cV();
   }

   protected float fX() {
      return (float)this.b(bhg.f);
   }

   @Override
   protected amg d(ben $$0) {
      return this.gb() ? amh.wt : amh.vE;
   }

   @Override
   protected amg g_() {
      return this.gb() ? amh.ws : amh.vD;
   }

   protected amg fY() {
      return this.gb() ? amh.wv : amh.vG;
   }

   public static boolean c(bfn<bwl> $$0, cmn $$1, bgd $$2, gu $$3, apf $$4) {
      if ($$1.ai() != bdu.a) {
         if ($$1.s($$3).a(amv.ap) && $$3.v() > 50 && $$3.v() < 70 && $$4.i() < 0.5F && $$4.i() < $$1.an() && $$1.z($$3) <= $$4.a(8)) {
            return a($$0, $$1, $$2, $$3, $$4);
         }

         if (!($$1 instanceof cng)) {
            return false;
         }

         clt $$5 = new clt($$3);
         boolean $$6 = dij.a($$5.e, $$5.f, ((cng)$$1).A(), 987234911L).a(10) == 0;
         if ($$4.a(10) == 0 && $$6 && $$3.v() < 40) {
            return a($$0, $$1, $$2, $$3, $$4);
         }
      }

      return false;
   }

   @Override
   protected float eR() {
      return 0.4F * (float)this.ga();
   }

   @Override
   public int X() {
      return 0;
   }

   protected boolean gc() {
      return this.ga() > 0;
   }

   @Override
   protected void eW() {
      eei $$0 = this.dl();
      this.o($$0.c, (double)this.eU(), $$0.e);
      this.at = true;
   }

   @Nullable
   @Override
   public bgt a(cnb $$0, bdv $$1, bgd $$2, @Nullable bgt $$3, @Nullable qr $$4) {
      apf $$5 = $$0.y_();
      int $$6 = $$5.a(3);
      if ($$6 < 2 && $$5.i() < 0.5F * $$1.d()) {
         $$6++;
      }

      int $$7 = 1 << $$6;
      this.a($$7, true);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   float q() {
      float $$0 = this.gb() ? 1.4F : 0.8F;
      return ((this.af.i() - this.af.i()) * 0.2F + 1.0F) * $$0;
   }

   protected amg fZ() {
      return this.gb() ? amh.wu : amh.vF;
   }

   @Override
   public bfk a(bgl $$0) {
      return super.a($$0).a(0.255F * (float)this.ga());
   }

   static class a extends bmv {
      private final bwl a;
      private int b;

      public a(bwl $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bmv.a.b));
      }

      @Override
      public boolean a() {
         bfz $$0 = this.a.j();
         if ($$0 == null) {
            return false;
         } else {
            return !this.a.c($$0) ? false : this.a.G() instanceof bwl.d;
         }
      }

      @Override
      public void c() {
         this.b = b(300);
         super.c();
      }

      @Override
      public boolean b() {
         bfz $$0 = this.a.j();
         if ($$0 == null) {
            return false;
         } else {
            return !this.a.c($$0) ? false : --this.b > 0;
         }
      }

      @Override
      public boolean K_() {
         return true;
      }

      @Override
      public void e() {
         bfz $$0 = this.a.j();
         if ($$0 != null) {
            this.a.a($$0, 10.0F, 10.0F);
         }

         if (this.a.G() instanceof bwl.d $$1) {
            $$1.a(this.a.dy(), this.a.fW());
         }
      }
   }

   static class b extends bmv {
      private final bwl a;

      public b(bwl $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bmv.a.c, bmv.a.a));
         $$0.J().a(true);
      }

      @Override
      public boolean a() {
         return (this.a.aV() || this.a.bi()) && this.a.G() instanceof bwl.d;
      }

      @Override
      public boolean K_() {
         return true;
      }

      @Override
      public void e() {
         if (this.a.ec().i() < 0.8F) {
            this.a.I().a();
         }

         if (this.a.G() instanceof bwl.d $$0) {
            $$0.a(1.2);
         }
      }
   }

   static class c extends bmv {
      private final bwl a;

      public c(bwl $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bmv.a.c, bmv.a.a));
      }

      @Override
      public boolean a() {
         return !this.a.bM();
      }

      @Override
      public void e() {
         if (this.a.G() instanceof bwl.d $$0) {
            $$0.a(1.0);
         }
      }
   }

   static class d extends bly {
      private float l;
      private int m;
      private final bwl n;
      private boolean o;

      public d(bwl $$0) {
         super($$0);
         this.n = $$0;
         this.l = 180.0F * $$0.dy() / (float) Math.PI;
      }

      public void a(float $$0, boolean $$1) {
         this.l = $$0;
         this.o = $$1;
      }

      public void a(double $$0) {
         this.h = $$0;
         this.k = bly.a.b;
      }

      @Override
      public void a() {
         this.d.a_(this.a(this.d.dy(), this.l, 90.0F));
         this.d.aX = this.d.dy();
         this.d.aV = this.d.dy();
         if (this.k != bly.a.b) {
            this.d.z(0.0F);
         } else {
            this.k = bly.a.a;
            if (this.d.ay()) {
               this.d.w((float)(this.h * this.d.b(bhg.d)));
               if (this.m-- <= 0) {
                  this.m = this.n.w();
                  if (this.o) {
                     this.m /= 3;
                  }

                  this.n.I().a();
                  if (this.n.gc()) {
                     this.n.a(this.n.fZ(), this.n.eR(), this.n.q());
                  }
               } else {
                  this.n.bl = 0.0F;
                  this.n.bn = 0.0F;
                  this.d.w(0.0F);
               }
            } else {
               this.d.w((float)(this.h * this.d.b(bhg.d)));
            }
         }
      }
   }

   static class e extends bmv {
      private final bwl a;
      private float b;
      private int c;

      public e(bwl $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bmv.a.b));
      }

      @Override
      public boolean a() {
         return this.a.j() == null && (this.a.ay() || this.a.aV() || this.a.bi() || this.a.a(bfc.y)) && this.a.G() instanceof bwl.d;
      }

      @Override
      public void e() {
         if (--this.c <= 0) {
            this.c = this.a(40 + this.a.ec().a(60));
            this.b = (float)this.a.ec().a(360);
         }

         if (this.a.G() instanceof bwl.d $$0) {
            $$0.a(this.b, false);
         }
      }
   }
}
