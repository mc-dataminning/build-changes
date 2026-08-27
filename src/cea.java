import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;

public abstract class cea extends cem {
   private static final double f = 2.0;
   private static final afo<Byte> g = afr.a(cea.class, afq.a);
   private static final afo<Byte> h = afr.a(cea.class, afq.a);
   private static final int i = 1;
   private static final int j = 2;
   private static final int k = 4;
   @Nullable
   private dhi l;
   protected boolean b;
   protected int c;
   public cea.a d = cea.a.a;
   public int e;
   private int m;
   private double n = 2.0;
   private int o;
   private aqq p = this.s();
   @Nullable
   private IntOpenHashSet q;
   @Nullable
   private List<bkq> r;
   private clj s;

   protected cea(bku<? extends cea> $$0, csa $$1, clj $$2) {
      super($$0, $$1);
      this.s = $$2.p();
   }

   protected cea(bku<? extends cea> $$0, double $$1, double $$2, double $$3, csa $$4, clj $$5) {
      this($$0, $$4, $$5);
      this.a_($$1, $$2, $$3);
   }

   protected cea(bku<? extends cea> $$0, blg $$1, csa $$2, clj $$3) {
      this($$0, $$1.ds(), $$1.dw() - 0.1F, $$1.dy(), $$2, $$3);
      this.b($$1);
      if ($$1 instanceof cdu) {
         this.d = cea.a.b;
      }
   }

   public void b(aqq $$0) {
      this.p = $$0;
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cH().a() * 10.0;
      if (Double.isNaN($$1)) {
         $$1 = 1.0;
      }

      $$1 *= 64.0 * cA();
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
      this.a_($$0, $$1, $$2);
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
      boolean $$0 = this.G();
      eju $$1 = this.dq();
      if (this.O == 0.0F && this.N == 0.0F) {
         double $$2 = $$1.h();
         this.r((float)(atm.d($$1.c, $$1.e) * 180.0F / (float)Math.PI));
         this.s((float)(atm.d($$1.d, $$2) * 180.0F / (float)Math.PI));
         this.N = this.dD();
         this.O = this.dF();
      }

      ht $$3 = this.dn();
      dhi $$4 = this.dN().a_($$3);
      if (!$$4.i() && !$$0) {
         ekn $$5 = $$4.k(this.dN(), $$3);
         if (!$$5.c()) {
            eju $$6 = this.dl();

            for (ejp $$7 : $$5.e()) {
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

      if (this.ba() || $$4.a(cvc.qP)) {
         this.aA();
      }

      if (this.b && !$$0) {
         if (this.l != $$4 && this.H()) {
            this.K();
         } else if (!this.dN().B) {
            this.q();
         }

         this.c++;
      } else {
         this.c = 0;
         eju $$8 = this.dl();
         eju $$9 = $$8.e($$1);
         ejs $$10 = this.dN().a(new crj($$8, $$9, crj.a.a, crj.b.a, this));
         if ($$10.c() != ejs.a.a) {
            $$9 = $$10.e();
         }

         while (!this.dI()) {
            ejr $$11 = this.a($$8, $$9);
            if ($$11 != null) {
               $$10 = $$11;
            }

            if ($$10 != null && $$10.c() == ejs.a.c) {
               bkq $$12 = ((ejr)$$10).a();
               bkq $$13 = this.w();
               if ($$12 instanceof cdu && $$13 instanceof cdu && !((cdu)$$13).a((cdu)$$12)) {
                  $$10 = null;
                  $$11 = null;
               }
            }

            if ($$10 != null && !$$0) {
               this.a($$10);
               this.au = true;
            }

            if ($$11 == null || this.D() <= 0) {
               break;
            }

            $$10 = null;
         }

         $$1 = this.dq();
         double $$14 = $$1.c;
         double $$15 = $$1.d;
         double $$16 = $$1.e;
         if (this.B()) {
            for (int $$17 = 0; $$17 < 4; $$17++) {
               this.dN()
                  .a(
                     js.g,
                     this.ds() + $$14 * (double)$$17 / 4.0,
                     this.du() + $$15 * (double)$$17 / 4.0,
                     this.dy() + $$16 * (double)$$17 / 4.0,
                     -$$14,
                     -$$15 + 0.2,
                     -$$16
                  );
            }
         }

         double $$18 = this.ds() + $$14;
         double $$19 = this.du() + $$15;
         double $$20 = this.dy() + $$16;
         double $$21 = $$1.h();
         if ($$0) {
            this.r((float)(atm.d(-$$14, -$$16) * 180.0F / (float)Math.PI));
         } else {
            this.r((float)(atm.d($$14, $$16) * 180.0F / (float)Math.PI));
         }

         this.s((float)(atm.d($$15, $$21) * 180.0F / (float)Math.PI));
         this.s(d(this.O, this.dF()));
         this.r(d(this.N, this.dD()));
         float $$22 = 0.99F;
         float $$23 = 0.05F;
         if (this.aZ()) {
            for (int $$24 = 0; $$24 < 4; $$24++) {
               float $$25 = 0.25F;
               this.dN().a(js.e, $$18 - $$14 * 0.25, $$19 - $$15 * 0.25, $$20 - $$16 * 0.25, $$14, $$15, $$16);
            }

            $$22 = this.E();
         }

         this.g($$1.a((double)$$22));
         if (!this.aV() && !$$0) {
            eju $$26 = this.dq();
            this.o($$26.c, $$26.d - 0.05F, $$26.e);
         }

         this.a_($$18, $$19, $$20);
         this.aQ();
      }
   }

   private boolean H() {
      return this.b && this.dN().b(new ejp(this.dl(), this.dl()).g(0.06));
   }

   private void K() {
      this.b = false;
      eju $$0 = this.dq();
      this.g($$0.d((double)(this.ag.i() * 0.2F), (double)(this.ag.i() * 0.2F), (double)(this.ag.i() * 0.2F)));
      this.m = 0;
   }

   @Override
   public void a(blm $$0, eju $$1) {
      super.a($$0, $$1);
      if ($$0 != blm.a && this.H()) {
         this.K();
      }
   }

   protected void q() {
      this.m++;
      if (this.m >= 1200) {
         this.am();
      }
   }

   private void M() {
      if (this.r != null) {
         this.r.clear();
      }

      if (this.q != null) {
         this.q.clear();
      }
   }

   @Override
   protected void a(ejr $$0) {
      super.a($$0);
      bkq $$1 = $$0.a();
      float $$2 = (float)this.dq().f();
      int $$3 = atm.c(atm.a((double)$$2 * this.n, 0.0, 2.147483647E9));
      if (this.D() > 0) {
         if (this.q == null) {
            this.q = new IntOpenHashSet(5);
         }

         if (this.r == null) {
            this.r = Lists.newArrayListWithCapacity(5);
         }

         if (this.q.size() >= this.D() + 1) {
            this.am();
            return;
         }

         this.q.add($$1.aj());
      }

      if (this.B()) {
         long $$4 = (long)this.ag.a($$3 / 2 + 2);
         $$3 = (int)Math.min($$4 + (long)$$3, 2147483647L);
      }

      bkq $$5 = this.w();
      bjo $$6;
      if ($$5 == null) {
         $$6 = this.dO().a(this, this);
      } else {
         $$6 = this.dO().a(this, $$5);
         if ($$5 instanceof blg) {
            ((blg)$$5).A($$1);
         }
      }

      boolean $$8 = $$1.ai() == bku.E;
      int $$9 = $$1.az();
      if (this.bN() && !$$8) {
         $$1.g(5);
      }

      if ($$1.a($$6, (float)$$3)) {
         if ($$8) {
            return;
         }

         if ($$1 instanceof blg $$10) {
            if (!this.dN().B && this.D() <= 0) {
               $$10.p($$10.eP() + 1);
            }

            if (this.o > 0) {
               double $$11 = Math.max(0.0, 1.0 - $$10.b(bmm.i));
               eju $$12 = this.dq().d(1.0, 0.0, 1.0).d().a((double)this.o * 0.6 * $$11);
               if ($$12.g() > 0.0) {
                  $$10.j($$12.c, 0.1, $$12.e);
               }
            }

            if (!this.dN().B && $$5 instanceof blg) {
               cpw.a($$10, $$5);
               cpw.b((blg)$$5, $$10);
            }

            this.a($$10);
            if ($$5 != null && $$10 != $$5 && $$10 instanceof cdu && $$5 instanceof amf && !this.aU()) {
               ((amf)$$5).c.b(new zi(zi.g, 0.0F));
            }

            if (!$$1.bx() && this.r != null) {
               this.r.add($$10);
            }

            if (!this.dN().B && $$5 instanceof amf $$13) {
               if (this.r != null && this.C()) {
                  al.G.a($$13, this.r);
               } else if (!$$1.bx() && this.C()) {
                  al.G.a($$13, Arrays.asList($$1));
               }
            }
         }

         this.a(this.p, 1.0F, 1.2F / (this.ag.i() * 0.2F + 0.9F));
         if (this.D() <= 0) {
            this.am();
         }
      } else {
         $$1.h($$9);
         this.g(this.dq().a(-0.1));
         this.r(this.dD() + 180.0F);
         this.N += 180.0F;
         if (!this.dN().B && this.dq().g() < 1.0E-7) {
            if (this.d == cea.a.b) {
               this.a(this.x(), 0.1F);
            }

            this.am();
         }
      }
   }

   @Override
   protected void a(ejq $$0) {
      this.l = this.dN().a_($$0.a());
      super.a($$0);
      eju $$1 = $$0.e().a(this.ds(), this.du(), this.dy());
      this.g($$1);
      eju $$2 = $$1.d().a(0.05F);
      this.p(this.ds() - $$2.c, this.du() - $$2.d, this.dy() - $$2.e);
      this.a(this.u(), 1.0F, 1.2F / (this.ag.i() * 0.2F + 0.9F));
      this.b = true;
      this.e = 7;
      this.a(false);
      this.a((byte)0);
      this.b(aqr.ap);
      this.q(false);
      this.M();
   }

   protected aqq s() {
      return aqr.ap;
   }

   protected final aqq u() {
      return this.p;
   }

   protected void a(blg $$0) {
   }

   @Nullable
   protected ejr a(eju $$0, eju $$1) {
      return cen.a(this.dN(), this, $$0, $$1, this.cH().b(this.dq()).g(1.0), this::a);
   }

   @Override
   protected boolean a(bkq $$0) {
      return super.a($$0) && (this.q == null || !this.q.contains($$0.aj()));
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
      $$0.a("crit", this.B());
      $$0.a("PierceLevel", this.D());
      $$0.a("SoundEvent", jy.c.b(this.p).toString());
      $$0.a("ShotFromCrossbow", this.C());
      $$0.a("item", this.s.b(new rz()));
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.m = $$0.g("life");
      if ($$0.b("inBlockState", 10)) {
         this.l = so.a(this.dN().a(jz.e), $$0.p("inBlockState"));
      }

      this.e = $$0.f("shake") & 255;
      this.b = $$0.q("inGround");
      if ($$0.b("damage", 99)) {
         this.n = $$0.k("damage");
      }

      this.d = cea.a.a($$0.f("pickup"));
      this.a($$0.q("crit"));
      this.a($$0.f("PierceLevel"));
      if ($$0.b("SoundEvent", 8)) {
         this.p = jy.c.b(new agi($$0.l("SoundEvent"))).orElse(this.s());
      }

      this.q($$0.q("ShotFromCrossbow"));
      if ($$0.b("item", 10)) {
         this.s = clj.a($$0.p("item"));
      }
   }

   @Override
   public void b(@Nullable bkq $$0) {
      super.b($$0);
      if ($$0 instanceof cdu) {
         this.d = ((cdu)$$0).fU().d ? cea.a.c : cea.a.b;
      }
   }

   @Override
   public void b_(cdu $$0) {
      if (!this.dN().B && (this.b || this.G()) && this.e <= 0) {
         if (this.a($$0)) {
            $$0.a(this, 1);
            this.am();
         }
      }
   }

   protected boolean a(cdu $$0) {
      switch (this.d) {
         case b:
            return $$0.fT().e(this.x());
         case c:
            return $$0.fU().d;
         default:
            return false;
      }
   }

   protected clj x() {
      return this.s.p();
   }

   @Override
   protected bkq.b aW() {
      return bkq.b.a;
   }

   public clj y() {
      return this.s;
   }

   public void h(double $$0) {
      this.n = $$0;
   }

   public double z() {
      return this.n;
   }

   public void b(int $$0) {
      this.o = $$0;
   }

   public int A() {
      return this.o;
   }

   @Override
   public boolean cq() {
      return false;
   }

   @Override
   protected float a(bls $$0, bkr $$1) {
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

   public boolean B() {
      byte $$0 = this.an.b(g);
      return ($$0 & 1) != 0;
   }

   public boolean C() {
      byte $$0 = this.an.b(g);
      return ($$0 & 4) != 0;
   }

   public byte D() {
      return this.an.b(h);
   }

   public void a(blg $$0, float $$1) {
      int $$2 = cpw.a(cpy.y, $$0);
      int $$3 = cpw.a(cpy.z, $$0);
      this.h((double)($$1 * 2.0F) + this.ag.a((double)this.dN().aj().a() * 0.11, 0.57425));
      if ($$2 > 0) {
         this.h(this.z() + (double)$$2 * 0.5 + 0.5);
      }

      if ($$3 > 0) {
         this.b($$3);
      }

      if (cpw.a(cpy.A, $$0) > 0) {
         this.g(100);
      }
   }

   protected float E() {
      return 0.6F;
   }

   public void p(boolean $$0) {
      this.af = $$0;
      this.a(2, $$0);
   }

   public boolean G() {
      return !this.dN().B ? this.af : (this.an.b(g) & 2) != 0;
   }

   public void q(boolean $$0) {
      this.a(4, $$0);
   }

   public static enum a {
      a,
      b,
      c;

      public static cea.a a(int $$0) {
         if ($$0 < 0 || $$0 > values().length) {
            $$0 = 0;
         }

         return values()[$$0];
      }
   }
}
