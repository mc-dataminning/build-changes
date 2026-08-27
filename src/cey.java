import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cey extends cee implements btn<cey.g> {
   public static final double ch = 0.6;
   public static final double ci = 0.8;
   public static final double ck = 1.0;
   public static final double cl = 2.2;
   public static final double cm = 1.4;
   private static final ajy<Integer> cp = akc.a(cey.class, aka.b);
   private static final akt cq = new akt("killer_bunny");
   public static final int cn = 8;
   public static final int co = 8;
   private static final int cr = 40;
   private int cs;
   private int ct;
   private boolean cu;
   private int cv;
   int cw;

   public cey(bsb<? extends cey> $$0, dca $$1) {
      super($$0, $$1);
      this.bZ = new cey.c(this);
      this.bY = new cey.d(this);
      this.i(0.0);
   }

   @Override
   protected void y() {
      this.cb.a(1, new bzf(this));
      this.cb.a(1, new bza(this, this.dU()));
      this.cb.a(1, new cey.e(this, 2.2));
      this.cb.a(2, new byx(this, 0.8));
      this.cb.a(3, new cat(this, 1.0, $$0 -> $$0.a(awm.as), false));
      this.cb.a(4, new cey.a<>(this, cly.class, 8.0F, 2.2, 2.2));
      this.cb.a(4, new cey.a<>(this, cfh.class, 10.0F, 2.2, 2.2));
      this.cb.a(4, new cey.a<>(this, cjd.class, 4.0F, 2.2, 2.2));
      this.cb.a(5, new cey.f(this));
      this.cb.a(6, new cay(this, 0.6));
      this.cb.a(11, new bzt(this, cly.class, 10.0F));
   }

   @Override
   protected float fq() {
      float $$0 = 0.3F;
      if (this.R || this.bY.b() && this.bY.e() > this.dB() + 0.5) {
         $$0 = 0.5F;
      }

      eps $$1 = this.ca.j();
      if ($$1 != null && !$$1.c()) {
         ewu $$2 = $$1.a(this);
         if ($$2.d > this.dB() + 0.5) {
            $$0 = 0.5F;
         }
      }

      if (this.bY.c() <= 0.6) {
         $$0 = 0.2F;
      }

      return super.w($$0 / 0.42F);
   }

   @Override
   protected void fs() {
      super.fs();
      double $$0 = this.bY.c();
      if ($$0 > 0.0) {
         double $$1 = this.dx().i();
         if ($$1 < 0.01) {
            this.a(0.1F, new ewu(0.0, 0.0, 1.0));
         }
      }

      if (!this.dU().C) {
         this.dU().a(this, (byte)1);
      }
   }

   public float G(float $$0) {
      return this.ct == 0 ? 0.0F : ((float)this.cs + $$0) / (float)this.ct;
   }

   public void i(double $$0) {
      this.J().a($$0);
      this.bY.a(this.bY.d(), this.bY.e(), this.bY.f(), $$0);
   }

   @Override
   public void s(boolean $$0) {
      super.s($$0);
      if ($$0) {
         this.a(this.x(), this.fn(), ((this.al.i() - this.al.i()) * 0.2F + 1.0F) * 0.8F);
      }
   }

   @Override
   public void r() {
      this.s(true);
      this.ct = 10;
      this.cs = 0;
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(cp, cey.g.a.j);
   }

   @Override
   public void Y() {
      if (this.cv > 0) {
         this.cv--;
      }

      if (this.cw > 0) {
         this.cw = this.cw - this.al.a(3);
         if (this.cw < 0) {
            this.cw = 0;
         }
      }

      if (this.aE()) {
         if (!this.cu) {
            this.s(false);
            this.gH();
         }

         if (this.gy() == cey.g.g && this.cv == 0) {
            bso $$0 = this.p();
            if ($$0 != null && this.g((brv)$$0) < 16.0) {
               this.c($$0.dz(), $$0.dF());
               this.bY.a($$0.dz(), $$0.dB(), $$0.dF(), this.bY.c());
               this.r();
               this.cu = true;
            }
         }

         cey.c $$1 = (cey.c)this.bZ;
         if (!$$1.c()) {
            if (this.bY.b() && this.cv == 0) {
               eps $$2 = this.ca.j();
               ewu $$3 = new ewu(this.bY.d(), this.bY.e(), this.bY.f());
               if ($$2 != null && !$$2.c()) {
                  $$3 = $$2.a(this);
               }

               this.c($$3.c, $$3.e);
               this.r();
            }
         } else if (!$$1.d()) {
            this.gE();
         }
      }

      this.cu = this.aE();
   }

   @Override
   public boolean bu() {
      return false;
   }

   private void c(double $$0, double $$1) {
      this.r((float)(aym.d($$1 - this.dF(), $$0 - this.dz()) * 180.0F / (float)Math.PI) - 90.0F);
   }

   private void gE() {
      ((cey.c)this.bZ).a(true);
   }

   private void gF() {
      ((cey.c)this.bZ).a(false);
   }

   private void gG() {
      if (this.bY.c() < 2.2) {
         this.cv = 10;
      } else {
         this.cv = 1;
      }
   }

   private void gH() {
      this.gG();
      this.gF();
   }

   @Override
   public void m_() {
      super.m_();
      if (this.cs != this.ct) {
         this.cs++;
      } else if (this.ct != 0) {
         this.cs = 0;
         this.ct = 0;
         this.s(false);
      }
   }

   public static btu.a t() {
      return bsq.A().a(btv.q, 3.0).a(btv.r, 0.3F);
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("RabbitType", this.gy().j);
      $$0.a("MoreCarrotTicks", this.cw);
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.a(cey.g.a($$0.h("RabbitType")));
      this.cw = $$0.h("MoreCarrotTicks");
   }

   protected avn x() {
      return avo.vw;
   }

   @Override
   protected avn u() {
      return avo.vs;
   }

   @Override
   protected avn d(bqt $$0) {
      return avo.vv;
   }

   @Override
   protected avn n_() {
      return avo.vu;
   }

   @Override
   public boolean C(brv $$0) {
      if (this.gy() == cey.g.g) {
         this.a(avo.vt, 1.0F, (this.al.i() - this.al.i()) * 0.2F + 1.0F);
         return $$0.a(this.dX().b((bso)this), 8.0F);
      } else {
         return $$0.a(this.dX().b((bso)this), 3.0F);
      }
   }

   @Override
   public avq dj() {
      return this.gy() == cey.g.g ? avq.f : avq.g;
   }

   @Nullable
   public cey b(aqt $$0, brp $$1) {
      cey $$2 = bsb.aI.a((dca)$$0);
      if ($$2 != null) {
         cey.g $$3;
         $$3 = a($$0, this.du());
         label16:
         if (this.al.a(20) != 0) {
            if ($$1 instanceof cey $$4 && this.al.h()) {
               $$3 = $$4.gy();
               break label16;
            }

            $$3 = this.gy();
         }

         $$2.a($$3);
      }

      return $$2;
   }

   @Override
   public boolean o(cuh $$0) {
      return $$0.a(awm.as);
   }

   public cey.g gy() {
      return cey.g.a(this.as.a(cp));
   }

   public void a(cey.g $$0) {
      if ($$0 == cey.g.g) {
         this.f(btv.a).a(8.0);
         this.cb.a(4, new bzv(this, 1.4, true));
         this.cc.a(1, new cbd(this).a());
         this.cc.a(2, new cbe<>(this, cly.class, true));
         this.cc.a(2, new cbe<>(this, cfh.class, true));
         if (!this.ag()) {
            this.b(xe.c(ad.a("entity", cq)));
         }
      }

      this.as.a(cp, $$0.j);
   }

   @Nullable
   @Override
   public btg a(dcp $$0, bpy $$1, bss $$2, @Nullable btg $$3) {
      cey.g $$4 = a($$0, this.du());
      if ($$3 instanceof cey.b) {
         $$4 = ((cey.b)$$3).a;
      } else {
         $$3 = new cey.b($$4);
      }

      this.a($$4);
      return super.a($$0, $$1, $$2, $$3);
   }

   private static cey.g a(dcb $$0, ir $$1) {
      ja<dcz> $$2 = $$0.t($$1);
      int $$3 = $$0.F_().a(100);
      if ($$2.a(awd.ap)) {
         return $$3 < 80 ? cey.g.b : cey.g.d;
      } else if ($$2.a(awd.ao)) {
         return cey.g.e;
      } else {
         return $$3 < 50 ? cey.g.a : ($$3 < 90 ? cey.g.f : cey.g.c);
      }
   }

   public static boolean c(bsb<cey> $$0, dcb $$1, bss $$2, ir $$3, ayt $$4) {
      return $$1.a_($$3.d()).a(awe.cg) && a((dbd)$$1, $$3);
   }

   boolean gI() {
      return this.cw <= 0;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 1) {
         this.bw();
         this.ct = 10;
         this.cs = 0;
      } else {
         super.b($$0);
      }
   }

   @Override
   public ewu cR() {
      return new ewu(0.0, (double)(0.6F * this.cQ()), (double)(this.do() * 0.4F));
   }

   static class a<T extends bso> extends bys<T> {
      private final cey i;

      public a(cey $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.gy() != cey.g.g && super.a();
      }
   }

   public static class b extends brp.a {
      public final cey.g a;

      public b(cey.g $$0) {
         super(1.0F);
         this.a = $$0;
      }
   }

   public static class c extends bym {
      private final cey b;
      private boolean c;

      public c(cey $$0) {
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
            this.b.r();
            this.a = false;
         }
      }
   }

   static class d extends byo {
      private final cey l;
      private double m;

      public d(cey $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.aE() && !this.l.by && !((cey.c)this.l.bZ).c()) {
            this.l.i(0.0);
         } else if (this.b()) {
            this.l.i(this.m);
         }

         super.a();
      }

      @Override
      public void a(double $$0, double $$1, double $$2, double $$3) {
         if (this.l.bi()) {
            $$3 = 1.5;
         }

         super.a($$0, $$1, $$2, $$3);
         if ($$3 > 0.0) {
            this.m = $$3;
         }
      }
   }

   static class e extends cae {
      private final cey h;

      public e(cey $$0, double $$1) {
         super($$0, $$1);
         this.h = $$0;
      }

      @Override
      public void e() {
         super.e();
         this.h.i(this.c);
      }
   }

   static class f extends bzy {
      private final cey g;
      private boolean h;
      private boolean i;

      public f(cey $$0) {
         super($$0, 0.7F, 16);
         this.g = $$0;
      }

      @Override
      public boolean a() {
         if (this.c <= 0) {
            if (!this.g.dU().ab().b(dbw.c)) {
               return false;
            }

            this.i = false;
            this.h = this.g.gI();
         }

         return super.a();
      }

      @Override
      public boolean b() {
         return this.i && super.b();
      }

      @Override
      public void e() {
         super.e();
         this.g.F().a((double)this.e.u() + 0.5, (double)(this.e.v() + 1), (double)this.e.w() + 0.5, 10.0F, (float)this.g.Z());
         if (this.m()) {
            dca $$0 = this.g.dU();
            ir $$1 = this.e.c();
            dtc $$2 = $$0.a_($$1);
            dfc $$3 = $$2.b();
            if (this.i && $$3 instanceof dfu) {
               int $$4 = $$2.c(dfu.f);
               if ($$4 == 0) {
                  $$0.a($$1, dfe.a.n(), 2);
                  $$0.a($$1, true, this.g);
               } else {
                  $$0.a($$1, $$2.a(dfu.f, Integer.valueOf($$4 - 1)), 2);
                  $$0.a(dxv.c, $$1, dxv.a.a(this.g));
                  $$0.c(2001, $$1, dfc.i($$2));
               }

               this.g.cw = 40;
            }

            this.i = false;
            this.c = 10;
         }
      }

      @Override
      protected boolean a(dcd $$0, ir $$1) {
         dtc $$2 = $$0.a_($$1);
         if ($$2.a(dfe.dn) && this.h && !this.i) {
            $$2 = $$0.a_($$1.c());
            if ($$2.b() instanceof dfu && ((dfu)$$2.b()).h($$2)) {
               this.i = true;
               return true;
            }
         }

         return false;
      }
   }

   public static enum g implements azg {
      a(0, "brown"),
      b(1, "white"),
      c(2, "black"),
      d(3, "white_splotched"),
      e(4, "gold"),
      f(5, "salt"),
      g(99, "evil");

      private static final IntFunction<cey.g> i = axd.a(cey.g::a, values(), a);
      public static final Codec<cey.g> h = azg.a(cey.g::values);
      final int j;
      private final String k;

      private g(int $$0, String $$1) {
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

      public static cey.g a(int $$0) {
         return i.apply($$0);
      }
   }
}
