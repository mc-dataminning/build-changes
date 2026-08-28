import com.google.common.annotations.VisibleForTesting;
import java.util.EnumSet;
import javax.annotation.Nullable;

public class cjz extends btd implements cji {
   private static final ajp<Integer> cb = ajt.a(cjz.class, ajr.b);
   public static final int b = 1;
   public static final int c = 127;
   public static final int d = 4;
   public float e;
   public float bZ;
   public float ca;
   private boolean cc;

   public cjz(bsm<? extends cjz> $$0, dcf $$1) {
      super($$0, $$1);
      this.cH();
      this.bR = new cjz.d(this);
   }

   @Override
   protected void z() {
      this.bU.a(1, new cjz.b(this));
      this.bU.a(2, new cjz.a(this));
      this.bU.a(3, new cjz.e(this));
      this.bU.a(5, new cjz.c(this));
      this.bV.a(1, new cbs<>(this, cmk.class, 10, true, false, $$0 -> Math.abs($$0.dx() - this.dx()) <= 4.0));
      this.bV.a(3, new cbs<>(this, cfd.class, true));
   }

   @Override
   public avi df() {
      return avi.f;
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(cb, 1);
   }

   @VisibleForTesting
   public void a(int $$0, boolean $$1) {
      int $$2 = ayg.a($$0, 1, 127);
      this.ao.a(cb, $$2);
      this.au();
      this.j_();
      this.f(buj.s).a((double)($$2 * $$2));
      this.f(buj.v).a((double)(0.2F + 0.1F * (float)$$2));
      this.f(buj.c).a((double)$$2);
      if ($$1) {
         this.u(this.eO());
      }

      this.bP = $$2;
   }

   public int gp() {
      return this.ao.a(cb);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("Size", this.gp() - 1);
      $$0.a("wasOnGround", this.cc);
   }

   @Override
   public void a(tx $$0) {
      this.a($$0.h("Size") + 1, false);
      super.a($$0);
      this.cc = $$0.q("wasOnGround");
   }

   public boolean gq() {
      return this.gp() <= 1;
   }

   protected lh u() {
      return lj.U;
   }

   @Override
   protected boolean X() {
      return this.gp() > 0;
   }

   @Override
   public void l() {
      this.bZ = this.bZ + (this.e - this.bZ) * 0.5F;
      this.ca = this.bZ;
      super.l();
      if (this.aF() && !this.cc) {
         float $$0 = this.a(this.as()).a() * 2.0F;
         float $$1 = $$0 / 2.0F;

         for (int $$2 = 0; (float)$$2 < $$0 * 16.0F; $$2++) {
            float $$3 = this.ah.i() * (float) (Math.PI * 2);
            float $$4 = this.ah.i() * 0.5F + 0.5F;
            float $$5 = ayg.a($$3) * $$1 * $$4;
            float $$6 = ayg.b($$3) * $$1 * $$4;
            this.dQ().a(this.u(), this.dv() + (double)$$5, this.dx(), this.dB() + (double)$$6, 0.0, 0.0, 0.0);
         }

         this.a(this.gn(), this.fb(), ((this.ah.i() - this.ah.i()) * 0.2F + 1.0F) / 0.8F);
         this.e = -0.5F;
      } else if (!this.aF() && this.cc) {
         this.e = 1.0F;
      }

      this.cc = this.aF();
      this.gk();
   }

   @Override
   protected void gk() {
      this.e *= 0.6F;
   }

   protected int y() {
      return this.ah.a(20) + 10;
   }

   @Override
   public void j_() {
      double $$0 = this.dv();
      double $$1 = this.dx();
      double $$2 = this.dB();
      super.j_();
      this.a_($$0, $$1, $$2);
   }

   @Override
   public void a(ajp<?> $$0) {
      if (cb.equals($$0)) {
         this.j_();
         this.s(this.ba);
         this.aY = this.ba;
         if (this.bf() && this.ah.a(20) == 0) {
            this.bo();
         }
      }

      super.a($$0);
   }

   @Override
   public bsm<? extends cjz> al() {
      return (bsm<? extends cjz>)super.al();
   }

   @Override
   public void a(bsg.c $$0) {
      int $$1 = this.gp();
      if (!this.dQ().B && $$1 > 1 && this.ey()) {
         wu $$2 = this.ai();
         boolean $$3 = this.gd();
         float $$4 = this.a(this.as()).a();
         float $$5 = $$4 / 2.0F;
         int $$6 = $$1 / 2;
         int $$7 = 2 + this.ah.a(3);

         for (int $$8 = 0; $$8 < $$7; $$8++) {
            float $$9 = ((float)($$8 % 2) - 0.5F) * $$5;
            float $$10 = ((float)($$8 / 2) - 0.5F) * $$5;
            cjz $$11 = this.al().a(this.dQ());
            if ($$11 != null) {
               if (this.fT()) {
                  $$11.fR();
               }

               $$11.b($$2);
               $$11.t($$3);
               $$11.n(this.cv());
               $$11.a($$6, true);
               $$11.b(this.dv() + (double)$$9, this.dx() + 0.5, this.dB() + (double)$$10, this.ah.i() * 360.0F, 0.0F);
               this.dQ().b($$11);
            }
         }
      }

      super.a($$0);
   }

   @Override
   public void h(bsg $$0) {
      super.h($$0);
      if ($$0 instanceof cfd && this.gl()) {
         this.j((btb)$$0);
      }
   }

   @Override
   public void b_(cmk $$0) {
      if (this.gl()) {
         this.j($$0);
      }
   }

   protected void j(btb $$0) {
      if (this.bE()) {
         int $$1 = this.gp();
         if (this.g((bsg)$$0) < 0.6 * (double)$$1 * 0.6 * (double)$$1 && this.F($$0)) {
            bqz $$2 = this.dR().b((btb)this);
            if ($$0.a($$2, this.gm())) {
               this.a(avh.xp, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
               if (this.dQ() instanceof aqm $$3) {
                  czn.a($$3, (bsg)$$0, $$2);
               }
            }
         }
      }
   }

   @Override
   protected ewf a(bsg $$0, bsj $$1, float $$2) {
      return new ewf(0.0, (double)$$1.b() - 0.015625 * (double)this.gp() * (double)$$2, 0.0);
   }

   protected boolean gl() {
      return !this.gq() && this.dc();
   }

   protected float gm() {
      return (float)this.g(buj.c);
   }

   @Override
   protected avg d(bqz $$0) {
      return this.gq() ? avh.yg : avh.xr;
   }

   @Override
   protected avg o_() {
      return this.gq() ? avh.yf : avh.xq;
   }

   protected avg gn() {
      return this.gq() ? avh.yi : avh.xt;
   }

   public static boolean c(bsm<cjz> $$0, dcg $$1, btf $$2, ja $$3, ayo $$4) {
      if (btf.a($$2)) {
         return a($$0, $$1, $$2, $$3, $$4);
      } else {
         if ($$1.al() != bqd.a) {
            if ($$2 == btf.c) {
               return a($$0, $$1, $$2, $$3, $$4);
            }

            if ($$1.t($$3).a(avv.aq) && $$3.v() > 50 && $$3.v() < 70 && $$4.i() < 0.5F && $$4.i() < $$1.aq() && $$1.A($$3) <= $$4.a(8)) {
               return a($$0, $$1, $$2, $$3, $$4);
            }

            if (!($$1 instanceof ddb)) {
               return false;
            }

            dbm $$5 = new dbm($$3);
            boolean $$6 = dze.a($$5.e, $$5.f, ((ddb)$$1).C(), 987234911L).a(10) == 0;
            if ($$4.a(10) == 0 && $$6 && $$3.v() < 40) {
               return a($$0, $$1, $$2, $$3, $$4);
            }
         }

         return false;
      }
   }

   @Override
   protected float fb() {
      return 0.4F * (float)this.gp();
   }

   @Override
   public int aa() {
      return 0;
   }

   protected boolean gr() {
      return this.gp() > 0;
   }

   @Override
   protected void fg() {
      ewf $$0 = this.dt();
      this.o($$0.c, (double)this.fe(), $$0.e);
      this.av = true;
   }

   @Nullable
   @Override
   public btu a(dcu $$0, bqe $$1, btf $$2, @Nullable btu $$3) {
      ayo $$4 = $$0.E_();
      int $$5 = $$4.a(3);
      if ($$5 < 2 && $$4.i() < 0.5F * $$1.d()) {
         $$5++;
      }

      int $$6 = 1 << $$5;
      this.a($$6, true);
      return super.a($$0, $$1, $$2, $$3);
   }

   float s() {
      float $$0 = this.gq() ? 1.4F : 0.8F;
      return ((this.ah.i() - this.ah.i()) * 0.2F + 1.0F) * $$0;
   }

   protected avg go() {
      return this.gq() ? avh.yh : avh.xs;
   }

   @Override
   public bsj e(btn $$0) {
      return super.e($$0).a((float)this.gp());
   }

   static class a extends bzz {
      private final cjz a;
      private int b;

      public a(cjz $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bzz.a.b));
      }

      @Override
      public boolean a() {
         btb $$0 = this.a.p();
         if ($$0 == null) {
            return false;
         } else {
            return !this.a.c($$0) ? false : this.a.H() instanceof cjz.d;
         }
      }

      @Override
      public void c() {
         this.b = b(300);
         super.c();
      }

      @Override
      public boolean b() {
         btb $$0 = this.a.p();
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
         btb $$0 = this.a.p();
         if ($$0 != null) {
            this.a.a($$0, 10.0F, 10.0F);
         }

         if (this.a.H() instanceof cjz.d $$1) {
            $$1.a(this.a.dG(), this.a.gl());
         }
      }
   }

   static class b extends bzz {
      private final cjz a;

      public b(cjz $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bzz.a.c, bzz.a.a));
         $$0.K().a(true);
      }

      @Override
      public boolean a() {
         return (this.a.bf() || this.a.bt()) && this.a.H() instanceof cjz.d;
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void e() {
         if (this.a.dT().i() < 0.8F) {
            this.a.I().a();
         }

         if (this.a.H() instanceof cjz.d $$0) {
            $$0.a(1.2);
         }
      }
   }

   static class c extends bzz {
      private final cjz a;

      public c(cjz $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bzz.a.c, bzz.a.a));
      }

      @Override
      public boolean a() {
         return !this.a.bS();
      }

      @Override
      public void e() {
         if (this.a.H() instanceof cjz.d $$0) {
            $$0.a(1.0);
         }
      }
   }

   static class d extends bzc {
      private float l;
      private int m;
      private final cjz n;
      private boolean o;

      public d(cjz $$0) {
         super($$0);
         this.n = $$0;
         this.l = 180.0F * $$0.dG() / (float) Math.PI;
      }

      public void a(float $$0, boolean $$1) {
         this.l = $$0;
         this.o = $$1;
      }

      public void a(double $$0) {
         this.h = $$0;
         this.k = bzc.a.b;
      }

      @Override
      public void a() {
         this.d.s(this.a(this.d.dG(), this.l, 90.0F));
         this.d.ba = this.d.dG();
         this.d.aY = this.d.dG();
         if (this.k != bzc.a.b) {
            this.d.D(0.0F);
         } else {
            this.k = bzc.a.a;
            if (this.d.aF()) {
               this.d.z((float)(this.h * this.d.g(buj.v)));
               if (this.m-- <= 0) {
                  this.m = this.n.y();
                  if (this.o) {
                     this.m /= 3;
                  }

                  this.n.I().a();
                  if (this.n.gr()) {
                     this.n.a(this.n.go(), this.n.fb(), this.n.s());
                  }
               } else {
                  this.n.bo = 0.0F;
                  this.n.bq = 0.0F;
                  this.d.z(0.0F);
               }
            } else {
               this.d.z((float)(this.h * this.d.g(buj.v)));
            }
         }
      }
   }

   static class e extends bzz {
      private final cjz a;
      private float b;
      private int c;

      public e(cjz $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bzz.a.b));
      }

      @Override
      public boolean a() {
         return this.a.p() == null && (this.a.aF() || this.a.bf() || this.a.bt() || this.a.b(brq.y)) && this.a.H() instanceof cjz.d;
      }

      @Override
      public void e() {
         if (--this.c <= 0) {
            this.c = this.a(40 + this.a.dT().a(60));
            this.b = (float)this.a.dT().a(360);
         }

         if (this.a.H() instanceof cjz.d $$0) {
            $$0.a(this.b, false);
         }
      }
   }
}
