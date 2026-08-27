import com.google.common.annotations.VisibleForTesting;
import java.util.EnumSet;
import javax.annotation.Nullable;

public class cew extends boi implements cef {
   private static final aie<Integer> bT = aih.a(cew.class, aig.b);
   public static final int b = 1;
   public static final int c = 127;
   public float d;
   public float e;
   public float bS;
   private boolean bU;

   public cew(bnu<? extends cew> $$0, cvn $$1) {
      super($$0, $$1);
      this.cD();
      this.bL = new cew.d(this);
   }

   @Override
   protected void B() {
      this.bO.a(1, new cew.b(this));
      this.bO.a(2, new cew.a(this));
      this.bO.a(3, new cew.e(this));
      this.bO.a(5, new cew.c(this));
      this.bP.a(1, new bwu<>(this, chh.class, 10, true, false, $$0 -> Math.abs($$0.dt() - this.dt()) <= 4.0));
      this.bP.a(3, new bwu<>(this, caf.class, true));
   }

   @Override
   public atl db() {
      return atl.f;
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(bT, 1);
   }

   @VisibleForTesting
   public void a(int $$0, boolean $$1) {
      int $$2 = awh.a($$0, 1, 127);
      this.am.b(bT, $$2);
      this.ar();
      this.k_();
      this.f(bpl.n).a((double)($$2 * $$2));
      this.f(bpl.o).a((double)(0.2F + 0.1F * (float)$$2));
      this.f(bpl.c).a((double)$$2);
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
            float $$5 = awh.a($$3) * $$1 * $$4;
            float $$6 = awh.b($$3) * $$1 * $$4;
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
   public bnu<? extends cew> ai() {
      return (bnu<? extends cew>)super.ai();
   }

   @Override
   public void a(bno.c $$0) {
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
            cew $$11 = this.ai().a(this.dM());
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
   public void g(bno $$0) {
      super.g($$0);
      if ($$0 instanceof caf && this.gd()) {
         this.j((bog)$$0);
      }
   }

   @Override
   public void b_(chh $$0) {
      if (this.gd()) {
         this.j($$0);
      }
   }

   protected void j(bog $$0) {
      if (this.bx()) {
         int $$1 = this.gh();
         if (this.f((bno)$$0) < 0.6 * (double)$$1 * 0.6 * (double)$$1 && this.D($$0) && $$0.a(this.dN().b((bog)this), this.ge())) {
            this.a(atk.wH, 1.0F, (this.af.i() - this.af.i()) * 0.2F + 1.0F);
            this.a(this, $$0);
         }
      }
   }

   @Override
   protected ens a(bno $$0, bnr $$1, float $$2) {
      return new ens(0.0, (double)$$1.b() - 0.015625 * (double)this.gh() * (double)$$2, 0.0);
   }

   protected boolean gd() {
      return !this.gi() && this.cY();
   }

   protected float ge() {
      return (float)this.g(bpl.c);
   }

   @Override
   protected atj d(bmn $$0) {
      return this.gi() ? atk.xy : atk.wJ;
   }

   @Override
   protected atj n_() {
      return this.gi() ? atk.xx : atk.wI;
   }

   protected atj gf() {
      return this.gi() ? atk.xA : atk.wL;
   }

   public static boolean c(bnu<cew> $$0, cvo $$1, bok $$2, hz $$3, awo $$4) {
      if (bok.a($$2)) {
         return a($$0, $$1, $$2, $$3, $$4);
      } else {
         if ($$1.ak() != blr.a) {
            if ($$2 == bok.c) {
               return a($$0, $$1, $$2, $$3, $$4);
            }

            if ($$1.t($$3).a(aty.aq) && $$3.v() > 50 && $$3.v() < 70 && $$4.i() < 0.5F && $$4.i() < $$1.ap() && $$1.A($$3) <= $$4.a(8)) {
               return a($$0, $$1, $$2, $$3, $$4);
            }

            if (!($$1 instanceof cwi)) {
               return false;
            }

            cuu $$5 = new cuu($$3);
            boolean $$6 = drn.a($$5.e, $$5.f, ((cwi)$$1).C(), 987234911L).a(10) == 0;
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
      ens $$0 = this.dp();
      this.o($$0.c, (double)this.eZ(), $$0.e);
      this.at = true;
   }

   @Nullable
   @Override
   public boy a(cwc $$0, bls $$1, bok $$2, @Nullable boy $$3, @Nullable sw $$4) {
      awo $$5 = $$0.F_();
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

   protected atj gg() {
      return this.gi() ? atk.xz : atk.wK;
   }

   @Override
   public bnr e(bor $$0) {
      return super.e($$0).a((float)this.gh());
   }

   static class a extends bvb {
      private final cew a;
      private int b;

      public a(cew $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bvb.a.b));
      }

      @Override
      public boolean a() {
         bog $$0 = this.a.q();
         if ($$0 == null) {
            return false;
         } else {
            return !this.a.c($$0) ? false : this.a.K() instanceof cew.d;
         }
      }

      @Override
      public void c() {
         this.b = b(300);
         super.c();
      }

      @Override
      public boolean b() {
         bog $$0 = this.a.q();
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
         bog $$0 = this.a.q();
         if ($$0 != null) {
            this.a.a($$0, 10.0F, 10.0F);
         }

         if (this.a.K() instanceof cew.d $$1) {
            $$1.a(this.a.dC(), this.a.gd());
         }
      }
   }

   static class b extends bvb {
      private final cew a;

      public b(cew $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bvb.a.c, bvb.a.a));
         $$0.N().a(true);
      }

      @Override
      public boolean a() {
         return (this.a.aZ() || this.a.bn()) && this.a.K() instanceof cew.d;
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

         if (this.a.K() instanceof cew.d $$0) {
            $$0.a(1.2);
         }
      }
   }

   static class c extends bvb {
      private final cew a;

      public c(cew $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bvb.a.c, bvb.a.a));
      }

      @Override
      public boolean a() {
         return !this.a.bO();
      }

      @Override
      public void e() {
         if (this.a.K() instanceof cew.d $$0) {
            $$0.a(1.0);
         }
      }
   }

   static class d extends bue {
      private float l;
      private int m;
      private final cew n;
      private boolean o;

      public d(cew $$0) {
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
         this.k = bue.a.b;
      }

      @Override
      public void a() {
         this.d.r(this.a(this.d.dC(), this.l, 90.0F));
         this.d.aW = this.d.dC();
         this.d.aU = this.d.dC();
         if (this.k != bue.a.b) {
            this.d.A(0.0F);
         } else {
            this.k = bue.a.a;
            if (this.d.aC()) {
               this.d.w((float)(this.h * this.d.g(bpl.o)));
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
               this.d.w((float)(this.h * this.d.g(bpl.o)));
            }
         }
      }
   }

   static class e extends bvb {
      private final cew a;
      private float b;
      private int c;

      public e(cew $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bvb.a.b));
      }

      @Override
      public boolean a() {
         return this.a.q() == null && (this.a.aC() || this.a.aZ() || this.a.bn() || this.a.a(bnd.y)) && this.a.K() instanceof cew.d;
      }

      @Override
      public void e() {
         if (--this.c <= 0) {
            this.c = this.a(40 + this.a.eh().a(60));
            this.b = (float)this.a.eh().a(360);
         }

         if (this.a.K() instanceof cew.d $$0) {
            $$0.a(this.b, false);
         }
      }
   }
}
