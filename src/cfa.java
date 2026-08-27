import com.google.common.annotations.VisibleForTesting;
import java.util.EnumSet;
import javax.annotation.Nullable;

public class cfa extends bok implements cej {
   private static final aie<Integer> bT = aih.a(cfa.class, aig.b);
   public static final int b = 1;
   public static final int c = 127;
   public float d;
   public float e;
   public float bS;
   private boolean bU;

   public cfa(bnw<? extends cfa> $$0, cvr $$1) {
      super($$0, $$1);
      this.cD();
      this.bL = new cfa.d(this);
   }

   @Override
   protected void B() {
      this.bO.a(1, new cfa.b(this));
      this.bO.a(2, new cfa.a(this));
      this.bO.a(3, new cfa.e(this));
      this.bO.a(5, new cfa.c(this));
      this.bP.a(1, new bwy<>(this, chl.class, 10, true, false, $$0 -> Math.abs($$0.dt() - this.dt()) <= 4.0));
      this.bP.a(3, new bwy<>(this, caj.class, true));
   }

   @Override
   public atm db() {
      return atm.f;
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(bT, 1);
   }

   @VisibleForTesting
   public void a(int $$0, boolean $$1) {
      int $$2 = awi.a($$0, 1, 127);
      this.am.b(bT, $$2);
      this.ar();
      this.k_();
      this.f(bpp.n).a((double)($$2 * $$2));
      this.f(bpp.o).a((double)(0.2F + 0.1F * (float)$$2));
      this.f(bpp.c).a((double)$$2);
      if ($$1) {
         this.t(this.eN());
      }

      this.bJ = $$2;
   }

   public int gh() {
      return this.am.b(bT);
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      $$0.a("Size", this.gh() - 1);
      $$0.a("wasOnGround", this.bU);
   }

   @Override
   public void a(sw $$0) {
      this.a($$0.h("Size") + 1, false);
      super.a($$0);
      this.bU = $$0.q("wasOnGround");
   }

   public boolean gi() {
      return this.gh() <= 1;
   }

   protected jx w() {
      return jz.S;
   }

   @Override
   protected boolean Y() {
      return this.gh() > 0;
   }

   @Override
   public void l() {
      this.e = this.e + (this.d - this.e) * 0.5F;
      this.bS = this.e;
      super.l();
      if (this.aC() && !this.bU) {
         float $$0 = this.a(this.ap()).a() * 2.0F;
         float $$1 = $$0 / 2.0F;

         for (int $$2 = 0; (float)$$2 < $$0 * 16.0F; $$2++) {
            float $$3 = this.af.i() * (float) (Math.PI * 2);
            float $$4 = this.af.i() * 0.5F + 0.5F;
            float $$5 = awi.a($$3) * $$1 * $$4;
            float $$6 = awi.b($$3) * $$1 * $$4;
            this.dM().a(this.w(), this.dr() + (double)$$5, this.dt(), this.dx() + (double)$$6, 0.0, 0.0, 0.0);
         }

         this.a(this.gf(), this.eW(), ((this.af.i() - this.af.i()) * 0.2F + 1.0F) / 0.8F);
         this.d = -0.5F;
      } else if (!this.aC() && this.bU) {
         this.d = 1.0F;
      }

      this.bU = this.aC();
      this.gc();
   }

   @Override
   protected void gc() {
      this.d *= 0.6F;
   }

   protected int A() {
      return this.af.a(20) + 10;
   }

   @Override
   public void k_() {
      double $$0 = this.dr();
      double $$1 = this.dt();
      double $$2 = this.dx();
      super.k_();
      this.a_($$0, $$1, $$2);
   }

   @Override
   public void a(aie<?> $$0) {
      if (bT.equals($$0)) {
         this.k_();
         this.r(this.aW);
         this.aU = this.aW;
         if (this.aZ() && this.af.a(20) == 0) {
            this.bi();
         }
      }

      super.a($$0);
   }

   @Override
   public bnw<? extends cfa> ai() {
      return (bnw<? extends cfa>)super.ai();
   }

   @Override
   public void a(bnq.c $$0) {
      int $$1 = this.gh();
      if (!this.dM().B && $$1 > 1 && this.ex()) {
         vq $$2 = this.af();
         boolean $$3 = this.fW();
         float $$4 = this.a(this.ap()).a();
         float $$5 = $$4 / 2.0F;
         int $$6 = $$1 / 2;
         int $$7 = 2 + this.af.a(3);

         for (int $$8 = 0; $$8 < $$7; $$8++) {
            float $$9 = ((float)($$8 % 2) - 0.5F) * $$5;
            float $$10 = ((float)($$8 / 2) - 0.5F) * $$5;
            cfa $$11 = this.ai().a(this.dM());
            if ($$11 != null) {
               if (this.fN()) {
                  $$11.fL();
               }

               $$11.b($$2);
               $$11.t($$3);
               $$11.m(this.cr());
               $$11.a($$6, true);
               $$11.b(this.dr() + (double)$$9, this.dt() + 0.5, this.dx() + (double)$$10, this.af.i() * 360.0F, 0.0F);
               this.dM().b($$11);
            }
         }
      }

      super.a($$0);
   }

   @Override
   public void g(bnq $$0) {
      super.g($$0);
      if ($$0 instanceof caj && this.gd()) {
         this.j((boi)$$0);
      }
   }

   @Override
   public void b_(chl $$0) {
      if (this.gd()) {
         this.j($$0);
      }
   }

   protected void j(boi $$0) {
      if (this.bx()) {
         int $$1 = this.gh();
         if (this.f((bnq)$$0) < 0.6 * (double)$$1 * 0.6 * (double)$$1 && this.D($$0) && $$0.a(this.dN().b((boi)this), this.ge())) {
            this.a(atl.wI, 1.0F, (this.af.i() - this.af.i()) * 0.2F + 1.0F);
            this.a(this, $$0);
         }
      }
   }

   @Override
   protected enz a(bnq $$0, bnt $$1, float $$2) {
      return new enz(0.0, (double)$$1.b() - 0.015625 * (double)this.gh() * (double)$$2, 0.0);
   }

   protected boolean gd() {
      return !this.gi() && this.cY();
   }

   protected float ge() {
      return (float)this.g(bpp.c);
   }

   @Override
   protected atk d(bmp $$0) {
      return this.gi() ? atl.xz : atl.wK;
   }

   @Override
   protected atk n_() {
      return this.gi() ? atl.xy : atl.wJ;
   }

   protected atk gf() {
      return this.gi() ? atl.xB : atl.wM;
   }

   public static boolean c(bnw<cfa> $$0, cvs $$1, bom $$2, hz $$3, awp $$4) {
      if (bom.a($$2)) {
         return a($$0, $$1, $$2, $$3, $$4);
      } else {
         if ($$1.aj() != blt.a) {
            if ($$2 == bom.c) {
               return a($$0, $$1, $$2, $$3, $$4);
            }

            if ($$1.t($$3).a(atz.aq) && $$3.v() > 50 && $$3.v() < 70 && $$4.i() < 0.5F && $$4.i() < $$1.ao() && $$1.A($$3) <= $$4.a(8)) {
               return a($$0, $$1, $$2, $$3, $$4);
            }

            if (!($$1 instanceof cwm)) {
               return false;
            }

            cuy $$5 = new cuy($$3);
            boolean $$6 = dru.a($$5.e, $$5.f, ((cwm)$$1).C(), 987234911L).a(10) == 0;
            if ($$4.a(10) == 0 && $$6 && $$3.v() < 40) {
               return a($$0, $$1, $$2, $$3, $$4);
            }
         }

         return false;
      }
   }

   @Override
   protected float eW() {
      return 0.4F * (float)this.gh();
   }

   @Override
   public int ab() {
      return 0;
   }

   protected boolean gj() {
      return this.gh() > 0;
   }

   @Override
   protected void fb() {
      enz $$0 = this.dp();
      this.o($$0.c, (double)this.eZ(), $$0.e);
      this.at = true;
   }

   @Nullable
   @Override
   public bpa a(cwg $$0, blu $$1, bom $$2, @Nullable bpa $$3, @Nullable sw $$4) {
      awp $$5 = $$0.F_();
      int $$6 = $$5.a(3);
      if ($$6 < 2 && $$5.i() < 0.5F * $$1.d()) {
         $$6++;
      }

      int $$7 = 1 << $$6;
      this.a($$7, true);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   float u() {
      float $$0 = this.gi() ? 1.4F : 0.8F;
      return ((this.af.i() - this.af.i()) * 0.2F + 1.0F) * $$0;
   }

   protected atk gg() {
      return this.gi() ? atl.xA : atl.wL;
   }

   @Override
   public bnt e(bot $$0) {
      return super.e($$0).a((float)this.gh());
   }

   static class a extends bvf {
      private final cfa a;
      private int b;

      public a(cfa $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bvf.a.b));
      }

      @Override
      public boolean a() {
         boi $$0 = this.a.q();
         if ($$0 == null) {
            return false;
         } else {
            return !this.a.c($$0) ? false : this.a.K() instanceof cfa.d;
         }
      }

      @Override
      public void c() {
         this.b = b(300);
         super.c();
      }

      @Override
      public boolean b() {
         boi $$0 = this.a.q();
         if ($$0 == null) {
            return false;
         } else {
            return !this.a.c($$0) ? false : --this.b > 0;
         }
      }

      @Override
      public boolean T_() {
         return true;
      }

      @Override
      public void e() {
         boi $$0 = this.a.q();
         if ($$0 != null) {
            this.a.a($$0, 10.0F, 10.0F);
         }

         if (this.a.K() instanceof cfa.d $$1) {
            $$1.a(this.a.dC(), this.a.gd());
         }
      }
   }

   static class b extends bvf {
      private final cfa a;

      public b(cfa $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bvf.a.c, bvf.a.a));
         $$0.N().a(true);
      }

      @Override
      public boolean a() {
         return (this.a.aZ() || this.a.bn()) && this.a.K() instanceof cfa.d;
      }

      @Override
      public boolean T_() {
         return true;
      }

      @Override
      public void e() {
         if (this.a.eh().i() < 0.8F) {
            this.a.M().a();
         }

         if (this.a.K() instanceof cfa.d $$0) {
            $$0.a(1.2);
         }
      }
   }

   static class c extends bvf {
      private final cfa a;

      public c(cfa $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bvf.a.c, bvf.a.a));
      }

      @Override
      public boolean a() {
         return !this.a.bO();
      }

      @Override
      public void e() {
         if (this.a.K() instanceof cfa.d $$0) {
            $$0.a(1.0);
         }
      }
   }

   static class d extends bui {
      private float l;
      private int m;
      private final cfa n;
      private boolean o;

      public d(cfa $$0) {
         super($$0);
         this.n = $$0;
         this.l = 180.0F * $$0.dC() / (float) Math.PI;
      }

      public void a(float $$0, boolean $$1) {
         this.l = $$0;
         this.o = $$1;
      }

      public void a(double $$0) {
         this.h = $$0;
         this.k = bui.a.b;
      }

      @Override
      public void a() {
         this.d.r(this.a(this.d.dC(), this.l, 90.0F));
         this.d.aW = this.d.dC();
         this.d.aU = this.d.dC();
         if (this.k != bui.a.b) {
            this.d.A(0.0F);
         } else {
            this.k = bui.a.a;
            if (this.d.aC()) {
               this.d.w((float)(this.h * this.d.g(bpp.o)));
               if (this.m-- <= 0) {
                  this.m = this.n.A();
                  if (this.o) {
                     this.m /= 3;
                  }

                  this.n.M().a();
                  if (this.n.gj()) {
                     this.n.a(this.n.gg(), this.n.eW(), this.n.u());
                  }
               } else {
                  this.n.bk = 0.0F;
                  this.n.bm = 0.0F;
                  this.d.w(0.0F);
               }
            } else {
               this.d.w((float)(this.h * this.d.g(bpp.o)));
            }
         }
      }
   }

   static class e extends bvf {
      private final cfa a;
      private float b;
      private int c;

      public e(cfa $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bvf.a.b));
      }

      @Override
      public boolean a() {
         return this.a.q() == null && (this.a.aC() || this.a.aZ() || this.a.bn() || this.a.a(bnf.y)) && this.a.K() instanceof cfa.d;
      }

      @Override
      public void e() {
         if (--this.c <= 0) {
            this.c = this.a(40 + this.a.eh().a(60));
            this.b = (float)this.a.eh().a(360);
         }

         if (this.a.K() instanceof cfa.d $$0) {
            $$0.a(this.b, false);
         }
      }
   }
}
