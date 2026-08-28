import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cjc extends cig {
   public static final double bE = 0.6;
   public static final double bF = 0.8;
   public static final double bG = 1.0;
   public static final double bI = 2.2;
   public static final double bJ = 1.4;
   private static final akg<Integer> bK = akk.a(cjc.class, aki.b);
   private static final ald bL = ald.b("killer_bunny");
   private static final int bM = 3;
   private static final int bN = 5;
   private static final ald bO = ald.b("evil");
   private static final int bP = 8;
   private static final int bQ = 40;
   private int bR;
   private int bS;
   private boolean bT;
   private int bU;
   int bV;

   public cjc(bwb<? extends cjc> $$0, dhp $$1) {
      super($$0, $$1);
      this.bz = new cjc.c(this);
      this.by = new cjc.d(this);
      this.i(0.0);
   }

   @Override
   protected void D() {
      this.bB.a(1, new cdh(this));
      this.bB.a(1, new cdc(this, this.dV()));
      this.bB.a(1, new cjc.e(this, 2.2));
      this.bB.a(2, new ccz(this, 0.8));
      this.bB.a(3, new cev(this, 1.0, $$0 -> $$0.a(axi.aw), false));
      this.bB.a(4, new cjc.a<>(this, cqi.class, 8.0F, 2.2, 2.2));
      this.bB.a(4, new cjc.a<>(this, cjm.class, 10.0F, 2.2, 2.2));
      this.bB.a(4, new cjc.a<>(this, cnj.class, 4.0F, 2.2, 2.2));
      this.bB.a(5, new cjc.f(this));
      this.bB.a(6, new cfa(this, 0.6));
      this.bB.a(11, new cdv(this, cqi.class, 10.0F));
   }

   @Override
   protected float fg() {
      float $$0 = 0.3F;
      if (this.by.c() <= 0.6) {
         $$0 = 0.2F;
      }

      evh $$1 = this.bA.i();
      if ($$1 != null && !$$1.c()) {
         fcu $$2 = $$1.a(this);
         if ($$2.e > this.dC() + 0.5) {
            $$0 = 0.5F;
         }
      }

      if (this.P || this.be && this.by.e() > this.dC() + 0.5) {
         $$0 = 0.5F;
      }

      return super.A($$0 / 0.42F);
   }

   @Override
   public void s() {
      super.s();
      double $$0 = this.by.c();
      if ($$0 > 0.0) {
         double $$1 = this.dy().j();
         if ($$1 < 0.01) {
            this.a(0.1F, new fcu(0.0, 0.0, 1.0));
         }
      }

      if (!this.dV().C) {
         this.dV().a(this, (byte)1);
      }
   }

   public float K(float $$0) {
      return this.bS == 0 ? 0.0F : ((float)this.bR + $$0) / (float)this.bS;
   }

   public void i(double $$0) {
      this.O().a($$0);
      this.by.a(this.by.d(), this.by.e(), this.by.f(), $$0);
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
      this.bS = 10;
      this.bR = 0;
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(bK, cjc.g.a.k);
   }

   @Override
   public void a(arn $$0) {
      if (this.bU > 0) {
         this.bU--;
      }

      if (this.bV > 0) {
         this.bV = this.bV - this.ae.a(3);
         if (this.bV < 0) {
            this.bV = 0;
         }
      }

      if (this.aJ()) {
         if (!this.bT) {
            this.s(false);
            this.gu();
         }

         if (this.gq() == cjc.g.g && this.bU == 0) {
            bwr $$1 = this.f();
            if ($$1 != null && this.g((bvs)$$1) < 16.0) {
               this.c($$1.dA(), $$1.dG());
               this.by.a($$1.dA(), $$1.dC(), $$1.dG(), this.by.c());
               this.q();
               this.bT = true;
            }
         }

         cjc.c $$2 = (cjc.c)this.bz;
         if (!$$2.c()) {
            if (this.by.b() && this.bU == 0) {
               evh $$3 = this.bA.i();
               fcu $$4 = new fcu(this.by.d(), this.by.e(), this.by.f());
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

      this.bT = this.aJ();
   }

   @Override
   public boolean bu() {
      return false;
   }

   private void c(double $$0, double $$1) {
      this.w((float)(azk.d($$1 - this.dG(), $$0 - this.dA()) * 180.0F / (float)Math.PI) - 90.0F);
   }

   private void gr() {
      ((cjc.c)this.bz).a(true);
   }

   private void gs() {
      ((cjc.c)this.bz).a(false);
   }

   private void gt() {
      if (this.by.c() < 2.2) {
         this.bU = 10;
      } else {
         this.bU = 1;
      }
   }

   private void gu() {
      this.gt();
      this.gs();
   }

   @Override
   public void k_() {
      super.k_();
      if (this.bR != this.bS) {
         this.bR++;
      } else if (this.bS != 0) {
         this.bR = 0;
         this.bS = 0;
         this.s(false);
      }
   }

   public static bxw.a t() {
      return cig.gv().a(bxx.s, 3.0).a(bxx.v, 0.3F).a(bxx.c, 3.0);
   }

   @Override
   public void b(tw $$0) {
      super.b($$0);
      $$0.a("RabbitType", this.gq().k);
      $$0.a("MoreCarrotTicks", this.bV);
   }

   @Override
   public void a(tw $$0) {
      super.a($$0);
      this.a(cjc.g.a($$0.h("RabbitType")));
      this.bV = $$0.h("MoreCarrotTicks");
   }

   protected awj x() {
      return awk.vL;
   }

   @Override
   protected awj u() {
      return awk.vH;
   }

   @Override
   protected awj e(buh $$0) {
      return awk.vK;
   }

   @Override
   protected awj l_() {
      return awk.vJ;
   }

   @Override
   public void gj() {
      if (this.gq() == cjc.g.g) {
         this.a(awk.vI, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
      }
   }

   @Override
   public awl dm() {
      return this.gq() == cjc.g.g ? awl.f : awl.g;
   }

   @Nullable
   public cjc b(arn $$0, bvi $$1) {
      cjc $$2 = bwb.aX.a($$0, bwa.e);
      if ($$2 != null) {
         cjc.g $$3;
         $$3 = a($$0, this.dv());
         label16:
         if (this.ae.a(20) != 0) {
            if ($$1 instanceof cjc $$4 && this.ae.h()) {
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
   public boolean k(cxy $$0) {
      return $$0.a(axi.aw);
   }

   public cjc.g gq() {
      return cjc.g.a(this.al.a(bK));
   }

   private void a(cjc.g $$0) {
      if ($$0 == cjc.g.g) {
         this.g(bxx.a).a(8.0);
         this.bB.a(4, new cdx(this, 1.4, true));
         this.bC.a(1, new cff(this).a());
         this.bC.a(2, new cfg<>(this, cqi.class, true));
         this.bC.a(2, new cfg<>(this, cjm.class, true));
         this.g(bxx.c).a(new bxv(bO, 5.0, bxv.a.a));
         if (!this.h_()) {
            this.b(wv.c(af.a("entity", bL)));
         }
      } else {
         this.g(bxx.c).c(bO);
      }

      this.al.a(bK, $$0.k);
   }

   @Nullable
   @Override
   public <T> T a(kw<? extends T> $$0) {
      return $$0 == kx.aC ? b((kw<T>)$$0, this.gq()) : super.a($$0);
   }

   @Override
   protected void a(kr $$0) {
      this.a($$0, kx.aC);
      super.a($$0);
   }

   @Override
   protected <T> boolean d(kw<T> $$0, T $$1) {
      if ($$0 == kx.aC) {
         this.a(b(kx.aC, $$1));
         return true;
      } else {
         return super.d($$0, $$1);
      }
   }

   @Nullable
   @Override
   public bxj a(dig $$0, bto $$1, bwa $$2, @Nullable bxj $$3) {
      cjc.g $$4 = a($$0, this.dv());
      if ($$3 instanceof cjc.b) {
         $$4 = ((cjc.b)$$3).a;
      } else {
         $$3 = new cjc.b($$4);
      }

      this.a($$4);
      return super.a($$0, $$1, $$2, $$3);
   }

   private static cjc.g a(dhq $$0, jj $$1) {
      js<dis> $$2 = $$0.t($$1);
      int $$3 = $$0.C_().a(100);
      if ($$2.a(awy.an)) {
         return $$3 < 80 ? cjc.g.b : cjc.g.d;
      } else if ($$2.a(awy.am)) {
         return cjc.g.e;
      } else {
         return $$3 < 50 ? cjc.g.a : ($$3 < 90 ? cjc.g.f : cjc.g.c);
      }
   }

   public static boolean c(bwb<cjc> $$0, dhq $$1, bwa $$2, jj $$3, azs $$4) {
      return $$1.a_($$3.e()).a(awz.cg) && a((dgs)$$1, $$3);
   }

   boolean gC() {
      return this.bV <= 0;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 1) {
         this.bv();
         this.bS = 10;
         this.bR = 0;
      } else {
         super.b($$0);
      }
   }

   @Override
   public fcu cT() {
      return new fcu(0.0, (double)(0.6F * this.cS()), (double)(this.dq() * 0.4F));
   }

   static class a<T extends bwr> extends ccu<T> {
      private final cjc i;

      public a(cjc $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return this.i.gq() != cjc.g.g && super.b();
      }
   }

   public static class b extends bvi.a {
      public final cjc.g a;

      public b(cjc.g $$0) {
         super(1.0F);
         this.a = $$0;
      }
   }

   public static class c extends cco {
      private final cjc b;
      private boolean c;

      public c(cjc $$0) {
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

   static class d extends ccq {
      private final cjc l;
      private double m;

      public d(cjc $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.aJ() && !this.l.be && !((cjc.c)this.l.bz).c()) {
            this.l.i(0.0);
         } else if (this.b() || this.k == ccq.a.d) {
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

   static class e extends ceg {
      private final cjc a;

      public e(cjc $$0, double $$1) {
         super($$0, $$1);
         this.a = $$0;
      }

      @Override
      public void a() {
         super.a();
         this.a.i(this.d);
      }
   }

   static class f extends cea {
      private final cjc g;
      private boolean h;
      private boolean i;

      public f(cjc $$0) {
         super($$0, 0.7F, 16);
         this.g = $$0;
      }

      @Override
      public boolean b() {
         if (this.c <= 0) {
            if (!a(this.g).O().c(dhl.c)) {
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
            dhp $$0 = this.g.dV();
            jj $$1 = this.e.d();
            dym $$2 = $$0.a_($$1);
            dku $$3 = $$2.b();
            if (this.i && $$3 instanceof dln) {
               int $$4 = $$2.c(dln.f);
               if ($$4 == 0) {
                  $$0.a($$1, dkw.a.m(), 2);
                  $$0.a($$1, true, this.g);
               } else {
                  $$0.a($$1, $$2.b(dln.f, Integer.valueOf($$4 - 1)), 2);
                  $$0.a(edm.c, $$1, edm.a.a(this.g));
                  $$0.c(2001, $$1, dku.j($$2));
               }

               this.g.bV = 40;
            }

            this.i = false;
            this.c = 10;
         }
      }

      @Override
      protected boolean a(dhs $$0, jj $$1) {
         dym $$2 = $$0.a_($$1);
         if ($$2.a(dkw.cK) && this.h && !this.i) {
            $$2 = $$0.a_($$1.d());
            if ($$2.b() instanceof dln && ((dln)$$2.b()).i($$2)) {
               this.i = true;
               return true;
            }
         }

         return false;
      }
   }

   public static enum g implements bag {
      a(0, "brown"),
      b(1, "white"),
      c(2, "black"),
      d(3, "white_splotched"),
      e(4, "gold"),
      f(5, "salt"),
      g(99, "evil");

      private static final IntFunction<cjc.g> j = aya.a(cjc.g::a, values(), a);
      public static final Codec<cjc.g> h = bag.a(cjc.g::values);
      public static final yt<ByteBuf, cjc.g> i = yr.a(j, cjc.g::a);
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

      public static cjc.g a(int $$0) {
         return j.apply($$0);
      }
   }
}
