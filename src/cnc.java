import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;

public abstract class cnc extends cno {
   private static final double f = 2.0;
   private static final akj<Byte> g = akn.a(cnc.class, akl.a);
   private static final akj<Byte> h = akn.a(cnc.class, akl.a);
   private static final int i = 1;
   private static final int j = 2;
   private static final int k = 4;
   @Nullable
   private dsb l;
   protected boolean b;
   protected int c;
   public cnc.a d = cnc.a.a;
   public int e;
   private int m;
   private double n = 2.0;
   private int o;
   private avy p = this.u();
   @Nullable
   private IntOpenHashSet q;
   @Nullable
   private List<bst> r;
   private cuo s = this.x();

   protected cnc(bsz<? extends cnc> $$0, dbx $$1) {
      super($$0, $$1);
   }

   protected cnc(bsz<? extends cnc> $$0, dbx $$1, cuo $$2) {
      this($$0, $$1);
      this.s = $$2.s();
      this.b($$2.a(km.g));
      bab $$3 = $$2.c(km.u);
      if ($$3 != null) {
         this.d = cnc.a.c;
      }
   }

   protected cnc(bsz<? extends cnc> $$0, double $$1, double $$2, double $$3, dbx $$4, cuo $$5) {
      this($$0, $$4, $$5);
      this.a_($$1, $$2, $$3);
   }

   protected cnc(bsz<? extends cnc> $$0, bto $$1, dbx $$2, cuo $$3) {
      this($$0, $$1.du(), $$1.dy() - 0.1F, $$1.dA(), $$2, $$3);
      this.c($$1);
   }

   public void b(avy $$0) {
      this.p = $$0;
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
   protected void a(akn.a $$0) {
      $$0.a(g, (byte)0);
      $$0.a(h, (byte)0);
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
      evq $$1 = this.ds();
      if (this.P == 0.0F && this.O == 0.0F) {
         double $$2 = $$1.h();
         this.r((float)(ayy.d($$1.c, $$1.e) * 180.0F / (float)Math.PI));
         this.s((float)(ayy.d($$1.d, $$2) * 180.0F / (float)Math.PI));
         this.O = this.dF();
         this.P = this.dH();
      }

      iz $$3 = this.dp();
      dsb $$4 = this.dP().a_($$3);
      if (!$$4.i() && !$$0) {
         ewj $$5 = $$4.k(this.dP(), $$3);
         if (!$$5.c()) {
            evq $$6 = this.dn();

            for (evl $$7 : $$5.e()) {
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

      if (this.bf() || $$4.a(dfa.qP)) {
         this.aC();
      }

      if (this.b && !$$0) {
         if (this.l != $$4 && this.H()) {
            this.K();
         } else if (!this.dP().B) {
            this.p();
         }

         this.c++;
      } else {
         this.c = 0;
         evq $$8 = this.dn();
         evq $$9 = $$8.e($$1);
         evo $$10 = this.dP().a(new dbg($$8, $$9, dbg.a.a, dbg.b.a, this));
         if ($$10.c() != evo.a.a) {
            $$9 = $$10.e();
         }

         while (!this.dK()) {
            evn $$11 = this.a($$8, $$9);
            if ($$11 != null) {
               $$10 = $$11;
            }

            if ($$10 != null && $$10.c() == evo.a.c) {
               bst $$12 = ((evn)$$10).a();
               bst $$13 = this.s();
               if ($$12 instanceof cmw && $$13 instanceof cmw && !((cmw)$$13).a((cmw)$$12)) {
                  $$10 = null;
                  $$11 = null;
               }
            }

            if ($$10 != null && !$$0) {
               cnp $$14 = this.b($$10);
               this.av = true;
               if ($$14 != cnp.a) {
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
                     li.f,
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
            this.r((float)(ayy.d(-$$15, -$$17) * 180.0F / (float)Math.PI));
         } else {
            this.r((float)(ayy.d($$15, $$17) * 180.0F / (float)Math.PI));
         }

         this.s((float)(ayy.d($$16, $$22) * 180.0F / (float)Math.PI));
         this.s(d(this.P, this.dH()));
         this.r(d(this.O, this.dF()));
         float $$23 = 0.99F;
         if (this.be()) {
            for (int $$24 = 0; $$24 < 4; $$24++) {
               float $$25 = 0.25F;
               this.dP().a(li.d, $$19 - $$15 * 0.25, $$20 - $$16 * 0.25, $$21 - $$17 * 0.25, $$15, $$16, $$17);
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
      return this.b && this.dP().b(new evl(this.dn(), this.dn()).g(0.06));
   }

   private void K() {
      this.b = false;
      evq $$0 = this.ds();
      this.h($$0.d((double)(this.ah.i() * 0.2F), (double)(this.ah.i() * 0.2F), (double)(this.ah.i() * 0.2F)));
      this.m = 0;
   }

   @Override
   public void a(btt $$0, evq $$1) {
      super.a($$0, $$1);
      if ($$0 != btt.a && this.H()) {
         this.K();
      }
   }

   protected void p() {
      this.m++;
      if (this.m >= 1200) {
         this.ao();
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
   protected void a(evn $$0) {
      super.a($$0);
      bst $$1 = $$0.a();
      float $$2 = (float)this.ds().f();
      int $$3 = ayy.c(ayy.a((double)$$2 * this.n, 0.0, 2.147483647E9));
      if (this.D() > 0) {
         if (this.q == null) {
            this.q = new IntOpenHashSet(5);
         }

         if (this.r == null) {
            this.r = Lists.newArrayListWithCapacity(5);
         }

         if (this.q.size() >= this.D() + 1) {
            this.ao();
            return;
         }

         this.q.add($$1.al());
      }

      if (this.B()) {
         long $$4 = (long)this.ah.a($$3 / 2 + 2);
         $$3 = (int)Math.min($$4 + (long)$$3, 2147483647L);
      }

      bst $$5 = this.s();
      brm $$6;
      if ($$5 == null) {
         $$6 = this.dQ().a(this, this);
      } else {
         $$6 = this.dQ().a(this, $$5);
         if ($$5 instanceof bto) {
            ((bto)$$5).A($$1);
         }
      }

      boolean $$8 = $$1.ak() == bsz.H;
      int $$9 = $$1.aB();
      if (this.bQ() && !$$8) {
         $$1.g(5);
      }

      if ($$1.a($$6, (float)$$3)) {
         if ($$8) {
            return;
         }

         if ($$1 instanceof bto $$10) {
            if (!this.dP().B && this.D() <= 0) {
               $$10.q($$10.eT() + 1);
            }

            if (this.o > 0) {
               double $$11 = Math.max(0.0, 1.0 - $$10.g(buw.n));
               evq $$12 = this.ds().d(1.0, 0.0, 1.0).d().a((double)this.o * 0.6 * $$11);
               if ($$12.g() > 0.0) {
                  $$10.j($$12.c, 0.1, $$12.e);
               }
            }

            if (!this.dP().B && $$5 instanceof bto) {
               daa.a($$10, $$5);
               daa.b((bto)$$5, $$10);
            }

            this.a($$10);
            if ($$5 != null && $$10 != $$5 && $$10 instanceof cmw && $$5 instanceof arf && !this.aW()) {
               ((arf)$$5).c.b(new ado(ado.h, 0.0F));
            }

            if (!$$1.bD() && this.r != null) {
               this.r.add($$10);
            }

            if (!this.dP().B && $$5 instanceof arf $$13) {
               if (this.r != null && this.C()) {
                  am.H.a($$13, this.r);
               } else if (!$$1.bD() && this.C()) {
                  am.H.a($$13, Arrays.asList($$1));
               }
            }
         }

         this.a(this.p, 1.0F, 1.2F / (this.ah.i() * 0.2F + 0.9F));
         if (this.D() <= 0) {
            this.ao();
         }
      } else {
         $$1.i($$9);
         this.a(cnp.b, $$1, this.s(), false);
         this.h(this.ds().a(0.2));
         if (!this.dP().B && this.ds().g() < 1.0E-7) {
            if (this.d == cnc.a.b) {
               this.a(this.w(), 0.1F);
            }

            this.ao();
         }
      }
   }

   @Override
   protected void a(evm $$0) {
      this.l = this.dP().a_($$0.a());
      super.a($$0);
      evq $$1 = $$0.e().a(this.du(), this.dw(), this.dA());
      this.h($$1);
      evq $$2 = $$1.d().a(0.05F);
      this.p(this.du() - $$2.c, this.dw() - $$2.d, this.dA() - $$2.e);
      this.a(this.v(), 1.0F, 1.2F / (this.ah.i() * 0.2F + 0.9F));
      this.b = true;
      this.e = 7;
      this.a(false);
      this.a((byte)0);
      this.b(avz.aE);
      this.q(false);
      this.M();
   }

   protected avy u() {
      return avz.aE;
   }

   protected final avy v() {
      return this.p;
   }

   protected void a(bto $$0) {
   }

   @Nullable
   protected evn a(evq $$0, evq $$1) {
      return cnq.a(this.dP(), this, $$0, $$1, this.cK().b(this.ds()).g(1.0), this::b);
   }

   @Override
   protected boolean b(bst $$0) {
      return super.b($$0) && (this.q == null || !this.q.contains($$0.al()));
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      $$0.a("life", (short)this.m);
      if (this.l != null) {
         $$0.a("inBlockState", vg.a(this.l));
      }

      $$0.a("shake", (byte)this.e);
      $$0.a("inGround", this.b);
      $$0.a("pickup", (byte)this.d.ordinal());
      $$0.a("damage", this.n);
      $$0.a("crit", this.B());
      $$0.a("PierceLevel", this.D());
      $$0.a("SoundEvent", lp.b.b(this.p).toString());
      $$0.a("ShotFromCrossbow", this.C());
      $$0.a("item", this.s.a(this.dR()));
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      this.m = $$0.g("life");
      if ($$0.b("inBlockState", 10)) {
         this.l = vg.a(this.dP().a(lq.f), $$0.p("inBlockState"));
      }

      this.e = $$0.f("shake") & 255;
      this.b = $$0.q("inGround");
      if ($$0.b("damage", 99)) {
         this.n = $$0.k("damage");
      }

      this.d = cnc.a.a($$0.f("pickup"));
      this.a($$0.q("crit"));
      this.a($$0.f("PierceLevel"));
      if ($$0.b("SoundEvent", 8)) {
         this.p = lp.b.b(new ale($$0.l("SoundEvent"))).orElse(this.u());
      }

      this.q($$0.q("ShotFromCrossbow"));
      if ($$0.b("item", 10)) {
         this.a(cuo.a(this.dR(), (vo)$$0.p("item")).orElse(this.x()));
      } else {
         this.a(this.x());
      }
   }

   @Override
   public void c(@Nullable bst $$0) {
      super.c($$0);
      if ($$0 instanceof cmw && this.d == cnc.a.a) {
         this.d = cnc.a.b;
      }
   }

   @Override
   public void b_(cmw $$0) {
      if (!this.dP().B && (this.b || this.G()) && this.e <= 0) {
         if (this.a($$0)) {
            $$0.a(this, 1);
            this.ao();
         }
      }
   }

   protected boolean a(cmw $$0) {
      return switch (this.d) {
         case a -> false;
         case b -> $$0.gc().f(this.w());
         case c -> $$0.fP();
      };
   }

   protected cuo w() {
      return this.s.s();
   }

   protected abstract cuo x();

   @Override
   protected bst.b bb() {
      return bst.b.a;
   }

   public cuo y() {
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
   public boolean ct() {
      return this.ak().a(aws.H);
   }

   public void a(boolean $$0) {
      this.a(1, $$0);
   }

   public void a(byte $$0) {
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

   protected void a(cuo $$0) {
      if (!$$0.e()) {
         this.s = $$0;
      } else {
         this.s = this.x();
      }
   }

   public boolean B() {
      byte $$0 = this.ao.a(g);
      return ($$0 & 1) != 0;
   }

   public boolean C() {
      byte $$0 = this.ao.a(g);
      return ($$0 & 4) != 0;
   }

   public byte D() {
      return this.ao.a(h);
   }

   public void a(bto $$0, float $$1) {
      int $$2 = daa.a(dac.y, $$0);
      int $$3 = daa.a(dac.z, $$0);
      this.h((double)($$1 * 2.0F) + this.ah.a((double)this.dP().al().a() * 0.11, 0.57425));
      if ($$2 > 0) {
         this.h(this.z() + (double)$$2 * 0.5 + 0.5);
      }

      if ($$3 > 0) {
         this.b($$3);
      }

      if (daa.a(dac.A, $$0) > 0) {
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
      return !this.dP().B ? this.ag : (this.ao.a(g) & 2) != 0;
   }

   public void q(boolean $$0) {
      this.a(4, $$0);
   }

   @Override
   public boolean bz() {
      return super.bz() && !this.b;
   }

   @Override
   public bug a_(int $$0) {
      return $$0 == 0 ? bug.a(this::y, this::a) : super.a_($$0);
   }

   public static enum a {
      a,
      b,
      c;

      public static cnc.a a(int $$0) {
         if ($$0 < 0 || $$0 > values().length) {
            $$0 = 0;
         }

         return values()[$$0];
      }
   }
}
