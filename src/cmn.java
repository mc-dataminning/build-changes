import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;

public abstract class cmn extends cmz {
   private static final double f = 2.0;
   private static final ajp<Byte> g = ajt.a(cmn.class, ajr.a);
   private static final ajp<Byte> h = ajt.a(cmn.class, ajr.a);
   private static final int i = 1;
   private static final int j = 2;
   @Nullable
   private dsh k;
   protected boolean b;
   protected int c;
   public cmn.a d = cmn.a.a;
   public int e;
   private int l;
   private double m = 2.0;
   private ave n = this.v();
   @Nullable
   private IntOpenHashSet o;
   @Nullable
   private List<bsd> p;
   private cua q = this.y();
   @Nullable
   private cua r = null;

   protected cmn(bsj<? extends cmn> $$0, dcd $$1) {
      super($$0, $$1);
   }

   protected cmn(bsj<? extends cmn> $$0, dcd $$1, cua $$2, @Nullable cua $$3) {
      this($$0, $$1);
      this.q = $$2.s();
      this.b($$2.a(kn.g));
      azh $$4 = $$2.c(kn.u);
      if ($$4 != null) {
         this.d = cmn.a.c;
      }

      if ($$3 != null && $$1 instanceof aqk $$5) {
         this.r = $$3.s();
         int $$6 = czl.a($$5, $$3, this.q);
         if ($$6 > 0) {
            this.a((byte)$$6);
         }

         czl.a($$5, $$3, this, () -> this.r = null);
      }
   }

   protected cmn(bsj<? extends cmn> $$0, double $$1, double $$2, double $$3, dcd $$4, cua $$5, @Nullable cua $$6) {
      this($$0, $$4, $$5, $$6);
      this.a_($$1, $$2, $$3);
   }

   protected cmn(bsj<? extends cmn> $$0, bsy $$1, dcd $$2, cua $$3, @Nullable cua $$4) {
      this($$0, $$1.du(), $$1.dy() - 0.1F, $$1.dA(), $$2, $$3, $$4);
      this.c($$1);
   }

   public void b(ave $$0) {
      this.n = $$0;
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
      boolean $$0 = this.G();
      evz $$1 = this.ds();
      if (this.P == 0.0F && this.O == 0.0F) {
         double $$2 = $$1.h();
         this.s((float)(aye.d($$1.c, $$1.e) * 180.0F / (float)Math.PI));
         this.t((float)(aye.d($$1.d, $$2) * 180.0F / (float)Math.PI));
         this.O = this.dF();
         this.P = this.dH();
      }

      ja $$3 = this.dp();
      dsh $$4 = this.dP().a_($$3);
      if (!$$4.i() && !$$0) {
         ews $$5 = $$4.k(this.dP(), $$3);
         if (!$$5.c()) {
            evz $$6 = this.dn();

            for (evu $$7 : $$5.e()) {
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

      if (this.bf() || $$4.a(dfh.qP)) {
         this.aC();
      }

      if (this.b && !$$0) {
         if (this.k != $$4 && this.H()) {
            this.K();
         } else if (!this.dP().B) {
            this.p();
         }

         this.c++;
      } else {
         this.c = 0;
         evz $$8 = this.dn();
         evz $$9 = $$8.e($$1);
         evx $$10 = this.dP().a(new dbm($$8, $$9, dbm.a.a, dbm.b.a, this));
         if ($$10.c() != evx.a.a) {
            $$9 = $$10.e();
         }

         while (!this.dK()) {
            evw $$11 = this.a($$8, $$9);
            if ($$11 != null) {
               $$10 = $$11;
            }

            if ($$10 != null && $$10.c() == evx.a.c) {
               bsd $$12 = ((evw)$$10).a();
               bsd $$13 = this.s();
               if ($$12 instanceof cmh && $$13 instanceof cmh && !((cmh)$$13).a((cmh)$$12)) {
                  $$10 = null;
                  $$11 = null;
               }
            }

            if ($$10 != null && !$$0) {
               cna $$14 = this.b($$10);
               this.av = true;
               if ($$14 != cna.a) {
                  break;
               }
            }

            if ($$11 == null || this.D() <= 0) {
               break;
            }

            $$10 = null;
         }

         $$1 = this.ds();
         double $$15 = $$1.c;
         double $$16 = $$1.d;
         double $$17 = $$1.e;
         if (this.B()) {
            for (int $$18 = 0; $$18 < 4; $$18++) {
               this.dP()
                  .a(
                     lj.f,
                     this.du() + $$15 * (double)$$18 / 4.0,
                     this.dw() + $$16 * (double)$$18 / 4.0,
                     this.dA() + $$17 * (double)$$18 / 4.0,
                     -$$15,
                     -$$16 + 0.2,
                     -$$17
                  );
            }
         }

         double $$19 = this.du() + $$15;
         double $$20 = this.dw() + $$16;
         double $$21 = this.dA() + $$17;
         double $$22 = $$1.h();
         if ($$0) {
            this.s((float)(aye.d(-$$15, -$$17) * 180.0F / (float)Math.PI));
         } else {
            this.s((float)(aye.d($$15, $$17) * 180.0F / (float)Math.PI));
         }

         this.t((float)(aye.d($$16, $$22) * 180.0F / (float)Math.PI));
         this.t(d(this.P, this.dH()));
         this.s(d(this.O, this.dF()));
         float $$23 = 0.99F;
         if (this.be()) {
            for (int $$24 = 0; $$24 < 4; $$24++) {
               float $$25 = 0.25F;
               this.dP().a(lj.d, $$19 - $$15 * 0.25, $$20 - $$16 * 0.25, $$21 - $$17 * 0.25, $$15, $$16, $$17);
            }

            $$23 = this.E();
         }

         this.h($$1.a((double)$$23));
         if (!$$0) {
            this.ba();
         }

         this.a_($$19, $$20, $$21);
         this.aS();
      }
   }

   @Override
   protected double aY() {
      return 0.05;
   }

   private boolean H() {
      return this.b && this.dP().b(new evu(this.dn(), this.dn()).g(0.06));
   }

   private void K() {
      this.b = false;
      evz $$0 = this.ds();
      this.h($$0.d((double)(this.ah.i() * 0.2F), (double)(this.ah.i() * 0.2F), (double)(this.ah.i() * 0.2F)));
      this.l = 0;
   }

   @Override
   public void a(btd $$0, evz $$1) {
      super.a($$0, $$1);
      if ($$0 != btd.a && this.H()) {
         this.K();
      }
   }

   protected void p() {
      this.l++;
      if (this.l >= 1200) {
         this.ao();
      }
   }

   private void M() {
      if (this.p != null) {
         this.p.clear();
      }

      if (this.o != null) {
         this.o.clear();
      }
   }

   @Override
   protected void a(evw $$0) {
      super.a($$0);
      bsd $$1 = $$0.a();
      float $$2 = (float)this.ds().f();
      double $$3 = this.m;
      bsd $$4 = this.s();
      bqw $$5 = this.dQ().a(this, (bsd)($$4 != null ? $$4 : this));
      if (this.r != null && this.dP() instanceof aqk $$6) {
         $$3 = (double)czl.a($$6, this.r, $$1, $$5, (float)$$3);
      }

      int $$7 = aye.c(aye.a((double)$$2 * $$3, 0.0, 2.147483647E9));
      if (this.D() > 0) {
         if (this.o == null) {
            this.o = new IntOpenHashSet(5);
         }

         if (this.p == null) {
            this.p = Lists.newArrayListWithCapacity(5);
         }

         if (this.o.size() >= this.D() + 1) {
            this.ao();
            return;
         }

         this.o.add($$1.al());
      }

      if (this.B()) {
         long $$8 = (long)this.ah.a($$7 / 2 + 2);
         $$7 = (int)Math.min($$8 + (long)$$7, 2147483647L);
      }

      if ($$4 instanceof bsy $$9) {
         $$9.A($$1);
      }

      boolean $$10 = $$1.ak() == bsj.H;
      int $$11 = $$1.aB();
      if (this.bQ() && !$$10) {
         $$1.d(5.0F);
      }

      if ($$1.a($$5, (float)$$7)) {
         if ($$10) {
            return;
         }

         if ($$1 instanceof bsy $$12) {
            if (!this.dP().B && this.D() <= 0) {
               $$12.p($$12.eP() + 1);
            }

            this.a($$12, $$5);
            if (this.dP() instanceof aqk $$13) {
               czl.a($$13, (bsd)$$12, $$5);
            }

            this.a($$12);
            if ($$12 != $$4 && $$12 instanceof cmh && $$4 instanceof aql && !this.aW()) {
               ((aql)$$4).c.b(new acu(acu.h, 0.0F));
            }

            if (!$$1.bD() && this.p != null) {
               this.p.add($$12);
            }

            if (!this.dP().B && $$4 instanceof aql $$14) {
               if (this.p != null && this.C()) {
                  am.H.a($$14, this.p);
               } else if (!$$1.bD() && this.C()) {
                  am.H.a($$14, Arrays.asList($$1));
               }
            }
         }

         this.a(this.n, 1.0F, 1.2F / (this.ah.i() * 0.2F + 0.9F));
         if (this.D() <= 0) {
            this.ao();
         }
      } else {
         $$1.h($$11);
         this.a(cna.b, $$1, this.s(), false);
         this.h(this.ds().a(0.2));
         if (!this.dP().B && this.ds().g() < 1.0E-7) {
            if (this.d == cmn.a.b) {
               this.a(this.x(), 0.1F);
            }

            this.ao();
         }
      }
   }

   protected void a(bsy $$0, bqw $$1) {
      double $$3 = (double)(this.r != null && this.dP() instanceof aqk $$2 ? czl.d($$2, this.r, $$0, $$1, 0.0F) : 0.0F);
      if ($$3 > 0.0) {
         double $$4 = Math.max(0.0, 1.0 - $$0.g(bug.p));
         evz $$5 = this.ds().d(1.0, 0.0, 1.0).d().a($$3 * 0.6 * $$4);
         if ($$5.g() > 0.0) {
            $$0.j($$5.c, 0.1, $$5.e);
         }
      }
   }

   @Override
   protected void a(evv $$0) {
      this.k = this.dP().a_($$0.a());
      super.a($$0);
      evz $$1 = $$0.e().a(this.du(), this.dw(), this.dA());
      this.h($$1);
      cua $$2 = this.u();
      if (this.dP() instanceof aqk $$3 && $$2 != null) {
         this.a($$3, $$0, $$2);
      }

      evz $$4 = $$1.d().a(0.05F);
      this.p(this.du() - $$4.c, this.dw() - $$4.d, this.dA() - $$4.e);
      this.a(this.w(), 1.0F, 1.2F / (this.ah.i() * 0.2F + 0.9F));
      this.b = true;
      this.e = 7;
      this.a(false);
      this.a((byte)0);
      this.b(avf.aE);
      this.r = null;
      this.M();
   }

   protected void a(aqk $$0, evv $$1, cua $$2) {
      czl.a($$0, $$2, this.s() instanceof bsy $$3 ? $$3 : null, this, null, $$1.e(), () -> {
      });
   }

   @Nullable
   protected cua u() {
      return this.r;
   }

   protected ave v() {
      return avf.aE;
   }

   protected final ave w() {
      return this.n;
   }

   protected void a(bsy $$0) {
   }

   @Nullable
   protected evw a(evz $$0, evz $$1) {
      return cnb.a(this.dP(), this, $$0, $$1, this.cK().b(this.ds()).g(1.0), this::b);
   }

   @Override
   protected boolean b(bsd $$0) {
      return super.b($$0) && (this.o == null || !this.o.contains($$0.al()));
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
      $$0.a("item", this.q.a(this.dR()));
      if (this.r != null) {
         $$0.a("weapon", this.r.b(this.dR(), new tx()));
      }
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.l = $$0.g("life");
      if ($$0.b("inBlockState", 10)) {
         this.k = um.a(this.dP().a(lr.f), $$0.p("inBlockState"));
      }

      this.e = $$0.f("shake") & 255;
      this.b = $$0.q("inGround");
      if ($$0.b("damage", 99)) {
         this.m = $$0.k("damage");
      }

      this.d = cmn.a.a($$0.f("pickup"));
      this.a($$0.q("crit"));
      this.a($$0.f("PierceLevel"));
      if ($$0.b("SoundEvent", 8)) {
         this.n = lq.b.b(new akk($$0.l("SoundEvent"))).orElse(this.v());
      }

      if ($$0.b("item", 10)) {
         this.a(cua.a(this.dR(), (uu)$$0.p("item")).orElse(this.y()));
      } else {
         this.a(this.y());
      }

      if ($$0.b("weapon", 10)) {
         this.r = cua.a(this.dR(), (uu)$$0.p("weapon")).orElse(null);
      } else {
         this.r = null;
      }
   }

   @Override
   public void c(@Nullable bsd $$0) {
      super.c($$0);

      this.d = switch ($$0) {
         case null, default -> this.d;
         case cmh $$1 when this.d == cmn.a.a -> cmn.a.b;
         case btf $$2 -> cmn.a.a;
      };
   }

   @Override
   public void b_(cmh $$0) {
      if (!this.dP().B && (this.b || this.G()) && this.e <= 0) {
         if (this.a($$0)) {
            $$0.a(this, 1);
            this.ao();
         }
      }
   }

   protected boolean a(cmh $$0) {
      return switch (this.d) {
         case a -> false;
         case b -> $$0.fY().f(this.x());
         case c -> $$0.fL();
      };
   }

   protected cua x() {
      return this.q.s();
   }

   protected abstract cua y();

   @Override
   protected bsd.b bb() {
      return bsd.b.a;
   }

   public cua z() {
      return this.q;
   }

   public void h(double $$0) {
      this.m = $$0;
   }

   public double A() {
      return this.m;
   }

   @Override
   public boolean ct() {
      return this.ak().a(avy.H);
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

   protected void a(cua $$0) {
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
      return this.r != null && this.r.a(cud.vW);
   }

   public byte D() {
      return this.ao.a(h);
   }

   public void a(float $$0) {
      this.h((double)($$0 * 2.0F) + this.ah.a((double)this.dP().al().a() * 0.11, 0.57425));
   }

   protected float E() {
      return 0.6F;
   }

   public void b(boolean $$0) {
      this.ag = $$0;
      this.a(2, $$0);
   }

   public boolean G() {
      return !this.dP().B ? this.ag : (this.ao.a(g) & 2) != 0;
   }

   @Override
   public boolean bz() {
      return super.bz() && !this.b;
   }

   @Override
   public btq a_(int $$0) {
      return $$0 == 0 ? btq.a(this::z, this::a) : super.a_($$0);
   }

   public static enum a {
      a,
      b,
      c;

      public static cmn.a a(int $$0) {
         if ($$0 < 0 || $$0 > values().length) {
            $$0 = 0;
         }

         return values()[$$0];
      }
   }
}
