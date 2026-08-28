import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;

public abstract class cmr extends cnd {
   private static final double f = 2.0;
   private static final ajp<Byte> g = ajt.a(cmr.class, ajr.a);
   private static final ajp<Byte> h = ajt.a(cmr.class, ajr.a);
   private static final int i = 1;
   private static final int j = 2;
   @Nullable
   private dsl k;
   protected boolean b;
   protected int c;
   public cmr.a d = cmr.a.a;
   public int e;
   private int l;
   private double m = 2.0;
   private avg n = this.v();
   @Nullable
   private IntOpenHashSet o;
   @Nullable
   private List<bsh> p;
   private cud q = this.y();
   @Nullable
   private cud r = null;

   protected cmr(bsn<? extends cmr> $$0, dcg $$1) {
      super($$0, $$1);
   }

   protected cmr(bsn<? extends cmr> $$0, double $$1, double $$2, double $$3, dcg $$4, cud $$5, @Nullable cud $$6) {
      this($$0, $$4);
      this.q = $$5.s();
      this.b($$5.a(kn.g));
      azk $$7 = $$5.c(kn.u);
      if ($$7 != null) {
         this.d = cmr.a.c;
      }

      this.a_($$1, $$2, $$3);
      if ($$6 != null && $$4 instanceof aqm $$8) {
         this.r = $$6.s();
         int $$9 = czo.a($$8, $$6, this.q);
         if ($$9 > 0) {
            this.a((byte)$$9);
         }

         czo.a($$8, $$6, this, $$0x -> this.r = null);
      }
   }

   protected cmr(bsn<? extends cmr> $$0, btc $$1, dcg $$2, cud $$3, @Nullable cud $$4) {
      this($$0, $$1.dw(), $$1.dA() - 0.1F, $$1.dC(), $$2, $$3, $$4);
      this.c($$1);
   }

   public void b(avg $$0) {
      this.n = $$0;
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cM().a() * 10.0;
      if (Double.isNaN($$1)) {
         $$1 = 1.0;
      }

      $$1 *= 64.0 * cF();
      return $$0 < $$1 * $$1;
   }

   @Override
   protected void a(ajt.a $$0) {
      $$0.a(g, (byte)0);
      $$0.a(h, (byte)0);
   }

   @Override
   public void c(double $$0, double $$1, double $$2, float $$3, float $$4) {
      super.c($$0, $$1, $$2, $$3, $$4);
      this.l = 0;
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      this.a_($$0, $$1, $$2);
      this.a($$3, $$4);
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      super.l($$0, $$1, $$2);
      this.l = 0;
   }

   @Override
   public void l() {
      super.l();
      boolean $$0 = this.F();
      ewh $$1 = this.du();
      if (this.P == 0.0F && this.O == 0.0F) {
         double $$2 = $$1.h();
         this.s((float)(ayg.d($$1.c, $$1.e) * 180.0F / (float)Math.PI));
         this.t((float)(ayg.d($$1.d, $$2) * 180.0F / (float)Math.PI));
         this.O = this.dH();
         this.P = this.dJ();
      }

      ja $$3 = this.dr();
      dsl $$4 = this.dR().a_($$3);
      if (!$$4.i() && !$$0) {
         exa $$5 = $$4.k(this.dR(), $$3);
         if (!$$5.c()) {
            ewh $$6 = this.dp();

            for (ewc $$7 : $$5.e()) {
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

      if (this.bh() || $$4.a(dfk.qP)) {
         this.aE();
      }

      if (this.b && !$$0) {
         if (this.k != $$4 && this.H()) {
            this.K();
         } else if (!this.dR().B) {
            this.p();
         }

         this.c++;
      } else {
         this.c = 0;
         ewh $$8 = this.dp();
         ewh $$9 = $$8.e($$1);
         ewf $$10 = this.dR().a(new dbp($$8, $$9, dbp.a.a, dbp.b.a, this));
         if ($$10.c() != ewf.a.a) {
            $$9 = $$10.e();
         }

         while (!this.dM()) {
            ewe $$11 = this.a($$8, $$9);
            if ($$11 != null) {
               $$10 = $$11;
            }

            if ($$10 != null && $$10.c() == ewf.a.c) {
               bsh $$12 = ((ewe)$$10).a();
               bsh $$13 = this.s();
               if ($$12 instanceof cml && $$13 instanceof cml && !((cml)$$13).a((cml)$$12)) {
                  $$10 = null;
                  $$11 = null;
               }
            }

            if ($$10 != null && !$$0) {
               cne $$14 = this.b($$10);
               this.av = true;
               if ($$14 != cne.a) {
                  break;
               }
            }

            if ($$11 == null || this.D() <= 0) {
               break;
            }

            $$10 = null;
         }

         $$1 = this.du();
         double $$15 = $$1.c;
         double $$16 = $$1.d;
         double $$17 = $$1.e;
         if (this.B()) {
            for (int $$18 = 0; $$18 < 4; $$18++) {
               this.dR()
                  .a(
                     lj.f,
                     this.dw() + $$15 * (double)$$18 / 4.0,
                     this.dy() + $$16 * (double)$$18 / 4.0,
                     this.dC() + $$17 * (double)$$18 / 4.0,
                     -$$15,
                     -$$16 + 0.2,
                     -$$17
                  );
            }
         }

         double $$19 = this.dw() + $$15;
         double $$20 = this.dy() + $$16;
         double $$21 = this.dC() + $$17;
         double $$22 = $$1.h();
         if ($$0) {
            this.s((float)(ayg.d(-$$15, -$$17) * 180.0F / (float)Math.PI));
         } else {
            this.s((float)(ayg.d($$15, $$17) * 180.0F / (float)Math.PI));
         }

         this.t((float)(ayg.d($$16, $$22) * 180.0F / (float)Math.PI));
         this.t(e(this.P, this.dJ()));
         this.s(e(this.O, this.dH()));
         float $$23 = 0.99F;
         if (this.bg()) {
            for (int $$24 = 0; $$24 < 4; $$24++) {
               float $$25 = 0.25F;
               this.dR().a(lj.d, $$19 - $$15 * 0.25, $$20 - $$16 * 0.25, $$21 - $$17 * 0.25, $$15, $$16, $$17);
            }

            $$23 = this.E();
         }

         this.j($$1.a((double)$$23));
         if (!$$0) {
            this.bc();
         }

         this.a_($$19, $$20, $$21);
         this.aU();
      }
   }

   @Override
   protected double ba() {
      return 0.05;
   }

   private boolean H() {
      return this.b && this.dR().b(new ewc(this.dp(), this.dp()).g(0.06));
   }

   private void K() {
      this.b = false;
      ewh $$0 = this.du();
      this.j($$0.d((double)(this.ah.i() * 0.2F), (double)(this.ah.i() * 0.2F), (double)(this.ah.i() * 0.2F)));
      this.l = 0;
   }

   @Override
   public void a(bth $$0, ewh $$1) {
      super.a($$0, $$1);
      if ($$0 != bth.a && this.H()) {
         this.K();
      }
   }

   protected void p() {
      this.l++;
      if (this.l >= 1200) {
         this.aq();
      }
   }

   private void L() {
      if (this.p != null) {
         this.p.clear();
      }

      if (this.o != null) {
         this.o.clear();
      }
   }

   @Override
   protected void a(ewe $$0) {
      super.a($$0);
      bsh $$1 = $$0.a();
      float $$2 = (float)this.du().f();
      double $$3 = this.m;
      bsh $$4 = this.s();
      bra $$5 = this.dS().a(this, (bsh)($$4 != null ? $$4 : this));
      if (this.t() != null && this.dR() instanceof aqm $$6) {
         $$3 = (double)czo.a($$6, this.t(), $$1, $$5, (float)$$3);
      }

      int $$7 = ayg.c(ayg.a((double)$$2 * $$3, 0.0, 2.147483647E9));
      if (this.D() > 0) {
         if (this.o == null) {
            this.o = new IntOpenHashSet(5);
         }

         if (this.p == null) {
            this.p = Lists.newArrayListWithCapacity(5);
         }

         if (this.o.size() >= this.D() + 1) {
            this.aq();
            return;
         }

         this.o.add($$1.an());
      }

      if (this.B()) {
         long $$8 = (long)this.ah.a($$7 / 2 + 2);
         $$7 = (int)Math.min($$8 + (long)$$7, 2147483647L);
      }

      if ($$4 instanceof btc $$9) {
         $$9.A($$1);
      }

      boolean $$10 = $$1.am() == bsn.H;
      int $$11 = $$1.aD();
      if (this.bS() && !$$10) {
         $$1.d(5.0F);
      }

      if ($$1.a($$5, (float)$$7)) {
         if ($$10) {
            return;
         }

         if ($$1 instanceof btc $$12) {
            if (!this.dR().B && this.D() <= 0) {
               $$12.p($$12.eR() + 1);
            }

            this.a($$12, $$5);
            if (this.dR() instanceof aqm $$13) {
               czo.a($$13, $$12, $$5, this.t());
            }

            this.a($$12);
            if ($$12 != $$4 && $$12 instanceof cml && $$4 instanceof aqn && !this.aY()) {
               ((aqn)$$4).c.b(new acu(acu.h, 0.0F));
            }

            if (!$$1.bF() && this.p != null) {
               this.p.add($$12);
            }

            if (!this.dR().B && $$4 instanceof aqn $$14) {
               if (this.p != null && this.C()) {
                  am.H.a($$14, this.p);
               } else if (!$$1.bF() && this.C()) {
                  am.H.a($$14, Arrays.asList($$1));
               }
            }
         }

         this.a(this.n, 1.0F, 1.2F / (this.ah.i() * 0.2F + 0.9F));
         if (this.D() <= 0) {
            this.aq();
         }
      } else {
         $$1.h($$11);
         this.a(cne.b, $$1, this.s(), false);
         this.j(this.du().a(0.2));
         if (!this.dR().B && this.du().g() < 1.0E-7) {
            if (this.d == cmr.a.b) {
               this.a(this.x(), 0.1F);
            }

            this.aq();
         }
      }
   }

   protected void a(btc $$0, bra $$1) {
      double $$3 = (double)(this.r != null && this.dR() instanceof aqm $$2 ? czo.d($$2, this.r, $$0, $$1, 0.0F) : 0.0F);
      if ($$3 > 0.0) {
         double $$4 = Math.max(0.0, 1.0 - $$0.g(buk.p));
         ewh $$5 = this.du().d(1.0, 0.0, 1.0).d().a($$3 * 0.6 * $$4);
         if ($$5.g() > 0.0) {
            $$0.j($$5.c, 0.1, $$5.e);
         }
      }
   }

   @Override
   protected void a(ewd $$0) {
      this.k = this.dR().a_($$0.a());
      super.a($$0);
      ewh $$1 = $$0.e().a(this.dw(), this.dy(), this.dC());
      this.j($$1);
      cud $$2 = this.t();
      if (this.dR() instanceof aqm $$3 && $$2 != null) {
         this.a($$3, $$0, $$2);
      }

      ewh $$4 = $$1.d().a(0.05F);
      this.p(this.dw() - $$4.c, this.dy() - $$4.d, this.dC() - $$4.e);
      this.a(this.w(), 1.0F, 1.2F / (this.ah.i() * 0.2F + 0.9F));
      this.b = true;
      this.e = 7;
      this.a(false);
      this.a((byte)0);
      this.b(avh.aE);
      this.L();
   }

   protected void a(aqm $$0, ewd $$1, cud $$2) {
      czo.a($$0, $$2, this.s() instanceof btc $$3 ? $$3 : null, this, null, $$1.e(), $$0x -> this.r = null);
   }

   @Nullable
   protected cud t() {
      return this.r;
   }

   protected avg v() {
      return avh.aE;
   }

   protected final avg w() {
      return this.n;
   }

   protected void a(btc $$0) {
   }

   @Nullable
   protected ewe a(ewh $$0, ewh $$1) {
      return cnf.a(this.dR(), this, $$0, $$1, this.cM().b(this.du()).g(1.0), this::b);
   }

   @Override
   protected boolean b(bsh $$0) {
      return super.b($$0) && (this.o == null || !this.o.contains($$0.an()));
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("life", (short)this.l);
      if (this.k != null) {
         $$0.a("inBlockState", um.a(this.k));
      }

      $$0.a("shake", (byte)this.e);
      $$0.a("inGround", this.b);
      $$0.a("pickup", (byte)this.d.ordinal());
      $$0.a("damage", this.m);
      $$0.a("crit", this.B());
      $$0.a("PierceLevel", this.D());
      $$0.a("SoundEvent", lq.b.b(this.n).toString());
      $$0.a("item", this.q.a(this.dT()));
      if (this.r != null) {
         $$0.a("weapon", this.r.b(this.dT(), new tx()));
      }
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.l = $$0.g("life");
      if ($$0.b("inBlockState", 10)) {
         this.k = um.a(this.dR().a(lr.f), $$0.p("inBlockState"));
      }

      this.e = $$0.f("shake") & 255;
      this.b = $$0.q("inGround");
      if ($$0.b("damage", 99)) {
         this.m = $$0.k("damage");
      }

      this.d = cmr.a.a($$0.f("pickup"));
      this.a($$0.q("crit"));
      this.a($$0.f("PierceLevel"));
      if ($$0.b("SoundEvent", 8)) {
         this.n = lq.b.b(new akk($$0.l("SoundEvent"))).orElse(this.v());
      }

      if ($$0.b("item", 10)) {
         this.a(cud.a(this.dT(), (uu)$$0.p("item")).orElse(this.y()));
      } else {
         this.a(this.y());
      }

      if ($$0.b("weapon", 10)) {
         this.r = cud.a(this.dT(), (uu)$$0.p("weapon")).orElse(null);
      } else {
         this.r = null;
      }
   }

   @Override
   public void c(@Nullable bsh $$0) {
      super.c($$0);

      this.d = switch ($$0) {
         case null, default -> this.d;
         case cml $$1 when this.d == cmr.a.a -> cmr.a.b;
         case btj $$2 -> cmr.a.a;
      };
   }

   @Override
   public void b_(cml $$0) {
      if (!this.dR().B && (this.b || this.F()) && this.e <= 0) {
         if (this.a($$0)) {
            $$0.a(this, 1);
            this.aq();
         }
      }
   }

   protected boolean a(cml $$0) {
      return switch (this.d) {
         case a -> false;
         case b -> $$0.ga().f(this.x());
         case c -> $$0.fN();
      };
   }

   protected cud x() {
      return this.q.s();
   }

   protected abstract cud y();

   @Override
   protected bsh.c bd() {
      return bsh.c.a;
   }

   public cud z() {
      return this.q;
   }

   public void h(double $$0) {
      this.m = $$0;
   }

   public double A() {
      return this.m;
   }

   @Override
   public boolean cv() {
      return this.am().a(awa.H);
   }

   public void a(boolean $$0) {
      this.a(1, $$0);
   }

   private void a(byte $$0) {
      this.ao.a(h, $$0);
   }

   private void a(int $$0, boolean $$1) {
      byte $$2 = this.ao.a(g);
      if ($$1) {
         this.ao.a(g, (byte)($$2 | $$0));
      } else {
         this.ao.a(g, (byte)($$2 & ~$$0));
      }
   }

   protected void a(cud $$0) {
      if (!$$0.e()) {
         this.q = $$0;
      } else {
         this.q = this.y();
      }
   }

   public boolean B() {
      byte $$0 = this.ao.a(g);
      return ($$0 & 1) != 0;
   }

   public boolean C() {
      return this.r != null && this.r.a(cug.vW);
   }

   public byte D() {
      return this.ao.a(h);
   }

   public void a(float $$0) {
      this.h((double)($$0 * 2.0F) + this.ah.a((double)this.dR().al().a() * 0.11, 0.57425));
   }

   protected float E() {
      return 0.6F;
   }

   public void b(boolean $$0) {
      this.ag = $$0;
      this.a(2, $$0);
   }

   public boolean F() {
      return !this.dR().B ? this.ag : (this.ao.a(g) & 2) != 0;
   }

   @Override
   public boolean bB() {
      return super.bB() && !this.b;
   }

   @Override
   public btu a_(int $$0) {
      return $$0 == 0 ? btu.a(this::z, this::a) : super.a_($$0);
   }

   public static enum a {
      a,
      b,
      c;

      public static cmr.a a(int $$0) {
         if ($$0 < 0 || $$0 > values().length) {
            $$0 = 0;
         }

         return values()[$$0];
      }
   }
}
