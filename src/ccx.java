import com.google.common.annotations.VisibleForTesting;
import java.util.EnumSet;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class ccx extends bmm implements ccg {
   private static final agm<Integer> bT = agp.a(ccx.class, ago.b);
   public static final int b = 1;
   public static final int c = 127;
   public float d;
   public float e;
   public float bS;
   private boolean bU;

   public ccx(bly<? extends ccx> $$0, cto $$1) {
      super($$0, $$1);
      this.cD();
      this.bL = new ccx.d(this);
   }

   @Override
   protected void B() {
      this.bO.a(1, new ccx.b(this));
      this.bO.a(2, new ccx.a(this));
      this.bO.a(3, new ccx.e(this));
      this.bO.a(5, new ccx.c(this));
      this.bP.a(1, new buz<>(this, cfh.class, 10, true, false, $$0 -> Math.abs($$0.dt() - this.dt()) <= 4.0));
      this.bP.a(3, new buz<>(this, byj.class, true));
   }

   @Override
   public ars db() {
      return ars.f;
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(bT, 1);
   }

   @VisibleForTesting
   public void a(int $$0, boolean $$1) {
      int $$2 = aun.a($$0, 1, 127);
      this.an.b(bT, $$2);
      this.ar();
      this.k_();
      this.a(bnq.l).a((double)($$2 * $$2));
      this.a(bnq.m).a((double)(0.2F + 0.1F * (float)$$2));
      this.a(bnq.c).a((double)$$2);
      if ($$1) {
         this.c(this.eM());
      }

      this.bJ = $$2;
   }

   public int gf() {
      return this.an.b(bT);
   }

   @Override
   public void b(sn $$0) {
      super.b($$0);
      $$0.a("Size", this.gf() - 1);
      $$0.a("wasOnGround", this.bU);
   }

   @Override
   public void a(sn $$0) {
      this.a($$0.h("Size") + 1, false);
      super.a($$0);
      this.bU = $$0.q("wasOnGround");
   }

   public boolean gg() {
      return this.gf() <= 1;
   }

   protected jv w() {
      return jx.S;
   }

   @Override
   protected boolean X() {
      return this.gf() > 0;
   }

   @Override
   public void l() {
      this.e = this.e + (this.d - this.e) * 0.5F;
      this.bS = this.e;
      super.l();
      if (this.aC() && !this.bU) {
         int $$0 = this.gf();

         for (int $$1 = 0; $$1 < $$0 * 8; $$1++) {
            float $$2 = this.ag.i() * (float) (Math.PI * 2);
            float $$3 = this.ag.i() * 0.5F + 0.5F;
            float $$4 = aun.a($$2) * (float)$$0 * 0.5F * $$3;
            float $$5 = aun.b($$2) * (float)$$0 * 0.5F * $$3;
            this.dM().a(this.w(), this.dr() + (double)$$4, this.dt(), this.dx() + (double)$$5, 0.0, 0.0, 0.0);
         }

         this.a(this.gd(), this.eW(), ((this.ag.i() - this.ag.i()) * 0.2F + 1.0F) / 0.8F);
         this.d = -0.5F;
      } else if (!this.aC() && this.bU) {
         this.d = 1.0F;
      }

      this.bU = this.aC();
      this.ga();
   }

   @Override
   protected void ga() {
      this.d *= 0.6F;
   }

   protected int A() {
      return this.ag.a(20) + 10;
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
   public void a(agm<?> $$0) {
      if (bT.equals($$0)) {
         this.k_();
         this.r(this.aW);
         this.aU = this.aW;
         if (this.aZ() && this.ag.a(20) == 0) {
            this.bi();
         }
      }

      super.a($$0);
   }

   @Override
   public bly<? extends ccx> ai() {
      return (bly<? extends ccx>)super.ai();
   }

   @Override
   public void a(blu.c $$0) {
      int $$1 = this.gf();
      if (!this.dM().B && $$1 > 1 && this.ew()) {
         vf $$2 = this.af();
         boolean $$3 = this.fU();
         float $$4 = (float)$$1 / 4.0F;
         int $$5 = $$1 / 2;
         int $$6 = 2 + this.ag.a(3);

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            float $$8 = ((float)($$7 % 2) - 0.5F) * $$4;
            float $$9 = ((float)($$7 / 2) - 0.5F) * $$4;
            ccx $$10 = this.ai().a(this.dM());
            if ($$10 != null) {
               if (this.fL()) {
                  $$10.fJ();
               }

               $$10.b($$2);
               $$10.t($$3);
               $$10.m(this.cr());
               $$10.a($$5, true);
               $$10.b(this.dr() + (double)$$8, this.dt() + 0.5, this.dx() + (double)$$9, this.ag.i() * 360.0F, 0.0F);
               this.dM().b($$10);
            }
         }
      }

      super.a($$0);
   }

   @Override
   public void g(blu $$0) {
      super.g($$0);
      if ($$0 instanceof byj && this.gb()) {
         this.j((bmk)$$0);
      }
   }

   @Override
   public void b_(cfh $$0) {
      if (this.gb()) {
         this.j($$0);
      }
   }

   protected void j(bmk $$0) {
      if (this.bx()) {
         int $$1 = this.gf();
         if (this.f((blu)$$0) < 0.6 * (double)$$1 * 0.6 * (double)$$1 && this.E($$0) && $$0.a(this.dN().b((bmk)this), this.gc())) {
            this.a(arr.ws, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
            this.a(this, $$0);
         }
      }
   }

   @Override
   protected float b(bmw $$0, blv $$1) {
      return 0.625F * $$1.b;
   }

   @Override
   protected Vector3f a(blu $$0, blv $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.015625F * (float)this.gf() * $$2, 0.0F);
   }

   protected boolean gb() {
      return !this.gg() && this.cY();
   }

   protected float gc() {
      return (float)this.b(bnq.c);
   }

   @Override
   protected arq d(bks $$0) {
      return this.gg() ? arr.xj : arr.wu;
   }

   @Override
   protected arq n_() {
      return this.gg() ? arr.xi : arr.wt;
   }

   protected arq gd() {
      return this.gg() ? arr.xl : arr.ww;
   }

   public static boolean c(bly<ccx> $$0, ctp $$1, bmo $$2, hx $$3, auu $$4) {
      if (bmo.a($$2)) {
         return a($$0, $$1, $$2, $$3, $$4);
      } else {
         if ($$1.ak() != bjx.a) {
            if ($$2 == bmo.c) {
               return a($$0, $$1, $$2, $$3, $$4);
            }

            if ($$1.t($$3).a(asf.aq) && $$3.v() > 50 && $$3.v() < 70 && $$4.i() < 0.5F && $$4.i() < $$1.ap() && $$1.A($$3) <= $$4.a(8)) {
               return a($$0, $$1, $$2, $$3, $$4);
            }

            if (!($$1 instanceof cuj)) {
               return false;
            }

            csv $$5 = new csv($$3);
            boolean $$6 = dpo.a($$5.e, $$5.f, ((cuj)$$1).C(), 987234911L).a(10) == 0;
            if ($$4.a(10) == 0 && $$6 && $$3.v() < 40) {
               return a($$0, $$1, $$2, $$3, $$4);
            }
         }

         return false;
      }
   }

   @Override
   protected float eW() {
      return 0.4F * (float)this.gf();
   }

   @Override
   public int aa() {
      return 0;
   }

   protected boolean gh() {
      return this.gf() > 0;
   }

   @Override
   protected void fb() {
      els $$0 = this.dp();
      this.o($$0.c, (double)this.eZ(), $$0.e);
      this.au = true;
   }

   @Nullable
   @Override
   public bnd a(cud $$0, bjy $$1, bmo $$2, @Nullable bnd $$3, @Nullable sn $$4) {
      auu $$5 = $$0.F_();
      int $$6 = $$5.a(3);
      if ($$6 < 2 && $$5.i() < 0.5F * $$1.d()) {
         $$6++;
      }

      int $$7 = 1 << $$6;
      this.a($$7, true);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   float u() {
      float $$0 = this.gg() ? 1.4F : 0.8F;
      return ((this.ag.i() - this.ag.i()) * 0.2F + 1.0F) * $$0;
   }

   protected arq ge() {
      return this.gg() ? arr.xk : arr.wv;
   }

   @Override
   public blv a(bmw $$0) {
      return super.a($$0).a(0.255F * (float)this.gf());
   }

   static class a extends btg {
      private final ccx a;
      private int b;

      public a(ccx $$0) {
         this.a = $$0;
         this.a(EnumSet.of(btg.a.b));
      }

      @Override
      public boolean a() {
         bmk $$0 = this.a.q();
         if ($$0 == null) {
            return false;
         } else {
            return !this.a.c($$0) ? false : this.a.K() instanceof ccx.d;
         }
      }

      @Override
      public void c() {
         this.b = b(300);
         super.c();
      }

      @Override
      public boolean b() {
         bmk $$0 = this.a.q();
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
         bmk $$0 = this.a.q();
         if ($$0 != null) {
            this.a.a($$0, 10.0F, 10.0F);
         }

         if (this.a.K() instanceof ccx.d $$1) {
            $$1.a(this.a.dC(), this.a.gb());
         }
      }
   }

   static class b extends btg {
      private final ccx a;

      public b(ccx $$0) {
         this.a = $$0;
         this.a(EnumSet.of(btg.a.c, btg.a.a));
         $$0.N().a(true);
      }

      @Override
      public boolean a() {
         return (this.a.aZ() || this.a.bn()) && this.a.K() instanceof ccx.d;
      }

      @Override
      public boolean T_() {
         return true;
      }

      @Override
      public void e() {
         if (this.a.eg().i() < 0.8F) {
            this.a.M().a();
         }

         if (this.a.K() instanceof ccx.d $$0) {
            $$0.a(1.2);
         }
      }
   }

   static class c extends btg {
      private final ccx a;

      public c(ccx $$0) {
         this.a = $$0;
         this.a(EnumSet.of(btg.a.c, btg.a.a));
      }

      @Override
      public boolean a() {
         return !this.a.bO();
      }

      @Override
      public void e() {
         if (this.a.K() instanceof ccx.d $$0) {
            $$0.a(1.0);
         }
      }
   }

   static class d extends bsj {
      private float l;
      private int m;
      private final ccx n;
      private boolean o;

      public d(ccx $$0) {
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
         this.k = bsj.a.b;
      }

      @Override
      public void a() {
         this.d.r(this.a(this.d.dC(), this.l, 90.0F));
         this.d.aW = this.d.dC();
         this.d.aU = this.d.dC();
         if (this.k != bsj.a.b) {
            this.d.A(0.0F);
         } else {
            this.k = bsj.a.a;
            if (this.d.aC()) {
               this.d.w((float)(this.h * this.d.b(bnq.m)));
               if (this.m-- <= 0) {
                  this.m = this.n.A();
                  if (this.o) {
                     this.m /= 3;
                  }

                  this.n.M().a();
                  if (this.n.gh()) {
                     this.n.a(this.n.ge(), this.n.eW(), this.n.u());
                  }
               } else {
                  this.n.bk = 0.0F;
                  this.n.bm = 0.0F;
                  this.d.w(0.0F);
               }
            } else {
               this.d.w((float)(this.h * this.d.b(bnq.m)));
            }
         }
      }
   }

   static class e extends btg {
      private final ccx a;
      private float b;
      private int c;

      public e(ccx $$0) {
         this.a = $$0;
         this.a(EnumSet.of(btg.a.b));
      }

      @Override
      public boolean a() {
         return this.a.q() == null && (this.a.aC() || this.a.aZ() || this.a.bn() || this.a.a(blj.y)) && this.a.K() instanceof ccx.d;
      }

      @Override
      public void e() {
         if (--this.c <= 0) {
            this.c = this.a(40 + this.a.eg().a(60));
            this.b = (float)this.a.eg().a(360);
         }

         if (this.a.K() instanceof ccx.d $$0) {
            $$0.a(this.b, false);
         }
      }
   }
}
