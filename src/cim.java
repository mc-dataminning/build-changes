import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cim extends chs implements bxb<cim.g> {
   public static final double bZ = 0.6;
   public static final double ca = 0.8;
   public static final double cb = 1.0;
   public static final double cd = 2.2;
   public static final double ce = 1.4;
   private static final alc<Integer> cf = alg.a(cim.class, ale.b);
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

   public cim(bvm<? extends cim> $$0, dha $$1) {
      super($$0, $$1);
      this.bR = new cim.c(this);
      this.bQ = new cim.d(this);
      this.i(0.0);
   }

   @Override
   protected void B() {
      this.bT.a(1, new cct(this));
      this.bT.a(1, new cco(this, this.dV()));
      this.bT.a(1, new cim.e(this, 2.2));
      this.bT.a(2, new ccl(this, 0.8));
      this.bT.a(3, new ceh(this, 1.0, $$0 -> $$0.a(ayd.ay), false));
      this.bT.a(4, new cim.a<>(this, cps.class, 8.0F, 2.2, 2.2));
      this.bT.a(4, new cim.a<>(this, civ.class, 10.0F, 2.2, 2.2));
      this.bT.a(4, new cim.a<>(this, cms.class, 4.0F, 2.2, 2.2));
      this.bT.a(5, new cim.f(this));
      this.bT.a(6, new cem(this, 0.6));
      this.bT.a(11, new cdh(this, cps.class, 10.0F));
   }

   @Override
   protected float fh() {
      float $$0 = 0.3F;
      if (this.P || this.bQ.b() && this.bQ.e() > this.dC() + 0.5) {
         $$0 = 0.5F;
      }

      eud $$1 = this.bS.k();
      if ($$1 != null && !$$1.c()) {
         fbs $$2 = $$1.a(this);
         if ($$2.e > this.dC() + 0.5) {
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
         double $$1 = this.dy().j();
         if ($$1 < 0.01) {
            this.a(0.1F, new fbs(0.0, 0.0, 1.0));
         }
      }

      if (!this.dV().C) {
         this.dV().a(this, (byte)1);
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
         this.a(this.x(), this.fe(), ((this.ae.i() - this.ae.i()) * 0.2F + 1.0F) * 0.8F);
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
      $$0.a(cf, cim.g.a.j);
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
            this.gq();
         }

         if (this.gm() == cim.g.g && this.cp == 0) {
            bwb $$1 = this.O_();
            if ($$1 != null && this.g((bvf)$$1) < 16.0) {
               this.c($$1.dA(), $$1.dG());
               this.bQ.a($$1.dA(), $$1.dC(), $$1.dG(), this.bQ.c());
               this.p();
               this.co = true;
            }
         }

         cim.c $$2 = (cim.c)this.bR;
         if (!$$2.c()) {
            if (this.bQ.b() && this.cp == 0) {
               eud $$3 = this.bS.k();
               fbs $$4 = new fbs(this.bQ.d(), this.bQ.e(), this.bQ.f());
               if ($$3 != null && !$$3.c()) {
                  $$4 = $$3.a(this);
               }

               this.c($$4.d, $$4.f);
               this.p();
            }
         } else if (!$$2.d()) {
            this.gn();
         }
      }

      this.co = this.aJ();
   }

   @Override
   public boolean bv() {
      return false;
   }

   private void c(double $$0, double $$1) {
      this.v((float)(bae.d($$1 - this.dG(), $$0 - this.dA()) * 180.0F / (float)Math.PI) - 90.0F);
   }

   private void gn() {
      ((cim.c)this.bR).a(true);
   }

   private void go() {
      ((cim.c)this.bR).a(false);
   }

   private void gp() {
      if (this.bQ.c() < 2.2) {
         this.cp = 10;
      } else {
         this.cp = 1;
      }
   }

   private void gq() {
      this.gp();
      this.go();
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

   public static bxi.a t() {
      return chs.gr().a(bxj.s, 3.0).a(bxj.v, 0.3F).a(bxj.c, 3.0);
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      $$0.a("RabbitType", this.gm().j);
      $$0.a("MoreCarrotTicks", this.cq);
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      this.a(cim.g.a($$0.h("RabbitType")));
      this.cq = $$0.h("MoreCarrotTicks");
   }

   protected axe x() {
      return axf.vu;
   }

   @Override
   protected axe u() {
      return axf.vq;
   }

   @Override
   protected axe e(btv $$0) {
      return axf.vt;
   }

   @Override
   protected axe o_() {
      return axf.vs;
   }

   @Override
   public void gd() {
      if (this.gm() == cim.g.g) {
         this.a(axf.vr, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
      }
   }

   @Override
   public axg dm() {
      return this.gm() == cim.g.g ? axg.f : axg.g;
   }

   @Nullable
   public cim b(ash $$0, buw $$1) {
      cim $$2 = bvm.aY.a($$0, bvl.e);
      if ($$2 != null) {
         cim.g $$3;
         $$3 = a($$0, this.dv());
         label16:
         if (this.ae.a(20) != 0) {
            if ($$1 instanceof cim $$4 && this.ae.h()) {
               $$3 = $$4.gm();
               break label16;
            }

            $$3 = this.gm();
         }

         $$2.a($$3);
      }

      return $$2;
   }

   @Override
   public boolean j(cxk $$0) {
      return $$0.a(ayd.ay);
   }

   public cim.g gm() {
      return cim.g.a(this.al.a(cf));
   }

   public void a(cim.g $$0) {
      if ($$0 == cim.g.g) {
         this.g(bxj.a).a(8.0);
         this.bT.a(4, new cdj(this, 1.4, true));
         this.bU.a(1, new cer(this).a());
         this.bU.a(2, new ces<>(this, cps.class, true));
         this.bU.a(2, new ces<>(this, civ.class, true));
         this.g(bxj.c).a(new bxh(cj, 5.0, bxh.a.a));
         if (!this.l_()) {
            this.b(xv.c(ae.a("entity", cg)));
         }
      } else {
         this.g(bxj.c).c(cj);
      }

      this.al.a(cf, $$0.j);
   }

   @Nullable
   @Override
   public bwu a(dhr $$0, btc $$1, bvl $$2, @Nullable bwu $$3) {
      cim.g $$4 = a($$0, this.dv());
      if ($$3 instanceof cim.b) {
         $$4 = ((cim.b)$$3).a;
      } else {
         $$3 = new cim.b($$4);
      }

      this.a($$4);
      return super.a($$0, $$1, $$2, $$3);
   }

   private static cim.g a(dhb $$0, jh $$1) {
      jq<dic> $$2 = $$0.t($$1);
      int $$3 = $$0.H_().a(100);
      if ($$2.a(axt.al)) {
         return $$3 < 80 ? cim.g.b : cim.g.d;
      } else if ($$2.a(axt.ak)) {
         return cim.g.e;
      } else {
         return $$3 < 50 ? cim.g.a : ($$3 < 90 ? cim.g.f : cim.g.c);
      }
   }

   public static boolean c(bvm<cim> $$0, dhb $$1, bvl $$2, jh $$3, bam $$4) {
      return $$1.a_($$3.e()).a(axu.cf) && a((dgc)$$1, $$3);
   }

   boolean gy() {
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
   public fbs cT() {
      return new fbs(0.0, (double)(0.6F * this.cS()), (double)(this.dq() * 0.4F));
   }

   static class a<T extends bwb> extends ccg<T> {
      private final cim i;

      public a(cim $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return this.i.gm() != cim.g.g && super.b();
      }
   }

   public static class b extends buw.a {
      public final cim.g a;

      public b(cim.g $$0) {
         super(1.0F);
         this.a = $$0;
      }
   }

   public static class c extends cca {
      private final cim b;
      private boolean c;

      public c(cim $$0) {
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

   static class d extends ccc {
      private final cim l;
      private double m;

      public d(cim $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.aJ() && !this.l.bn && !((cim.c)this.l.bR).c()) {
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

   static class e extends cds {
      private final cim a;

      public e(cim $$0, double $$1) {
         super($$0, $$1);
         this.a = $$0;
      }

      @Override
      public void a() {
         super.a();
         this.a.i(this.d);
      }
   }

   static class f extends cdm {
      private final cim g;
      private boolean h;
      private boolean i;

      public f(cim $$0) {
         super($$0, 0.7F, 16);
         this.g = $$0;
      }

      @Override
      public boolean b() {
         if (this.c <= 0) {
            if (!a(this.g).N().b(dgw.c)) {
               return false;
            }

            this.i = false;
            this.h = this.g.gy();
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
            dha $$0 = this.g.dV();
            jh $$1 = this.e.d();
            dxn $$2 = $$0.a_($$1);
            dke $$3 = $$2.b();
            if (this.i && $$3 instanceof dkx) {
               int $$4 = $$2.c(dkx.f);
               if ($$4 == 0) {
                  $$0.a($$1, dkg.a.m(), 2);
                  $$0.a($$1, true, this.g);
               } else {
                  $$0.a($$1, $$2.b(dkx.f, Integer.valueOf($$4 - 1)), 2);
                  $$0.a(ecj.c, $$1, ecj.a.a(this.g));
                  $$0.c(2001, $$1, dke.j($$2));
               }

               this.g.cq = 40;
            }

            this.i = false;
            this.c = 10;
         }
      }

      @Override
      protected boolean a(dhd $$0, jh $$1) {
         dxn $$2 = $$0.a_($$1);
         if ($$2.a(dkg.cK) && this.h && !this.i) {
            $$2 = $$0.a_($$1.d());
            if ($$2.b() instanceof dkx && ((dkx)$$2.b()).i($$2)) {
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

      private static final IntFunction<cim.g> i = ayv.a(cim.g::a, values(), a);
      public static final Codec<cim.g> h = bba.a(cim.g::values);
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

      public static cim.g a(int $$0) {
         return i.apply($$0);
      }
   }
}
