import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;

public abstract class cfw extends cgi {
   private static final double f = 2.0;
   private static final agn<Byte> g = agq.a(cfw.class, agp.a);
   private static final agn<Byte> h = agq.a(cfw.class, agp.a);
   private static final int i = 1;
   private static final int j = 2;
   private static final int k = 4;
   @Nullable
   private djp l;
   protected boolean b;
   protected int c;
   public cfw.a d = cfw.a.a;
   public int e;
   private int m;
   private double n = 2.0;
   private int o;
   private ars p = this.s();
   @Nullable
   private IntOpenHashSet q;
   @Nullable
   private List<blw> r;
   private cng s;

   protected cfw(bmc<? extends cfw> $$0, ctx $$1, cng $$2) {
      super($$0, $$1);
      this.s = $$2.p();
      if ($$2.A()) {
         this.b($$2.y());
      }
   }

   protected cfw(bmc<? extends cfw> $$0, double $$1, double $$2, double $$3, ctx $$4, cng $$5) {
      this($$0, $$4, $$5);
      this.a_($$1, $$2, $$3);
   }

   protected cfw(bmc<? extends cfw> $$0, bmo $$1, ctx $$2, cng $$3) {
      this($$0, $$1.dq(), $$1.du() - 0.1F, $$1.dw(), $$2, $$3);
      this.c($$1);
      if ($$1 instanceof cfq) {
         this.d = cfw.a.b;
      }
   }

   public void b(ars $$0) {
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
      boolean $$0 = this.G();
      emc $$1 = this.do();
      if (this.O == 0.0F && this.N == 0.0F) {
         double $$2 = $$1.h();
         this.r((float)(aup.d($$1.c, $$1.e) * 180.0F / (float)Math.PI));
         this.s((float)(aup.d($$1.d, $$2) * 180.0F / (float)Math.PI));
         this.N = this.dB();
         this.O = this.dD();
      }

      hx $$3 = this.dl();
      djp $$4 = this.dL().a_($$3);
      if (!$$4.i() && !$$0) {
         emv $$5 = $$4.k(this.dL(), $$3);
         if (!$$5.c()) {
            emc $$6 = this.dj();

            for (elx $$7 : $$5.e()) {
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

      if (this.ba() || $$4.a(cxa.qP)) {
         this.aA();
      }

      if (this.b && !$$0) {
         if (this.l != $$4 && this.H()) {
            this.K();
         } else if (!this.dL().B) {
            this.q();
         }

         this.c++;
      } else {
         this.c = 0;
         emc $$8 = this.dj();
         emc $$9 = $$8.e($$1);
         ema $$10 = this.dL().a(new ctg($$8, $$9, ctg.a.a, ctg.b.a, this));
         if ($$10.c() != ema.a.a) {
            $$9 = $$10.e();
         }

         while (!this.dG()) {
            elz $$11 = this.a($$8, $$9);
            if ($$11 != null) {
               $$10 = $$11;
            }

            if ($$10 != null && $$10.c() == ema.a.c) {
               blw $$12 = ((elz)$$10).a();
               blw $$13 = this.w();
               if ($$12 instanceof cfq && $$13 instanceof cfq && !((cfq)$$13).a((cfq)$$12)) {
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

         $$1 = this.do();
         double $$14 = $$1.c;
         double $$15 = $$1.d;
         double $$16 = $$1.e;
         if (this.B()) {
            for (int $$17 = 0; $$17 < 4; $$17++) {
               this.dL()
                  .a(
                     jx.g,
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
            this.r((float)(aup.d(-$$14, -$$16) * 180.0F / (float)Math.PI));
         } else {
            this.r((float)(aup.d($$14, $$16) * 180.0F / (float)Math.PI));
         }

         this.s((float)(aup.d($$15, $$21) * 180.0F / (float)Math.PI));
         this.s(d(this.O, this.dD()));
         this.r(d(this.N, this.dB()));
         float $$22 = 0.99F;
         float $$23 = 0.05F;
         if (this.aZ()) {
            for (int $$24 = 0; $$24 < 4; $$24++) {
               float $$25 = 0.25F;
               this.dL().a(jx.e, $$18 - $$14 * 0.25, $$19 - $$15 * 0.25, $$20 - $$16 * 0.25, $$14, $$15, $$16);
            }

            $$22 = this.E();
         }

         this.g($$1.a((double)$$22));
         if (!this.aV() && !$$0) {
            emc $$26 = this.do();
            this.o($$26.c, $$26.d - 0.05F, $$26.e);
         }

         this.a_($$18, $$19, $$20);
         this.aQ();
      }
   }

   private boolean H() {
      return this.b && this.dL().b(new elx(this.dj(), this.dj()).g(0.06));
   }

   private void K() {
      this.b = false;
      emc $$0 = this.do();
      this.g($$0.d((double)(this.ag.i() * 0.2F), (double)(this.ag.i() * 0.2F), (double)(this.ag.i() * 0.2F)));
      this.m = 0;
   }

   @Override
   public void a(bmu $$0, emc $$1) {
      super.a($$0, $$1);
      if ($$0 != bmu.a && this.H()) {
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
   protected void a(elz $$0) {
      super.a($$0);
      blw $$1 = $$0.a();
      float $$2 = (float)this.do().f();
      int $$3 = aup.c(aup.a((double)$$2 * this.n, 0.0, 2.147483647E9));
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

      blw $$5 = this.w();
      bkv $$6;
      if ($$5 == null) {
         $$6 = this.dM().a(this, this);
      } else {
         $$6 = this.dM().a(this, $$5);
         if ($$5 instanceof bmo) {
            ((bmo)$$5).z($$1);
         }
      }

      boolean $$8 = $$1.ai() == bmc.G;
      int $$9 = $$1.az();
      boolean $$10 = $$1.ai().a(asl.r);
      if (this.bN() && !$$8 && !$$10) {
         $$1.g(5);
      }

      if ($$1.a($$6, (float)$$3)) {
         if ($$8) {
            return;
         }

         if ($$1 instanceof bmo $$11) {
            if (!this.dL().B && this.D() <= 0) {
               $$11.p($$11.eO() + 1);
            }

            if (this.o > 0) {
               double $$12 = Math.max(0.0, 1.0 - $$11.g(bnu.k));
               emc $$13 = this.do().d(1.0, 0.0, 1.0).d().a((double)this.o * 0.6 * $$12);
               if ($$13.g() > 0.0) {
                  $$11.j($$13.c, 0.1, $$13.e);
               }
            }

            if (!this.dL().B && $$5 instanceof bmo) {
               crt.a($$11, $$5);
               crt.b((bmo)$$5, $$11);
            }

            this.a($$11);
            if ($$5 != null && $$11 != $$5 && $$11 instanceof cfq && $$5 instanceof anf && !this.aU()) {
               ((anf)$$5).c.b(new aag(aag.g, 0.0F));
            }

            if (!$$1.bx() && this.r != null) {
               this.r.add($$11);
            }

            if (!this.dL().B && $$5 instanceof anf $$14) {
               if (this.r != null && this.C()) {
                  am.H.a($$14, this.r);
               } else if (!$$1.bx() && this.C()) {
                  am.H.a($$14, Arrays.asList($$1));
               }
            }
         }

         this.a(this.p, 1.0F, 1.2F / (this.ag.i() * 0.2F + 0.9F));
         if (this.D() <= 0) {
            this.am();
         }
      } else if ($$10) {
         this.a($$1);
      } else {
         $$1.h($$9);
         this.g(this.do().a(-0.1));
         this.r(this.dB() + 180.0F);
         this.N += 180.0F;
         if (!this.dL().B && this.do().g() < 1.0E-7) {
            if (this.d == cfw.a.b) {
               this.a(this.x(), 0.1F);
            }

            this.am();
         }
      }
   }

   public void a(blw $$0) {
      float $$1 = this.ag.i() * 360.0F;
      this.g(this.do().b($$1 * (float) (Math.PI / 180.0)).a(0.5));
      this.r(this.dB() + $$1);
      this.N += $$1;
      $$0.a(this);
   }

   @Override
   protected void a(ely $$0) {
      this.l = this.dL().a_($$0.a());
      super.a($$0);
      emc $$1 = $$0.e().a(this.dq(), this.ds(), this.dw());
      this.g($$1);
      emc $$2 = $$1.d().a(0.05F);
      this.p(this.dq() - $$2.c, this.ds() - $$2.d, this.dw() - $$2.e);
      this.a(this.u(), 1.0F, 1.2F / (this.ag.i() * 0.2F + 0.9F));
      this.b = true;
      this.e = 7;
      this.a(false);
      this.a((byte)0);
      this.b(art.aB);
      this.q(false);
      this.M();
   }

   protected ars s() {
      return art.aB;
   }

   protected final ars u() {
      return this.p;
   }

   protected void a(bmo $$0) {
   }

   @Nullable
   protected elz a(emc $$0, emc $$1) {
      return cgj.a(this.dL(), this, $$0, $$1, this.cH().b(this.do()).g(1.0), this::b);
   }

   @Override
   protected boolean b(blw $$0) {
      return super.b($$0) && (this.q == null || !this.q.contains($$0.aj()));
   }

   @Override
   public void b(so $$0) {
      super.b($$0);
      $$0.a("life", (short)this.m);
      if (this.l != null) {
         $$0.a("inBlockState", td.a(this.l));
      }

      $$0.a("shake", (byte)this.e);
      $$0.a("inGround", this.b);
      $$0.a("pickup", (byte)this.d.ordinal());
      $$0.a("damage", this.n);
      $$0.a("crit", this.B());
      $$0.a("PierceLevel", this.D());
      $$0.a("SoundEvent", kd.b.b(this.p).toString());
      $$0.a("ShotFromCrossbow", this.C());
      $$0.a("item", this.s.b(new so()));
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      this.m = $$0.g("life");
      if ($$0.b("inBlockState", 10)) {
         this.l = td.a(this.dL().a(ke.f), $$0.p("inBlockState"));
      }

      this.e = $$0.f("shake") & 255;
      this.b = $$0.q("inGround");
      if ($$0.b("damage", 99)) {
         this.n = $$0.k("damage");
      }

      this.d = cfw.a.a($$0.f("pickup"));
      this.a($$0.q("crit"));
      this.a($$0.f("PierceLevel"));
      if ($$0.b("SoundEvent", 8)) {
         this.p = kd.b.b(new ahh($$0.l("SoundEvent"))).orElse(this.s());
      }

      this.q($$0.q("ShotFromCrossbow"));
      if ($$0.b("item", 10)) {
         this.s = cng.a($$0.p("item"));
      }
   }

   @Override
   public void c(@Nullable blw $$0) {
      super.c($$0);
      if ($$0 instanceof cfq) {
         this.d = ((cfq)$$0).fT().d ? cfw.a.c : cfw.a.b;
      }
   }

   @Override
   public void b_(cfq $$0) {
      if (!this.dL().B && (this.b || this.G()) && this.e <= 0) {
         if (this.a($$0)) {
            $$0.a(this, 1);
            this.am();
         }
      }
   }

   protected boolean a(cfq $$0) {
      switch (this.d) {
         case b:
            return $$0.fS().e(this.x());
         case c:
            return $$0.fT().d;
         default:
            return false;
      }
   }

   protected cng x() {
      return this.s.p();
   }

   @Override
   protected blw.b aW() {
      return blw.b.a;
   }

   public cng y() {
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

   public void a(bmo $$0, float $$1) {
      int $$2 = crt.a(crv.y, $$0);
      int $$3 = crt.a(crv.z, $$0);
      this.h((double)($$1 * 2.0F) + this.ag.a((double)this.dL().ak().a() * 0.11, 0.57425));
      if ($$2 > 0) {
         this.h(this.z() + (double)$$2 * 0.5 + 0.5);
      }

      if ($$3 > 0) {
         this.b($$3);
      }

      if (crt.a(crv.A, $$0) > 0) {
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
      return !this.dL().B ? this.af : (this.an.b(g) & 2) != 0;
   }

   public void q(boolean $$0) {
      this.a(4, $$0);
   }

   public static enum a {
      a,
      b,
      c;

      public static cfw.a a(int $$0) {
         if ($$0 < 0 || $$0 > values().length) {
            $$0 = 0;
         }

         return values()[$$0];
      }
   }
}
