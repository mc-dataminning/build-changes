import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;

public abstract class cbs extends cce {
   private static final double f = 2.0;
   private static final adz<Byte> g = aec.a(cbs.class, aeb.a);
   private static final adz<Byte> h = aec.a(cbs.class, aeb.a);
   private static final int i = 1;
   private static final int j = 2;
   private static final int k = 4;
   @Nullable
   private dez l;
   protected boolean b;
   protected int c;
   public cbs.a d = cbs.a.a;
   public int e;
   private int m;
   private double n = 2.0;
   private int o;
   private aov p = this.m();
   @Nullable
   private IntOpenHashSet q;
   @Nullable
   private List<bii> r;

   protected cbs(bim<? extends cbs> $$0, cpl $$1) {
      super($$0, $$1);
   }

   protected cbs(bim<? extends cbs> $$0, double $$1, double $$2, double $$3, cpl $$4) {
      this($$0, $$4);
      this.e($$1, $$2, $$3);
   }

   protected cbs(bim<? extends cbs> $$0, biy $$1, cpl $$2) {
      this($$0, $$1.dp(), $$1.dt() - 0.1F, $$1.dv(), $$2);
      this.b($$1);
      if ($$1 instanceof cbm) {
         this.d = cbs.a.b;
      }
   }

   public void b(aov $$0) {
      this.p = $$0;
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cG().a() * 10.0;
      if (Double.isNaN($$1)) {
         $$1 = 1.0;
      }

      $$1 *= 64.0 * cz();
      return $$0 < $$1 * $$1;
   }

   @Override
   protected void a_() {
      this.an.a(g, (byte)0);
      this.an.a(h, (byte)0);
   }

   @Override
   public void c(double $$0, double $$1, double $$2, float $$3, float $$4) {
      super.c($$0, $$1, $$2, $$3, $$4);
      this.m = 0;
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      this.e($$0, $$1, $$2);
      this.a($$3, $$4);
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      super.l($$0, $$1, $$2);
      this.m = 0;
   }

   @Override
   public void l() {
      super.l();
      boolean $$0 = this.y();
      ehd $$1 = this.dn();
      if (this.O == 0.0F && this.N == 0.0F) {
         double $$2 = $$1.h();
         this.r((float)(arp.d($$1.c, $$1.e) * 180.0F / (float)Math.PI));
         this.s((float)(arp.d($$1.d, $$2) * 180.0F / (float)Math.PI));
         this.N = this.dA();
         this.O = this.dC();
      }

      gu $$3 = this.dk();
      dez $$4 = this.dK().a_($$3);
      if (!$$4.i() && !$$0) {
         ehw $$5 = $$4.k(this.dK(), $$3);
         if (!$$5.c()) {
            ehd $$6 = this.di();

            for (egy $$7 : $$5.e()) {
               if ($$7.a($$3).d($$6)) {
                  this.b = true;
                  break;
               }
            }
         }
      }

      if (this.e > 0) {
         this.e--;
      }

      if (this.aY() || $$4.a(csm.qC)) {
         this.ay();
      }

      if (this.b && !$$0) {
         if (this.l != $$4 && this.z()) {
            this.D();
         } else if (!this.dK().B) {
            this.j();
         }

         this.c++;
      } else {
         this.c = 0;
         ehd $$8 = this.di();
         ehd $$9 = $$8.e($$1);
         ehb $$10 = this.dK().a(new cou($$8, $$9, cou.a.a, cou.b.a, this));
         if ($$10.c() != ehb.a.a) {
            $$9 = $$10.e();
         }

         while (!this.dF()) {
            eha $$11 = this.a($$8, $$9);
            if ($$11 != null) {
               $$10 = $$11;
            }

            if ($$10 != null && $$10.c() == ehb.a.c) {
               bii $$12 = ((eha)$$10).a();
               bii $$13 = this.v();
               if ($$12 instanceof cbm && $$13 instanceof cbm && !((cbm)$$13).a((cbm)$$12)) {
                  $$10 = null;
                  $$11 = null;
               }
            }

            if ($$10 != null && !$$0) {
               this.a($$10);
               this.au = true;
            }

            if ($$11 == null || this.w() <= 0) {
               break;
            }

            $$10 = null;
         }

         $$1 = this.dn();
         double $$14 = $$1.c;
         double $$15 = $$1.d;
         double $$16 = $$1.e;
         if (this.s()) {
            for (int $$17 = 0; $$17 < 4; $$17++) {
               this.dK()
                  .a(
                     iv.g,
                     this.dp() + $$14 * (double)$$17 / 4.0,
                     this.dr() + $$15 * (double)$$17 / 4.0,
                     this.dv() + $$16 * (double)$$17 / 4.0,
                     -$$14,
                     -$$15 + 0.2,
                     -$$16
                  );
            }
         }

         double $$18 = this.dp() + $$14;
         double $$19 = this.dr() + $$15;
         double $$20 = this.dv() + $$16;
         double $$21 = $$1.h();
         if ($$0) {
            this.r((float)(arp.d(-$$14, -$$16) * 180.0F / (float)Math.PI));
         } else {
            this.r((float)(arp.d($$14, $$16) * 180.0F / (float)Math.PI));
         }

         this.s((float)(arp.d($$15, $$21) * 180.0F / (float)Math.PI));
         this.s(d(this.O, this.dC()));
         this.r(d(this.N, this.dA()));
         float $$22 = 0.99F;
         float $$23 = 0.05F;
         if (this.aX()) {
            for (int $$24 = 0; $$24 < 4; $$24++) {
               float $$25 = 0.25F;
               this.dK().a(iv.e, $$18 - $$14 * 0.25, $$19 - $$15 * 0.25, $$20 - $$16 * 0.25, $$14, $$15, $$16);
            }

            $$22 = this.x();
         }

         this.f($$1.a((double)$$22));
         if (!this.aT() && !$$0) {
            ehd $$26 = this.dn();
            this.o($$26.c, $$26.d - 0.05F, $$26.e);
         }

         this.e($$18, $$19, $$20);
         this.aO();
      }
   }

   private boolean z() {
      return this.b && this.dK().b(new egy(this.di(), this.di()).g(0.06));
   }

   private void D() {
      this.b = false;
      ehd $$0 = this.dn();
      this.f($$0.d((double)(this.ag.i() * 0.2F), (double)(this.ag.i() * 0.2F), (double)(this.ag.i() * 0.2F)));
      this.m = 0;
   }

   @Override
   public void a(bje $$0, ehd $$1) {
      super.a($$0, $$1);
      if ($$0 != bje.a && this.z()) {
         this.D();
      }
   }

   protected void j() {
      this.m++;
      if (this.m >= 1200) {
         this.ak();
      }
   }

   private void E() {
      if (this.r != null) {
         this.r.clear();
      }

      if (this.q != null) {
         this.q.clear();
      }
   }

   @Override
   protected void a(eha $$0) {
      super.a($$0);
      bii $$1 = $$0.a();
      float $$2 = (float)this.dn().f();
      int $$3 = arp.c(arp.a((double)$$2 * this.n, 0.0, 2.147483647E9));
      if (this.w() > 0) {
         if (this.q == null) {
            this.q = new IntOpenHashSet(5);
         }

         if (this.r == null) {
            this.r = Lists.newArrayListWithCapacity(5);
         }

         if (this.q.size() >= this.w() + 1) {
            this.ak();
            return;
         }

         this.q.add($$1.ah());
      }

      if (this.s()) {
         long $$4 = (long)this.ag.a($$3 / 2 + 2);
         $$3 = (int)Math.min($$4 + (long)$$3, 2147483647L);
      }

      bii $$5 = this.v();
      bhg $$6;
      if ($$5 == null) {
         $$6 = this.dL().a(this, this);
      } else {
         $$6 = this.dL().a(this, $$5);
         if ($$5 instanceof biy) {
            ((biy)$$5).A($$1);
         }
      }

      boolean $$8 = $$1.ag() == bim.E;
      int $$9 = $$1.ax();
      if (this.bM() && !$$8) {
         $$1.g(5);
      }

      if ($$1.a($$6, (float)$$3)) {
         if ($$8) {
            return;
         }

         if ($$1 instanceof biy $$10) {
            if (!this.dK().B && this.w() <= 0) {
               $$10.p($$10.eM() + 1);
            }

            if (this.o > 0) {
               double $$11 = Math.max(0.0, 1.0 - $$10.b(bke.c));
               ehd $$12 = this.dn().d(1.0, 0.0, 1.0).d().a((double)this.o * 0.6 * $$11);
               if ($$12.g() > 0.0) {
                  $$10.j($$12.c, 0.1, $$12.e);
               }
            }

            if (!this.dK().B && $$5 instanceof biy) {
               cng.a($$10, $$5);
               cng.b((biy)$$5, $$10);
            }

            this.a($$10);
            if ($$5 != null && $$10 != $$5 && $$10 instanceof cbm && $$5 instanceof akl && !this.aS()) {
               ((akl)$$5).c.b(new xv(xv.g, 0.0F));
            }

            if (!$$1.bv() && this.r != null) {
               this.r.add($$10);
            }

            if (!this.dK().B && $$5 instanceof akl $$13) {
               if (this.r != null && this.t()) {
                  ai.G.a($$13, this.r);
               } else if (!$$1.bv() && this.t()) {
                  ai.G.a($$13, Arrays.asList($$1));
               }
            }
         }

         this.a(this.p, 1.0F, 1.2F / (this.ag.i() * 0.2F + 0.9F));
         if (this.w() <= 0) {
            this.ak();
         }
      } else {
         $$1.h($$9);
         this.f(this.dn().a(-0.1));
         this.r(this.dA() + 180.0F);
         this.N += 180.0F;
         if (!this.dK().B && this.dn().g() < 1.0E-7) {
            if (this.d == cbs.a.b) {
               this.a(this.p(), 0.1F);
            }

            this.ak();
         }
      }
   }

   @Override
   protected void a(egz $$0) {
      this.l = this.dK().a_($$0.a());
      super.a($$0);
      ehd $$1 = $$0.e().a(this.dp(), this.dr(), this.dv());
      this.f($$1);
      ehd $$2 = $$1.d().a(0.05F);
      this.p(this.dp() - $$2.c, this.dr() - $$2.d, this.dv() - $$2.e);
      this.a(this.o(), 1.0F, 1.2F / (this.ag.i() * 0.2F + 0.9F));
      this.b = true;
      this.e = 7;
      this.a(false);
      this.a((byte)0);
      this.b(aow.ap);
      this.q(false);
      this.E();
   }

   protected aov m() {
      return aow.ap;
   }

   protected final aov o() {
      return this.p;
   }

   protected void a(biy $$0) {
   }

   @Nullable
   protected eha a(ehd $$0, ehd $$1) {
      return ccf.a(this.dK(), this, $$0, $$1, this.cG().b(this.dn()).g(1.0), this::a);
   }

   @Override
   protected boolean a(bii $$0) {
      return super.a($$0) && (this.q == null || !this.q.contains($$0.ah()));
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      $$0.a("life", (short)this.m);
      if (this.l != null) {
         $$0.a("inBlockState", rd.a(this.l));
      }

      $$0.a("shake", (byte)this.e);
      $$0.a("inGround", this.b);
      $$0.a("pickup", (byte)this.d.ordinal());
      $$0.a("damage", this.n);
      $$0.a("crit", this.s());
      $$0.a("PierceLevel", this.w());
      $$0.a("SoundEvent", jb.c.b(this.p).toString());
      $$0.a("ShotFromCrossbow", this.t());
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.m = $$0.g("life");
      if ($$0.b("inBlockState", 10)) {
         this.l = rd.a(this.dK().a(jc.e), $$0.p("inBlockState"));
      }

      this.e = $$0.f("shake") & 255;
      this.b = $$0.q("inGround");
      if ($$0.b("damage", 99)) {
         this.n = $$0.k("damage");
      }

      this.d = cbs.a.a($$0.f("pickup"));
      this.a($$0.q("crit"));
      this.a($$0.f("PierceLevel"));
      if ($$0.b("SoundEvent", 8)) {
         this.p = jb.c.b(new aer($$0.l("SoundEvent"))).orElse(this.m());
      }

      this.q($$0.q("ShotFromCrossbow"));
   }

   @Override
   public void b(@Nullable bii $$0) {
      super.b($$0);
      if ($$0 instanceof cbm) {
         this.d = ((cbm)$$0).fR().d ? cbs.a.c : cbs.a.b;
      }
   }

   @Override
   public void b_(cbm $$0) {
      if (!this.dK().B && (this.b || this.y()) && this.e <= 0) {
         if (this.a($$0)) {
            $$0.a(this, 1);
            this.ak();
         }
      }
   }

   protected boolean a(cbm $$0) {
      switch (this.d) {
         case b:
            return $$0.fQ().e(this.p());
         case c:
            return $$0.fR().d;
         default:
            return false;
      }
   }

   protected abstract cix p();

   @Override
   protected bii.b aU() {
      return bii.b.a;
   }

   public void h(double $$0) {
      this.n = $$0;
   }

   public double q() {
      return this.n;
   }

   public void b(int $$0) {
      this.o = $$0;
   }

   public int r() {
      return this.o;
   }

   @Override
   public boolean cp() {
      return false;
   }

   @Override
   protected float a(bjk $$0, bij $$1) {
      return 0.13F;
   }

   public void a(boolean $$0) {
      this.a(1, $$0);
   }

   public void a(byte $$0) {
      this.an.b(h, $$0);
   }

   private void a(int $$0, boolean $$1) {
      byte $$2 = this.an.b(g);
      if ($$1) {
         this.an.b(g, (byte)($$2 | $$0));
      } else {
         this.an.b(g, (byte)($$2 & ~$$0));
      }
   }

   public boolean s() {
      byte $$0 = this.an.b(g);
      return ($$0 & 1) != 0;
   }

   public boolean t() {
      byte $$0 = this.an.b(g);
      return ($$0 & 4) != 0;
   }

   public byte w() {
      return this.an.b(h);
   }

   public void a(biy $$0, float $$1) {
      int $$2 = cng.a(cni.y, $$0);
      int $$3 = cng.a(cni.z, $$0);
      this.h((double)($$1 * 2.0F) + this.ag.a((double)this.dK().ai().a() * 0.11, 0.57425));
      if ($$2 > 0) {
         this.h(this.q() + (double)$$2 * 0.5 + 0.5);
      }

      if ($$3 > 0) {
         this.b($$3);
      }

      if (cng.a(cni.A, $$0) > 0) {
         this.g(100);
      }
   }

   protected float x() {
      return 0.6F;
   }

   public void p(boolean $$0) {
      this.af = $$0;
      this.a(2, $$0);
   }

   public boolean y() {
      return !this.dK().B ? this.af : (this.an.b(g) & 2) != 0;
   }

   public void q(boolean $$0) {
      this.a(4, $$0);
   }

   public static enum a {
      a,
      b,
      c;

      public static cbs.a a(int $$0) {
         if ($$0 < 0 || $$0 > values().length) {
            $$0 = 0;
         }

         return values()[$$0];
      }
   }
}
