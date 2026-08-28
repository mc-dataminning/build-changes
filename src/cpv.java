import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public abstract class cpv extends cqh {
   private static final double d = 2.0;
   private static final int e = 7;
   private static final float f = 0.6F;
   private static final float g = 0.99F;
   private static final aks<Byte> h = akw.a(cpv.class, aku.a);
   private static final aks<Byte> i = akw.a(cpv.class, aku.a);
   private static final aks<Boolean> j = akw.a(cpv.class, aku.k);
   private static final int k = 1;
   private static final int l = 2;
   @Nullable
   private dxo m;
   protected int a;
   public cpv.a b = cpv.a.a;
   public int c;
   private int n;
   private double o = 2.0;
   private awu p = this.s();
   @Nullable
   private IntOpenHashSet q;
   @Nullable
   private List<bvb> r;
   private cxg s = this.v();
   @Nullable
   private cxg t = null;

   protected cpv(bvi<? extends cpv> $$0, dgz $$1) {
      super($$0, $$1);
   }

   protected cpv(bvi<? extends cpv> $$0, double $$1, double $$2, double $$3, dgz $$4, cxg $$5, @Nullable cxg $$6) {
      this($$0, $$4);
      this.s = $$5.v();
      this.b($$5.a(ku.g));
      bba $$7 = $$5.c(ku.v);
      if ($$7 != null) {
         this.b = cpv.a.c;
      }

      this.a_($$1, $$2, $$3);
      if ($$6 != null && $$4 instanceof arx $$8) {
         if ($$6.f()) {
            throw new IllegalArgumentException("Invalid weapon firing an arrow");
         }

         this.t = $$6.v();
         int $$9 = dds.a($$8, $$6, this.s);
         if ($$9 > 0) {
            this.a((byte)$$9);
         }
      }
   }

   protected cpv(bvi<? extends cpv> $$0, bvx $$1, dgz $$2, cxg $$3, @Nullable cxg $$4) {
      this($$0, $$1.dB(), $$1.dF() - 0.1F, $$1.dH(), $$2, $$3, $$4);
      this.c($$1);
   }

   public void b(awu $$0) {
      this.p = $$0;
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
   protected void a(akw.a $$0) {
      $$0.a(h, (byte)0);
      $$0.a(i, (byte)0);
      $$0.a(j, false);
   }

   @Override
   public void c(double $$0, double $$1, double $$2, float $$3, float $$4) {
      super.c($$0, $$1, $$2, $$3, $$4);
      this.n = 0;
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      this.a_($$0, $$1, $$2);
      this.b($$3, $$4);
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      super.l($$0, $$1, $$2);
      this.n = 0;
      if (this.l() && azu.f($$0, $$1, $$2) > 0.0) {
         this.a(false);
      }
   }

   @Override
   public void a(aks<?> $$0) {
      super.a($$0);
      if (!this.ak && this.c <= 0 && $$0.equals(j) && this.l()) {
         this.c = 7;
      }
   }

   @Override
   public void h() {
      boolean $$0 = !this.B();
      fbr $$1 = this.dz();
      jh $$2 = this.dw();
      dxo $$3 = this.dW().a_($$2);
      if (!$$3.l() && $$0) {
         fcl $$4 = $$3.g(this.dW(), $$2);
         if (!$$4.c()) {
            fbr $$5 = this.du();

            for (fbm $$6 : $$4.e()) {
               if ($$6.a($$2).d($$5)) {
                  this.a(true);
                  break;
               }
            }
         }
      }

      if (this.c > 0) {
         this.c--;
      }

      if (this.bk() || $$3.a(dkf.rr)) {
         this.aH();
      }

      if (this.l() && $$0) {
         if (!this.dW().B_()) {
            if (this.m != $$3 && this.D()) {
               this.G();
            } else {
               this.m();
            }
         }

         this.a++;
         if (this.bL()) {
            this.aK();
         }
      } else {
         this.a = 0;
         fbr $$7 = this.du();
         if (this.bj()) {
            this.b(this.A());
            this.a($$7);
         }

         if (this.y()) {
            for (int $$8 = 0; $$8 < 4; $$8++) {
               this.dW()
                  .a(
                     ls.f,
                     $$7.d + $$1.d * (double)$$8 / 4.0,
                     $$7.e + $$1.e * (double)$$8 / 4.0,
                     $$7.f + $$1.f * (double)$$8 / 4.0,
                     -$$1.d,
                     -$$1.e + 0.2,
                     -$$1.f
                  );
            }
         }

         float $$9;
         if (!$$0) {
            $$9 = (float)(azu.d(-$$1.d, -$$1.f) * 180.0F / (float)Math.PI);
         } else {
            $$9 = (float)(azu.d($$1.d, $$1.f) * 180.0F / (float)Math.PI);
         }

         float $$11 = (float)(azu.d($$1.e, $$1.i()) * 180.0F / (float)Math.PI);
         this.w(f(this.dO(), $$11));
         this.v(f(this.dM(), $$9));
         if ($$0) {
            fbn $$12 = this.dW().b(new dgh($$7, $$7.e($$1), dgh.a.a, dgh.b.a, this));
            this.b($$12);
         } else {
            this.b($$7.e($$1));
            this.aK();
         }

         if (!this.bj()) {
            this.b(0.99F);
         }

         if ($$0 && !this.l()) {
            this.bf();
         }

         super.h();
      }
   }

   private void b(fbn $$0) {
      while (this.bL()) {
         fbr $$1 = this.du();
         fbo $$2 = this.c($$1, $$0.g());
         fbr $$3 = Objects.requireNonNullElse($$2, $$0).g();
         this.b($$3);
         this.a($$1, $$3);
         if (this.as != null && this.as.e()) {
            this.bW();
         }

         if ($$2 == null) {
            if (this.bL() && $$0.d() != fbp.a.a) {
               this.b((fbp)$$0);
               this.ar = true;
            }
            break;
         } else if (this.bL() && !this.ad) {
            cqi $$4 = this.b($$2);
            this.ar = true;
            if (this.z() > 0 && $$4 == cqi.a) {
               continue;
            }
            break;
         }
      }
   }

   private void b(float $$0) {
      fbr $$1 = this.dz();
      this.h($$1.c((double)$$0));
   }

   private void a(fbr $$0) {
      fbr $$1 = this.dz();

      for (int $$2 = 0; $$2 < 4; $$2++) {
         float $$3 = 0.25F;
         this.dW().a(ls.d, $$0.d - $$1.d * 0.25, $$0.e - $$1.e * 0.25, $$0.f - $$1.f * 0.25, $$1.d, $$1.e, $$1.f);
      }
   }

   @Override
   protected double bd() {
      return 0.05;
   }

   private boolean D() {
      return this.l() && this.dW().b(new fbm(this.du(), this.du()).g(0.06));
   }

   private void G() {
      this.a(false);
      fbr $$0 = this.dz();
      this.h($$0.d((double)(this.ae.i() * 0.2F), (double)(this.ae.i() * 0.2F), (double)(this.ae.i() * 0.2F)));
      this.n = 0;
   }

   protected boolean l() {
      return this.al.a(j);
   }

   protected void a(boolean $$0) {
      this.al.a(j, $$0);
   }

   @Override
   public void a(bwb $$0, fbr $$1) {
      super.a($$0, $$1);
      if ($$0 != bwb.a && this.D()) {
         this.G();
      }
   }

   @Override
   protected void m() {
      this.n++;
      if (this.n >= 1200) {
         this.at();
      }
   }

   private void H() {
      if (this.r != null) {
         this.r.clear();
      }

      if (this.q != null) {
         this.q.clear();
      }
   }

   @Override
   protected void b(cxc $$0) {
      this.t = null;
   }

   @Override
   public void m(boolean $$0) {
      if (!this.l()) {
         super.m($$0);
      }
   }

   @Override
   public void j(double $$0, double $$1, double $$2) {
      if (!this.l()) {
         super.j($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(fbo $$0) {
      super.a($$0);
      bvb $$1 = $$0.a();
      float $$2 = (float)this.dz().g();
      double $$3 = this.o;
      bvb $$4 = this.p();
      btr $$5 = this.dX().a(this, (bvb)($$4 != null ? $$4 : this));
      if (this.ea() != null && this.dW() instanceof arx $$6) {
         $$3 = (double)dds.a($$6, this.ea(), $$1, $$5, (float)$$3);
      }

      int $$7 = azu.c(azu.a((double)$$2 * $$3, 0.0, 2.147483647E9));
      if (this.z() > 0) {
         if (this.q == null) {
            this.q = new IntOpenHashSet(5);
         }

         if (this.r == null) {
            this.r = Lists.newArrayListWithCapacity(5);
         }

         if (this.q.size() >= this.z() + 1) {
            this.at();
            return;
         }

         this.q.add($$1.ar());
      }

      if (this.y()) {
         long $$8 = (long)this.ae.a($$7 / 2 + 2);
         $$7 = (int)Math.min($$8 + (long)$$7, 2147483647L);
      }

      if ($$4 instanceof bvx $$9) {
         $$9.B($$1);
      }

      boolean $$10 = $$1.aq() == bvi.O;
      int $$11 = $$1.aG();
      if (this.bY() && !$$10) {
         $$1.d(5.0F);
      }

      if ($$1.b($$5, (float)$$7)) {
         if ($$10) {
            return;
         }

         if ($$1 instanceof bvx $$12) {
            if (!this.dW().C && this.z() <= 0) {
               $$12.o($$12.eU() + 1);
            }

            this.a($$12, $$5);
            if (this.dW() instanceof arx $$13) {
               dds.a($$13, $$12, $$5, this.ea());
            }

            this.a($$12);
            if ($$12 != $$4 && $$12 instanceof cpo && $$4 instanceof ary && !this.bb()) {
               ((ary)$$4).f.b(new ado(ado.h, 0.0F));
            }

            if (!$$1.bL() && this.r != null) {
               this.r.add($$12);
            }

            if (!this.dW().C && $$4 instanceof ary $$14) {
               if (this.r != null) {
                  ao.H.a($$14, this.r, this.t);
               } else if (!$$1.bL()) {
                  ao.H.a($$14, List.of($$1), this.t);
               }
            }
         }

         this.a(this.p, 1.0F, 1.2F / (this.ae.i() * 0.2F + 0.9F));
         if (this.z() <= 0) {
            this.at();
         }
      } else {
         $$1.h($$11);
         this.a(cqi.b, $$1, this.p(), false);
         this.h(this.dz().c(0.2));
         if (this.dW() instanceof arx $$15 && this.dz().h() < 1.0E-7) {
            if (this.b == cpv.a.b) {
               this.a($$15, this.u(), 0.1F);
            }

            this.at();
         }
      }
   }

   protected void a(bvx $$0, btr $$1) {
      double $$3 = (double)(this.t != null && this.dW() instanceof arx $$2 ? dds.d($$2, this.t, $$0, $$1, 0.0F) : 0.0F);
      if ($$3 > 0.0) {
         double $$4 = Math.max(0.0, 1.0 - $$0.h(bxf.p));
         fbr $$5 = this.dz().d(1.0, 0.0, 1.0).d().c($$3 * 0.6 * $$4);
         if ($$5.h() > 0.0) {
            $$0.j($$5.d, 0.1, $$5.f);
         }
      }
   }

   @Override
   protected void a(fbn $$0) {
      this.m = this.dW().a_($$0.b());
      super.a($$0);
      cxg $$1 = this.ea();
      if (this.dW() instanceof arx $$2 && $$1 != null) {
         this.a($$2, $$0, $$1);
      }

      fbr $$3 = this.dz();
      fbr $$4 = new fbr(Math.signum($$3.d), Math.signum($$3.e), Math.signum($$3.f));
      fbr $$5 = $$4.c(0.05F);
      this.b(this.du().d($$5));
      this.h(fbr.c);
      this.a(this.t(), 1.0F, 1.2F / (this.ae.i() * 0.2F + 0.9F));
      this.a(true);
      this.c = 7;
      this.b(false);
      this.a((byte)0);
      this.b(awv.aE);
      this.H();
   }

   protected void a(arx $$0, fbn $$1, cxg $$2) {
      fbr $$3 = $$1.b().a($$1.g());
      dds.a($$0, $$2, this.p() instanceof bvx $$4 ? $$4 : null, this, null, $$3, $$0.a_($$1.b()), $$0x -> this.t = null);
   }

   @Override
   public cxg ea() {
      return this.t;
   }

   protected awu s() {
      return awv.aE;
   }

   protected final awu t() {
      return this.p;
   }

   protected void a(bvx $$0) {
   }

   @Nullable
   protected fbo c(fbr $$0, fbr $$1) {
      return cqj.a(this.dW(), this, $$0, $$1, this.cR().b(this.dz()).g(1.0), this::b);
   }

   @Override
   protected boolean b(bvb $$0) {
      return $$0 instanceof cpo && this.p() instanceof cpo $$1 && !$$1.a((cpo)$$0) ? false : super.b($$0) && (this.q == null || !this.q.contains($$0.ar()));
   }

   @Override
   public void b(um $$0) {
      super.b($$0);
      $$0.a("life", (short)this.n);
      if (this.m != null) {
         $$0.a("inBlockState", vb.a(this.m));
      }

      $$0.a("shake", (byte)this.c);
      $$0.a("inGround", this.l());
      $$0.a("pickup", (byte)this.b.ordinal());
      $$0.a("damage", this.o);
      $$0.a("crit", this.y());
      $$0.a("PierceLevel", this.z());
      $$0.a("SoundEvent", ma.b.b(this.p).toString());
      $$0.a("item", this.s.a(this.dY()));
      if (this.t != null) {
         $$0.a("weapon", this.t.b(this.dY(), new um()));
      }
   }

   @Override
   public void a(um $$0) {
      super.a($$0);
      this.n = $$0.g("life");
      if ($$0.b("inBlockState", 10)) {
         this.m = vb.a(this.dW().a(mb.f), $$0.p("inBlockState"));
      }

      this.c = $$0.f("shake") & 255;
      this.a($$0.q("inGround"));
      if ($$0.b("damage", 99)) {
         this.o = $$0.k("damage");
      }

      this.b = cpv.a.a($$0.f("pickup"));
      this.b($$0.q("crit"));
      this.a($$0.f("PierceLevel"));
      if ($$0.b("SoundEvent", 8)) {
         this.p = ma.b.b(alp.a($$0.l("SoundEvent"))).orElse(this.s());
      }

      if ($$0.b("item", 10)) {
         this.a(cxg.a(this.dY(), (vj)$$0.p("item")).orElse(this.v()));
      } else {
         this.a(this.v());
      }

      if ($$0.b("weapon", 10)) {
         this.t = cxg.a(this.dY(), (vj)$$0.p("weapon")).orElse(null);
      } else {
         this.t = null;
      }
   }

   @Override
   public void c(@Nullable bvb $$0) {
      super.c($$0);

      this.b = switch ($$0) {
         case null, default -> this.b;
         case cpo $$1 when this.b == cpv.a.a -> cpv.a.b;
         case bwd $$2 -> cpv.a.a;
      };
   }

   @Override
   public void a_(cpo $$0) {
      if (!this.dW().C && (this.l() || this.B()) && this.c <= 0) {
         if (this.a($$0)) {
            $$0.a(this, 1);
            this.at();
         }
      }
   }

   protected boolean a(cpo $$0) {
      return switch (this.b) {
         case a -> false;
         case b -> $$0.gi().f(this.u());
         case c -> $$0.fV();
      };
   }

   protected cxg u() {
      return this.s.v();
   }

   protected abstract cxg v();

   @Override
   protected bvb.c bg() {
      return bvb.c.a;
   }

   public cxg w() {
      return this.s;
   }

   public void h(double $$0) {
      this.o = $$0;
   }

   public double x() {
      return this.o;
   }

   @Override
   public boolean cB() {
      return this.aq().a(axo.H);
   }

   public void b(boolean $$0) {
      this.a(1, $$0);
   }

   private void a(byte $$0) {
      this.al.a(i, $$0);
   }

   private void a(int $$0, boolean $$1) {
      byte $$2 = this.al.a(h);
      if ($$1) {
         this.al.a(h, (byte)($$2 | $$0));
      } else {
         this.al.a(h, (byte)($$2 & ~$$0));
      }
   }

   protected void a(cxg $$0) {
      if (!$$0.f()) {
         this.s = $$0;
      } else {
         this.s = this.v();
      }
   }

   public boolean y() {
      byte $$0 = this.al.a(h);
      return ($$0 & 1) != 0;
   }

   public byte z() {
      return this.al.a(i);
   }

   public void a(float $$0) {
      this.h((double)($$0 * 2.0F) + this.ae.a((double)this.dW().am().a() * 0.11, 0.57425));
   }

   protected float A() {
      return 0.6F;
   }

   public void r(boolean $$0) {
      this.ad = $$0;
      this.a(2, $$0);
   }

   public boolean B() {
      return !this.dW().C ? this.ad : (this.al.a(h) & 2) != 0;
   }

   @Override
   public boolean bH() {
      return super.bH() && !this.l();
   }

   @Override
   public bwp a_(int $$0) {
      return $$0 == 0 ? bwp.a(this::w, this::a) : super.a_($$0);
   }

   @Override
   protected boolean C() {
      return true;
   }

   public static enum a {
      a,
      b,
      c;

      public static cpv.a a(int $$0) {
         if ($$0 < 0 || $$0 > values().length) {
            $$0 = 0;
         }

         return values()[$$0];
      }
   }
}
