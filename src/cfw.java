import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cfw extends cfc implements bum<cfw.g> {
   public static final double ca = 0.6;
   public static final double cb = 0.8;
   public static final double cc = 1.0;
   public static final double ce = 2.2;
   public static final double cf = 1.4;
   private static final ajv<Integer> cg = ajz.a(cfw.class, ajx.b);
   private static final akq ch = akq.b("killer_bunny");
   private static final int ci = 3;
   private static final int cj = 5;
   private static final akq ck = akq.b("evil");
   private static final int cl = 8;
   private static final int cm = 40;
   private int cn;
   private int co;
   private boolean cp;
   private int cq;
   int cr;

   public cfw(bsw<? extends cfw> $$0, dcu $$1) {
      super($$0, $$1);
      this.bS = new cfw.c(this);
      this.bR = new cfw.d(this);
      this.i(0.0);
   }

   @Override
   protected void z() {
      this.bU.a(1, new cae(this));
      this.bU.a(1, new bzz(this, this.dQ()));
      this.bU.a(1, new cfw.e(this, 2.2));
      this.bU.a(2, new bzw(this, 0.8));
      this.bU.a(3, new cbs(this, 1.0, $$0 -> $$0.a(awm.as), false));
      this.bU.a(4, new cfw.a<>(this, cmv.class, 8.0F, 2.2, 2.2));
      this.bU.a(4, new cfw.a<>(this, cgf.class, 10.0F, 2.2, 2.2));
      this.bU.a(4, new cfw.a<>(this, ckb.class, 4.0F, 2.2, 2.2));
      this.bU.a(5, new cfw.f(this));
      this.bU.a(6, new cbx(this, 0.6));
      this.bU.a(11, new cas(this, cmv.class, 10.0F));
   }

   @Override
   protected float fe() {
      float $$0 = 0.3F;
      if (this.Q || this.bR.b() && this.bR.e() > this.dx() + 0.5) {
         $$0 = 0.5F;
      }

      epm $$1 = this.bT.j();
      if ($$1 != null && !$$1.c()) {
         eww $$2 = $$1.a(this);
         if ($$2.d > this.dx() + 0.5) {
            $$0 = 0.5F;
         }
      }

      if (this.bR.c() <= 0.6) {
         $$0 = 0.2F;
      }

      return super.x($$0 / 0.42F);
   }

   @Override
   protected void fg() {
      super.fg();
      double $$0 = this.bR.c();
      if ($$0 > 0.0) {
         double $$1 = this.dt().i();
         if ($$1 < 0.01) {
            this.a(0.1F, new eww(0.0, 0.0, 1.0));
         }
      }

      if (!this.dQ().B) {
         this.dQ().a(this, (byte)1);
      }
   }

   public float H(float $$0) {
      return this.co == 0 ? 0.0F : ((float)this.cn + $$0) / (float)this.co;
   }

   public void i(double $$0) {
      this.J().a($$0);
      this.bR.a(this.bR.d(), this.bR.e(), this.bR.f(), $$0);
   }

   @Override
   public void t(boolean $$0) {
      super.t($$0);
      if ($$0) {
         this.a(this.x(), this.fb(), ((this.ah.i() - this.ah.i()) * 0.2F + 1.0F) * 0.8F);
      }
   }

   @Override
   public void s() {
      this.t(true);
      this.co = 10;
      this.cn = 0;
   }

   @Override
   protected void a(ajz.a $$0) {
      super.a($$0);
      $$0.a(cg, cfw.g.a.j);
   }

   @Override
   public void Z() {
      if (this.cq > 0) {
         this.cq--;
      }

      if (this.cr > 0) {
         this.cr = this.cr - this.ah.a(3);
         if (this.cr < 0) {
            this.cr = 0;
         }
      }

      if (this.aF()) {
         if (!this.cp) {
            this.t(false);
            this.gq();
         }

         if (this.gm() == cfw.g.g && this.cq == 0) {
            btl $$0 = this.p();
            if ($$0 != null && this.g((bsq)$$0) < 16.0) {
               this.c($$0.dv(), $$0.dB());
               this.bR.a($$0.dv(), $$0.dx(), $$0.dB(), this.bR.c());
               this.s();
               this.cp = true;
            }
         }

         cfw.c $$1 = (cfw.c)this.bS;
         if (!$$1.c()) {
            if (this.bR.b() && this.cq == 0) {
               epm $$2 = this.bT.j();
               eww $$3 = new eww(this.bR.d(), this.bR.e(), this.bR.f());
               if ($$2 != null && !$$2.c()) {
                  $$3 = $$2.a(this);
               }

               this.c($$3.c, $$3.e);
               this.s();
            }
         } else if (!$$1.d()) {
            this.gn();
         }
      }

      this.cp = this.aF();
   }

   @Override
   public boolean br() {
      return false;
   }

   private void c(double $$0, double $$1) {
      this.s((float)(ayn.d($$1 - this.dB(), $$0 - this.dv()) * 180.0F / (float)Math.PI) - 90.0F);
   }

   private void gn() {
      ((cfw.c)this.bS).a(true);
   }

   private void go() {
      ((cfw.c)this.bS).a(false);
   }

   private void gp() {
      if (this.bR.c() < 2.2) {
         this.cq = 10;
      } else {
         this.cq = 1;
      }
   }

   private void gq() {
      this.gp();
      this.go();
   }

   @Override
   public void m_() {
      super.m_();
      if (this.cn != this.co) {
         this.cn++;
      } else if (this.co != 0) {
         this.cn = 0;
         this.co = 0;
         this.t(false);
      }
   }

   public static but.a t() {
      return btn.A().a(buu.s, 3.0).a(buu.v, 0.3F).a(buu.c, 3.0);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("RabbitType", this.gm().j);
      $$0.a("MoreCarrotTicks", this.cr);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.a(cfw.g.a($$0.h("RabbitType")));
      this.cr = $$0.h("MoreCarrotTicks");
   }

   protected avn x() {
      return avo.vb;
   }

   @Override
   protected avn v() {
      return avo.uX;
   }

   @Override
   protected avn d(brj $$0) {
      return avo.va;
   }

   @Override
   protected avn n_() {
      return avo.uZ;
   }

   @Override
   public void gf() {
      if (this.gm() == cfw.g.g) {
         this.a(avo.uY, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
      }
   }

   @Override
   public avp df() {
      return this.gm() == cfw.g.g ? avp.f : avp.g;
   }

   @Nullable
   public cfw b(aqt $$0, bsk $$1) {
      cfw $$2 = bsw.aG.a((dcu)$$0);
      if ($$2 != null) {
         cfw.g $$3;
         $$3 = a($$0, this.dq());
         label16:
         if (this.ah.a(20) != 0) {
            if ($$1 instanceof cfw $$4 && this.ah.h()) {
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
   public boolean o(cuo $$0) {
      return $$0.a(awm.as);
   }

   public cfw.g gm() {
      return cfw.g.a(this.ao.a(cg));
   }

   public void a(cfw.g $$0) {
      if ($$0 == cfw.g.g) {
         this.f(buu.a).a(8.0);
         this.bU.a(4, new cau(this, 1.4, true));
         this.bV.a(1, new ccc(this).a());
         this.bV.a(2, new ccd<>(this, cmv.class, true));
         this.bV.a(2, new ccd<>(this, cgf.class, true));
         this.f(buu.c).a(new bus(ck, 5.0, bus.a.a));
         if (!this.ai()) {
            this.b(wy.c(ad.a("entity", ch)));
         }
      } else {
         this.f(buu.c).c(ck);
      }

      this.ao.a(cg, $$0.j);
   }

   @Nullable
   @Override
   public buf a(ddj $$0, bqo $$1, btp $$2, @Nullable buf $$3) {
      cfw.g $$4 = a($$0, this.dq());
      if ($$3 instanceof cfw.b) {
         $$4 = ((cfw.b)$$3).a;
      } else {
         $$3 = new cfw.b($$4);
      }

      this.a($$4);
      return super.a($$0, $$1, $$2, $$3);
   }

   private static cfw.g a(dcv $$0, jd $$1) {
      jm<ddu> $$2 = $$0.t($$1);
      int $$3 = $$0.E_().a(100);
      if ($$2.a(awc.al)) {
         return $$3 < 80 ? cfw.g.b : cfw.g.d;
      } else if ($$2.a(awc.ak)) {
         return cfw.g.e;
      } else {
         return $$3 < 50 ? cfw.g.a : ($$3 < 90 ? cfw.g.f : cfw.g.c);
      }
   }

   public static boolean c(bsw<cfw> $$0, dcv $$1, btp $$2, jd $$3, ayv $$4) {
      return $$1.a_($$3.d()).a(awd.cd) && a((dbx)$$1, $$3);
   }

   boolean gw() {
      return this.cr <= 0;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 1) {
         this.bs();
         this.co = 10;
         this.cn = 0;
      } else {
         super.b($$0);
      }
   }

   @Override
   public eww cN() {
      return new eww(0.0, (double)(0.6F * this.cM()), (double)(this.dk() * 0.4F));
   }

   static class a<T extends btl> extends bzr<T> {
      private final cfw i;

      public a(cfw $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return this.i.gm() != cfw.g.g && super.b();
      }
   }

   public static class b extends bsk.a {
      public final cfw.g a;

      public b(cfw.g $$0) {
         super(1.0F);
         this.a = $$0;
      }
   }

   public static class c extends bzl {
      private final cfw b;
      private boolean c;

      public c(cfw $$0) {
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
            this.b.s();
            this.a = false;
         }
      }
   }

   static class d extends bzn {
      private final cfw l;
      private double m;

      public d(cfw $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.aF() && !this.l.bn && !((cfw.c)this.l.bS).c()) {
            this.l.i(0.0);
         } else if (this.b()) {
            this.l.i(this.m);
         }

         super.a();
      }

      @Override
      public void a(double $$0, double $$1, double $$2, double $$3) {
         if (this.l.bf()) {
            $$3 = 1.5;
         }

         super.a($$0, $$1, $$2, $$3);
         if ($$3 > 0.0) {
            this.m = $$3;
         }
      }
   }

   static class e extends cbd {
      private final cfw a;

      public e(cfw $$0, double $$1) {
         super($$0, $$1);
         this.a = $$0;
      }

      @Override
      public void a() {
         super.a();
         this.a.i(this.d);
      }
   }

   static class f extends cax {
      private final cfw g;
      private boolean h;
      private boolean i;

      public f(cfw $$0) {
         super($$0, 0.7F, 16);
         this.g = $$0;
      }

      @Override
      public boolean b() {
         if (this.c <= 0) {
            if (!this.g.dQ().ab().b(dcq.c)) {
               return false;
            }

            this.i = false;
            this.h = this.g.gw();
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
         this.g.F().a((double)this.e.u() + 0.5, (double)(this.e.v() + 1), (double)this.e.w() + 0.5, 10.0F, (float)this.g.aa());
         if (this.m()) {
            dcu $$0 = this.g.dQ();
            jd $$1 = this.e.c();
            dta $$2 = $$0.a_($$1);
            dfw $$3 = $$2.b();
            if (this.i && $$3 instanceof dgo) {
               int $$4 = $$2.c(dgo.f);
               if ($$4 == 0) {
                  $$0.a($$1, dfy.a.o(), 2);
                  $$0.a($$1, true, this.g);
               } else {
                  $$0.a($$1, $$2.a(dgo.f, Integer.valueOf($$4 - 1)), 2);
                  $$0.a(dxw.c, $$1, dxw.a.a(this.g));
                  $$0.c(2001, $$1, dfw.i($$2));
               }

               this.g.cr = 40;
            }

            this.i = false;
            this.c = 10;
         }
      }

      @Override
      protected boolean a(dcx $$0, jd $$1) {
         dta $$2 = $$0.a_($$1);
         if ($$2.a(dfy.cC) && this.h && !this.i) {
            $$2 = $$0.a_($$1.c());
            if ($$2.b() instanceof dgo && ((dgo)$$2.b()).h($$2)) {
               this.i = true;
               return true;
            }
         }

         return false;
      }
   }

   public static enum g implements azj {
      a(0, "brown"),
      b(1, "white"),
      c(2, "black"),
      d(3, "white_splotched"),
      e(4, "gold"),
      f(5, "salt"),
      g(99, "evil");

      private static final IntFunction<cfw.g> i = axd.a(cfw.g::a, values(), a);
      public static final Codec<cfw.g> h = azj.a(cfw.g::values);
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

      public static cfw.g a(int $$0) {
         return i.apply($$0);
      }
   }
}
