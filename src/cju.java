import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cju extends ciu {
   public static final double bG = 0.6;
   public static final double bH = 0.8;
   public static final double bI = 1.0;
   public static final double bK = 2.2;
   public static final double bL = 1.4;
   private static final akj<Integer> bM = akn.a(cju.class, akl.b);
   private static final alg bN = alg.b("killer_bunny");
   private static final int bO = 3;
   private static final int bP = 5;
   private static final alg bQ = alg.b("evil");
   private static final int bR = 8;
   private static final int bS = 40;
   private int bT;
   private int bU;
   private boolean bV;
   private int bW;
   int bX;

   public cju(bwo<? extends cju> $$0, dja $$1) {
      super($$0, $$1);
      this.bB = new cju.c(this);
      this.bA = new cju.d(this);
      this.i(0.0);
   }

   @Override
   protected void D() {
      this.bD.a(1, new cdu(this));
      this.bD.a(1, new cdp(this, this.dV()));
      this.bD.a(1, new cju.e(this, 2.2));
      this.bD.a(2, new cdm(this, 0.8));
      this.bD.a(3, new cfi(this, 1.0, $$0 -> $$0.a(axk.ax), false));
      this.bD.a(4, new cju.a<>(this, crc.class, 8.0F, 2.2, 2.2));
      this.bD.a(4, new cju.a<>(this, cke.class, 10.0F, 2.2, 2.2));
      this.bD.a(4, new cju.a<>(this, cod.class, 4.0F, 2.2, 2.2));
      this.bD.a(5, new cju.f(this));
      this.bD.a(6, new cfn(this, 0.6));
      this.bD.a(11, new cei(this, crc.class, 10.0F));
   }

   @Override
   protected float fh() {
      float $$0 = 0.3F;
      if (this.bA.c() <= 0.6) {
         $$0 = 0.2F;
      }

      exc $$1 = this.bC.i();
      if ($$1 != null && !$$1.c()) {
         feq $$2 = $$1.a(this);
         if ($$2.e > this.dC() + 0.5) {
            $$0 = 0.5F;
         }
      }

      if (this.P || this.bf && this.bA.e() > this.dC() + 0.5) {
         $$0 = 0.5F;
      }

      return super.z($$0 / 0.42F);
   }

   @Override
   public void s() {
      super.s();
      double $$0 = this.bA.c();
      if ($$0 > 0.0) {
         double $$1 = this.dy().j();
         if ($$1 < 0.01) {
            this.a(0.1F, new feq(0.0, 0.0, 1.0));
         }
      }

      if (!this.dV().C) {
         this.dV().a(this, (byte)1);
      }
   }

   public float J(float $$0) {
      return this.bU == 0 ? 0.0F : ((float)this.bT + $$0) / (float)this.bU;
   }

   public void i(double $$0) {
      this.O().a($$0);
      this.bA.a(this.bA.d(), this.bA.e(), this.bA.f(), $$0);
   }

   @Override
   public void s(boolean $$0) {
      super.s($$0);
      if ($$0) {
         this.a(this.x(), this.fe(), ((this.ae.i() - this.ae.i()) * 0.2F + 1.0F) * 0.8F);
      }
   }

   @Override
   public void q() {
      this.s(true);
      this.bU = 10;
      this.bT = 0;
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bM, cju.g.a.k);
   }

   @Override
   public void a(arq $$0) {
      if (this.bW > 0) {
         this.bW--;
      }

      if (this.bX > 0) {
         this.bX = this.bX - this.ae.a(3);
         if (this.bX < 0) {
            this.bX = 0;
         }
      }

      if (this.aJ()) {
         if (!this.bV) {
            this.s(false);
            this.gv();
         }

         if (this.gr() == cju.g.g && this.bW == 0) {
            bxe $$1 = this.f();
            if ($$1 != null && this.g((bwf)$$1) < 16.0) {
               this.c($$1.dA(), $$1.dG());
               this.bA.a($$1.dA(), $$1.dC(), $$1.dG(), this.bA.c());
               this.q();
               this.bV = true;
            }
         }

         cju.c $$2 = (cju.c)this.bB;
         if (!$$2.c()) {
            if (this.bA.b() && this.bW == 0) {
               exc $$3 = this.bC.i();
               feq $$4 = new feq(this.bA.d(), this.bA.e(), this.bA.f());
               if ($$3 != null && !$$3.c()) {
                  $$4 = $$3.a(this);
               }

               this.c($$4.d, $$4.f);
               this.q();
            }
         } else if (!$$2.d()) {
            this.gs();
         }
      }

      this.bV = this.aJ();
   }

   @Override
   public boolean bu() {
      return false;
   }

   private void c(double $$0, double $$1) {
      this.w((float)(azm.d($$1 - this.dG(), $$0 - this.dA()) * 180.0F / (float)Math.PI) - 90.0F);
   }

   private void gs() {
      ((cju.c)this.bB).a(true);
   }

   private void gt() {
      ((cju.c)this.bB).a(false);
   }

   private void gu() {
      if (this.bA.c() < 2.2) {
         this.bW = 10;
      } else {
         this.bW = 1;
      }
   }

   private void gv() {
      this.gu();
      this.gt();
   }

   @Override
   public void k_() {
      super.k_();
      if (this.bT != this.bU) {
         this.bT++;
      } else if (this.bU != 0) {
         this.bT = 0;
         this.bU = 0;
         this.s(false);
      }
   }

   public static byj.a t() {
      return ciu.gw().a(byk.s, 3.0).a(byk.v, 0.3F).a(byk.c, 3.0);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("RabbitType", this.gr().k);
      $$0.a("MoreCarrotTicks", this.bX);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.a(cju.g.a($$0.h("RabbitType")));
      this.bX = $$0.h("MoreCarrotTicks");
   }

   protected awm x() {
      return awn.vP;
   }

   @Override
   protected awm u() {
      return awn.vL;
   }

   @Override
   protected awm e(buu $$0) {
      return awn.vO;
   }

   @Override
   protected awm l_() {
      return awn.vN;
   }

   @Override
   public void gk() {
      if (this.gr() == cju.g.g) {
         this.a(awn.vM, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
      }
   }

   @Override
   public awo dm() {
      return this.gr() == cju.g.g ? awo.f : awo.g;
   }

   @Nullable
   public cju b(arq $$0, bvv $$1) {
      cju $$2 = bwo.aY.a($$0, bwn.e);
      if ($$2 != null) {
         cju.g $$3;
         $$3 = a($$0, this.dv());
         label16:
         if (this.ae.a(20) != 0) {
            if ($$1 instanceof cju $$4 && this.ae.h()) {
               $$3 = $$4.gr();
               break label16;
            }

            $$3 = this.gr();
         }

         $$2.a($$3);
      }

      return $$2;
   }

   @Override
   public boolean i(czd $$0) {
      return $$0.a(axk.ax);
   }

   public cju.g gr() {
      return cju.g.a(this.al.a(bM));
   }

   private void a(cju.g $$0) {
      if ($$0 == cju.g.g) {
         this.g(byk.a).a(8.0);
         this.bD.a(4, new cek(this, 1.4, true));
         this.bE.a(1, new cfs(this).a());
         this.bE.a(2, new cft<>(this, crc.class, true));
         this.bE.a(2, new cft<>(this, cke.class, true));
         this.g(byk.c).a(new byi(bQ, 5.0, byi.a.a));
         if (!this.h_()) {
            this.b(wy.c(af.a("entity", bN)));
         }
      } else {
         this.g(byk.c).c(bQ);
      }

      this.al.a(bM, $$0.k);
   }

   @Nullable
   @Override
   public <T> T a(ki<? extends T> $$0) {
      return $$0 == kj.aF ? c((ki<T>)$$0, this.gr()) : super.a($$0);
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
   public bxw a(djr $$0, bub $$1, bwn $$2, @Nullable bxw $$3) {
      cju.g $$4 = a($$0, this.dv());
      if ($$3 instanceof cju.b) {
         $$4 = ((cju.b)$$3).a;
      } else {
         $$3 = new cju.b($$4);
      }

      this.a($$4);
      return super.a($$0, $$1, $$2, $$3);
   }

   private static cju.g a(djb $$0, iu $$1) {
      je<dkd> $$2 = $$0.u($$1);
      int $$3 = $$0.C_().a(100);
      if ($$2.a(axb.an)) {
         return $$3 < 80 ? cju.g.b : cju.g.d;
      } else if ($$2.a(axb.am)) {
         return cju.g.e;
      } else {
         return $$3 < 50 ? cju.g.a : ($$3 < 90 ? cju.g.f : cju.g.c);
      }
   }

   public static boolean c(bwo<cju> $$0, djb $$1, bwn $$2, iu $$3, azv $$4) {
      return $$1.a_($$3.e()).a(axc.ch) && a((did)$$1, $$3);
   }

   boolean gD() {
      return this.bX <= 0;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 1) {
         this.bv();
         this.bU = 10;
         this.bT = 0;
      } else {
         super.b($$0);
      }
   }

   @Override
   public feq cT() {
      return new feq(0.0, (double)(0.6F * this.cS()), (double)(this.dq() * 0.4F));
   }

   static class a<T extends bxe> extends cdh<T> {
      private final cju i;

      public a(cju $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return this.i.gr() != cju.g.g && super.b();
      }
   }

   public static class b extends bvv.a {
      public final cju.g a;

      public b(cju.g $$0) {
         super(1.0F);
         this.a = $$0;
      }
   }

   public static class c extends cdb {
      private final cju b;
      private boolean c;

      public c(cju $$0) {
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

   static class d extends cdd {
      private final cju l;
      private double m;

      public d(cju $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.aJ() && !this.l.bf && !((cju.c)this.l.bB).c()) {
            this.l.i(0.0);
         } else if (this.b() || this.k == cdd.a.d) {
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

   static class e extends cet {
      private final cju a;

      public e(cju $$0, double $$1) {
         super($$0, $$1);
         this.a = $$0;
      }

      @Override
      public void a() {
         super.a();
         this.a.i(this.d);
      }
   }

   static class f extends cen {
      private final cju g;
      private boolean h;
      private boolean i;

      public f(cju $$0) {
         super($$0, 0.7F, 16);
         this.g = $$0;
      }

      @Override
      public boolean b() {
         if (this.c <= 0) {
            if (!a(this.g).O().c(diw.d)) {
               return false;
            }

            this.i = false;
            this.h = this.g.gD();
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
            dja $$0 = this.g.dV();
            iu $$1 = this.e.d();
            eah $$2 = $$0.a_($$1);
            dmf $$3 = $$2.b();
            if (this.i && $$3 instanceof dmz) {
               int $$4 = $$2.c(dmz.f);
               if ($$4 == 0) {
                  $$0.a($$1, dmh.a.m(), 2);
                  $$0.a($$1, true, this.g);
               } else {
                  $$0.a($$1, $$2.b(dmz.f, Integer.valueOf($$4 - 1)), 2);
                  $$0.a(efh.c, $$1, efh.a.a(this.g));
                  $$0.c(2001, $$1, dmf.j($$2));
               }

               this.g.bX = 40;
            }

            this.i = false;
            this.c = 10;
         }
      }

      @Override
      protected boolean a(djd $$0, iu $$1) {
         eah $$2 = $$0.a_($$1);
         if ($$2.a(dmh.cN) && this.h && !this.i) {
            $$2 = $$0.a_($$1.d());
            if ($$2.b() instanceof dmz && ((dmz)$$2.b()).i($$2)) {
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

      private static final IntFunction<cju.g> j = ayc.a(cju.g::a, values(), a);
      public static final Codec<cju.g> h = bak.a(cju.g::values);
      public static final yw<ByteBuf, cju.g> i = yu.a(j, cju.g::a);
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

      public static cju.g a(int $$0) {
         return j.apply($$0);
      }
   }
}
