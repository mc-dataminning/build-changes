import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;

public abstract class cmc extends cmo {
   private static final double g = 2.0;
   private static final ajr<Byte> h = ajv.a(cmc.class, ajt.a);
   private static final ajr<Byte> i = ajv.a(cmc.class, ajt.a);
   private static final int j = 1;
   private static final int k = 2;
   private static final int l = 4;
   @Nullable
   private drb m;
   protected boolean b;
   protected int c;
   public cmc.a d = cmc.a.a;
   public int e;
   private int n;
   private double o = 2.0;
   private int p;
   private avg q = this.u();
   @Nullable
   private IntOpenHashSet r;
   @Nullable
   private List<bru> s;
   private cto t = this.x();

   protected cmc(bsa<? extends cmc> $$0, dax $$1) {
      super($$0, $$1);
   }

   protected cmc(bsa<? extends cmc> $$0, dax $$1, cto $$2) {
      this($$0, $$1);
      this.t = $$2.s();
      this.b($$2.a(kb.f));
      azf $$3 = $$2.c(kb.t);
      if ($$3 != null) {
         this.d = cmc.a.c;
      }
   }

   protected cmc(bsa<? extends cmc> $$0, double $$1, double $$2, double $$3, dax $$4, cto $$5) {
      this($$0, $$4, $$5);
      this.a_($$1, $$2, $$3);
   }

   protected cmc(bsa<? extends cmc> $$0, bso $$1, dax $$2, cto $$3) {
      this($$0, $$1.du(), $$1.dy() - 0.1F, $$1.dA(), $$2, $$3);
      this.c($$1);
   }

   public void b(avg $$0) {
      this.q = $$0;
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cK().a() * 10.0;
      if (Double.isNaN($$1)) {
         $$1 = 1.0;
      }

      $$1 *= 64.0 * cD();
      return $$0 < $$1 * $$1;
   }

   @Override
   protected void a(ajv.a $$0) {
      $$0.a(h, (byte)0);
      $$0.a(i, (byte)0);
   }

   @Override
   public void c(double $$0, double $$1, double $$2, float $$3, float $$4) {
      super.c($$0, $$1, $$2, $$3, $$4);
      this.n = 0;
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      this.a_($$0, $$1, $$2);
      this.a($$3, $$4);
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      super.l($$0, $$1, $$2);
      this.n = 0;
   }

   @Override
   public void l() {
      super.l();
      boolean $$0 = this.G();
      euk $$1 = this.ds();
      if (this.P == 0.0F && this.O == 0.0F) {
         double $$2 = $$1.h();
         this.r((float)(ayd.d($$1.c, $$1.e) * 180.0F / (float)Math.PI));
         this.s((float)(ayd.d($$1.d, $$2) * 180.0F / (float)Math.PI));
         this.O = this.dF();
         this.P = this.dH();
      }

      io $$3 = this.dp();
      drb $$4 = this.dP().a_($$3);
      if (!$$4.i() && !$$0) {
         evd $$5 = $$4.k(this.dP(), $$3);
         if (!$$5.c()) {
            euk $$6 = this.dn();

            for (euf $$7 : $$5.e()) {
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

      if (this.bf() || $$4.a(dea.qP)) {
         this.aC();
      }

      if (this.b && !$$0) {
         if (this.m != $$4 && this.H()) {
            this.K();
         } else if (!this.dP().B) {
            this.p();
         }

         this.c++;
      } else {
         this.c = 0;
         euk $$8 = this.dn();
         euk $$9 = $$8.e($$1);
         eui $$10 = this.dP().a(new dag($$8, $$9, dag.a.a, dag.b.a, this));
         if ($$10.c() != eui.a.a) {
            $$9 = $$10.e();
         }

         while (!this.dK() && !this.f) {
            euh $$11 = this.a($$8, $$9);
            if ($$11 != null) {
               $$10 = $$11;
            }

            if ($$10 != null && $$10.c() == eui.a.c) {
               bru $$12 = ((euh)$$10).a();
               bru $$13 = this.s();
               if ($$12 instanceof clw && $$13 instanceof clw && !((clw)$$13).a((clw)$$12)) {
                  $$10 = null;
                  $$11 = null;
               }
            }

            if ($$10 != null && !$$0) {
               this.a($$10);
               this.av = true;
            }

            if ($$11 == null || this.D() <= 0) {
               break;
            }

            $$10 = null;
         }

         this.f = false;
         $$1 = this.ds();
         double $$14 = $$1.c;
         double $$15 = $$1.d;
         double $$16 = $$1.e;
         if (this.B()) {
            for (int $$17 = 0; $$17 < 4; $$17++) {
               this.dP()
                  .a(
                     ky.f,
                     this.du() + $$14 * (double)$$17 / 4.0,
                     this.dw() + $$15 * (double)$$17 / 4.0,
                     this.dA() + $$16 * (double)$$17 / 4.0,
                     -$$14,
                     -$$15 + 0.2,
                     -$$16
                  );
            }
         }

         double $$18 = this.du() + $$14;
         double $$19 = this.dw() + $$15;
         double $$20 = this.dA() + $$16;
         double $$21 = $$1.h();
         if ($$0) {
            this.r((float)(ayd.d(-$$14, -$$16) * 180.0F / (float)Math.PI));
         } else {
            this.r((float)(ayd.d($$14, $$16) * 180.0F / (float)Math.PI));
         }

         this.s((float)(ayd.d($$15, $$21) * 180.0F / (float)Math.PI));
         this.s(d(this.P, this.dH()));
         this.r(d(this.O, this.dF()));
         float $$22 = 0.99F;
         if (this.be()) {
            for (int $$23 = 0; $$23 < 4; $$23++) {
               float $$24 = 0.25F;
               this.dP().a(ky.d, $$18 - $$14 * 0.25, $$19 - $$15 * 0.25, $$20 - $$16 * 0.25, $$14, $$15, $$16);
            }

            $$22 = this.E();
         }

         this.g($$1.a((double)$$22));
         if (!$$0) {
            this.ba();
         }

         this.a_($$18, $$19, $$20);
         this.aS();
      }
   }

   @Override
   protected double aY() {
      return 0.05;
   }

   private boolean H() {
      return this.b && this.dP().b(new euf(this.dn(), this.dn()).g(0.06));
   }

   private void K() {
      this.b = false;
      euk $$0 = this.ds();
      this.g($$0.d((double)(this.ah.i() * 0.2F), (double)(this.ah.i() * 0.2F), (double)(this.ah.i() * 0.2F)));
      this.n = 0;
   }

   @Override
   public void a(bst $$0, euk $$1) {
      super.a($$0, $$1);
      if ($$0 != bst.a && this.H()) {
         this.K();
      }
   }

   protected void p() {
      this.n++;
      if (this.n >= 1200) {
         this.ao();
      }
   }

   private void M() {
      if (this.s != null) {
         this.s.clear();
      }

      if (this.r != null) {
         this.r.clear();
      }
   }

   @Override
   protected void a(euh $$0) {
      super.a($$0);
      bru $$1 = $$0.a();
      float $$2 = (float)this.ds().f();
      int $$3 = ayd.c(ayd.a((double)$$2 * this.o, 0.0, 2.147483647E9));
      if (this.D() > 0) {
         if (this.r == null) {
            this.r = new IntOpenHashSet(5);
         }

         if (this.s == null) {
            this.s = Lists.newArrayListWithCapacity(5);
         }

         if (this.r.size() >= this.D() + 1) {
            this.ao();
            return;
         }

         this.r.add($$1.al());
      }

      if (this.B()) {
         long $$4 = (long)this.ah.a($$3 / 2 + 2);
         $$3 = (int)Math.min($$4 + (long)$$3, 2147483647L);
      }

      bru $$5 = this.s();
      bqn $$6;
      if ($$5 == null) {
         $$6 = this.dQ().a(this, this);
      } else {
         $$6 = this.dQ().a(this, $$5);
         if ($$5 instanceof bso) {
            ((bso)$$5).A($$1);
         }
      }

      boolean $$8 = $$1.ak() == bsa.H;
      int $$9 = $$1.aB();
      if (this.bQ() && !$$8) {
         $$1.g(5);
      }

      if ($$1.a($$6, (float)$$3)) {
         if ($$8) {
            return;
         }

         if ($$1 instanceof bso $$10) {
            if (!this.dP().B && this.D() <= 0) {
               $$10.q($$10.eT() + 1);
            }

            if (this.p > 0) {
               double $$11 = Math.max(0.0, 1.0 - $$10.g(btw.n));
               euk $$12 = this.ds().d(1.0, 0.0, 1.0).d().a((double)this.p * 0.6 * $$11);
               if ($$12.g() > 0.0) {
                  $$10.j($$12.c, 0.1, $$12.e);
               }
            }

            if (!this.dP().B && $$5 instanceof bso) {
               cza.a($$10, $$5);
               cza.b((bso)$$5, $$10);
            }

            this.a($$10);
            if ($$5 != null && $$10 != $$5 && $$10 instanceof clw && $$5 instanceof aqn && !this.aW()) {
               ((aqn)$$5).d.b(new acx(acx.h, 0.0F));
            }

            if (!$$1.bD() && this.s != null) {
               this.s.add($$10);
            }

            if (!this.dP().B && $$5 instanceof aqn $$13) {
               if (this.s != null && this.C()) {
                  am.H.a($$13, this.s);
               } else if (!$$1.bD() && this.C()) {
                  am.H.a($$13, Arrays.asList($$1));
               }
            }
         }

         this.a(this.q, 1.0F, 1.2F / (this.ah.i() * 0.2F + 0.9F));
         if (this.D() <= 0) {
            this.ao();
         }
      } else {
         $$1.i($$9);
         this.g(this.ds().a(-0.1));
         this.r(this.dF() + 180.0F);
         this.O += 180.0F;
         if (!this.dP().B && this.ds().g() < 1.0E-7) {
            if (this.d == cmc.a.b) {
               this.a(this.w(), 0.1F);
            }

            this.ao();
         }
      }
   }

   @Override
   protected void a(eug $$0) {
      this.m = this.dP().a_($$0.a());
      super.a($$0);
      euk $$1 = $$0.e().a(this.du(), this.dw(), this.dA());
      this.g($$1);
      euk $$2 = $$1.d().a(0.05F);
      this.p(this.du() - $$2.c, this.dw() - $$2.d, this.dA() - $$2.e);
      this.a(this.v(), 1.0F, 1.2F / (this.ah.i() * 0.2F + 0.9F));
      this.b = true;
      this.e = 7;
      this.a(false);
      this.a((byte)0);
      this.b(avh.aE);
      this.q(false);
      this.M();
   }

   protected avg u() {
      return avh.aE;
   }

   protected final avg v() {
      return this.q;
   }

   protected void a(bso $$0) {
   }

   @Nullable
   protected euh a(euk $$0, euk $$1) {
      return cmq.a(this.dP(), this, $$0, $$1, this.cK().b(this.ds()).g(1.0), this::b);
   }

   @Override
   protected boolean b(bru $$0) {
      return super.b($$0) && (this.r == null || !this.r.contains($$0.al()));
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      $$0.a("life", (short)this.n);
      if (this.m != null) {
         $$0.a("inBlockState", us.a(this.m));
      }

      $$0.a("shake", (byte)this.e);
      $$0.a("inGround", this.b);
      $$0.a("pickup", (byte)this.d.ordinal());
      $$0.a("damage", this.o);
      $$0.a("crit", this.B());
      $$0.a("PierceLevel", this.D());
      $$0.a("SoundEvent", le.b.b(this.q).toString());
      $$0.a("ShotFromCrossbow", this.C());
      $$0.a("item", this.t.a(this.dR()));
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      this.n = $$0.g("life");
      if ($$0.b("inBlockState", 10)) {
         this.m = us.a(this.dP().a(lf.f), $$0.p("inBlockState"));
      }

      this.e = $$0.f("shake") & 255;
      this.b = $$0.q("inGround");
      if ($$0.b("damage", 99)) {
         this.o = $$0.k("damage");
      }

      this.d = cmc.a.a($$0.f("pickup"));
      this.a($$0.q("crit"));
      this.a($$0.f("PierceLevel"));
      if ($$0.b("SoundEvent", 8)) {
         this.q = le.b.b(new akm($$0.l("SoundEvent"))).orElse(this.u());
      }

      this.q($$0.q("ShotFromCrossbow"));
      if ($$0.b("item", 10)) {
         this.a(cto.a(this.dR(), (va)$$0.p("item")).orElse(this.x()));
      } else {
         this.a(this.t);
      }
   }

   @Override
   public void c(@Nullable bru $$0) {
      super.c($$0);
      if ($$0 instanceof clw && this.d == cmc.a.a) {
         this.d = cmc.a.b;
      }
   }

   @Override
   public void b_(clw $$0) {
      if (!this.dP().B && (this.b || this.G()) && this.e <= 0) {
         if (this.a($$0)) {
            $$0.a(this, 1);
            this.ao();
         }
      }
   }

   protected boolean a(clw $$0) {
      return switch (this.d) {
         case a -> false;
         case b -> $$0.gc().f(this.w());
         case c -> $$0.fP();
      };
   }

   protected cto w() {
      return this.t.s();
   }

   protected abstract cto x();

   @Override
   protected bru.b bb() {
      return bru.b.a;
   }

   public cto y() {
      return this.t;
   }

   public void h(double $$0) {
      this.o = $$0;
   }

   public double z() {
      return this.o;
   }

   public void b(int $$0) {
      this.p = $$0;
   }

   public int A() {
      return this.p;
   }

   @Override
   public boolean ct() {
      return false;
   }

   public void a(boolean $$0) {
      this.a(1, $$0);
   }

   public void a(byte $$0) {
      this.ao.a(i, $$0);
   }

   private void a(int $$0, boolean $$1) {
      byte $$2 = this.ao.a(h);
      if ($$1) {
         this.ao.a(h, (byte)($$2 | $$0));
      } else {
         this.ao.a(h, (byte)($$2 & ~$$0));
      }
   }

   protected void a(cto $$0) {
      this.t = $$0;
   }

   public boolean B() {
      byte $$0 = this.ao.a(h);
      return ($$0 & 1) != 0;
   }

   public boolean C() {
      byte $$0 = this.ao.a(h);
      return ($$0 & 4) != 0;
   }

   public byte D() {
      return this.ao.a(i);
   }

   public void a(bso $$0, float $$1) {
      int $$2 = cza.a(czc.y, $$0);
      int $$3 = cza.a(czc.z, $$0);
      this.h((double)($$1 * 2.0F) + this.ah.a((double)this.dP().ak().a() * 0.11, 0.57425));
      if ($$2 > 0) {
         this.h(this.z() + (double)$$2 * 0.5 + 0.5);
      }

      if ($$3 > 0) {
         this.b($$3);
      }

      if (cza.a(czc.A, $$0) > 0) {
         this.g(100);
      }
   }

   protected float E() {
      return 0.6F;
   }

   public void b(boolean $$0) {
      this.ag = $$0;
      this.a(2, $$0);
   }

   public boolean G() {
      return !this.dP().B ? this.ag : (this.ao.a(h) & 2) != 0;
   }

   public void q(boolean $$0) {
      this.a(4, $$0);
   }

   public static enum a {
      a,
      b,
      c;

      public static cmc.a a(int $$0) {
         if ($$0 < 0 || $$0 > values().length) {
            $$0 = 0;
         }

         return values()[$$0];
      }
   }
}
