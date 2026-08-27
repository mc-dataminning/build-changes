import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;

public abstract class cds extends cee {
   private static final double f = 2.0;
   private static final afm<Byte> g = afp.a(cds.class, afo.a);
   private static final afm<Byte> h = afp.a(cds.class, afo.a);
   private static final int i = 1;
   private static final int j = 2;
   private static final int k = 4;
   @Nullable
   private dgw l;
   protected boolean b;
   protected int c;
   public cds.a d = cds.a.a;
   public int e;
   private int m;
   private double n = 2.0;
   private int o;
   private aqm p = this.s();
   @Nullable
   private IntOpenHashSet q;
   @Nullable
   private List<bki> r;

   protected cds(bkm<? extends cds> $$0, crs $$1) {
      super($$0, $$1);
   }

   protected cds(bkm<? extends cds> $$0, double $$1, double $$2, double $$3, crs $$4) {
      this($$0, $$4);
      this.e($$1, $$2, $$3);
   }

   protected cds(bkm<? extends cds> $$0, bky $$1, crs $$2) {
      this($$0, $$1.dq(), $$1.du() - 0.1F, $$1.dw(), $$2);
      this.b($$1);
      if ($$1 instanceof cdm) {
         this.d = cds.a.b;
      }
   }

   public void b(aqm $$0) {
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
   protected void b_() {
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
      boolean $$0 = this.E();
      eji $$1 = this.do();
      if (this.O == 0.0F && this.N == 0.0F) {
         double $$2 = $$1.h();
         this.r((float)(ati.d($$1.c, $$1.e) * 180.0F / (float)Math.PI));
         this.s((float)(ati.d($$1.d, $$2) * 180.0F / (float)Math.PI));
         this.N = this.dB();
         this.O = this.dD();
      }

      ht $$3 = this.dl();
      dgw $$4 = this.dL().a_($$3);
      if (!$$4.i() && !$$0) {
         ekb $$5 = $$4.k(this.dL(), $$3);
         if (!$$5.c()) {
            eji $$6 = this.dj();

            for (ejd $$7 : $$5.e()) {
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

      if (this.aY() || $$4.a(cuv.qC)) {
         this.ay();
      }

      if (this.b && !$$0) {
         if (this.l != $$4 && this.F()) {
            this.I();
         } else if (!this.dL().B) {
            this.q();
         }

         this.c++;
      } else {
         this.c = 0;
         eji $$8 = this.dj();
         eji $$9 = $$8.e($$1);
         ejg $$10 = this.dL().a(new crb($$8, $$9, crb.a.a, crb.b.a, this));
         if ($$10.c() != ejg.a.a) {
            $$9 = $$10.e();
         }

         while (!this.dG()) {
            ejf $$11 = this.a($$8, $$9);
            if ($$11 != null) {
               $$10 = $$11;
            }

            if ($$10 != null && $$10.c() == ejg.a.c) {
               bki $$12 = ((ejf)$$10).a();
               bki $$13 = this.v();
               if ($$12 instanceof cdm && $$13 instanceof cdm && !((cdm)$$13).a((cdm)$$12)) {
                  $$10 = null;
                  $$11 = null;
               }
            }

            if ($$10 != null && !$$0) {
               this.a($$10);
               this.au = true;
            }

            if ($$11 == null || this.B() <= 0) {
               break;
            }

            $$10 = null;
         }

         $$1 = this.do();
         double $$14 = $$1.c;
         double $$15 = $$1.d;
         double $$16 = $$1.e;
         if (this.z()) {
            for (int $$17 = 0; $$17 < 4; $$17++) {
               this.dL()
                  .a(
                     js.g,
                     this.dq() + $$14 * (double)$$17 / 4.0,
                     this.ds() + $$15 * (double)$$17 / 4.0,
                     this.dw() + $$16 * (double)$$17 / 4.0,
                     -$$14,
                     -$$15 + 0.2,
                     -$$16
                  );
            }
         }

         double $$18 = this.dq() + $$14;
         double $$19 = this.ds() + $$15;
         double $$20 = this.dw() + $$16;
         double $$21 = $$1.h();
         if ($$0) {
            this.r((float)(ati.d(-$$14, -$$16) * 180.0F / (float)Math.PI));
         } else {
            this.r((float)(ati.d($$14, $$16) * 180.0F / (float)Math.PI));
         }

         this.s((float)(ati.d($$15, $$21) * 180.0F / (float)Math.PI));
         this.s(d(this.O, this.dD()));
         this.r(d(this.N, this.dB()));
         float $$22 = 0.99F;
         float $$23 = 0.05F;
         if (this.aX()) {
            for (int $$24 = 0; $$24 < 4; $$24++) {
               float $$25 = 0.25F;
               this.dL().a(js.e, $$18 - $$14 * 0.25, $$19 - $$15 * 0.25, $$20 - $$16 * 0.25, $$14, $$15, $$16);
            }

            $$22 = this.C();
         }

         this.f($$1.a((double)$$22));
         if (!this.aT() && !$$0) {
            eji $$26 = this.do();
            this.o($$26.c, $$26.d - 0.05F, $$26.e);
         }

         this.e($$18, $$19, $$20);
         this.aO();
      }
   }

   private boolean F() {
      return this.b && this.dL().b(new ejd(this.dj(), this.dj()).g(0.06));
   }

   private void I() {
      this.b = false;
      eji $$0 = this.do();
      this.f($$0.d((double)(this.ag.i() * 0.2F), (double)(this.ag.i() * 0.2F), (double)(this.ag.i() * 0.2F)));
      this.m = 0;
   }

   @Override
   public void a(ble $$0, eji $$1) {
      super.a($$0, $$1);
      if ($$0 != ble.a && this.F()) {
         this.I();
      }
   }

   protected void q() {
      this.m++;
      if (this.m >= 1200) {
         this.ak();
      }
   }

   private void K() {
      if (this.r != null) {
         this.r.clear();
      }

      if (this.q != null) {
         this.q.clear();
      }
   }

   @Override
   protected void a(ejf $$0) {
      super.a($$0);
      bki $$1 = $$0.a();
      float $$2 = (float)this.do().f();
      int $$3 = ati.c(ati.a((double)$$2 * this.n, 0.0, 2.147483647E9));
      if (this.B() > 0) {
         if (this.q == null) {
            this.q = new IntOpenHashSet(5);
         }

         if (this.r == null) {
            this.r = Lists.newArrayListWithCapacity(5);
         }

         if (this.q.size() >= this.B() + 1) {
            this.ak();
            return;
         }

         this.q.add($$1.ah());
      }

      if (this.z()) {
         long $$4 = (long)this.ag.a($$3 / 2 + 2);
         $$3 = (int)Math.min($$4 + (long)$$3, 2147483647L);
      }

      bki $$5 = this.v();
      bjg $$6;
      if ($$5 == null) {
         $$6 = this.dM().a(this, this);
      } else {
         $$6 = this.dM().a(this, $$5);
         if ($$5 instanceof bky) {
            ((bky)$$5).A($$1);
         }
      }

      boolean $$8 = $$1.ag() == bkm.E;
      int $$9 = $$1.ax();
      if (this.bM() && !$$8) {
         $$1.g(5);
      }

      if ($$1.a($$6, (float)$$3)) {
         if ($$8) {
            return;
         }

         if ($$1 instanceof bky $$10) {
            if (!this.dL().B && this.B() <= 0) {
               $$10.p($$10.eN() + 1);
            }

            if (this.o > 0) {
               double $$11 = Math.max(0.0, 1.0 - $$10.b(bme.i));
               eji $$12 = this.do().d(1.0, 0.0, 1.0).d().a((double)this.o * 0.6 * $$11);
               if ($$12.g() > 0.0) {
                  $$10.j($$12.c, 0.1, $$12.e);
               }
            }

            if (!this.dL().B && $$5 instanceof bky) {
               cpo.a($$10, $$5);
               cpo.b((bky)$$5, $$10);
            }

            this.a($$10);
            if ($$5 != null && $$10 != $$5 && $$10 instanceof cdm && $$5 instanceof amb && !this.aS()) {
               ((amb)$$5).c.b(new zi(zi.g, 0.0F));
            }

            if (!$$1.bv() && this.r != null) {
               this.r.add($$10);
            }

            if (!this.dL().B && $$5 instanceof amb $$13) {
               if (this.r != null && this.A()) {
                  al.G.a($$13, this.r);
               } else if (!$$1.bv() && this.A()) {
                  al.G.a($$13, Arrays.asList($$1));
               }
            }
         }

         this.a(this.p, 1.0F, 1.2F / (this.ag.i() * 0.2F + 0.9F));
         if (this.B() <= 0) {
            this.ak();
         }
      } else {
         $$1.h($$9);
         this.f(this.do().a(-0.1));
         this.r(this.dB() + 180.0F);
         this.N += 180.0F;
         if (!this.dL().B && this.do().g() < 1.0E-7) {
            if (this.d == cds.a.b) {
               this.a(this.w(), 0.1F);
            }

            this.ak();
         }
      }
   }

   @Override
   protected void a(eje $$0) {
      this.l = this.dL().a_($$0.a());
      super.a($$0);
      eji $$1 = $$0.e().a(this.dq(), this.ds(), this.dw());
      this.f($$1);
      eji $$2 = $$1.d().a(0.05F);
      this.p(this.dq() - $$2.c, this.ds() - $$2.d, this.dw() - $$2.e);
      this.a(this.t(), 1.0F, 1.2F / (this.ag.i() * 0.2F + 0.9F));
      this.b = true;
      this.e = 7;
      this.a(false);
      this.a((byte)0);
      this.b(aqn.ap);
      this.q(false);
      this.K();
   }

   protected aqm s() {
      return aqn.ap;
   }

   protected final aqm t() {
      return this.p;
   }

   protected void a(bky $$0) {
   }

   @Nullable
   protected ejf a(eji $$0, eji $$1) {
      return cef.a(this.dL(), this, $$0, $$1, this.cG().b(this.do()).g(1.0), this::a);
   }

   @Override
   protected boolean a(bki $$0) {
      return super.a($$0) && (this.q == null || !this.q.contains($$0.ah()));
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      $$0.a("life", (short)this.m);
      if (this.l != null) {
         $$0.a("inBlockState", so.a(this.l));
      }

      $$0.a("shake", (byte)this.e);
      $$0.a("inGround", this.b);
      $$0.a("pickup", (byte)this.d.ordinal());
      $$0.a("damage", this.n);
      $$0.a("crit", this.z());
      $$0.a("PierceLevel", this.B());
      $$0.a("SoundEvent", jy.c.b(this.p).toString());
      $$0.a("ShotFromCrossbow", this.A());
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.m = $$0.g("life");
      if ($$0.b("inBlockState", 10)) {
         this.l = so.a(this.dL().a(jz.e), $$0.p("inBlockState"));
      }

      this.e = $$0.f("shake") & 255;
      this.b = $$0.q("inGround");
      if ($$0.b("damage", 99)) {
         this.n = $$0.k("damage");
      }

      this.d = cds.a.a($$0.f("pickup"));
      this.a($$0.q("crit"));
      this.a($$0.f("PierceLevel"));
      if ($$0.b("SoundEvent", 8)) {
         this.p = jy.c.b(new agg($$0.l("SoundEvent"))).orElse(this.s());
      }

      this.q($$0.q("ShotFromCrossbow"));
   }

   @Override
   public void b(@Nullable bki $$0) {
      super.b($$0);
      if ($$0 instanceof cdm) {
         this.d = ((cdm)$$0).fT().d ? cds.a.c : cds.a.b;
      }
   }

   @Override
   public void b_(cdm $$0) {
      if (!this.dL().B && (this.b || this.E()) && this.e <= 0) {
         if (this.a($$0)) {
            $$0.a(this, 1);
            this.ak();
         }
      }
   }

   protected boolean a(cdm $$0) {
      switch (this.d) {
         case b:
            return $$0.fS().e(this.w());
         case c:
            return $$0.fT().d;
         default:
            return false;
      }
   }

   protected abstract clb w();

   @Override
   protected bki.b aU() {
      return bki.b.a;
   }

   public void h(double $$0) {
      this.n = $$0;
   }

   public double x() {
      return this.n;
   }

   public void b(int $$0) {
      this.o = $$0;
   }

   public int y() {
      return this.o;
   }

   @Override
   public boolean cp() {
      return false;
   }

   @Override
   protected float a(blk $$0, bkj $$1) {
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

   public boolean z() {
      byte $$0 = this.an.b(g);
      return ($$0 & 1) != 0;
   }

   public boolean A() {
      byte $$0 = this.an.b(g);
      return ($$0 & 4) != 0;
   }

   public byte B() {
      return this.an.b(h);
   }

   public void a(bky $$0, float $$1) {
      int $$2 = cpo.a(cpq.y, $$0);
      int $$3 = cpo.a(cpq.z, $$0);
      this.h((double)($$1 * 2.0F) + this.ag.a((double)this.dL().ai().a() * 0.11, 0.57425));
      if ($$2 > 0) {
         this.h(this.x() + (double)$$2 * 0.5 + 0.5);
      }

      if ($$3 > 0) {
         this.b($$3);
      }

      if (cpo.a(cpq.A, $$0) > 0) {
         this.g(100);
      }
   }

   protected float C() {
      return 0.6F;
   }

   public void p(boolean $$0) {
      this.af = $$0;
      this.a(2, $$0);
   }

   public boolean E() {
      return !this.dL().B ? this.af : (this.an.b(g) & 2) != 0;
   }

   public void q(boolean $$0) {
      this.a(4, $$0);
   }

   public static enum a {
      a,
      b,
      c;

      public static cds.a a(int $$0) {
         if ($$0 < 0 || $$0 > values().length) {
            $$0 = 0;
         }

         return values()[$$0];
      }
   }
}
