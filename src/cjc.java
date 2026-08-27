import com.google.common.annotations.VisibleForTesting;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class cjc extends bsw implements bta, ciu {
   private static final ajy<Integer> e = akc.a(cjc.class, aka.b);
   private static final ajy<Byte> ch = akc.a(cjc.class, aka.a);
   private static final ajy<Boolean> ci = akc.a(cjc.class, aka.k);
   private static final int cj = 1024;
   public float b;
   public float c;
   public float d;
   private boolean ck;
   private cjc.e cl;
   private final List<bsq> cm = new ArrayList<>();
   private final aqq cn;
   private final List<Runnable> co = new ArrayList<>();
   private static final kz cp = new kx(lb.Q, new cuh(cuk.vT));

   public cjc(bsb<? extends cjc> $$0, dca $$1) {
      super($$0, $$1);
      this.bY = new cjc.c(this);
      this.cl = cjc.e.a;
      this.bW = 50;
      this.cn = new aqq(this, bpq.a.d, bpq.b.a);
      this.cn.a(false);
      this.cL();
   }

   @Override
   public void dG() {
   }

   public static btu.a r() {
      return cjd.gG().a(btv.q, 1024.0).a(btv.k, 48.0).a(btv.m, 0.62F).a(btv.a, 5.0).a(btv.r, 0.2F);
   }

   @Override
   protected void y() {
      this.cb.a(7, new cjc.a(this));
      this.cb.a(8, new bzt(this, cly.class, 8.0F));
      this.cb.a(7, new cay(this, 1.0));
      this.cb.a(0, new bzf(this) {
         @Override
         public void e() {
            if (cjc.this.et().i() < 0.8F) {
               cjc.this.fs();
            }
         }
      });
      this.cb.a(7, new cag(this));
      this.cb.a(3, new cjc.d(this));
      this.cb.a(5, new cjc.b(this));
      this.cc.a(1, new cbe<>(this, cly.class, true).c(300));
      this.cc.a(3, new cbe<>(this, clg.class, false).c(300));
      this.cc.a(3, new cbe<>(this, ceq.class, false));
   }

   @Override
   protected void Y() {
      super.Y();
      boolean $$0 = false;
      if (!this.cm.isEmpty()) {
         $$0 = true;
         this.cm.removeIf($$0x -> $$0x.dP() || $$0x.eJ());
      }

      if (!this.co.isEmpty()) {
         $$0 = true;
         if (this.al.i() < 0.05F) {
            this.co.remove(0).run();
            if (this.co.isEmpty()) {
               this.a(avo.pc, this.fn(), 1.0F);
            }
         }
      }

      if (this.cm.isEmpty() && this.co.isEmpty()) {
         this.w(false);
         if ($$0) {
            this.a(avo.pb, this.fn(), 1.0F);
         }
      }

      if ((!this.gj() || this.gg().b(this.ds()) > 16384.0) && !this.du().equals(ir.c)) {
         this.a(this.du(), 3);
      }

      cjc.e $$1 = this.cl.a(this.eI());
      if (this.cl != $$1) {
         this.t(this.cl.d());
         ewp $$2 = this.cP();
         ewu $$3 = this.ds();
         bpw.a(this.dU(), $$3.c, $$3.d, $$3.e, cuk.AF.v());

         for (int $$4 = 0; $$4 < 100; $$4++) {
            ewu $$5 = $$3.b((double)this.al.a(-5.0F, 5.0F), (double)this.al.a(0.0F, 10.0F), (double)this.al.a(-5.0F, 5.0F));
            if ($$2.d($$5)) {
               bpw.a(this.dU(), $$5.c, $$5.d, $$5.e, cuk.AF.v());
            }
         }

         aqt $$6 = (aqt)this.dU();
         ext $$7 = this.co();
         this.a(this.cl, $$6, $$7);
         cjc.e $$8 = this.cl;

         for (int $$9 = 1; $$9 <= this.cl.ordinal(); $$9++) {
            this.co.add(() -> this.a($$8, $$6, $$7));
         }

         this.cl = $$1;
         this.b(this.cl.l);
         this.w(true);
         this.cn.a(this.P_());
      }

      this.cn.a(this.eI() / this.eZ());
      this.cn.a(this.ds(), 64);
   }

   private void a(cjc.e $$0, aqt $$1, ext $$2) {
      ir $$3 = this.gg().b(this.al.a(5) - this.al.a(5), this.al.a(5), this.al.a(5) - this.al.a(5));
      bsq $$4 = $$0.c().a(this.dU());
      if ($$4 != null) {
         $$4.a($$3, 0.0F, 0.0F);
         $$4.a($$1, this.dU().d_($$3), bss.f, null);
         if ($$2 != null) {
            $$1.f().a($$4.cG(), $$2);
         }

         $$1.a_($$4);
         $$1.a(dxv.t, $$3, dxv.a.a(this));
         $$4.gc();
         $$4.a(this.gg(), 8);
         this.a(avo.oX, this.fn(), 1.0F);
         $$1.c(3012, $$3, 0);
         $$1.a(lb.aZ, $$4.dz(), $$4.e(0.5), $$4.dF(), 100, 0.5, 0.5, 0.5, 0.0);
         this.cm.add($$4);
      }
   }

   @Override
   public boolean a(bqt $$0, float $$1) {
      if ($$0.a(awg.e)) {
         return super.a($$0, $$1);
      } else {
         $$1 = Math.min($$1, 100.0F);
         if (!this.a()) {
            return super.a($$0, $$1);
         } else {
            if ($$0.d() instanceof cly) {
               for (bsq $$2 : this.cm) {
                  $$2.b(new brh(brj.x, 200), this);
               }
            }

            if ($$0.d() != null && !$$0.a(bqw.O)) {
               $$0.d().a(this.dU().aj().q(), $$1);
            }

            return false;
         }
      }
   }

   @Override
   public void c(aqu $$0) {
      super.c($$0);
      this.cn.a($$0);
   }

   @Override
   public void d(aqu $$0) {
      super.d($$0);
      this.cn.b($$0);
   }

   @Override
   public boolean dV() {
      return true;
   }

   @Override
   public avq dj() {
      return avq.f;
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(e, cjc.e.a.l);
      $$0.a(ch, (byte)0);
      $$0.a(ci, false);
   }

   public void w(boolean $$0) {
      this.as.a(ci, $$0);
   }

   @Override
   public boolean cz() {
      return super.cz() || this.a();
   }

   @VisibleForTesting
   public void b(int $$0) {
      this.as.a(e, $$0);
      this.at();
      this.i_();
   }

   public int t() {
      return this.as.a(e);
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("Size", this.t() - 1);
      $$0.a("wasOnGround", this.ck);
      $$0.a("homeX", this.gg().u());
      $$0.a("homeY", this.gg().v());
      $$0.a("homeZ", this.gg().w());
      if (this.ag()) {
         this.cn.a(this.P_());
      }
   }

   @Override
   protected xe cw() {
      return this.cl.e();
   }

   @Override
   public void a(uk $$0) {
      this.b($$0.h("Size") + 1);
      super.a($$0);
      this.ck = $$0.q("wasOnGround");
      this.a(new ir($$0.h("homeX"), $$0.h("homeY"), $$0.h("homeZ")), 3);

      while (this.cl != this.cl.a(this.eI())) {
         this.cl = this.cl.a();
      }

      this.cn.a(this.P_());
   }

   public boolean x() {
      return this.t() <= 1;
   }

   protected kz gy() {
      return cp;
   }

   @Override
   protected boolean W() {
      return this.t() > 0;
   }

   @Override
   public void l() {
      this.c = this.c + (this.b - this.c) * 0.5F;
      this.d = this.c;
      super.l();
      if (this.aE() && !this.ck) {
         float $$0 = this.a(this.ar()).a() * 2.0F;
         float $$1 = $$0 / 2.0F;

         for (int $$2 = 0; (float)$$2 < $$0 * 16.0F; $$2++) {
            float $$3 = this.al.i() * (float) (Math.PI * 2);
            float $$4 = this.al.i() * 0.5F + 0.5F;
            float $$5 = aym.a($$3) * $$1 * $$4;
            float $$6 = aym.b($$3) * $$1 * $$4;
            this.dU().a(this.gy(), this.dz() + (double)$$5, this.dB(), this.dF() + (double)$$6, 0.0, 0.0, 0.0);
         }

         this.a(this.gD(), this.fn(), ((this.al.i() - this.al.i()) * 0.2F + 1.0F) / 0.8F);
         this.b = -0.5F;
      } else if (!this.aE() && this.ck) {
         this.b = 1.0F;
      }

      this.ck = this.aE();
      this.gz();
   }

   protected void gz() {
      this.b *= 0.6F;
   }

   protected int gA() {
      return this.al.a(20) + 10;
   }

   @Override
   public void i_() {
      double $$0 = this.dz();
      double $$1 = this.dB();
      double $$2 = this.dF();
      super.i_();
      this.a_($$0, $$1, $$2);
   }

   @Override
   public void a(ajy<?> $$0) {
      if (e.equals($$0)) {
         this.i_();
         this.r(this.bl);
         this.bj = this.bl;
         if (this.bi() && this.al.a(20) == 0) {
            this.br();
         }
      }

      super.a($$0);
   }

   @Override
   public bsb<? extends cjc> ak() {
      return (bsb<? extends cjc>)super.ak();
   }

   @Override
   public void a(brv.d $$0) {
      for (bsq $$1 : this.cm) {
         $$1.a($$0);
      }

      super.a($$0);
   }

   @Override
   public void h(brv $$0) {
      super.h($$0);
      if ($$0 instanceof ceq && this.gB()) {
         this.j((bso)$$0);
      }
   }

   @Override
   public void b_(cly $$0) {
      if (this.gB()) {
         this.j($$0);
      }
   }

   protected void j(bso $$0) {
      if (this.bI()) {
         int $$1 = this.t();
         if (this.g((brv)$$0) < 0.6 * (double)$$1 * 0.6 * (double)$$1 && this.E($$0) && $$0.a(this.dX().b((bso)this), this.gC())) {
            this.a(this, $$0);
         }
      }
   }

   @Override
   protected ewu a(brv $$0, bry $$1, float $$2) {
      return new ewu(0.0, (double)$$1.b() - 0.015625 * (double)this.t() * (double)$$2, 0.0);
   }

   protected boolean gB() {
      return !this.x() && this.dg();
   }

   protected float gC() {
      return (float)this.g(btv.c);
   }

   @Override
   protected avn d(bqt $$0) {
      return avo.oV;
   }

   @Override
   protected avn n_() {
      return avo.oU;
   }

   protected avn gD() {
      return avo.pa;
   }

   @Override
   protected avn u() {
      return avo.oW;
   }

   @Override
   protected float fn() {
      return 0.4F + 0.4F * (float)this.t();
   }

   @Override
   public int Z() {
      return 0;
   }

   protected boolean gE() {
      return this.t() > 0;
   }

   @Override
   protected void fs() {
      ewu $$0 = this.dx();
      ewu $$1 = this.bQ();
      float $$2 = this.fq();
      float $$3 = this.gf() ? 0.0F : $$2;
      this.o($$0.c + $$1.c * (double)$$3, (double)$$2, $$0.e + $$1.e * (double)$$3);
      this.az = true;
   }

   @Nullable
   @Override
   public btg a(dcp $$0, bpy $$1, bss $$2, @Nullable btg $$3) {
      this.b(cjc.e.a.l);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a() {
      return this.as.a(ci);
   }

   float gG() {
      float $$0 = this.x() ? 1.4F : 0.8F;
      return ((this.al.i() - this.al.i()) * 0.2F + 1.0F) * $$0;
   }

   protected avn gF() {
      return this.x() ? avo.pa : avo.oZ;
   }

   @Override
   public bry e(bsz $$0) {
      return super.e($$0).a((float)this.t());
   }

   static class a extends bzl {
      private final cjc b;
      public int a;

      public a(cjc $$0) {
         this.b = $$0;
      }

      @Override
      public boolean a() {
         return this.b.p() != null;
      }

      @Override
      public void c() {
         this.a = 0;
      }

      @Override
      public boolean S_() {
         return true;
      }

      @Override
      public void e() {
         bso $$0 = this.b.p();
         if ($$0 != null) {
            double $$1 = 64.0;
            if ($$0.g(this.b) < 4096.0 && this.b.E($$0)) {
               dca $$2 = this.b.dU();
               this.a++;
               if (this.a == 10 && !this.b.ba()) {
                  this.b.a(avo.oY);
               }

               if (this.a == 20) {
                  ewp $$3 = this.b.cP().g(0.5);
                  ewu $$4 = this.b.bC();
                  ewu $$5 = $$0.bC().d($$4).d().a(0.1);
                  ewu $$6 = $$4;

                  while ($$3.d($$6)) {
                     $$6 = $$6.e($$5);
                  }

                  cmp $$7 = new cmp($$2, this.b, $$5.c, $$5.d, $$5.e, 2, false);
                  $$7.b($$6);
                  $$2.b($$7);
                  this.a = -40;
               }
            } else if (this.a > 0) {
               this.a--;
            }
         }
      }
   }

   public static class b extends bzl {
      private final bsq a;

      public b(bsq $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bzl.a.c, bzl.a.a));
      }

      @Override
      public boolean a() {
         return !this.a.bW();
      }

      @Override
      public void e() {
         if (this.a.G() instanceof cjc.c $$0) {
            $$0.a(1.0);
         }
      }
   }

   static class c extends byo {
      private float l;
      private int m;
      private final cjc n;
      private boolean o;

      public c(cjc $$0) {
         super($$0);
         this.n = $$0;
         this.l = 180.0F * $$0.dK() / (float) Math.PI;
      }

      public void a(float $$0, boolean $$1) {
         this.l = $$0;
         this.o = $$1;
      }

      public void a(double $$0) {
         this.h = $$0;
         this.k = byo.a.b;
      }

      @Override
      public void a() {
         this.d.r(this.a(this.d.dK(), this.l, 90.0F));
         this.d.bl = this.d.dK();
         this.d.bj = this.d.dK();
         if (this.k != byo.a.b) {
            this.d.C(0.0F);
         } else {
            this.k = byo.a.a;
            if (this.d.aE()) {
               this.d.y((float)(this.h * this.d.g(btv.r)));
               if (this.m-- <= 0) {
                  this.m = this.n.gA();
                  if (this.o) {
                     this.m /= 3;
                  }

                  this.n.I().a();
                  if (this.n.gE()) {
                     this.n.a(this.n.gF(), this.n.fn(), this.n.gG());
                  }
               } else {
                  this.n.bz = 0.0F;
                  this.n.bB = 0.0F;
                  this.d.y(0.0F);
               }
            } else {
               this.d.y((float)(this.h * this.d.g(btv.r)));
            }
         }
      }
   }

   static class d extends bzl {
      private final cjc a;
      private float b;
      private int c;

      public d(cjc $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bzl.a.b));
      }

      @Override
      public boolean a() {
         return (this.a.aE() || this.a.bi() || this.a.bx() || this.a.b(brj.y)) && this.a.G() instanceof cjc.c;
      }

      @Override
      public void e() {
         if (--this.c <= 0) {
            this.c = this.a(40 + this.a.et().a(60));
            if (this.a.p() != null && this.a.al.i() < 0.4F) {
               this.b = this.a(this.a.p().ds()) + 90.0F;
            } else if (this.a.gj() && !this.a.gf()) {
               ewu $$0 = ewu.c(this.a.gg());
               this.b = this.a($$0) + 60.0F;
            } else {
               this.b = (float)this.a.et().a(360);
            }
         }

         if (this.a.G() instanceof cjc.c $$1) {
            $$1.a(this.b + 20.0F - (float)this.a.al.a(40), false);
         }
      }

      private float a(ewu $$0) {
         return (float)aym.d(this.a.dF() - $$0.e, this.a.dz() - $$0.c) * (180.0F / (float)Math.PI);
      }
   }

   static enum e {
      a(10, 1.0F, bsb.v),
      b(9, 0.9F, bsb.c),
      c(8, 0.8F, bsb.bz),
      d(7, 0.7F, bsb.aZ),
      e(6, 0.6F, bsb.bb),
      f(5, 0.5F, bsb.z),
      g(4, 0.4F, bsb.aC),
      h(3, 0.3F, bsb.V),
      i(2, 0.2F, bsb.aE),
      j(1, 0.1F, bsb.W),
      k(1, -1.0F, bsb.T);

      final int l;
      private final float m;
      private final bsb<? extends bsq> n;
      private xe o = bsb.aS.h();

      private e(int $$0, float $$1, bsb<? extends bsq> $$2) {
         this.l = $$0;
         this.m = $$1;
         this.n = $$2;
      }

      public cjc.e a() {
         int $$0 = this.ordinal() + 1;
         return $$0 >= values().length ? this : values()[$$0];
      }

      @Nullable
      public cjc.e b() {
         int $$0 = this.ordinal() - 1;
         return $$0 < 0 ? null : values()[$$0];
      }

      public bsb<? extends bsq> c() {
         return this.n;
      }

      public float d() {
         return this.m * 1024.0F;
      }

      public cjc.e a(float $$0) {
         return $$0 < this.d() ? this.a() : this;
      }

      public xe e() {
         return this.o;
      }

      static {
         for (cjc.e $$0 : values()) {
            cjc.e $$1 = $$0.b();
            if ($$1 == null) {
               $$0.o = bsb.aS.h();
            } else {
               $$0.o = xe.c("entity.minecraft.mega_spud." + lh.g.b($$1.c()).a());
            }
         }
      }
   }
}
