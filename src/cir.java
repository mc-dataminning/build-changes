import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cir extends chx implements bxg<cir.g> {
   public static final double bZ = 0.6;
   public static final double ca = 0.8;
   public static final double cb = 1.0;
   public static final double cd = 2.2;
   public static final double ce = 1.4;
   private static final alc<Integer> cf = alg.a(cir.class, ale.b);
   private static final alz cg = alz.b("killer_bunny");
   private static final int ch = 3;
   private static final int ci = 5;
   private static final alz cj = alz.b("evil");
   private static final int ck = 8;
   private static final int cl = 40;
   private int cm;
   private int cn;
   private boolean co;
   private int cp;
   int cq;

   public cir(bvr<? extends cir> $$0, dhi $$1) {
      super($$0, $$1);
      this.bR = new cir.c(this);
      this.bQ = new cir.d(this);
      this.i(0.0);
   }

   @Override
   protected void B() {
      this.bT.a(1, new ccy(this));
      this.bT.a(1, new cct(this, this.dW()));
      this.bT.a(1, new cir.e(this, 2.2));
      this.bT.a(2, new ccq(this, 0.8));
      this.bT.a(3, new cem(this, 1.0, $$0 -> $$0.a(ayd.ay), false));
      this.bT.a(4, new cir.a<>(this, cpx.class, 8.0F, 2.2, 2.2));
      this.bT.a(4, new cir.a<>(this, cja.class, 10.0F, 2.2, 2.2));
      this.bT.a(4, new cir.a<>(this, cmx.class, 4.0F, 2.2, 2.2));
      this.bT.a(5, new cir.f(this));
      this.bT.a(6, new cer(this, 0.6));
      this.bT.a(11, new cdm(this, cpx.class, 10.0F));
   }

   @Override
   protected float fj() {
      float $$0 = 0.3F;
      if (this.P || this.bQ.b() && this.bQ.e() > this.dD() + 0.5) {
         $$0 = 0.5F;
      }

      eul $$1 = this.bS.k();
      if ($$1 != null && !$$1.c()) {
         fby $$2 = $$1.a(this);
         if ($$2.e > this.dD() + 0.5) {
            $$0 = 0.5F;
         }
      }

      if (this.bQ.c() <= 0.6) {
         $$0 = 0.2F;
      }

      return super.A($$0 / 0.42F);
   }

   @Override
   public void s() {
      super.s();
      double $$0 = this.bQ.c();
      if ($$0 > 0.0) {
         double $$1 = this.dz().j();
         if ($$1 < 0.01) {
            this.a(0.1F, new fby(0.0, 0.0, 1.0));
         }
      }

      if (!this.dW().C) {
         this.dW().a(this, (byte)1);
      }
   }

   public float J(float $$0) {
      return this.cn == 0 ? 0.0F : ((float)this.cm + $$0) / (float)this.cn;
   }

   public void i(double $$0) {
      this.L().a($$0);
      this.bQ.a(this.bQ.d(), this.bQ.e(), this.bQ.f(), $$0);
   }

   @Override
   public void t(boolean $$0) {
      super.t($$0);
      if ($$0) {
         this.a(this.x(), this.fg(), ((this.ae.i() - this.ae.i()) * 0.2F + 1.0F) * 0.8F);
      }
   }

   public void p() {
      this.t(true);
      this.cn = 10;
      this.cm = 0;
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(cf, cir.g.a.j);
   }

   @Override
   public void a(ash $$0) {
      if (this.cp > 0) {
         this.cp--;
      }

      if (this.cq > 0) {
         this.cq = this.cq - this.ae.a(3);
         if (this.cq < 0) {
            this.cq = 0;
         }
      }

      if (this.aJ()) {
         if (!this.co) {
            this.t(false);
            this.gs();
         }

         if (this.go() == cir.g.g && this.cp == 0) {
            bwg $$1 = this.O_();
            if ($$1 != null && this.g((bvk)$$1) < 16.0) {
               this.c($$1.dB(), $$1.dH());
               this.bQ.a($$1.dB(), $$1.dD(), $$1.dH(), this.bQ.c());
               this.p();
               this.co = true;
            }
         }

         cir.c $$2 = (cir.c)this.bR;
         if (!$$2.c()) {
            if (this.bQ.b() && this.cp == 0) {
               eul $$3 = this.bS.k();
               fby $$4 = new fby(this.bQ.d(), this.bQ.e(), this.bQ.f());
               if ($$3 != null && !$$3.c()) {
                  $$4 = $$3.a(this);
               }

               this.c($$4.d, $$4.f);
               this.p();
            }
         } else if (!$$2.d()) {
            this.gp();
         }
      }

      this.co = this.aJ();
   }

   @Override
   public boolean bv() {
      return false;
   }

   private void c(double $$0, double $$1) {
      this.v((float)(bae.d($$1 - this.dH(), $$0 - this.dB()) * 180.0F / (float)Math.PI) - 90.0F);
   }

   private void gp() {
      ((cir.c)this.bR).a(true);
   }

   private void gq() {
      ((cir.c)this.bR).a(false);
   }

   private void gr() {
      if (this.bQ.c() < 2.2) {
         this.cp = 10;
      } else {
         this.cp = 1;
      }
   }

   private void gs() {
      this.gr();
      this.gq();
   }

   @Override
   public void d_() {
      super.d_();
      if (this.cm != this.cn) {
         this.cm++;
      } else if (this.cn != 0) {
         this.cm = 0;
         this.cn = 0;
         this.t(false);
      }
   }

   public static bxn.a t() {
      return chx.gt().a(bxo.s, 3.0).a(bxo.v, 0.3F).a(bxo.c, 3.0);
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      $$0.a("RabbitType", this.go().j);
      $$0.a("MoreCarrotTicks", this.cq);
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      this.a(cir.g.a($$0.h("RabbitType")));
      this.cq = $$0.h("MoreCarrotTicks");
   }

   protected axe x() {
      return axf.vv;
   }

   @Override
   protected axe u() {
      return axf.vr;
   }

   @Override
   protected axe e(bua $$0) {
      return axf.vu;
   }

   @Override
   protected axe o_() {
      return axf.vt;
   }

   @Override
   public void gf() {
      if (this.go() == cir.g.g) {
         this.a(axf.vs, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
      }
   }

   @Override
   public axg dn() {
      return this.go() == cir.g.g ? axg.f : axg.g;
   }

   @Nullable
   public cir b(ash $$0, bvb $$1) {
      cir $$2 = bvr.aY.a($$0, bvq.e);
      if ($$2 != null) {
         cir.g $$3;
         $$3 = a($$0, this.dw());
         label16:
         if (this.ae.a(20) != 0) {
            if ($$1 instanceof cir $$4 && this.ae.h()) {
               $$3 = $$4.go();
               break label16;
            }

            $$3 = this.go();
         }

         $$2.a($$3);
      }

      return $$2;
   }

   @Override
   public boolean j(cxp $$0) {
      return $$0.a(ayd.ay);
   }

   public cir.g go() {
      return cir.g.a(this.al.a(cf));
   }

   public void a(cir.g $$0) {
      if ($$0 == cir.g.g) {
         this.g(bxo.a).a(8.0);
         this.bT.a(4, new cdo(this, 1.4, true));
         this.bU.a(1, new cew(this).a());
         this.bU.a(2, new cex<>(this, cpx.class, true));
         this.bU.a(2, new cex<>(this, cja.class, true));
         this.g(bxo.c).a(new bxm(cj, 5.0, bxm.a.a));
         if (!this.l_()) {
            this.b(xv.c(ae.a("entity", cg)));
         }
      } else {
         this.g(bxo.c).c(cj);
      }

      this.al.a(cf, $$0.j);
   }

   @Nullable
   @Override
   public bwz a(dhz $$0, bth $$1, bvq $$2, @Nullable bwz $$3) {
      cir.g $$4 = a($$0, this.dw());
      if ($$3 instanceof cir.b) {
         $$4 = ((cir.b)$$3).a;
      } else {
         $$3 = new cir.b($$4);
      }

      this.a($$4);
      return super.a($$0, $$1, $$2, $$3);
   }

   private static cir.g a(dhj $$0, jh $$1) {
      jq<dik> $$2 = $$0.t($$1);
      int $$3 = $$0.H_().a(100);
      if ($$2.a(axt.al)) {
         return $$3 < 80 ? cir.g.b : cir.g.d;
      } else if ($$2.a(axt.ak)) {
         return cir.g.e;
      } else {
         return $$3 < 50 ? cir.g.a : ($$3 < 90 ? cir.g.f : cir.g.c);
      }
   }

   public static boolean c(bvr<cir> $$0, dhj $$1, bvq $$2, jh $$3, bam $$4) {
      return $$1.a_($$3.e()).a(axu.cf) && a((dgk)$$1, $$3);
   }

   boolean gA() {
      return this.cq <= 0;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 1) {
         this.bw();
         this.cn = 10;
         this.cm = 0;
      } else {
         super.b($$0);
      }
   }

   @Override
   public fby cT() {
      return new fby(0.0, (double)(0.6F * this.cS()), (double)(this.dr() * 0.4F));
   }

   static class a<T extends bwg> extends ccl<T> {
      private final cir i;

      public a(cir $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return this.i.go() != cir.g.g && super.b();
      }
   }

   public static class b extends bvb.a {
      public final cir.g a;

      public b(cir.g $$0) {
         super(1.0F);
         this.a = $$0;
      }
   }

   public static class c extends ccf {
      private final cir b;
      private boolean c;

      public c(cir $$0) {
         super($$0);
         this.b = $$0;
      }

      public boolean c() {
         return this.a;
      }

      public boolean d() {
         return this.c;
      }

      public void a(boolean $$0) {
         this.c = $$0;
      }

      @Override
      public void b() {
         if (this.a) {
            this.b.p();
            this.a = false;
         }
      }
   }

   static class d extends cch {
      private final cir l;
      private double m;

      public d(cir $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.aJ() && !this.l.bn && !((cir.c)this.l.bR).c()) {
            this.l.i(0.0);
         } else if (this.b()) {
            this.l.i(this.m);
         }

         super.a();
      }

      @Override
      public void a(double $$0, double $$1, double $$2, double $$3) {
         if (this.l.bj()) {
            $$3 = 1.5;
         }

         super.a($$0, $$1, $$2, $$3);
         if ($$3 > 0.0) {
            this.m = $$3;
         }
      }
   }

   static class e extends cdx {
      private final cir a;

      public e(cir $$0, double $$1) {
         super($$0, $$1);
         this.a = $$0;
      }

      @Override
      public void a() {
         super.a();
         this.a.i(this.d);
      }
   }

   static class f extends cdr {
      private final cir g;
      private boolean h;
      private boolean i;

      public f(cir $$0) {
         super($$0, 0.7F, 16);
         this.g = $$0;
      }

      @Override
      public boolean b() {
         if (this.c <= 0) {
            if (!a(this.g).N().b(dhe.c)) {
               return false;
            }

            this.i = false;
            this.h = this.g.gA();
         }

         return super.b();
      }

      @Override
      public boolean c() {
         return this.i && super.c();
      }

      @Override
      public void a() {
         super.a();
         this.g.H().a((double)this.e.u() + 0.5, (double)(this.e.v() + 1), (double)this.e.w() + 0.5, 10.0F, (float)this.g.Z());
         if (this.m()) {
            dhi $$0 = this.g.dW();
            jh $$1 = this.e.d();
            dxv $$2 = $$0.a_($$1);
            dkm $$3 = $$2.b();
            if (this.i && $$3 instanceof dlf) {
               int $$4 = $$2.c(dlf.f);
               if ($$4 == 0) {
                  $$0.a($$1, dko.a.m(), 2);
                  $$0.a($$1, true, this.g);
               } else {
                  $$0.a($$1, $$2.b(dlf.f, Integer.valueOf($$4 - 1)), 2);
                  $$0.a(ecr.c, $$1, ecr.a.a(this.g));
                  $$0.c(2001, $$1, dkm.j($$2));
               }

               this.g.cq = 40;
            }

            this.i = false;
            this.c = 10;
         }
      }

      @Override
      protected boolean a(dhl $$0, jh $$1) {
         dxv $$2 = $$0.a_($$1);
         if ($$2.a(dko.cK) && this.h && !this.i) {
            $$2 = $$0.a_($$1.d());
            if ($$2.b() instanceof dlf && ((dlf)$$2.b()).i($$2)) {
               this.i = true;
               return true;
            }
         }

         return false;
      }
   }

   public static enum g implements bba {
      a(0, "brown"),
      b(1, "white"),
      c(2, "black"),
      d(3, "white_splotched"),
      e(4, "gold"),
      f(5, "salt"),
      g(99, "evil");

      private static final IntFunction<cir.g> i = ayv.a(cir.g::a, values(), a);
      public static final Codec<cir.g> h = bba.a(cir.g::values);
      final int j;
      private final String k;

      private g(final int $$0, final String $$1) {
         this.j = $$0;
         this.k = $$1;
      }

      @Override
      public String c() {
         return this.k;
      }

      public int a() {
         return this.j;
      }

      public static cir.g a(int $$0) {
         return i.apply($$0);
      }
   }
}
