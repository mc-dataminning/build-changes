import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;

public abstract class cnw extends coi {
   private static final double f = 2.0;
   private static final akg<Byte> g = akk.a(cnw.class, aki.a);
   private static final akg<Byte> h = akk.a(cnw.class, aki.a);
   private static final int i = 1;
   private static final int j = 2;
   @Nullable
   private dua k;
   protected boolean b;
   protected int c;
   public cnw.a d = cnw.a.a;
   public int e;
   private int l;
   private double m = 2.0;
   private awc n = this.o();
   @Nullable
   private IntOpenHashSet o;
   @Nullable
   private List<btj> p;
   private cvl q = this.v();
   @Nullable
   private cvl r = null;

   protected cnw(btq<? extends cnw> $$0, dds $$1) {
      super($$0, $$1);
   }

   protected cnw(btq<? extends cnw> $$0, double $$1, double $$2, double $$3, dds $$4, cvl $$5, @Nullable cvl $$6) {
      this($$0, $$4);
      this.q = $$5.u();
      this.b($$5.a(kr.g));
      bah $$7 = $$5.c(kr.u);
      if ($$7 != null) {
         this.d = cnw.a.c;
      }

      this.a_($$1, $$2, $$3);
      if ($$6 != null && $$4 instanceof arg $$8) {
         if ($$6.f()) {
            throw new IllegalArgumentException("Invalid weapon firing an arrow");
         }

         this.r = $$6.u();
         int $$9 = day.a($$8, $$6, this.q);
         if ($$9 > 0) {
            this.a((byte)$$9);
         }
      }
   }

   protected cnw(btq<? extends cnw> $$0, buf $$1, dds $$2, cvl $$3, @Nullable cvl $$4) {
      this($$0, $$1.dx(), $$1.dB() - 0.1F, $$1.dD(), $$2, $$3, $$4);
      this.c($$1);
   }

   public void b(awc $$0) {
      this.n = $$0;
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cO().a() * 10.0;
      if (Double.isNaN($$1)) {
         $$1 = 1.0;
      }

      $$1 *= 64.0 * cH();
      return $$0 < $$1 * $$1;
   }

   @Override
   protected void a(akk.a $$0) {
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
      boolean $$0 = this.C();
      eye $$1 = this.dv();
      if (this.P == 0.0F && this.O == 0.0F) {
         double $$2 = $$1.i();
         this.v((float)(azc.d($$1.d, $$1.f) * 180.0F / (float)Math.PI));
         this.w((float)(azc.d($$1.e, $$2) * 180.0F / (float)Math.PI));
         this.O = this.dI();
         this.P = this.dK();
      }

      je $$3 = this.ds();
      dua $$4 = this.dS().a_($$3);
      if (!$$4.l() && !$$0) {
         eyx $$5 = $$4.g(this.dS(), $$3);
         if (!$$5.c()) {
            eye $$6 = this.dq();

            for (exz $$7 : $$5.e()) {
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

      if (this.bj() || $$4.a(dgx.qP)) {
         this.aF();
      }

      if (this.b && !$$0) {
         if (this.k != $$4 && this.D()) {
            this.G();
         } else if (!this.dS().B) {
            this.m();
         }

         this.c++;
      } else {
         this.c = 0;
         eye $$8 = this.dq();
         eye $$9 = $$8.e($$1);
         eyc $$10 = this.dS().b(new dda($$8, $$9, dda.a.a, dda.b.a, this));
         if ($$10.c() != eyc.a.a) {
            $$9 = $$10.e();
         }

         while (!this.dN()) {
            eyb $$11 = this.a($$8, $$9);
            if ($$11 != null) {
               $$10 = $$11;
            }

            if ($$10 != null && $$10.c() == eyc.a.c) {
               btj $$12 = ((eyb)$$10).a();
               btj $$13 = this.s();
               if ($$12 instanceof cnp && $$13 instanceof cnp && !((cnp)$$13).a((cnp)$$12)) {
                  $$10 = null;
                  $$11 = null;
               }
            }

            if ($$10 != null && !$$0) {
               coj $$14 = this.b($$10);
               this.as = true;
               if ($$14 != coj.a) {
                  break;
               }
            }

            if ($$11 == null || this.A() <= 0) {
               break;
            }

            $$10 = null;
         }

         $$1 = this.dv();
         double $$15 = $$1.d;
         double $$16 = $$1.e;
         double $$17 = $$1.f;
         if (this.y()) {
            for (int $$18 = 0; $$18 < 4; $$18++) {
               this.dS()
                  .a(
                     ln.f,
                     this.dx() + $$15 * (double)$$18 / 4.0,
                     this.dz() + $$16 * (double)$$18 / 4.0,
                     this.dD() + $$17 * (double)$$18 / 4.0,
                     -$$15,
                     -$$16 + 0.2,
                     -$$17
                  );
            }
         }

         double $$19 = this.dx() + $$15;
         double $$20 = this.dz() + $$16;
         double $$21 = this.dD() + $$17;
         double $$22 = $$1.i();
         if ($$0) {
            this.v((float)(azc.d(-$$15, -$$17) * 180.0F / (float)Math.PI));
         } else {
            this.v((float)(azc.d($$15, $$17) * 180.0F / (float)Math.PI));
         }

         this.w((float)(azc.d($$16, $$22) * 180.0F / (float)Math.PI));
         this.w(e(this.P, this.dK()));
         this.v(e(this.O, this.dI()));
         float $$23 = 0.99F;
         if (this.bi()) {
            for (int $$24 = 0; $$24 < 4; $$24++) {
               float $$25 = 0.25F;
               this.dS().a(ln.d, $$19 - $$15 * 0.25, $$20 - $$16 * 0.25, $$21 - $$17 * 0.25, $$15, $$16, $$17);
            }

            $$23 = this.B();
         }

         this.h($$1.c((double)$$23));
         if (!$$0) {
            this.be();
         }

         this.a_($$19, $$20, $$21);
         if (!this.dS().w_()) {
            this.aI();
         }
      }
   }

   @Override
   protected double bc() {
      return 0.05;
   }

   private boolean D() {
      return this.b && this.dS().b(new exz(this.dq(), this.dq()).g(0.06));
   }

   private void G() {
      this.b = false;
      eye $$0 = this.dv();
      this.h($$0.d((double)(this.af.i() * 0.2F), (double)(this.af.i() * 0.2F), (double)(this.af.i() * 0.2F)));
      this.l = 0;
   }

   @Override
   public void a(buj $$0, eye $$1) {
      super.a($$0, $$1);
      if ($$0 != buj.a && this.D()) {
         this.G();
      }
   }

   protected void m() {
      this.l++;
      if (this.l >= 1200) {
         this.as();
      }
   }

   private void I() {
      if (this.p != null) {
         this.p.clear();
      }

      if (this.o != null) {
         this.o.clear();
      }
   }

   @Override
   protected void b(cvg $$0) {
      this.r = null;
   }

   @Override
   protected void a(eyb $$0) {
      super.a($$0);
      btj $$1 = $$0.a();
      float $$2 = (float)this.dv().g();
      double $$3 = this.m;
      btj $$4 = this.s();
      bsb $$5 = this.dT().a(this, (btj)($$4 != null ? $$4 : this));
      if (this.dW() != null && this.dS() instanceof arg $$6) {
         $$3 = (double)day.a($$6, this.dW(), $$1, $$5, (float)$$3);
      }

      int $$7 = azc.c(azc.a((double)$$2 * $$3, 0.0, 2.147483647E9));
      if (this.A() > 0) {
         if (this.o == null) {
            this.o = new IntOpenHashSet(5);
         }

         if (this.p == null) {
            this.p = Lists.newArrayListWithCapacity(5);
         }

         if (this.o.size() >= this.A() + 1) {
            this.as();
            return;
         }

         this.o.add($$1.ap());
      }

      if (this.y()) {
         long $$8 = (long)this.af.a($$7 / 2 + 2);
         $$7 = (int)Math.min($$8 + (long)$$7, 2147483647L);
      }

      if ($$4 instanceof buf $$9) {
         $$9.B($$1);
      }

      boolean $$10 = $$1.ao() == btq.H;
      int $$11 = $$1.aE();
      if (this.bV() && !$$10) {
         $$1.d(5.0F);
      }

      if ($$1.a($$5, (float)$$7)) {
         if ($$10) {
            return;
         }

         if ($$1 instanceof buf $$12) {
            if (!this.dS().B && this.A() <= 0) {
               $$12.p($$12.eS() + 1);
            }

            this.a($$12, $$5);
            if (this.dS() instanceof arg $$13) {
               day.a($$13, $$12, $$5, this.dW());
            }

            this.a($$12);
            if ($$12 != $$4 && $$12 instanceof cnp && $$4 instanceof arh && !this.ba()) {
               ((arh)$$4).c.b(new adg(adg.h, 0.0F));
            }

            if (!$$1.bI() && this.p != null) {
               this.p.add($$12);
            }

            if (!this.dS().B && $$4 instanceof arh $$14) {
               if (this.p != null && this.z()) {
                  an.H.a($$14, this.p);
               } else if (!$$1.bI() && this.z()) {
                  an.H.a($$14, Arrays.asList($$1));
               }
            }
         }

         this.a(this.n, 1.0F, 1.2F / (this.af.i() * 0.2F + 0.9F));
         if (this.A() <= 0) {
            this.as();
         }
      } else {
         $$1.h($$11);
         this.a(coj.b, $$1, this.s(), false);
         this.h(this.dv().c(0.2));
         if (!this.dS().B && this.dv().h() < 1.0E-7) {
            if (this.d == cnw.a.b) {
               this.a(this.t(), 0.1F);
            }

            this.as();
         }
      }
   }

   protected void a(buf $$0, bsb $$1) {
      double $$3 = (double)(this.r != null && this.dS() instanceof arg $$2 ? day.d($$2, this.r, $$0, $$1, 0.0F) : 0.0F);
      if ($$3 > 0.0) {
         double $$4 = Math.max(0.0, 1.0 - $$0.h(bvm.p));
         eye $$5 = this.dv().d(1.0, 0.0, 1.0).d().c($$3 * 0.6 * $$4);
         if ($$5.h() > 0.0) {
            $$0.j($$5.d, 0.1, $$5.f);
         }
      }
   }

   @Override
   protected void a(eya $$0) {
      this.k = this.dS().a_($$0.a());
      super.a($$0);
      eye $$1 = $$0.e().a(this.dx(), this.dz(), this.dD());
      this.h($$1);
      cvl $$2 = this.dW();
      if (this.dS() instanceof arg $$3 && $$2 != null) {
         this.a($$3, $$0, $$2);
      }

      eye $$4 = $$1.d().c(0.05F);
      this.o(this.dx() - $$4.d, this.dz() - $$4.e, this.dD() - $$4.f);
      this.a(this.q(), 1.0F, 1.2F / (this.af.i() * 0.2F + 0.9F));
      this.b = true;
      this.e = 7;
      this.a(false);
      this.a((byte)0);
      this.b(awd.aE);
      this.I();
   }

   protected void a(arg $$0, eya $$1, cvl $$2) {
      eye $$3 = $$1.a().a($$1.e());
      day.a($$0, $$2, this.s() instanceof buf $$4 ? $$4 : null, this, null, $$3, $$0.a_($$1.a()), $$0x -> this.r = null);
   }

   @Override
   public cvl dW() {
      return this.r;
   }

   protected awc o() {
      return awd.aE;
   }

   protected final awc q() {
      return this.n;
   }

   protected void a(buf $$0) {
   }

   @Nullable
   protected eyb a(eye $$0, eye $$1) {
      return cok.a(this.dS(), this, $$0, $$1, this.cO().b(this.dv()).g(1.0), this::b);
   }

   @Override
   protected boolean b(btj $$0) {
      return super.b($$0) && (this.o == null || !this.o.contains($$0.ap()));
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("life", (short)this.l);
      if (this.k != null) {
         $$0.a("inBlockState", uu.a(this.k));
      }

      $$0.a("shake", (byte)this.e);
      $$0.a("inGround", this.b);
      $$0.a("pickup", (byte)this.d.ordinal());
      $$0.a("damage", this.m);
      $$0.a("crit", this.y());
      $$0.a("PierceLevel", this.A());
      $$0.a("SoundEvent", lu.b.b(this.n).toString());
      $$0.a("item", this.q.a(this.dU()));
      if (this.r != null) {
         $$0.a("weapon", this.r.b(this.dU(), new uf()));
      }
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      this.l = $$0.g("life");
      if ($$0.b("inBlockState", 10)) {
         this.k = uu.a(this.dS().a(lv.f), $$0.p("inBlockState"));
      }

      this.e = $$0.f("shake") & 255;
      this.b = $$0.q("inGround");
      if ($$0.b("damage", 99)) {
         this.m = $$0.k("damage");
      }

      this.d = cnw.a.a($$0.f("pickup"));
      this.a($$0.q("crit"));
      this.a($$0.f("PierceLevel"));
      if ($$0.b("SoundEvent", 8)) {
         this.n = lu.b.b(alb.a($$0.l("SoundEvent"))).orElse(this.o());
      }

      if ($$0.b("item", 10)) {
         this.a(cvl.a(this.dU(), (vc)$$0.p("item")).orElse(this.v()));
      } else {
         this.a(this.v());
      }

      if ($$0.b("weapon", 10)) {
         this.r = cvl.a(this.dU(), (vc)$$0.p("weapon")).orElse(null);
      } else {
         this.r = null;
      }
   }

   @Override
   public void c(@Nullable btj $$0) {
      super.c($$0);

      this.d = switch ($$0) {
         case null, default -> this.d;
         case cnp $$1 when this.d == cnw.a.a -> cnw.a.b;
         case bul $$2 -> cnw.a.a;
      };
   }

   @Override
   public void b_(cnp $$0) {
      if (!this.dS().B && (this.b || this.C()) && this.e <= 0) {
         if (this.a($$0)) {
            $$0.a(this, 1);
            this.as();
         }
      }
   }

   protected boolean a(cnp $$0) {
      return switch (this.d) {
         case a -> false;
         case b -> $$0.gc().f(this.t());
         case c -> $$0.fP();
      };
   }

   protected cvl t() {
      return this.q.u();
   }

   protected abstract cvl v();

   @Override
   protected btj.b bf() {
      return btj.b.a;
   }

   public cvl w() {
      return this.q;
   }

   public void h(double $$0) {
      this.m = $$0;
   }

   public double x() {
      return this.m;
   }

   @Override
   public boolean cy() {
      return this.ao().a(aww.H);
   }

   public void a(boolean $$0) {
      this.a(1, $$0);
   }

   private void a(byte $$0) {
      this.am.a(h, $$0);
   }

   private void a(int $$0, boolean $$1) {
      byte $$2 = this.am.a(g);
      if ($$1) {
         this.am.a(g, (byte)($$2 | $$0));
      } else {
         this.am.a(g, (byte)($$2 & ~$$0));
      }
   }

   protected void a(cvl $$0) {
      if (!$$0.f()) {
         this.q = $$0;
      } else {
         this.q = this.v();
      }
   }

   public boolean y() {
      byte $$0 = this.am.a(g);
      return ($$0 & 1) != 0;
   }

   public boolean z() {
      return this.r != null && this.r.a(cvo.vX);
   }

   public byte A() {
      return this.am.a(h);
   }

   public void a(float $$0) {
      this.h((double)($$0 * 2.0F) + this.af.a((double)this.dS().am().a() * 0.11, 0.57425));
   }

   protected float B() {
      return 0.6F;
   }

   public void b(boolean $$0) {
      this.ae = $$0;
      this.a(2, $$0);
   }

   public boolean C() {
      return !this.dS().B ? this.ae : (this.am.a(g) & 2) != 0;
   }

   @Override
   public boolean bE() {
      return super.bE() && !this.b;
   }

   @Override
   public buw a_(int $$0) {
      return $$0 == 0 ? buw.a(this::w, this::a) : super.a_($$0);
   }

   public static enum a {
      a,
      b,
      c;

      public static cnw.a a(int $$0) {
         if ($$0 < 0 || $$0 > values().length) {
            $$0 = 0;
         }

         return values()[$$0];
      }
   }
}
