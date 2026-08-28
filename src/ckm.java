import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class ckm extends cjm {
   public static final double bI = 0.6;
   public static final double bJ = 0.8;
   public static final double bK = 1.0;
   public static final double bM = 2.2;
   public static final double bN = 1.4;
   private static final akn<Integer> bO = akr.a(ckm.class, akp.b);
   private static final int bP = 0;
   private static final alk bQ = alk.b("killer_bunny");
   private static final int bR = 3;
   private static final int bS = 5;
   private static final alk bT = alk.b("evil");
   private static final int bU = 8;
   private static final int bV = 40;
   private int bW;
   private int bX;
   private boolean bY;
   private int bZ;
   int ca = 0;

   public ckm(bxe<? extends ckm> $$0, djz $$1) {
      super($$0, $$1);
      this.bD = new ckm.c(this);
      this.bC = new ckm.d(this);
      this.i(0.0);
   }

   @Override
   protected void D() {
      this.bF.a(1, new cem(this));
      this.bF.a(1, new ceh(this, this.dV()));
      this.bF.a(1, new ckm.e(this, 2.2));
      this.bF.a(2, new cee(this, 0.8));
      this.bF.a(3, new cga(this, 1.0, $$0 -> $$0.a(axo.ay), false));
      this.bF.a(4, new ckm.a<>(this, crz.class, 8.0F, 2.2, 2.2));
      this.bF.a(4, new ckm.a<>(this, cmo.class, 10.0F, 2.2, 2.2));
      this.bF.a(4, new ckm.a<>(this, cpb.class, 4.0F, 2.2, 2.2));
      this.bF.a(5, new ckm.f(this));
      this.bF.a(6, new cgf(this, 0.6));
      this.bF.a(11, new cfa(this, crz.class, 10.0F));
   }

   @Override
   protected float fh() {
      float $$0 = 0.3F;
      if (this.bC.c() <= 0.6) {
         $$0 = 0.2F;
      }

      eye $$1 = this.bE.i();
      if ($$1 != null && !$$1.c()) {
         ffs $$2 = $$1.a(this);
         if ($$2.e > this.dC() + 0.5) {
            $$0 = 0.5F;
         }
      }

      if (this.P || this.bf && this.bC.e() > this.dC() + 0.5) {
         $$0 = 0.5F;
      }

      return super.z($$0 / 0.42F);
   }

   @Override
   public void s() {
      super.s();
      double $$0 = this.bC.c();
      if ($$0 > 0.0) {
         double $$1 = this.dy().j();
         if ($$1 < 0.01) {
            this.a(0.1F, new ffs(0.0, 0.0, 1.0));
         }
      }

      if (!this.dV().C) {
         this.dV().a(this, (byte)1);
      }
   }

   public float J(float $$0) {
      return this.bX == 0 ? 0.0F : ((float)this.bW + $$0) / (float)this.bX;
   }

   public void i(double $$0) {
      this.O().a($$0);
      this.bC.a(this.bC.d(), this.bC.e(), this.bC.f(), $$0);
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
      this.bX = 10;
      this.bW = 0;
   }

   @Override
   protected void a(akr.a $$0) {
      super.a($$0);
      $$0.a(bO, ckm.g.h.m);
   }

   @Override
   public void a(aru $$0) {
      if (this.bZ > 0) {
         this.bZ--;
      }

      if (this.ca > 0) {
         this.ca = this.ca - this.ae.a(3);
         if (this.ca < 0) {
            this.ca = 0;
         }
      }

      if (this.aH()) {
         if (!this.bY) {
            this.s(false);
            this.gy();
         }

         if (this.gu() == ckm.g.g && this.bZ == 0) {
            bxw $$1 = this.f();
            if ($$1 != null && this.g((bwv)$$1) < 16.0) {
               this.c($$1.dA(), $$1.dG());
               this.bC.a($$1.dA(), $$1.dC(), $$1.dG(), this.bC.c());
               this.q();
               this.bY = true;
            }
         }

         ckm.c $$2 = (ckm.c)this.bD;
         if (!$$2.c()) {
            if (this.bC.b() && this.bZ == 0) {
               eye $$3 = this.bE.i();
               ffs $$4 = new ffs(this.bC.d(), this.bC.e(), this.bC.f());
               if ($$3 != null && !$$3.c()) {
                  $$4 = $$3.a(this);
               }

               this.c($$4.d, $$4.f);
               this.q();
            }
         } else if (!$$2.d()) {
            this.gv();
         }
      }

      this.bY = this.aH();
   }

   @Override
   public boolean bt() {
      return false;
   }

   private void c(double $$0, double $$1) {
      this.w((float)(azq.d($$1 - this.dG(), $$0 - this.dA()) * 180.0F / (float)Math.PI) - 90.0F);
   }

   private void gv() {
      ((ckm.c)this.bD).a(true);
   }

   private void gw() {
      ((ckm.c)this.bD).a(false);
   }

   private void gx() {
      if (this.bC.c() < 2.2) {
         this.bZ = 10;
      } else {
         this.bZ = 1;
      }
   }

   private void gy() {
      this.gx();
      this.gw();
   }

   @Override
   public void k_() {
      super.k_();
      if (this.bW != this.bX) {
         this.bW++;
      } else if (this.bX != 0) {
         this.bW = 0;
         this.bX = 0;
         this.s(false);
      }
   }

   public static bzb.a t() {
      return cjm.gz().a(bzc.s, 3.0).a(bzc.v, 0.3F).a(bzc.c, 3.0);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("RabbitType", ckm.g.j, this.gu());
      $$0.a("MoreCarrotTicks", this.ca);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.a($$0.<ckm.g>a("RabbitType", ckm.g.j).orElse(ckm.g.h));
      this.ca = $$0.b("MoreCarrotTicks", 0);
   }

   protected awq x() {
      return awr.vP;
   }

   @Override
   protected awq u() {
      return awr.vL;
   }

   @Override
   protected awq e(bvk $$0) {
      return awr.vO;
   }

   @Override
   protected awq l_() {
      return awr.vN;
   }

   @Override
   public void gn() {
      if (this.gu() == ckm.g.g) {
         this.a(awr.vM, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
      }
   }

   @Override
   public aws dm() {
      return this.gu() == ckm.g.g ? aws.f : aws.g;
   }

   @Nullable
   public ckm b(aru $$0, bwl $$1) {
      ckm $$2 = bxe.aZ.a($$0, bxd.e);
      if ($$2 != null) {
         ckm.g $$3;
         $$3 = a($$0, this.dv());
         label16:
         if (this.ae.a(20) != 0) {
            if ($$1 instanceof ckm $$4 && this.ae.h()) {
               $$3 = $$4.gu();
               break label16;
            }

            $$3 = this.gu();
         }

         $$2.a($$3);
      }

      return $$2;
   }

   @Override
   public boolean i(daa $$0) {
      return $$0.a(axo.ay);
   }

   public ckm.g gu() {
      return ckm.g.a(this.al.a(bO));
   }

   private void a(ckm.g $$0) {
      if ($$0 == ckm.g.g) {
         this.g(bzc.a).a(8.0);
         this.bF.a(4, new cfc(this, 1.4, true));
         this.bG.a(1, new cgk(this).a());
         this.bG.a(2, new cgl<>(this, crz.class, true));
         this.bG.a(2, new cgl<>(this, cmo.class, true));
         this.g(bzc.c).a(new bza(bT, 5.0, bza.a.a));
         if (!this.h_()) {
            this.b(xc.c(ag.a("entity", bQ)));
         }
      } else {
         this.g(bzc.c).c(bT);
      }

      this.al.a(bO, $$0.m);
   }

   @Nullable
   @Override
   public <T> T a(kk<? extends T> $$0) {
      return $$0 == kl.aG ? c((kk<T>)$$0, this.gu()) : super.a($$0);
   }

   @Override
   protected void a(kg $$0) {
      this.a($$0, kl.aG);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kk<T> $$0, T $$1) {
      if ($$0 == kl.aG) {
         this.a(c(kl.aG, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Nullable
   @Override
   public byo a(dkq $$0, bur $$1, bxd $$2, @Nullable byo $$3) {
      ckm.g $$4 = a($$0, this.dv());
      if ($$3 instanceof ckm.b) {
         $$4 = ((ckm.b)$$3).a;
      } else {
         $$3 = new ckm.b($$4);
      }

      this.a($$4);
      return super.a($$0, $$1, $$2, $$3);
   }

   private static ckm.g a(dka $$0, iw $$1) {
      jg<dlc> $$2 = $$0.u($$1);
      int $$3 = $$0.G_().a(100);
      if ($$2.a(axf.an)) {
         return $$3 < 80 ? ckm.g.b : ckm.g.d;
      } else if ($$2.a(axf.am)) {
         return ckm.g.e;
      } else {
         return $$3 < 50 ? ckm.g.a : ($$3 < 90 ? ckm.g.f : ckm.g.c);
      }
   }

   public static boolean c(bxe<ckm> $$0, dka $$1, bxd $$2, iw $$3, azz $$4) {
      return $$1.a_($$3.e()).a(axg.ch) && a((dja)$$1, $$3);
   }

   boolean gG() {
      return this.ca <= 0;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 1) {
         this.bu();
         this.bX = 10;
         this.bW = 0;
      } else {
         super.b($$0);
      }
   }

   @Override
   public ffs cT() {
      return new ffs(0.0, (double)(0.6F * this.cS()), (double)(this.dq() * 0.4F));
   }

   static class a<T extends bxw> extends cdz<T> {
      private final ckm i;

      public a(ckm $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return this.i.gu() != ckm.g.g && super.b();
      }
   }

   public static class b extends bwl.a {
      public final ckm.g a;

      public b(ckm.g $$0) {
         super(1.0F);
         this.a = $$0;
      }
   }

   public static class c extends cdt {
      private final ckm b;
      private boolean c;

      public c(ckm $$0) {
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

   static class d extends cdv {
      private final ckm l;
      private double m;

      public d(ckm $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.aH() && !this.l.bf && !((ckm.c)this.l.bD).c()) {
            this.l.i(0.0);
         } else if (this.b() || this.k == cdv.a.d) {
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

   static class e extends cfl {
      private final ckm a;

      public e(ckm $$0, double $$1) {
         super($$0, $$1);
         this.a = $$0;
      }

      @Override
      public void a() {
         super.a();
         this.a.i(this.d);
      }
   }

   static class f extends cff {
      private final ckm g;
      private boolean h;
      private boolean i;

      public f(ckm $$0) {
         super($$0, 0.7F, 16);
         this.g = $$0;
      }

      @Override
      public boolean b() {
         if (this.c <= 0) {
            if (!a(this.g).O().c(djv.d)) {
               return false;
            }

            this.i = false;
            this.h = this.g.gG();
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
         this.g.J().a((double)this.e.u() + 0.5, (double)(this.e.v() + 1), (double)this.e.w() + 0.5, 10.0F, (float)this.g.ad());
         if (this.m()) {
            djz $$0 = this.g.dV();
            iw $$1 = this.e.d();
            ebg $$2 = $$0.a_($$1);
            dne $$3 = $$2.b();
            if (this.i && $$3 instanceof dny) {
               int $$4 = $$2.c(dny.f);
               if ($$4 == 0) {
                  $$0.a($$1, dng.a.m(), 2);
                  $$0.a($$1, true, this.g);
               } else {
                  $$0.a($$1, $$2.b(dny.f, Integer.valueOf($$4 - 1)), 2);
                  $$0.a(egg.c, $$1, egg.a.a(this.g));
                  $$0.c(2001, $$1, dne.j($$2));
               }

               this.g.ca = 40;
            }

            this.i = false;
            this.c = 10;
         }
      }

      @Override
      protected boolean a(dkc $$0, iw $$1) {
         ebg $$2 = $$0.a_($$1);
         if ($$2.a(dng.cN) && this.h && !this.i) {
            $$2 = $$0.a_($$1.d());
            if ($$2.b() instanceof dny && ((dny)$$2.b()).i($$2)) {
               this.i = true;
               return true;
            }
         }

         return false;
      }
   }

   public static enum g implements bao {
      a(0, "brown"),
      b(1, "white"),
      c(2, "black"),
      d(3, "white_splotched"),
      e(4, "gold"),
      f(5, "salt"),
      g(99, "evil");

      public static final ckm.g h = a;
      private static final IntFunction<ckm.g> l = ayg.a(ckm.g::a, values(), h);
      public static final Codec<ckm.g> i = bao.a(ckm.g::values);
      @Deprecated
      public static final Codec<ckm.g> j = Codec.INT.xmap(l::apply, ckm.g::a);
      public static final za<ByteBuf, ckm.g> k = yy.a(l, ckm.g::a);
      final int m;
      private final String n;

      private g(final int $$0, final String $$1) {
         this.m = $$0;
         this.n = $$1;
      }

      @Override
      public String c() {
         return this.n;
      }

      public int a() {
         return this.m;
      }

      public static ckm.g a(int $$0) {
         return l.apply($$0);
      }
   }
}
