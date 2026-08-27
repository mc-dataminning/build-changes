import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;

public abstract class cex extends cfj {
   private static final double f = 2.0;
   private static final afz<Byte> g = agc.a(cex.class, agb.a);
   private static final afz<Byte> h = agc.a(cex.class, agb.a);
   private static final int i = 1;
   private static final int j = 2;
   private static final int k = 4;
   @Nullable
   private dip l;
   protected boolean b;
   protected int c;
   public cex.a d = cex.a.a;
   public int e;
   private int m;
   private double n = 2.0;
   private int o;
   private arb p = this.u();
   @Nullable
   private IntOpenHashSet q;
   @Nullable
   private List<blf> r;
   private cmh s;

   protected cex(blj<? extends cex> $$0, csy $$1, cmh $$2) {
      super($$0, $$1);
      this.s = $$2.p();
   }

   protected cex(blj<? extends cex> $$0, double $$1, double $$2, double $$3, csy $$4, cmh $$5) {
      this($$0, $$4, $$5);
      this.a_($$1, $$2, $$3);
   }

   protected cex(blj<? extends cex> $$0, blv $$1, csy $$2, cmh $$3) {
      this($$0, $$1.dr(), $$1.dv() - 0.1F, $$1.dx(), $$2, $$3);
      this.b($$1);
      if ($$1 instanceof cer) {
         this.d = cex.a.b;
      }
   }

   public void b(arb $$0) {
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
   protected void c_() {
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
      boolean $$0 = this.H();
      elb $$1 = this.dp();
      if (this.O == 0.0F && this.N == 0.0F) {
         double $$2 = $$1.h();
         this.r((float)(aty.d($$1.c, $$1.e) * 180.0F / (float)Math.PI));
         this.s((float)(aty.d($$1.d, $$2) * 180.0F / (float)Math.PI));
         this.N = this.dC();
         this.O = this.dE();
      }

      hv $$3 = this.dm();
      dip $$4 = this.dM().a_($$3);
      if (!$$4.i() && !$$0) {
         elu $$5 = $$4.k(this.dM(), $$3);
         if (!$$5.c()) {
            elb $$6 = this.dk();

            for (ekw $$7 : $$5.e()) {
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

      if (this.ba() || $$4.a(cwb.qP)) {
         this.aA();
      }

      if (this.b && !$$0) {
         if (this.l != $$4 && this.I()) {
            this.M();
         } else if (!this.dM().B) {
            this.q();
         }

         this.c++;
      } else {
         this.c = 0;
         elb $$8 = this.dk();
         elb $$9 = $$8.e($$1);
         ekz $$10 = this.dM().a(new csh($$8, $$9, csh.a.a, csh.b.a, this));
         if ($$10.c() != ekz.a.a) {
            $$9 = $$10.e();
         }

         while (!this.dH()) {
            eky $$11 = this.a($$8, $$9);
            if ($$11 != null) {
               $$10 = $$11;
            }

            if ($$10 != null && $$10.c() == ekz.a.c) {
               blf $$12 = ((eky)$$10).a();
               blf $$13 = this.w();
               if ($$12 instanceof cer && $$13 instanceof cer && !((cer)$$13).a((cer)$$12)) {
                  $$10 = null;
                  $$11 = null;
               }
            }

            if ($$10 != null && !$$0) {
               this.a($$10);
               this.au = true;
            }

            if ($$11 == null || this.E() <= 0) {
               break;
            }

            $$10 = null;
         }

         $$1 = this.dp();
         double $$14 = $$1.c;
         double $$15 = $$1.d;
         double $$16 = $$1.e;
         if (this.C()) {
            for (int $$17 = 0; $$17 < 4; $$17++) {
               this.dM()
                  .a(
                     jv.g,
                     this.dr() + $$14 * (double)$$17 / 4.0,
                     this.dt() + $$15 * (double)$$17 / 4.0,
                     this.dx() + $$16 * (double)$$17 / 4.0,
                     -$$14,
                     -$$15 + 0.2,
                     -$$16
                  );
            }
         }

         double $$18 = this.dr() + $$14;
         double $$19 = this.dt() + $$15;
         double $$20 = this.dx() + $$16;
         double $$21 = $$1.h();
         if ($$0) {
            this.r((float)(aty.d(-$$14, -$$16) * 180.0F / (float)Math.PI));
         } else {
            this.r((float)(aty.d($$14, $$16) * 180.0F / (float)Math.PI));
         }

         this.s((float)(aty.d($$15, $$21) * 180.0F / (float)Math.PI));
         this.s(d(this.O, this.dE()));
         this.r(d(this.N, this.dC()));
         float $$22 = 0.99F;
         float $$23 = 0.05F;
         if (this.aZ()) {
            for (int $$24 = 0; $$24 < 4; $$24++) {
               float $$25 = 0.25F;
               this.dM().a(jv.e, $$18 - $$14 * 0.25, $$19 - $$15 * 0.25, $$20 - $$16 * 0.25, $$14, $$15, $$16);
            }

            $$22 = this.G();
         }

         this.g($$1.a((double)$$22));
         if (!this.aV() && !$$0) {
            elb $$26 = this.dp();
            this.o($$26.c, $$26.d - 0.05F, $$26.e);
         }

         this.a_($$18, $$19, $$20);
         this.aQ();
      }
   }

   private boolean I() {
      return this.b && this.dM().b(new ekw(this.dk(), this.dk()).g(0.06));
   }

   private void M() {
      this.b = false;
      elb $$0 = this.dp();
      this.g($$0.d((double)(this.ag.i() * 0.2F), (double)(this.ag.i() * 0.2F), (double)(this.ag.i() * 0.2F)));
      this.m = 0;
   }

   @Override
   public void a(bmb $$0, elb $$1) {
      super.a($$0, $$1);
      if ($$0 != bmb.a && this.I()) {
         this.M();
      }
   }

   protected void q() {
      this.m++;
      if (this.m >= 1200) {
         this.am();
      }
   }

   private void N() {
      if (this.r != null) {
         this.r.clear();
      }

      if (this.q != null) {
         this.q.clear();
      }
   }

   @Override
   protected void a(eky $$0) {
      super.a($$0);
      blf $$1 = $$0.a();
      float $$2 = (float)this.dp().f();
      int $$3 = aty.c(aty.a((double)$$2 * this.n, 0.0, 2.147483647E9));
      if (this.E() > 0) {
         if (this.q == null) {
            this.q = new IntOpenHashSet(5);
         }

         if (this.r == null) {
            this.r = Lists.newArrayListWithCapacity(5);
         }

         if (this.q.size() >= this.E() + 1) {
            this.am();
            return;
         }

         this.q.add($$1.aj());
      }

      if (this.C()) {
         long $$4 = (long)this.ag.a($$3 / 2 + 2);
         $$3 = (int)Math.min($$4 + (long)$$3, 2147483647L);
      }

      blf $$5 = this.w();
      bkd $$6;
      if ($$5 == null) {
         $$6 = this.dN().a(this, this);
      } else {
         $$6 = this.dN().a(this, $$5);
         if ($$5 instanceof blv) {
            ((blv)$$5).A($$1);
         }
      }

      boolean $$8 = $$1.ai() == blj.F;
      int $$9 = $$1.az();
      if (this.bN() && !$$8) {
         $$1.g(5);
      }

      if ($$1.a($$6, (float)$$3)) {
         if ($$8) {
            return;
         }

         if ($$1 instanceof blv $$10) {
            if (!this.dM().B && this.E() <= 0) {
               $$10.p($$10.eO() + 1);
            }

            if (this.o > 0) {
               double $$11 = Math.max(0.0, 1.0 - $$10.b(bnb.i));
               elb $$12 = this.dp().d(1.0, 0.0, 1.0).d().a((double)this.o * 0.6 * $$11);
               if ($$12.g() > 0.0) {
                  $$10.j($$12.c, 0.1, $$12.e);
               }
            }

            if (!this.dM().B && $$5 instanceof blv) {
               cqu.a($$10, $$5);
               cqu.b((blv)$$5, $$10);
            }

            this.a($$10);
            if ($$5 != null && $$10 != $$5 && $$10 instanceof cer && $$5 instanceof amq && !this.aU()) {
               ((amq)$$5).c.b(new zt(zt.g, 0.0F));
            }

            if (!$$1.bx() && this.r != null) {
               this.r.add($$10);
            }

            if (!this.dM().B && $$5 instanceof amq $$13) {
               if (this.r != null && this.D()) {
                  am.H.a($$13, this.r);
               } else if (!$$1.bx() && this.D()) {
                  am.H.a($$13, Arrays.asList($$1));
               }
            }
         }

         this.a(this.p, 1.0F, 1.2F / (this.ag.i() * 0.2F + 0.9F));
         if (this.E() <= 0) {
            this.am();
         }
      } else if ($$1.ai().a(aru.r)) {
         this.s();
      } else {
         $$1.h($$9);
         this.g(this.dp().a(-0.1));
         this.r(this.dC() + 180.0F);
         this.N += 180.0F;
         if (!this.dM().B && this.dp().g() < 1.0E-7) {
            if (this.d == cex.a.b) {
               this.a(this.y(), 0.1F);
            }

            this.am();
         }
      }
   }

   @Override
   public void s() {
      float $$0 = this.ag.i() * 360.0F;
      this.g(this.dp().b($$0 * (float) (Math.PI / 180.0)).a(0.5));
      this.r(this.dC() + $$0);
      this.N += $$0;
   }

   @Override
   protected void a(ekx $$0) {
      this.l = this.dM().a_($$0.a());
      super.a($$0);
      elb $$1 = $$0.e().a(this.dr(), this.dt(), this.dx());
      this.g($$1);
      elb $$2 = $$1.d().a(0.05F);
      this.p(this.dr() - $$2.c, this.dt() - $$2.d, this.dx() - $$2.e);
      this.a(this.x(), 1.0F, 1.2F / (this.ag.i() * 0.2F + 0.9F));
      this.b = true;
      this.e = 7;
      this.a(false);
      this.a((byte)0);
      this.b(arc.ap);
      this.q(false);
      this.N();
   }

   protected arb u() {
      return arc.ap;
   }

   protected final arb x() {
      return this.p;
   }

   protected void a(blv $$0) {
   }

   @Nullable
   protected eky a(elb $$0, elb $$1) {
      return cfk.a(this.dM(), this, $$0, $$1, this.cH().b(this.dp()).g(1.0), this::a);
   }

   @Override
   protected boolean a(blf $$0) {
      return super.a($$0) && (this.q == null || !this.q.contains($$0.aj()));
   }

   @Override
   public void b(sj $$0) {
      super.b($$0);
      $$0.a("life", (short)this.m);
      if (this.l != null) {
         $$0.a("inBlockState", sy.a(this.l));
      }

      $$0.a("shake", (byte)this.e);
      $$0.a("inGround", this.b);
      $$0.a("pickup", (byte)this.d.ordinal());
      $$0.a("damage", this.n);
      $$0.a("crit", this.C());
      $$0.a("PierceLevel", this.E());
      $$0.a("SoundEvent", kb.b.b(this.p).toString());
      $$0.a("ShotFromCrossbow", this.D());
      $$0.a("item", this.s.b(new sj()));
   }

   @Override
   public void a(sj $$0) {
      super.a($$0);
      this.m = $$0.g("life");
      if ($$0.b("inBlockState", 10)) {
         this.l = sy.a(this.dM().a(kc.f), $$0.p("inBlockState"));
      }

      this.e = $$0.f("shake") & 255;
      this.b = $$0.q("inGround");
      if ($$0.b("damage", 99)) {
         this.n = $$0.k("damage");
      }

      this.d = cex.a.a($$0.f("pickup"));
      this.a($$0.q("crit"));
      this.a($$0.f("PierceLevel"));
      if ($$0.b("SoundEvent", 8)) {
         this.p = kb.b.b(new agt($$0.l("SoundEvent"))).orElse(this.u());
      }

      this.q($$0.q("ShotFromCrossbow"));
      if ($$0.b("item", 10)) {
         this.s = cmh.a($$0.p("item"));
      }
   }

   @Override
   public void b(@Nullable blf $$0) {
      super.b($$0);
      if ($$0 instanceof cer) {
         this.d = ((cer)$$0).fT().d ? cex.a.c : cex.a.b;
      }
   }

   @Override
   public void b_(cer $$0) {
      if (!this.dM().B && (this.b || this.H()) && this.e <= 0) {
         if (this.a($$0)) {
            $$0.a(this, 1);
            this.am();
         }
      }
   }

   protected boolean a(cer $$0) {
      switch (this.d) {
         case b:
            return $$0.fS().e(this.y());
         case c:
            return $$0.fT().d;
         default:
            return false;
      }
   }

   protected cmh y() {
      return this.s.p();
   }

   @Override
   protected blf.b aW() {
      return blf.b.a;
   }

   public cmh z() {
      return this.s;
   }

   public void h(double $$0) {
      this.n = $$0;
   }

   public double A() {
      return this.n;
   }

   public void b(int $$0) {
      this.o = $$0;
   }

   public int B() {
      return this.o;
   }

   @Override
   public boolean cq() {
      return false;
   }

   @Override
   protected float a(bmh $$0, blg $$1) {
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

   public boolean C() {
      byte $$0 = this.an.b(g);
      return ($$0 & 1) != 0;
   }

   public boolean D() {
      byte $$0 = this.an.b(g);
      return ($$0 & 4) != 0;
   }

   public byte E() {
      return this.an.b(h);
   }

   public void a(blv $$0, float $$1) {
      int $$2 = cqu.a(cqw.y, $$0);
      int $$3 = cqu.a(cqw.z, $$0);
      this.h((double)($$1 * 2.0F) + this.ag.a((double)this.dM().aj().a() * 0.11, 0.57425));
      if ($$2 > 0) {
         this.h(this.A() + (double)$$2 * 0.5 + 0.5);
      }

      if ($$3 > 0) {
         this.b($$3);
      }

      if (cqu.a(cqw.A, $$0) > 0) {
         this.g(100);
      }
   }

   protected float G() {
      return 0.6F;
   }

   public void p(boolean $$0) {
      this.af = $$0;
      this.a(2, $$0);
   }

   public boolean H() {
      return !this.dM().B ? this.af : (this.an.b(g) & 2) != 0;
   }

   public void q(boolean $$0) {
      this.a(4, $$0);
   }

   public static enum a {
      a,
      b,
      c;

      public static cex.a a(int $$0) {
         if ($$0 < 0 || $$0 > values().length) {
            $$0 = 0;
         }

         return values()[$$0];
      }
   }
}
