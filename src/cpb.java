import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public abstract class cpb extends cpn {
   private static final double e = 2.0;
   private static final akm<Byte> f = akq.a(cpb.class, ako.a);
   private static final akm<Byte> g = akq.a(cpb.class, ako.a);
   private static final int h = 1;
   private static final int i = 2;
   @Nullable
   private dvv j;
   protected boolean a;
   protected int b;
   public cpb.a c = cpb.a.a;
   public int d;
   private int k;
   private double l = 2.0;
   private awm m = this.l();
   @Nullable
   private IntOpenHashSet n;
   @Nullable
   private List<bul> o;
   private cwm p = this.s();
   @Nullable
   private cwm q = null;

   protected cpb(bus<? extends cpb> $$0, dfm $$1) {
      super($$0, $$1);
   }

   protected cpb(bus<? extends cpb> $$0, double $$1, double $$2, double $$3, dfm $$4, cwm $$5, @Nullable cwm $$6) {
      this($$0, $$4);
      this.p = $$5.v();
      this.b($$5.a(ku.g));
      bas $$7 = $$5.c(ku.v);
      if ($$7 != null) {
         this.c = cpb.a.c;
      }

      this.a_($$1, $$2, $$3);
      if ($$6 != null && $$4 instanceof arp $$8) {
         if ($$6.f()) {
            throw new IllegalArgumentException("Invalid weapon firing an arrow");
         }

         this.q = $$6.v();
         int $$9 = dcf.a($$8, $$6, this.p);
         if ($$9 > 0) {
            this.a((byte)$$9);
         }
      }
   }

   protected cpb(bus<? extends cpb> $$0, bvh $$1, dfm $$2, cwm $$3, @Nullable cwm $$4) {
      this($$0, $$1.dA(), $$1.dE() - 0.1F, $$1.dG(), $$2, $$3, $$4);
      this.c($$1);
   }

   public void b(awm $$0) {
      this.m = $$0;
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cR().a() * 10.0;
      if (Double.isNaN($$1)) {
         $$1 = 1.0;
      }

      $$1 *= 64.0 * cK();
      return $$0 < $$1 * $$1;
   }

   @Override
   protected void a(akq.a $$0) {
      $$0.a(f, (byte)0);
      $$0.a(g, (byte)0);
   }

   @Override
   public void c(double $$0, double $$1, double $$2, float $$3, float $$4) {
      super.c($$0, $$1, $$2, $$3, $$4);
      this.k = 0;
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      this.a_($$0, $$1, $$2);
      this.a($$3, $$4);
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      super.l($$0, $$1, $$2);
      this.k = 0;
   }

   @Override
   public void h() {
      boolean $$0 = !this.y();
      if ($$0) {
         this.bf();
      }

      this.A();
      ezy $$1 = this.dy();
      if (this.O == 0.0F && this.N == 0.0F) {
         double $$2 = $$1.i();
         this.v((float)(azm.d($$1.d, $$1.f) * 180.0F / (float)Math.PI));
         this.w((float)(azm.d($$1.e, $$2) * 180.0F / (float)Math.PI));
         this.N = this.dL();
         this.O = this.dN();
      }

      jh $$3 = this.dv();
      dvv $$4 = this.dV().a_($$3);
      if (!$$4.l() && $$0) {
         fas $$5 = $$4.g(this.dV(), $$3);
         if (!$$5.c()) {
            ezy $$6 = this.dt();

            for (ezt $$7 : $$5.e()) {
               if ($$7.a($$3).d($$6)) {
                  this.a = true;
                  break;
               }
            }
         }
      }

      if (this.d > 0) {
         this.d--;
      }

      if (this.bk() || $$4.a(dis.qP)) {
         this.aH();
      }

      if (this.a && $$0) {
         if (this.j != $$4 && this.D()) {
            this.E();
         } else if (!this.dV().C) {
            this.j();
         }

         this.b++;
      } else {
         this.b = 0;
         ezy $$8 = this.dt();
         if (this.v()) {
            for (int $$9 = 0; $$9 < 4; $$9++) {
               this.dV()
                  .a(
                     ls.f,
                     $$8.d + $$1.d * (double)$$9 / 4.0,
                     $$8.e + $$1.e * (double)$$9 / 4.0,
                     $$8.f + $$1.f * (double)$$9 / 4.0,
                     -$$1.d,
                     -$$1.e + 0.2,
                     -$$1.f
                  );
            }
         }

         float $$10;
         if (!$$0) {
            $$10 = (float)(azm.d(-$$1.d, -$$1.f) * 180.0F / (float)Math.PI);
         } else {
            $$10 = (float)(azm.d($$1.d, $$1.f) * 180.0F / (float)Math.PI);
         }

         float $$12 = (float)(azm.d($$1.e, $$1.i()) * 180.0F / (float)Math.PI);
         this.w(e(this.dN(), $$12));
         this.v(e(this.dL(), $$10));
         if ($$0) {
            ezu $$13 = this.dV().b(new deu($$8, $$8.e($$1), deu.a.a, deu.b.a, this));
            this.b($$13);
         } else {
            this.b($$8.e($$1));
            this.aK();
         }

         super.h();
      }
   }

   private void b(ezu $$0) {
      while (this.bL()) {
         ezy $$1 = this.dt();
         ezv $$2 = this.c($$1, $$0.g());
         ezy $$3 = Objects.requireNonNullElse($$2, $$0).g();
         this.b($$3);
         this.a($$1, $$3);
         if (this.as != null && this.as.e()) {
            this.bW();
         }

         if ($$2 == null) {
            if (this.bL() && $$0.d() != ezw.a.a) {
               this.b((ezw)$$0);
               this.ar = true;
            }
            break;
         } else if (this.bL() && !this.ad) {
            cpo $$4 = this.b($$2);
            this.ar = true;
            if (this.w() > 0 && $$4 == cpo.a) {
               continue;
            }
            break;
         }
      }
   }

   private void A() {
      ezy $$0 = this.dy();
      ezy $$1 = this.dt();
      float $$2 = 0.99F;
      if (this.bj()) {
         for (int $$3 = 0; $$3 < 4; $$3++) {
            float $$4 = 0.25F;
            this.dV().a(ls.d, $$1.d - $$0.d * 0.25, $$1.e - $$0.e * 0.25, $$1.f - $$0.f * 0.25, $$0.d, $$0.e, $$0.f);
         }

         $$2 = this.x();
      }

      this.h($$0.c((double)$$2));
   }

   @Override
   protected double bd() {
      return 0.05;
   }

   private boolean D() {
      return this.a && this.dV().b(new ezt(this.dt(), this.dt()).g(0.06));
   }

   private void E() {
      this.a = false;
      ezy $$0 = this.dy();
      this.h($$0.d((double)(this.ae.i() * 0.2F), (double)(this.ae.i() * 0.2F), (double)(this.ae.i() * 0.2F)));
      this.k = 0;
   }

   @Override
   public void a(bvl $$0, ezy $$1) {
      super.a($$0, $$1);
      if ($$0 != bvl.a && this.D()) {
         this.E();
      }
   }

   protected void j() {
      this.k++;
      if (this.k >= 1200) {
         this.at();
      }
   }

   private void F() {
      if (this.o != null) {
         this.o.clear();
      }

      if (this.n != null) {
         this.n.clear();
      }
   }

   @Override
   protected void b(cwi $$0) {
      this.q = null;
   }

   @Override
   protected void a(ezv $$0) {
      super.a($$0);
      bul $$1 = $$0.a();
      float $$2 = (float)this.dy().g();
      double $$3 = this.l;
      bul $$4 = this.p();
      btb $$5 = this.dW().a(this, (bul)($$4 != null ? $$4 : this));
      if (this.dZ() != null && this.dV() instanceof arp $$6) {
         $$3 = (double)dcf.a($$6, this.dZ(), $$1, $$5, (float)$$3);
      }

      int $$7 = azm.c(azm.a((double)$$2 * $$3, 0.0, 2.147483647E9));
      if (this.w() > 0) {
         if (this.n == null) {
            this.n = new IntOpenHashSet(5);
         }

         if (this.o == null) {
            this.o = Lists.newArrayListWithCapacity(5);
         }

         if (this.n.size() >= this.w() + 1) {
            this.at();
            return;
         }

         this.n.add($$1.ar());
      }

      if (this.v()) {
         long $$8 = (long)this.ae.a($$7 / 2 + 2);
         $$7 = (int)Math.min($$8 + (long)$$7, 2147483647L);
      }

      if ($$4 instanceof bvh $$9) {
         $$9.B($$1);
      }

      boolean $$10 = $$1.aq() == bus.M;
      int $$11 = $$1.aG();
      if (this.bY() && !$$10) {
         $$1.d(5.0F);
      }

      if ($$1.b($$5, (float)$$7)) {
         if ($$10) {
            return;
         }

         if ($$1 instanceof bvh $$12) {
            if (!this.dV().C && this.w() <= 0) {
               $$12.o($$12.eT() + 1);
            }

            this.a($$12, $$5);
            if (this.dV() instanceof arp $$13) {
               dcf.a($$13, $$12, $$5, this.dZ());
            }

            this.a($$12);
            if ($$12 != $$4 && $$12 instanceof cou && $$4 instanceof arq && !this.bb()) {
               ((arq)$$4).f.b(new adm(adm.h, 0.0F));
            }

            if (!$$1.bL() && this.o != null) {
               this.o.add($$12);
            }

            if (!this.dV().C && $$4 instanceof arq $$14) {
               if (this.o != null) {
                  ao.H.a($$14, this.o, this.q);
               } else if (!$$1.bL()) {
                  ao.H.a($$14, List.of($$1), this.q);
               }
            }
         }

         this.a(this.m, 1.0F, 1.2F / (this.ae.i() * 0.2F + 0.9F));
         if (this.w() <= 0) {
            this.at();
         }
      } else {
         $$1.h($$11);
         this.a(cpo.b, $$1, this.p(), false);
         this.h(this.dy().c(0.2));
         if (this.dV() instanceof arp $$15 && this.dy().h() < 1.0E-7) {
            if (this.c == cpb.a.b) {
               this.a($$15, this.q(), 0.1F);
            }

            this.at();
         }
      }
   }

   protected void a(bvh $$0, btb $$1) {
      double $$3 = (double)(this.q != null && this.dV() instanceof arp $$2 ? dcf.d($$2, this.q, $$0, $$1, 0.0F) : 0.0F);
      if ($$3 > 0.0) {
         double $$4 = Math.max(0.0, 1.0 - $$0.h(bwp.p));
         ezy $$5 = this.dy().d(1.0, 0.0, 1.0).d().c($$3 * 0.6 * $$4);
         if ($$5.h() > 0.0) {
            $$0.j($$5.d, 0.1, $$5.f);
         }
      }
   }

   @Override
   protected void a(ezu $$0) {
      this.j = this.dV().a_($$0.b());
      super.a($$0);
      cwm $$1 = this.dZ();
      if (this.dV() instanceof arp $$2 && $$1 != null) {
         this.a($$2, $$0, $$1);
      }

      ezy $$3 = this.dy();
      ezy $$4 = new ezy(Math.signum($$3.d), Math.signum($$3.e), Math.signum($$3.f));
      ezy $$5 = $$4.c(0.05F);
      this.b(this.dt().d($$5));
      this.h(ezy.c);
      this.a(this.n(), 1.0F, 1.2F / (this.ae.i() * 0.2F + 0.9F));
      this.a = true;
      this.d = 7;
      this.a(false);
      this.a((byte)0);
      this.b(awn.aE);
      this.F();
   }

   protected void a(arp $$0, ezu $$1, cwm $$2) {
      ezy $$3 = $$1.b().a($$1.g());
      dcf.a($$0, $$2, this.p() instanceof bvh $$4 ? $$4 : null, this, null, $$3, $$0.a_($$1.b()), $$0x -> this.q = null);
   }

   @Override
   public cwm dZ() {
      return this.q;
   }

   protected awm l() {
      return awn.aE;
   }

   protected final awm n() {
      return this.m;
   }

   protected void a(bvh $$0) {
   }

   @Nullable
   protected ezv c(ezy $$0, ezy $$1) {
      return cpp.a(this.dV(), this, $$0, $$1, this.cR().b(this.dy()).g(1.0), this::b);
   }

   @Override
   protected boolean b(bul $$0) {
      return $$0 instanceof cou && this.p() instanceof cou $$1 && !$$1.a((cou)$$0) ? false : super.b($$0) && (this.n == null || !this.n.contains($$0.ar()));
   }

   @Override
   public void b(ul $$0) {
      super.b($$0);
      $$0.a("life", (short)this.k);
      if (this.j != null) {
         $$0.a("inBlockState", va.a(this.j));
      }

      $$0.a("shake", (byte)this.d);
      $$0.a("inGround", this.a);
      $$0.a("pickup", (byte)this.c.ordinal());
      $$0.a("damage", this.l);
      $$0.a("crit", this.v());
      $$0.a("PierceLevel", this.w());
      $$0.a("SoundEvent", lz.b.b(this.m).toString());
      $$0.a("item", this.p.a(this.dX()));
      if (this.q != null) {
         $$0.a("weapon", this.q.b(this.dX(), new ul()));
      }
   }

   @Override
   public void a(ul $$0) {
      super.a($$0);
      this.k = $$0.g("life");
      if ($$0.b("inBlockState", 10)) {
         this.j = va.a(this.dV().a(ma.f), $$0.p("inBlockState"));
      }

      this.d = $$0.f("shake") & 255;
      this.a = $$0.q("inGround");
      if ($$0.b("damage", 99)) {
         this.l = $$0.k("damage");
      }

      this.c = cpb.a.a($$0.f("pickup"));
      this.a($$0.q("crit"));
      this.a($$0.f("PierceLevel"));
      if ($$0.b("SoundEvent", 8)) {
         this.m = lz.b.b(alj.a($$0.l("SoundEvent"))).orElse(this.l());
      }

      if ($$0.b("item", 10)) {
         this.a(cwm.a(this.dX(), (vi)$$0.p("item")).orElse(this.s()));
      } else {
         this.a(this.s());
      }

      if ($$0.b("weapon", 10)) {
         this.q = cwm.a(this.dX(), (vi)$$0.p("weapon")).orElse(null);
      } else {
         this.q = null;
      }
   }

   @Override
   public void c(@Nullable bul $$0) {
      super.c($$0);

      this.c = switch ($$0) {
         case null, default -> this.c;
         case cou $$1 when this.c == cpb.a.a -> cpb.a.b;
         case bvn $$2 -> cpb.a.a;
      };
   }

   @Override
   public void a_(cou $$0) {
      if (!this.dV().C && (this.a || this.y()) && this.d <= 0) {
         if (this.a($$0)) {
            $$0.a(this, 1);
            this.at();
         }
      }
   }

   protected boolean a(cou $$0) {
      return switch (this.c) {
         case a -> false;
         case b -> $$0.gg().f(this.q());
         case c -> $$0.fT();
      };
   }

   protected cwm q() {
      return this.p.v();
   }

   protected abstract cwm s();

   @Override
   protected bul.b bg() {
      return bul.b.a;
   }

   public cwm t() {
      return this.p;
   }

   public void h(double $$0) {
      this.l = $$0;
   }

   public double u() {
      return this.l;
   }

   @Override
   public boolean cB() {
      return this.aq().a(axg.H);
   }

   public void a(boolean $$0) {
      this.a(1, $$0);
   }

   private void a(byte $$0) {
      this.al.a(g, $$0);
   }

   private void a(int $$0, boolean $$1) {
      byte $$2 = this.al.a(f);
      if ($$1) {
         this.al.a(f, (byte)($$2 | $$0));
      } else {
         this.al.a(f, (byte)($$2 & ~$$0));
      }
   }

   protected void a(cwm $$0) {
      if (!$$0.f()) {
         this.p = $$0;
      } else {
         this.p = this.s();
      }
   }

   public boolean v() {
      byte $$0 = this.al.a(f);
      return ($$0 & 1) != 0;
   }

   public byte w() {
      return this.al.a(g);
   }

   public void a(float $$0) {
      this.h((double)($$0 * 2.0F) + this.ae.a((double)this.dV().ak().a() * 0.11, 0.57425));
   }

   protected float x() {
      return 0.6F;
   }

   public void b(boolean $$0) {
      this.ad = $$0;
      this.a(2, $$0);
   }

   public boolean y() {
      return !this.dV().C ? this.ad : (this.al.a(f) & 2) != 0;
   }

   @Override
   public boolean bH() {
      return super.bH() && !this.a;
   }

   @Override
   public bvz a_(int $$0) {
      return $$0 == 0 ? bvz.a(this::t, this::a) : super.a_($$0);
   }

   @Override
   protected boolean z() {
      return true;
   }

   public static enum a {
      a,
      b,
      c;

      public static cpb.a a(int $$0) {
         if ($$0 < 0 || $$0 > values().length) {
            $$0 = 0;
         }

         return values()[$$0];
      }
   }
}
