import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cjq extends cis {
   public static final double bF = 0.6;
   public static final double bG = 0.8;
   public static final double bH = 1.0;
   public static final double bJ = 2.2;
   public static final double bK = 1.4;
   private static final akj<Integer> bL = akn.a(cjq.class, akl.b);
   private static final alg bM = alg.b("killer_bunny");
   private static final int bN = 3;
   private static final int bO = 5;
   private static final alg bP = alg.b("evil");
   private static final int bQ = 8;
   private static final int bR = 40;
   private int bS;
   private int bT;
   private boolean bU;
   private int bV;
   int bW;

   public cjq(bwm<? extends cjq> $$0, div $$1) {
      super($$0, $$1);
      this.bA = new cjq.c(this);
      this.bz = new cjq.d(this);
      this.i(0.0);
   }

   @Override
   protected void D() {
      this.bC.a(1, new cds(this));
      this.bC.a(1, new cdn(this, this.dV()));
      this.bC.a(1, new cjq.e(this, 2.2));
      this.bC.a(2, new cdk(this, 0.8));
      this.bC.a(3, new cfg(this, 1.0, $$0 -> $$0.a(axk.aw), false));
      this.bC.a(4, new cjq.a<>(this, cqy.class, 8.0F, 2.2, 2.2));
      this.bC.a(4, new cjq.a<>(this, cka.class, 10.0F, 2.2, 2.2));
      this.bC.a(4, new cjq.a<>(this, cnz.class, 4.0F, 2.2, 2.2));
      this.bC.a(5, new cjq.f(this));
      this.bC.a(6, new cfl(this, 0.6));
      this.bC.a(11, new ceg(this, cqy.class, 10.0F));
   }

   @Override
   protected float fg() {
      float $$0 = 0.3F;
      if (this.bz.c() <= 0.6) {
         $$0 = 0.2F;
      }

      ewu $$1 = this.bB.i();
      if ($$1 != null && !$$1.c()) {
         fei $$2 = $$1.a(this);
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
            this.a(0.1F, new fei(0.0, 0.0, 1.0));
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
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bL, cjq.g.a.k);
   }

   @Override
   public void a(arq $$0) {
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

         if (this.gq() == cjq.g.g && this.bV == 0) {
            bxc $$1 = this.f();
            if ($$1 != null && this.g((bwd)$$1) < 16.0) {
               this.c($$1.dA(), $$1.dG());
               this.bz.a($$1.dA(), $$1.dC(), $$1.dG(), this.bz.c());
               this.q();
               this.bU = true;
            }
         }

         cjq.c $$2 = (cjq.c)this.bA;
         if (!$$2.c()) {
            if (this.bz.b() && this.bV == 0) {
               ewu $$3 = this.bB.i();
               fei $$4 = new fei(this.bz.d(), this.bz.e(), this.bz.f());
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
      this.w((float)(azm.d($$1 - this.dG(), $$0 - this.dA()) * 180.0F / (float)Math.PI) - 90.0F);
   }

   private void gr() {
      ((cjq.c)this.bA).a(true);
   }

   private void gs() {
      ((cjq.c)this.bA).a(false);
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

   public static byh.a t() {
      return cis.gv().a(byi.s, 3.0).a(byi.v, 0.3F).a(byi.c, 3.0);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("RabbitType", this.gq().k);
      $$0.a("MoreCarrotTicks", this.bW);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.a(cjq.g.a($$0.h("RabbitType")));
      this.bW = $$0.h("MoreCarrotTicks");
   }

   protected awm x() {
      return awn.vM;
   }

   @Override
   protected awm u() {
      return awn.vI;
   }

   @Override
   protected awm e(bus $$0) {
      return awn.vL;
   }

   @Override
   protected awm l_() {
      return awn.vK;
   }

   @Override
   public void gj() {
      if (this.gq() == cjq.g.g) {
         this.a(awn.vJ, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
      }
   }

   @Override
   public awo dm() {
      return this.gq() == cjq.g.g ? awo.f : awo.g;
   }

   @Nullable
   public cjq b(arq $$0, bvt $$1) {
      cjq $$2 = bwm.aY.a($$0, bwl.e);
      if ($$2 != null) {
         cjq.g $$3;
         $$3 = a($$0, this.dv());
         label16:
         if (this.ae.a(20) != 0) {
            if ($$1 instanceof cjq $$4 && this.ae.h()) {
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
   public boolean j(cyy $$0) {
      return $$0.a(axk.aw);
   }

   public cjq.g gq() {
      return cjq.g.a(this.al.a(bL));
   }

   private void a(cjq.g $$0) {
      if ($$0 == cjq.g.g) {
         this.g(byi.a).a(8.0);
         this.bC.a(4, new cei(this, 1.4, true));
         this.bD.a(1, new cfq(this).a());
         this.bD.a(2, new cfr<>(this, cqy.class, true));
         this.bD.a(2, new cfr<>(this, cka.class, true));
         this.g(byi.c).a(new byg(bP, 5.0, byg.a.a));
         if (!this.h_()) {
            this.b(wy.c(af.a("entity", bM)));
         }
      } else {
         this.g(byi.c).c(bP);
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
   public bxu a(djm $$0, btz $$1, bwl $$2, @Nullable bxu $$3) {
      cjq.g $$4 = a($$0, this.dv());
      if ($$3 instanceof cjq.b) {
         $$4 = ((cjq.b)$$3).a;
      } else {
         $$3 = new cjq.b($$4);
      }

      this.a($$4);
      return super.a($$0, $$1, $$2, $$3);
   }

   private static cjq.g a(diw $$0, iu $$1) {
      je<djy> $$2 = $$0.u($$1);
      int $$3 = $$0.C_().a(100);
      if ($$2.a(axb.an)) {
         return $$3 < 80 ? cjq.g.b : cjq.g.d;
      } else if ($$2.a(axb.am)) {
         return cjq.g.e;
      } else {
         return $$3 < 50 ? cjq.g.a : ($$3 < 90 ? cjq.g.f : cjq.g.c);
      }
   }

   public static boolean c(bwm<cjq> $$0, diw $$1, bwl $$2, iu $$3, azv $$4) {
      return $$1.a_($$3.e()).a(axc.cg) && a((dhy)$$1, $$3);
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
   public fei cT() {
      return new fei(0.0, (double)(0.6F * this.cS()), (double)(this.dq() * 0.4F));
   }

   static class a<T extends bxc> extends cdf<T> {
      private final cjq i;

      public a(cjq $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return this.i.gq() != cjq.g.g && super.b();
      }
   }

   public static class b extends bvt.a {
      public final cjq.g a;

      public b(cjq.g $$0) {
         super(1.0F);
         this.a = $$0;
      }
   }

   public static class c extends ccz {
      private final cjq b;
      private boolean c;

      public c(cjq $$0) {
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

   static class d extends cdb {
      private final cjq l;
      private double m;

      public d(cjq $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.aJ() && !this.l.bf && !((cjq.c)this.l.bA).c()) {
            this.l.i(0.0);
         } else if (this.b() || this.k == cdb.a.d) {
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

   static class e extends cer {
      private final cjq a;

      public e(cjq $$0, double $$1) {
         super($$0, $$1);
         this.a = $$0;
      }

      @Override
      public void a() {
         super.a();
         this.a.i(this.d);
      }
   }

   static class f extends cel {
      private final cjq g;
      private boolean h;
      private boolean i;

      public f(cjq $$0) {
         super($$0, 0.7F, 16);
         this.g = $$0;
      }

      @Override
      public boolean b() {
         if (this.c <= 0) {
            if (!a(this.g).O().c(dir.c)) {
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
            div $$0 = this.g.dV();
            iu $$1 = this.e.d();
            dzz $$2 = $$0.a_($$1);
            dma $$3 = $$2.b();
            if (this.i && $$3 instanceof dmt) {
               int $$4 = $$2.c(dmt.f);
               if ($$4 == 0) {
                  $$0.a($$1, dmc.a.m(), 2);
                  $$0.a($$1, true, this.g);
               } else {
                  $$0.a($$1, $$2.b(dmt.f, Integer.valueOf($$4 - 1)), 2);
                  $$0.a(eez.c, $$1, eez.a.a(this.g));
                  $$0.c(2001, $$1, dma.j($$2));
               }

               this.g.bW = 40;
            }

            this.i = false;
            this.c = 10;
         }
      }

      @Override
      protected boolean a(diy $$0, iu $$1) {
         dzz $$2 = $$0.a_($$1);
         if ($$2.a(dmc.cL) && this.h && !this.i) {
            $$2 = $$0.a_($$1.d());
            if ($$2.b() instanceof dmt && ((dmt)$$2.b()).i($$2)) {
               this.i = true;
               return true;
            }
         }

         return false;
      }
   }

   public static enum g implements bak {
      a(0, "brown"),
      b(1, "white"),
      c(2, "black"),
      d(3, "white_splotched"),
      e(4, "gold"),
      f(5, "salt"),
      g(99, "evil");

      private static final IntFunction<cjq.g> j = ayc.a(cjq.g::a, values(), a);
      public static final Codec<cjq.g> h = bak.a(cjq.g::values);
      public static final yw<ByteBuf, cjq.g> i = yu.a(j, cjq.g::a);
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

      public static cjq.g a(int $$0) {
         return j.apply($$0);
      }
   }
}
