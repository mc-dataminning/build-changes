import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;

public abstract class byu extends bzg {
   private static final double f = 2.0;
   private static final aby<Byte> g = acb.a(byu.class, aca.a);
   private static final aby<Byte> h = acb.a(byu.class, aca.a);
   private static final int i = 1;
   private static final int j = 2;
   private static final int k = 4;
   @Nullable
   private dcb l;
   protected boolean b;
   protected int c;
   public byu.a d = byu.a.a;
   public int e;
   private int m;
   private double n = 2.0;
   private int o;
   private amg p = this.k();
   @Nullable
   private IntOpenHashSet q;
   @Nullable
   private List<bfj> r;

   protected byu(bfn<? extends byu> $$0, cmm $$1) {
      super($$0, $$1);
   }

   protected byu(bfn<? extends byu> $$0, double $$1, double $$2, double $$3, cmm $$4) {
      this($$0, $$4);
      this.e($$1, $$2, $$3);
   }

   protected byu(bfn<? extends byu> $$0, bfz $$1, cmm $$2) {
      this($$0, $$1.dn(), $$1.dr() - 0.1F, $$1.dt(), $$2);
      this.b($$1);
      if ($$1 instanceof byo) {
         this.d = byu.a.b;
      }
   }

   public void b(amg $$0) {
      this.p = $$0;
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cE().a() * 10.0;
      if (Double.isNaN($$1)) {
         $$1 = 1.0;
      }

      $$1 *= 64.0 * cx();
      return $$0 < $$1 * $$1;
   }

   @Override
   protected void a_() {
      this.am.a(g, (byte)0);
      this.am.a(h, (byte)0);
   }

   @Override
   public void c(double $$0, double $$1, double $$2, float $$3, float $$4) {
      super.c($$0, $$1, $$2, $$3, $$4);
      this.m = 0;
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5, boolean $$6) {
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
      eei $$1 = this.dl();
      if (this.N == 0.0F && this.M == 0.0F) {
         double $$2 = $$1.h();
         this.a_((float)(apa.d($$1.c, $$1.e) * 180.0F / (float)Math.PI));
         this.b_((float)(apa.d($$1.d, $$2) * 180.0F / (float)Math.PI));
         this.M = this.dy();
         this.N = this.dA();
      }

      gu $$3 = this.di();
      dcb $$4 = this.dI().a_($$3);
      if (!$$4.i() && !$$0) {
         efb $$5 = $$4.k(this.dI(), $$3);
         if (!$$5.b()) {
            eei $$6 = this.dg();

            for (eed $$7 : $$5.d()) {
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

      if (this.aW() || $$4.a(cpo.qC)) {
         this.aw();
      }

      if (this.b && !$$0) {
         if (this.l != $$4 && this.z()) {
            this.D();
         } else if (!this.dI().B) {
            this.j();
         }

         this.c++;
      } else {
         this.c = 0;
         eei $$8 = this.dg();
         eei $$9 = $$8.e($$1);
         eeg $$10 = this.dI().a(new clv($$8, $$9, clv.a.a, clv.b.a, this));
         if ($$10.c() != eeg.a.a) {
            $$9 = $$10.e();
         }

         while (!this.dD()) {
            eef $$11 = this.a($$8, $$9);
            if ($$11 != null) {
               $$10 = $$11;
            }

            if ($$10 != null && $$10.c() == eeg.a.c) {
               bfj $$12 = ((eef)$$10).a();
               bfj $$13 = this.v();
               if ($$12 instanceof byo && $$13 instanceof byo && !((byo)$$13).a((byo)$$12)) {
                  $$10 = null;
                  $$11 = null;
               }
            }

            if ($$10 != null && !$$0) {
               this.a($$10);
               this.at = true;
            }

            if ($$11 == null || this.w() <= 0) {
               break;
            }

            $$10 = null;
         }

         $$1 = this.dl();
         double $$14 = $$1.c;
         double $$15 = $$1.d;
         double $$16 = $$1.e;
         if (this.s()) {
            for (int $$17 = 0; $$17 < 4; $$17++) {
               this.dI()
                  .a(
                     iv.g,
                     this.dn() + $$14 * (double)$$17 / 4.0,
                     this.dp() + $$15 * (double)$$17 / 4.0,
                     this.dt() + $$16 * (double)$$17 / 4.0,
                     -$$14,
                     -$$15 + 0.2,
                     -$$16
                  );
            }
         }

         double $$18 = this.dn() + $$14;
         double $$19 = this.dp() + $$15;
         double $$20 = this.dt() + $$16;
         double $$21 = $$1.h();
         if ($$0) {
            this.a_((float)(apa.d(-$$14, -$$16) * 180.0F / (float)Math.PI));
         } else {
            this.a_((float)(apa.d($$14, $$16) * 180.0F / (float)Math.PI));
         }

         this.b_((float)(apa.d($$15, $$21) * 180.0F / (float)Math.PI));
         this.b_(d(this.N, this.dA()));
         this.a_(d(this.M, this.dy()));
         float $$22 = 0.99F;
         float $$23 = 0.05F;
         if (this.aV()) {
            for (int $$24 = 0; $$24 < 4; $$24++) {
               float $$25 = 0.25F;
               this.dI().a(iv.e, $$18 - $$14 * 0.25, $$19 - $$15 * 0.25, $$20 - $$16 * 0.25, $$14, $$15, $$16);
            }

            $$22 = this.x();
         }

         this.f($$1.a((double)$$22));
         if (!this.aR() && !$$0) {
            eei $$26 = this.dl();
            this.o($$26.c, $$26.d - 0.05F, $$26.e);
         }

         this.e($$18, $$19, $$20);
         this.aM();
      }
   }

   private boolean z() {
      return this.b && this.dI().b(new eed(this.dg(), this.dg()).g(0.06));
   }

   private void D() {
      this.b = false;
      eei $$0 = this.dl();
      this.f($$0.d((double)(this.af.i() * 0.2F), (double)(this.af.i() * 0.2F), (double)(this.af.i() * 0.2F)));
      this.m = 0;
   }

   @Override
   public void a(bgf $$0, eei $$1) {
      super.a($$0, $$1);
      if ($$0 != bgf.a && this.z()) {
         this.D();
      }
   }

   protected void j() {
      this.m++;
      if (this.m >= 1200) {
         this.ai();
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
   protected void a(eef $$0) {
      super.a($$0);
      bfj $$1 = $$0.a();
      float $$2 = (float)this.dl().f();
      int $$3 = apa.c(apa.a((double)$$2 * this.n, 0.0, 2.147483647E9));
      if (this.w() > 0) {
         if (this.q == null) {
            this.q = new IntOpenHashSet(5);
         }

         if (this.r == null) {
            this.r = Lists.newArrayListWithCapacity(5);
         }

         if (this.q.size() >= this.w() + 1) {
            this.ai();
            return;
         }

         this.q.add($$1.af());
      }

      if (this.s()) {
         long $$4 = (long)this.af.a($$3 / 2 + 2);
         $$3 = (int)Math.min($$4 + (long)$$3, 2147483647L);
      }

      bfj $$5 = this.v();
      ben $$6;
      if ($$5 == null) {
         $$6 = this.dJ().a(this, this);
      } else {
         $$6 = this.dJ().a(this, $$5);
         if ($$5 instanceof bfz) {
            ((bfz)$$5).x($$1);
         }
      }

      boolean $$8 = $$1.ae() == bfn.E;
      int $$9 = $$1.av();
      if (this.bL() && !$$8) {
         $$1.g(5);
      }

      if ($$1.a($$6, (float)$$3)) {
         if ($$8) {
            return;
         }

         if ($$1 instanceof bfz $$10) {
            if (!this.dI().B && this.w() <= 0) {
               $$10.p($$10.eJ() + 1);
            }

            if (this.o > 0) {
               double $$11 = Math.max(0.0, 1.0 - $$10.b(bhg.c));
               eei $$12 = this.dl().d(1.0, 0.0, 1.0).d().a((double)this.o * 0.6 * $$11);
               if ($$12.g() > 0.0) {
                  $$10.j($$12.c, 0.1, $$12.e);
               }
            }

            if (!this.dI().B && $$5 instanceof bfz) {
               cki.a($$10, $$5);
               cki.b((bfz)$$5, $$10);
            }

            this.a($$10);
            if ($$5 != null && $$10 != $$5 && $$10 instanceof byo && $$5 instanceof aig && !this.aQ()) {
               ((aig)$$5).c.a(new vx(vx.g, 0.0F));
            }

            if (!$$1.bs() && this.r != null) {
               this.r.add($$10);
            }

            if (!this.dI().B && $$5 instanceof aig $$13) {
               if (this.r != null && this.t()) {
                  ai.G.a($$13, this.r);
               } else if (!$$1.bs() && this.t()) {
                  ai.G.a($$13, Arrays.asList($$1));
               }
            }
         }

         this.a(this.p, 1.0F, 1.2F / (this.af.i() * 0.2F + 0.9F));
         if (this.w() <= 0) {
            this.ai();
         }
      } else {
         $$1.h($$9);
         this.f(this.dl().a(-0.1));
         this.a_(this.dy() + 180.0F);
         this.M += 180.0F;
         if (!this.dI().B && this.dl().g() < 1.0E-7) {
            if (this.d == byu.a.b) {
               this.a(this.p(), 0.1F);
            }

            this.ai();
         }
      }
   }

   @Override
   protected void a(eee $$0) {
      this.l = this.dI().a_($$0.a());
      super.a($$0);
      eei $$1 = $$0.e().a(this.dn(), this.dp(), this.dt());
      this.f($$1);
      eei $$2 = $$1.d().a(0.05F);
      this.p(this.dn() - $$2.c, this.dp() - $$2.d, this.dt() - $$2.e);
      this.a(this.o(), 1.0F, 1.2F / (this.af.i() * 0.2F + 0.9F));
      this.b = true;
      this.e = 7;
      this.a(false);
      this.a((byte)0);
      this.b(amh.ap);
      this.q(false);
      this.E();
   }

   protected amg k() {
      return amh.ap;
   }

   protected final amg o() {
      return this.p;
   }

   protected void a(bfz $$0) {
   }

   @Nullable
   protected eef a(eei $$0, eei $$1) {
      return bzh.a(this.dI(), this, $$0, $$1, this.cE().b(this.dl()).g(1.0), this::a);
   }

   @Override
   protected boolean a(bfj $$0) {
      return super.a($$0) && (this.q == null || !this.q.contains($$0.af()));
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
         this.l = rd.a(this.dI().a(jc.e), $$0.p("inBlockState"));
      }

      this.e = $$0.f("shake") & 255;
      this.b = $$0.q("inGround");
      if ($$0.b("damage", 99)) {
         this.n = $$0.k("damage");
      }

      this.d = byu.a.a($$0.f("pickup"));
      this.a($$0.q("crit"));
      this.a($$0.f("PierceLevel"));
      if ($$0.b("SoundEvent", 8)) {
         this.p = jb.c.b(new acq($$0.l("SoundEvent"))).orElse(this.k());
      }

      this.q($$0.q("ShotFromCrossbow"));
   }

   @Override
   public void b(@Nullable bfj $$0) {
      super.b($$0);
      if ($$0 instanceof byo) {
         this.d = ((byo)$$0).fO().d ? byu.a.c : byu.a.b;
      }
   }

   @Override
   public void b_(byo $$0) {
      if (!this.dI().B && (this.b || this.y()) && this.e <= 0) {
         if (this.a($$0)) {
            $$0.a(this, 1);
            this.ai();
         }
      }
   }

   protected boolean a(byo $$0) {
      switch (this.d) {
         case b:
            return $$0.fN().e(this.p());
         case c:
            return $$0.fO().d;
         default:
            return false;
      }
   }

   protected abstract cfz p();

   @Override
   protected bfj.b aS() {
      return bfj.b.a;
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
   public boolean cn() {
      return false;
   }

   @Override
   protected float a(bgl $$0, bfk $$1) {
      return 0.13F;
   }

   public void a(boolean $$0) {
      this.a(1, $$0);
   }

   public void a(byte $$0) {
      this.am.b(h, $$0);
   }

   private void a(int $$0, boolean $$1) {
      byte $$2 = this.am.b(g);
      if ($$1) {
         this.am.b(g, (byte)($$2 | $$0));
      } else {
         this.am.b(g, (byte)($$2 & ~$$0));
      }
   }

   public boolean s() {
      byte $$0 = this.am.b(g);
      return ($$0 & 1) != 0;
   }

   public boolean t() {
      byte $$0 = this.am.b(g);
      return ($$0 & 4) != 0;
   }

   public byte w() {
      return this.am.b(h);
   }

   public void a(bfz $$0, float $$1) {
      int $$2 = cki.a(ckk.y, $$0);
      int $$3 = cki.a(ckk.z, $$0);
      this.h((double)($$1 * 2.0F) + this.af.a((double)this.dI().ai().a() * 0.11, 0.57425));
      if ($$2 > 0) {
         this.h(this.q() + (double)$$2 * 0.5 + 0.5);
      }

      if ($$3 > 0) {
         this.b($$3);
      }

      if (cki.a(ckk.A, $$0) > 0) {
         this.g(100);
      }
   }

   protected float x() {
      return 0.6F;
   }

   public void p(boolean $$0) {
      this.ae = $$0;
      this.a(2, $$0);
   }

   public boolean y() {
      return !this.dI().B ? this.ae : (this.am.b(g) & 2) != 0;
   }

   public void q(boolean $$0) {
      this.a(4, $$0);
   }

   public static enum a {
      a,
      b,
      c;

      public static byu.a a(int $$0) {
         if ($$0 < 0 || $$0 > values().length) {
            $$0 = 0;
         }

         return values()[$$0];
      }
   }
}
