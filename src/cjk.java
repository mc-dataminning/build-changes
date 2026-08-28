import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cjk extends cio {
   public static final double bF = 0.6;
   public static final double bG = 0.8;
   public static final double bH = 1.0;
   public static final double bJ = 2.2;
   public static final double bK = 1.4;
   private static final akh<Integer> bL = akl.a(cjk.class, akj.b);
   private static final ale bM = ale.b("killer_bunny");
   private static final int bN = 3;
   private static final int bO = 5;
   private static final ale bP = ale.b("evil");
   private static final int bQ = 8;
   private static final int bR = 40;
   private int bS;
   private int bT;
   private boolean bU;
   private int bV;
   int bW;

   public cjk(bwj<? extends cjk> $$0, dip $$1) {
      super($$0, $$1);
      this.bA = new cjk.c(this);
      this.bz = new cjk.d(this);
      this.i(0.0);
   }

   @Override
   protected void D() {
      this.bC.a(1, new cdp(this));
      this.bC.a(1, new cdk(this, this.dV()));
      this.bC.a(1, new cjk.e(this, 2.2));
      this.bC.a(2, new cdh(this, 0.8));
      this.bC.a(3, new cfd(this, 1.0, $$0 -> $$0.a(axi.aw), false));
      this.bC.a(4, new cjk.a<>(this, cqs.class, 8.0F, 2.2, 2.2));
      this.bC.a(4, new cjk.a<>(this, cju.class, 10.0F, 2.2, 2.2));
      this.bC.a(4, new cjk.a<>(this, cnt.class, 4.0F, 2.2, 2.2));
      this.bC.a(5, new cjk.f(this));
      this.bC.a(6, new cfi(this, 0.6));
      this.bC.a(11, new ced(this, cqs.class, 10.0F));
   }

   @Override
   protected float fg() {
      float $$0 = 0.3F;
      if (this.bz.c() <= 0.6) {
         $$0 = 0.2F;
      }

      ewj $$1 = this.bB.i();
      if ($$1 != null && !$$1.c()) {
         fdw $$2 = $$1.a(this);
         if ($$2.e > this.dC() + 0.5) {
            $$0 = 0.5F;
         }
      }

      if (this.P || this.bf && this.bz.e() > this.dC() + 0.5) {
         $$0 = 0.5F;
      }

      return super.z($$0 / 0.42F);
   }

   @Override
   public void s() {
      super.s();
      double $$0 = this.bz.c();
      if ($$0 > 0.0) {
         double $$1 = this.dy().j();
         if ($$1 < 0.01) {
            this.a(0.1F, new fdw(0.0, 0.0, 1.0));
         }
      }

      if (!this.dV().C) {
         this.dV().a(this, (byte)1);
      }
   }

   public float J(float $$0) {
      return this.bT == 0 ? 0.0F : ((float)this.bS + $$0) / (float)this.bT;
   }

   public void i(double $$0) {
      this.O().a($$0);
      this.bz.a(this.bz.d(), this.bz.e(), this.bz.f(), $$0);
   }

   @Override
   public void s(boolean $$0) {
      super.s($$0);
      if ($$0) {
         this.a(this.x(), this.fd(), ((this.ae.i() - this.ae.i()) * 0.2F + 1.0F) * 0.8F);
      }
   }

   @Override
   public void q() {
      this.s(true);
      this.bT = 10;
      this.bS = 0;
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(bL, cjk.g.a.k);
   }

   @Override
   public void a(aro $$0) {
      if (this.bV > 0) {
         this.bV--;
      }

      if (this.bW > 0) {
         this.bW = this.bW - this.ae.a(3);
         if (this.bW < 0) {
            this.bW = 0;
         }
      }

      if (this.aJ()) {
         if (!this.bU) {
            this.s(false);
            this.gu();
         }

         if (this.gq() == cjk.g.g && this.bV == 0) {
            bwz $$1 = this.f();
            if ($$1 != null && this.g((bwa)$$1) < 16.0) {
               this.c($$1.dA(), $$1.dG());
               this.bz.a($$1.dA(), $$1.dC(), $$1.dG(), this.bz.c());
               this.q();
               this.bU = true;
            }
         }

         cjk.c $$2 = (cjk.c)this.bA;
         if (!$$2.c()) {
            if (this.bz.b() && this.bV == 0) {
               ewj $$3 = this.bB.i();
               fdw $$4 = new fdw(this.bz.d(), this.bz.e(), this.bz.f());
               if ($$3 != null && !$$3.c()) {
                  $$4 = $$3.a(this);
               }

               this.c($$4.d, $$4.f);
               this.q();
            }
         } else if (!$$2.d()) {
            this.gr();
         }
      }

      this.bU = this.aJ();
   }

   @Override
   public boolean bu() {
      return false;
   }

   private void c(double $$0, double $$1) {
      this.w((float)(azk.d($$1 - this.dG(), $$0 - this.dA()) * 180.0F / (float)Math.PI) - 90.0F);
   }

   private void gr() {
      ((cjk.c)this.bA).a(true);
   }

   private void gs() {
      ((cjk.c)this.bA).a(false);
   }

   private void gt() {
      if (this.bz.c() < 2.2) {
         this.bV = 10;
      } else {
         this.bV = 1;
      }
   }

   private void gu() {
      this.gt();
      this.gs();
   }

   @Override
   public void k_() {
      super.k_();
      if (this.bS != this.bT) {
         this.bS++;
      } else if (this.bT != 0) {
         this.bS = 0;
         this.bT = 0;
         this.s(false);
      }
   }

   public static bye.a t() {
      return cio.gv().a(byf.s, 3.0).a(byf.v, 0.3F).a(byf.c, 3.0);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("RabbitType", this.gq().k);
      $$0.a("MoreCarrotTicks", this.bW);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.a(cjk.g.a($$0.h("RabbitType")));
      this.bW = $$0.h("MoreCarrotTicks");
   }

   protected awk x() {
      return awl.vL;
   }

   @Override
   protected awk u() {
      return awl.vH;
   }

   @Override
   protected awk e(bup $$0) {
      return awl.vK;
   }

   @Override
   protected awk l_() {
      return awl.vJ;
   }

   @Override
   public void gj() {
      if (this.gq() == cjk.g.g) {
         this.a(awl.vI, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
      }
   }

   @Override
   public awm dm() {
      return this.gq() == cjk.g.g ? awm.f : awm.g;
   }

   @Nullable
   public cjk b(aro $$0, bvq $$1) {
      cjk $$2 = bwj.aY.a($$0, bwi.e);
      if ($$2 != null) {
         cjk.g $$3;
         $$3 = a($$0, this.dv());
         label16:
         if (this.ae.a(20) != 0) {
            if ($$1 instanceof cjk $$4 && this.ae.h()) {
               $$3 = $$4.gq();
               break label16;
            }

            $$3 = this.gq();
         }

         $$2.a($$3);
      }

      return $$2;
   }

   @Override
   public boolean k(cys $$0) {
      return $$0.a(axi.aw);
   }

   public cjk.g gq() {
      return cjk.g.a(this.al.a(bL));
   }

   private void a(cjk.g $$0) {
      if ($$0 == cjk.g.g) {
         this.g(byf.a).a(8.0);
         this.bC.a(4, new cef(this, 1.4, true));
         this.bD.a(1, new cfn(this).a());
         this.bD.a(2, new cfo<>(this, cqs.class, true));
         this.bD.a(2, new cfo<>(this, cju.class, true));
         this.g(byf.c).a(new byd(bP, 5.0, byd.a.a));
         if (!this.h_()) {
            this.b(ww.c(af.a("entity", bM)));
         }
      } else {
         this.g(byf.c).c(bP);
      }

      this.al.a(bL, $$0.k);
   }

   @Nullable
   @Override
   public <T> T a(ki<? extends T> $$0) {
      return $$0 == kj.aF ? c((ki<T>)$$0, this.gq()) : super.a($$0);
   }

   @Override
   protected void a(ke $$0) {
      this.a($$0, kj.aF);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(ki<T> $$0, T $$1) {
      if ($$0 == kj.aF) {
         this.a(c(kj.aF, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Nullable
   @Override
   public bxr a(djg $$0, btw $$1, bwi $$2, @Nullable bxr $$3) {
      cjk.g $$4 = a($$0, this.dv());
      if ($$3 instanceof cjk.b) {
         $$4 = ((cjk.b)$$3).a;
      } else {
         $$3 = new cjk.b($$4);
      }

      this.a($$4);
      return super.a($$0, $$1, $$2, $$3);
   }

   private static cjk.g a(diq $$0, iu $$1) {
      je<djs> $$2 = $$0.u($$1);
      int $$3 = $$0.C_().a(100);
      if ($$2.a(awz.an)) {
         return $$3 < 80 ? cjk.g.b : cjk.g.d;
      } else if ($$2.a(awz.am)) {
         return cjk.g.e;
      } else {
         return $$3 < 50 ? cjk.g.a : ($$3 < 90 ? cjk.g.f : cjk.g.c);
      }
   }

   public static boolean c(bwj<cjk> $$0, diq $$1, bwi $$2, iu $$3, azt $$4) {
      return $$1.a_($$3.e()).a(axa.cg) && a((dhs)$$1, $$3);
   }

   boolean gC() {
      return this.bW <= 0;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 1) {
         this.bv();
         this.bT = 10;
         this.bS = 0;
      } else {
         super.b($$0);
      }
   }

   @Override
   public fdw cT() {
      return new fdw(0.0, (double)(0.6F * this.cS()), (double)(this.dq() * 0.4F));
   }

   static class a<T extends bwz> extends cdc<T> {
      private final cjk i;

      public a(cjk $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return this.i.gq() != cjk.g.g && super.b();
      }
   }

   public static class b extends bvq.a {
      public final cjk.g a;

      public b(cjk.g $$0) {
         super(1.0F);
         this.a = $$0;
      }
   }

   public static class c extends ccw {
      private final cjk b;
      private boolean c;

      public c(cjk $$0) {
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
            this.b.q();
            this.a = false;
         }
      }
   }

   static class d extends ccy {
      private final cjk l;
      private double m;

      public d(cjk $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.aJ() && !this.l.bf && !((cjk.c)this.l.bA).c()) {
            this.l.i(0.0);
         } else if (this.b() || this.k == ccy.a.d) {
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

   static class e extends ceo {
      private final cjk a;

      public e(cjk $$0, double $$1) {
         super($$0, $$1);
         this.a = $$0;
      }

      @Override
      public void a() {
         super.a();
         this.a.i(this.d);
      }
   }

   static class f extends cei {
      private final cjk g;
      private boolean h;
      private boolean i;

      public f(cjk $$0) {
         super($$0, 0.7F, 16);
         this.g = $$0;
      }

      @Override
      public boolean b() {
         if (this.c <= 0) {
            if (!a(this.g).O().c(dil.c)) {
               return false;
            }

            this.i = false;
            this.h = this.g.gC();
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
         this.g.J().a((double)this.e.u() + 0.5, (double)(this.e.v() + 1), (double)this.e.w() + 0.5, 10.0F, (float)this.g.ac());
         if (this.m()) {
            dip $$0 = this.g.dV();
            iu $$1 = this.e.d();
            dzo $$2 = $$0.a_($$1);
            dlu $$3 = $$2.b();
            if (this.i && $$3 instanceof dmn) {
               int $$4 = $$2.c(dmn.f);
               if ($$4 == 0) {
                  $$0.a($$1, dlw.a.m(), 2);
                  $$0.a($$1, true, this.g);
               } else {
                  $$0.a($$1, $$2.b(dmn.f, Integer.valueOf($$4 - 1)), 2);
                  $$0.a(eeo.c, $$1, eeo.a.a(this.g));
                  $$0.c(2001, $$1, dlu.j($$2));
               }

               this.g.bW = 40;
            }

            this.i = false;
            this.c = 10;
         }
      }

      @Override
      protected boolean a(dis $$0, iu $$1) {
         dzo $$2 = $$0.a_($$1);
         if ($$2.a(dlw.cK) && this.h && !this.i) {
            $$2 = $$0.a_($$1.d());
            if ($$2.b() instanceof dmn && ((dmn)$$2.b()).i($$2)) {
               this.i = true;
               return true;
            }
         }

         return false;
      }
   }

   public static enum g implements bai {
      a(0, "brown"),
      b(1, "white"),
      c(2, "black"),
      d(3, "white_splotched"),
      e(4, "gold"),
      f(5, "salt"),
      g(99, "evil");

      private static final IntFunction<cjk.g> j = aya.a(cjk.g::a, values(), a);
      public static final Codec<cjk.g> h = bai.a(cjk.g::values);
      public static final yu<ByteBuf, cjk.g> i = ys.a(j, cjk.g::a);
      final int k;
      private final String l;

      private g(final int $$0, final String $$1) {
         this.k = $$0;
         this.l = $$1;
      }

      @Override
      public String c() {
         return this.l;
      }

      public int a() {
         return this.k;
      }

      public static cjk.g a(int $$0) {
         return j.apply($$0);
      }
   }
}
