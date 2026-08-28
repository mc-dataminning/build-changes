import java.util.EnumSet;
import java.util.Optional;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cmd extends cgu implements bwg<Optional<cvl>>, clp {
   private static final akv d = akv.b("covered");
   private static final bwm bY = new bwm(d, 20.0, bwm.a.a);
   protected static final ajy<jn> a = akc.a(cmd.class, aka.q);
   protected static final ajy<Byte> b = akc.a(cmd.class, aka.a);
   protected static final ajy<Byte> c = akc.a(cmd.class, aka.a);
   private static final int bZ = 6;
   private static final byte ca = 16;
   private static final byte cb = 16;
   private static final int cc = 8;
   private static final int cd = 8;
   private static final int ce = 5;
   private static final float cf = 0.05F;
   static final Vector3f cg = af.a(() -> {
      km $$0 = jn.d.q();
      return new Vector3f((float)$$0.u(), (float)$$0.v(), (float)$$0.w());
   });
   private static final float ch = 3.0F;
   private float ci;
   private float cj;
   @Nullable
   private ji ck;
   private int cl;
   private static final float cm = 1.0F;

   public cmd(bur<? extends cmd> $$0, dgh $$1) {
      super($$0, $$1);
      this.bN = 5;
      this.bO = new cmd.d(this);
   }

   @Override
   protected void E() {
      this.bS.a(1, new ccm(this, cow.class, 8.0F, 0.02F, true));
      this.bS.a(4, new cmd.a());
      this.bS.a(7, new cmd.f());
      this.bS.a(8, new ccz(this));
      this.bT.a(1, new cdw(this, this.getClass()).a());
      this.bT.a(2, new cmd.e(this));
      this.bT.a(3, new cmd.c(this));
   }

   @Override
   protected buk.c bg() {
      return buk.c.a;
   }

   @Override
   public awb dm() {
      return awb.f;
   }

   @Override
   protected avz u() {
      return awa.xl;
   }

   @Override
   public void U() {
      if (!this.gw()) {
         super.U();
      }
   }

   @Override
   protected avz o_() {
      return awa.xr;
   }

   @Override
   protected avz e(bta $$0) {
      return this.gw() ? awa.xt : awa.xs;
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(a, jn.a);
      $$0.a(b, (byte)0);
      $$0.a(c, (byte)16);
   }

   public static bwn.a m() {
      return bvi.F().a(bwo.s, 30.0);
   }

   @Override
   protected cbc J() {
      return new cmd.b(this);
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.a(jn.a($$0.f("AttachFace")));
      this.al.a(b, $$0.f("Peek"));
      if ($$0.b("Color", 99)) {
         this.al.a(c, $$0.f("Color"));
      }
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("AttachFace", (byte)this.t().d());
      $$0.a("Peek", this.al.a(b));
      $$0.a("Color", this.al.a(c));
   }

   @Override
   public void h() {
      super.h();
      if (!this.dV().C && !this.bZ() && !this.a(this.dv(), this.t())) {
         this.gt();
      }

      if (this.gu()) {
         this.gv();
      }

      if (this.dV().C) {
         if (this.cl > 0) {
            this.cl--;
         } else {
            this.ck = null;
         }
      }
   }

   private void gt() {
      jn $$0 = this.h(this.dv());
      if ($$0 != null) {
         this.a($$0);
      } else {
         this.p();
      }
   }

   @Override
   protected fau c(faz $$0) {
      float $$1 = L(this.cj);
      jn $$2 = this.t().g();
      return a(this.ej(), $$2, $$1, $$0);
   }

   private static float L(float $$0) {
      return 0.5F - ayz.a((0.5F + $$0) * (float) Math.PI) * 0.5F;
   }

   private boolean gu() {
      this.ci = this.cj;
      float $$0 = (float)this.gy() * 0.01F;
      if (this.cj == $$0) {
         return false;
      } else {
         if (this.cj > $$0) {
            this.cj = ayz.a(this.cj - 0.05F, $$0, 1.0F);
         } else {
            this.cj = ayz.a(this.cj + 0.05F, 0.0F, $$0);
         }

         return true;
      }
   }

   private void gv() {
      this.ay();
      float $$0 = L(this.cj);
      float $$1 = L(this.ci);
      jn $$2 = this.t().g();
      float $$3 = ($$0 - $$1) * this.ej();
      if (!($$3 <= 0.0F)) {
         for (buk $$5 : this.dV().a(this, a(this.ej(), $$2, $$1, $$0, this.dt()), bup.f.and($$0x -> !$$0x.z(this)))) {
            if (!($$5 instanceof cmd) && !$$5.ad) {
               $$5.a(bvk.e, new faz((double)($$3 * (float)$$2.j()), (double)($$3 * (float)$$2.k()), (double)($$3 * (float)$$2.l())));
            }
         }
      }
   }

   public static fau a(float $$0, jn $$1, float $$2, faz $$3) {
      return a($$0, $$1, -1.0F, $$2, $$3);
   }

   public static fau a(float $$0, jn $$1, float $$2, float $$3, faz $$4) {
      fau $$5 = new fau((double)(-$$0) * 0.5, 0.0, (double)(-$$0) * 0.5, (double)$$0 * 0.5, (double)$$0, (double)$$0 * 0.5);
      double $$6 = (double)Math.max($$2, $$3);
      double $$7 = (double)Math.min($$2, $$3);
      fau $$8 = $$5.b((double)$$1.j() * $$6 * (double)$$0, (double)$$1.k() * $$6 * (double)$$0, (double)$$1.l() * $$6 * (double)$$0)
         .a((double)(-$$1.j()) * (1.0 + $$7) * (double)$$0, (double)(-$$1.k()) * (1.0 + $$7) * (double)$$0, (double)(-$$1.l()) * (1.0 + $$7) * (double)$$0);
      return $$8.d($$4.d, $$4.e, $$4.f);
   }

   @Override
   public boolean a(buk $$0, boolean $$1) {
      if (this.dV().B_()) {
         this.ck = null;
         this.cl = 0;
      }

      this.a(jn.a);
      return super.a($$0, $$1);
   }

   @Override
   public void ae() {
      super.ae();
      if (this.dV().C) {
         this.ck = this.dv();
      }

      this.aY = 0.0F;
      this.aX = 0.0F;
   }

   @Nullable
   @Override
   public bvz a(dgy $$0, bsh $$1, buq $$2, @Nullable bvz $$3) {
      this.v(0.0F);
      this.aZ = this.dL();
      this.bz();
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(bvk $$0, faz $$1) {
      if ($$0 == bvk.d) {
         this.p();
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   public faz dy() {
      return faz.c;
   }

   @Override
   public void i(faz $$0) {
   }

   @Override
   public void a_(double $$0, double $$1, double $$2) {
      ji $$3 = this.dv();
      if (this.bZ()) {
         super.a_($$0, $$1, $$2);
      } else {
         super.a_((double)ayz.a($$0) + 0.5, (double)ayz.a($$1 + 0.5), (double)ayz.a($$2) + 0.5);
      }

      if (this.af != 0) {
         ji $$4 = this.dv();
         if (!$$4.equals($$3)) {
            this.al.a(b, (byte)0);
            this.ar = true;
            if (this.dV().C && !this.bZ() && !$$4.equals(this.ck)) {
               this.ck = $$3;
               this.cl = 6;
               this.aa = this.dA();
               this.ab = this.dC();
               this.ac = this.dG();
            }
         }
      }
   }

   @Nullable
   protected jn h(ji $$0) {
      for (jn $$1 : jn.values()) {
         if (this.a($$0, $$1)) {
            return $$1;
         }
      }

      return null;
   }

   boolean a(ji $$0, jn $$1) {
      if (this.i($$0)) {
         return false;
      } else {
         jn $$2 = $$1.g();
         if (!this.dV().a($$0.a($$1), this, $$2)) {
            return false;
         } else {
            fau $$3 = a(this.ej(), $$2, 1.0F, $$0.c()).h(1.0E-6);
            return this.dV().a(this, $$3);
         }
      }
   }

   private boolean i(ji $$0) {
      dww $$1 = this.dV().a_($$0);
      if ($$1.l()) {
         return false;
      } else {
         boolean $$2 = $$1.a(djn.bX) && $$0.equals(this.dv());
         return !$$2;
      }
   }

   protected boolean p() {
      if (!this.gf() && this.bL()) {
         ji $$0 = this.dv();

         for (int $$1 = 0; $$1 < 5; $$1++) {
            ji $$2 = $$0.b(ayz.b(this.ae, -8, 8), ayz.b(this.ae, -8, 8), ayz.b(this.ae, -8, 8));
            if ($$2.v() > this.dV().L_() && this.dV().u($$2) && this.dV().F_().a($$2) && this.dV().a(this, new fau($$2).h(1.0E-6))) {
               jn $$3 = this.h($$2);
               if ($$3 != null) {
                  this.ao();
                  this.a($$3);
                  this.a(awa.xw, 1.0F, 1.0F);
                  this.a_((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5);
                  this.dV().a(ebs.R, $$0, ebs.a.a(this));
                  this.al.a(b, (byte)0);
                  this.h(null);
                  return true;
               }
            }
         }

         return false;
      } else {
         return false;
      }
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      this.bq = 0;
      this.a_($$0, $$1, $$2);
      this.b($$3, $$4);
   }

   @Override
   public boolean a(ard $$0, bta $$1, float $$2) {
      if (this.gw()) {
         buk $$3 = $$1.c();
         if ($$3 instanceof cpd) {
            return false;
         }
      }

      if (!super.a($$0, $$1, $$2)) {
         return false;
      } else {
         if ((double)this.eD() < (double)this.eS() * 0.5 && this.ae.a(4) == 0) {
            this.p();
         } else if ($$1.a(awr.j)) {
            buk $$4 = $$1.c();
            if ($$4 != null && $$4.aq() == bur.bc) {
               this.gx();
            }
         }

         return true;
      }
   }

   private boolean gw() {
      return this.gy() == 0;
   }

   private void gx() {
      faz $$0 = this.dt();
      fau $$1 = this.cR();
      if (!this.gw() && this.p()) {
         int $$2 = this.dV().a(bur.bb, $$1.g(8.0), buk::bL).size();
         float $$3 = (float)($$2 - 1) / 5.0F;
         if (!(this.dV().A.i() < $$3)) {
            cmd $$4 = bur.bb.a(this.dV(), buq.e);
            if ($$4 != null) {
               $$4.a(this.x());
               $$4.f($$0);
               this.dV().b($$4);
            }
         }
      }
   }

   @Override
   public boolean bN() {
      return this.bL();
   }

   public jn t() {
      return this.al.a(a);
   }

   private void a(jn $$0) {
      this.al.a(a, $$0);
   }

   @Override
   public void a(ajy<?> $$0) {
      if (a.equals($$0)) {
         this.a(this.ax());
      }

      super.a($$0);
   }

   private int gy() {
      return this.al.a(b);
   }

   void b(int $$0) {
      if (!this.dV().C) {
         this.g(bwo.a).c(d);
         if ($$0 == 0) {
            this.g(bwo.a).d(bY);
            this.a(awa.xq, 1.0F, 1.0F);
            this.a(ebs.j);
         } else {
            this.a(awa.xu, 1.0F, 1.0F);
            this.a(ebs.k);
         }
      }

      this.al.a(b, (byte)$$0);
   }

   public float J(float $$0) {
      return ayz.h($$0, this.ci, this.cj);
   }

   @Override
   public void a(abm $$0) {
      super.a($$0);
      this.aX = 0.0F;
      this.aY = 0.0F;
   }

   @Override
   public int ad() {
      return 180;
   }

   @Override
   public int af() {
      return 180;
   }

   @Override
   public void h(buk $$0) {
   }

   @Nullable
   public faz K(float $$0) {
      if (this.ck != null && this.cl > 0) {
         double $$1 = (double)((float)this.cl - $$0) / 6.0;
         $$1 *= $$1;
         $$1 *= (double)this.ej();
         ji $$2 = this.dv();
         double $$3 = (double)($$2.u() - this.ck.u()) * $$1;
         double $$4 = (double)($$2.v() - this.ck.v()) * $$1;
         double $$5 = (double)($$2.w() - this.ck.w()) * $$1;
         return new faz(-$$3, -$$4, -$$5);
      } else {
         return null;
      }
   }

   @Override
   protected float b(float $$0) {
      return Math.min($$0, 3.0F);
   }

   public void a(Optional<cvl> $$0) {
      this.al.a(c, $$0.<Byte>map($$0x -> (byte)$$0x.a()).orElse((byte)16));
   }

   public Optional<cvl> x() {
      return Optional.ofNullable(this.gs());
   }

   @Nullable
   public cvl gs() {
      byte $$0 = this.al.a(c);
      return $$0 != 16 && $$0 <= 15 ? cvl.a($$0) : null;
   }

   class a extends cce {
      private int b;

      public a() {
         this.a(EnumSet.of(cce.a.a, cce.a.b));
      }

      @Override
      public boolean b() {
         bvg $$0 = cmd.this.O_();
         return $$0 != null && $$0.bL() ? cmd.this.dV().am() != bsg.a : false;
      }

      @Override
      public void d() {
         this.b = 20;
         cmd.this.b(100);
      }

      @Override
      public void e() {
         cmd.this.b(0);
      }

      @Override
      public boolean V_() {
         return true;
      }

      @Override
      public void a() {
         if (cmd.this.dV().am() != bsg.a) {
            this.b--;
            bvg $$0 = cmd.this.O_();
            if ($$0 != null) {
               cmd.this.L().a($$0, 180.0F, 180.0F);
               double $$1 = cmd.this.g((buk)$$0);
               if ($$1 < 400.0) {
                  if (this.b <= 0) {
                     this.b = 20 + cmd.this.ae.a(10) * 20 / 2;
                     cmd.this.dV().b(new cps(cmd.this.dV(), cmd.this, $$0, cmd.this.t().o()));
                     cmd.this.a(awa.xv, 2.0F, (cmd.this.ae.i() - cmd.this.ae.i()) * 0.2F + 1.0F);
                  }
               } else {
                  cmd.this.h(null);
               }

               super.a();
            }
         }
      }
   }

   static class b extends cbc {
      public b(bvi $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   static class c extends cdx<bvg> {
      public c(cmd $$0) {
         super($$0, bvg.class, 10, true, false, ($$0x, $$1) -> $$0x instanceof clp);
      }

      @Override
      public boolean b() {
         return this.e.cr() == null ? false : super.b();
      }

      @Override
      protected fau a(double $$0) {
         jn $$1 = ((cmd)this.e).t();
         if ($$1.o() == jn.a.a) {
            return this.e.cR().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == jn.a.c ? this.e.cR().c($$0, $$0, 4.0) : this.e.cR().c($$0, 4.0, $$0);
         }
      }
   }

   class d extends cbg {
      public d(final bvi $$0) {
         super($$0);
      }

      @Override
      protected void b() {
      }

      @Override
      protected Optional<Float> i() {
         jn $$0 = cmd.this.t().g();
         Vector3f $$1 = $$0.b().transform(new Vector3f(cmd.cg));
         km $$2 = $$0.q();
         Vector3f $$3 = new Vector3f((float)$$2.u(), (float)$$2.v(), (float)$$2.w());
         $$3.cross($$1);
         double $$4 = this.e - this.a.dA();
         double $$5 = this.f - this.a.dE();
         double $$6 = this.g - this.a.dG();
         Vector3f $$7 = new Vector3f((float)$$4, (float)$$5, (float)$$6);
         float $$8 = $$3.dot($$7);
         float $$9 = $$1.dot($$7);
         return !(Math.abs($$8) > 1.0E-5F) && !(Math.abs($$9) > 1.0E-5F)
            ? Optional.empty()
            : Optional.of((float)(ayz.d((double)(-$$8), (double)$$9) * 180.0F / (float)Math.PI));
      }

      @Override
      protected Optional<Float> h() {
         return Optional.of(0.0F);
      }
   }

   class e extends cdx<cow> {
      public e(final cmd $$0) {
         super($$0, cow.class, true);
      }

      @Override
      public boolean b() {
         return cmd.this.dV().am() == bsg.a ? false : super.b();
      }

      @Override
      protected fau a(double $$0) {
         jn $$1 = ((cmd)this.e).t();
         if ($$1.o() == jn.a.a) {
            return this.e.cR().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == jn.a.c ? this.e.cR().c($$0, $$0, 4.0) : this.e.cR().c($$0, 4.0, $$0);
         }
      }
   }

   class f extends cce {
      private int b;

      @Override
      public boolean b() {
         return cmd.this.O_() == null && cmd.this.ae.a(b(40)) == 0 && cmd.this.a(cmd.this.dv(), cmd.this.t());
      }

      @Override
      public boolean c() {
         return cmd.this.O_() == null && this.b > 0;
      }

      @Override
      public void d() {
         this.b = this.a(20 * (1 + cmd.this.ae.a(3)));
         cmd.this.b(30);
      }

      @Override
      public void e() {
         if (cmd.this.O_() == null) {
            cmd.this.b(0);
         }
      }

      @Override
      public void a() {
         this.b--;
      }
   }
}
