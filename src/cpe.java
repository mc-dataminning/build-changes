import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public abstract class cpe extends cpq {
   private static final double d = 2.0;
   private static final int e = 7;
   private static final float f = 0.6F;
   private static final float g = 0.99F;
   private static final ajx<Byte> h = akb.a(cpe.class, ajz.a);
   private static final ajx<Byte> i = akb.a(cpe.class, ajz.a);
   private static final ajx<Boolean> j = akb.a(cpe.class, ajz.k);
   private static final int k = 1;
   private static final int l = 2;
   @Nullable
   private dwx m;
   protected int a;
   public cpe.a b = cpe.a.a;
   public int c;
   private int n;
   private double o = 2.0;
   private avz p = this.s();
   @Nullable
   private IntOpenHashSet q;
   @Nullable
   private List<buk> r;
   private cwp s = this.v();
   @Nullable
   private cwp t = null;

   protected cpe(bur<? extends cpe> $$0, dgi $$1) {
      super($$0, $$1);
   }

   protected cpe(bur<? extends cpe> $$0, double $$1, double $$2, double $$3, dgi $$4, cwp $$5, @Nullable cwp $$6) {
      this($$0, $$4);
      this.s = $$5.v();
      this.b($$5.a(kv.g));
      baf $$7 = $$5.c(kv.v);
      if ($$7 != null) {
         this.b = cpe.a.c;
      }

      this.a_($$1, $$2, $$3);
      if ($$6 != null && $$4 instanceof arc $$8) {
         if ($$6.f()) {
            throw new IllegalArgumentException("Invalid weapon firing an arrow");
         }

         this.t = $$6.v();
         int $$9 = ddb.a($$8, $$6, this.s);
         if ($$9 > 0) {
            this.a((byte)$$9);
         }
      }
   }

   protected cpe(bur<? extends cpe> $$0, bvg $$1, dgi $$2, cwp $$3, @Nullable cwp $$4) {
      this($$0, $$1.dB(), $$1.dF() - 0.1F, $$1.dH(), $$2, $$3, $$4);
      this.c($$1);
   }

   public void b(avz $$0) {
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
   protected void a(akb.a $$0) {
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
      if (this.l() && ayz.f($$0, $$1, $$2) > 0.0) {
         this.a(false);
      }
   }

   @Override
   public void a(ajx<?> $$0) {
      super.a($$0);
      if (!this.ak && this.c <= 0 && $$0.equals(j) && this.l()) {
         this.c = 7;
      }
   }

   @Override
   public void h() {
      boolean $$0 = !this.B();
      fba $$1 = this.dz();
      ji $$2 = this.dw();
      dwx $$3 = this.dW().a_($$2);
      if (!$$3.l() && $$0) {
         fbu $$4 = $$3.g(this.dW(), $$2);
         if (!$$4.c()) {
            fba $$5 = this.du();

            for (fav $$6 : $$4.e()) {
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

      if (this.bk() || $$3.a(djo.rr)) {
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
         fba $$7 = this.du();
         if (this.bj()) {
            this.b(this.A());
            this.a($$7);
         }

         if (this.y()) {
            for (int $$8 = 0; $$8 < 4; $$8++) {
               this.dW()
                  .a(
                     lt.f,
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
            $$9 = (float)(ayz.d(-$$1.d, -$$1.f) * 180.0F / (float)Math.PI);
         } else {
            $$9 = (float)(ayz.d($$1.d, $$1.f) * 180.0F / (float)Math.PI);
         }

         float $$11 = (float)(ayz.d($$1.e, $$1.i()) * 180.0F / (float)Math.PI);
         this.w(f(this.dO(), $$11));
         this.v(f(this.dM(), $$9));
         if ($$0) {
            faw $$12 = this.dW().b(new dfq($$7, $$7.e($$1), dfq.a.a, dfq.b.a, this));
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

   private void b(faw $$0) {
      while (this.bL()) {
         fba $$1 = this.du();
         fax $$2 = this.c($$1, $$0.g());
         fba $$3 = Objects.requireNonNullElse($$2, $$0).g();
         this.b($$3);
         this.a($$1, $$3);
         if (this.as != null && this.as.e()) {
            this.bW();
         }

         if ($$2 == null) {
            if (this.bL() && $$0.d() != fay.a.a) {
               this.b((fay)$$0);
               this.ar = true;
            }
            break;
         } else if (this.bL() && !this.ad) {
            cpr $$4 = this.b($$2);
            this.ar = true;
            if (this.z() > 0 && $$4 == cpr.a) {
               continue;
            }
            break;
         }
      }
   }

   private void b(float $$0) {
      fba $$1 = this.dz();
      this.h($$1.c((double)$$0));
   }

   private void a(fba $$0) {
      fba $$1 = this.dz();

      for (int $$2 = 0; $$2 < 4; $$2++) {
         float $$3 = 0.25F;
         this.dW().a(lt.d, $$0.d - $$1.d * 0.25, $$0.e - $$1.e * 0.25, $$0.f - $$1.f * 0.25, $$1.d, $$1.e, $$1.f);
      }
   }

   @Override
   protected double bd() {
      return 0.05;
   }

   private boolean D() {
      return this.l() && this.dW().b(new fav(this.du(), this.du()).g(0.06));
   }

   private void G() {
      this.a(false);
      fba $$0 = this.dz();
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
   public void a(bvk $$0, fba $$1) {
      super.a($$0, $$1);
      if ($$0 != bvk.a && this.D()) {
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
   protected void b(cwl $$0) {
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
   protected void a(fax $$0) {
      super.a($$0);
      buk $$1 = $$0.a();
      float $$2 = (float)this.dz().g();
      double $$3 = this.o;
      buk $$4 = this.p();
      bta $$5 = this.dX().a(this, (buk)($$4 != null ? $$4 : this));
      if (this.ea() != null && this.dW() instanceof arc $$6) {
         $$3 = (double)ddb.a($$6, this.ea(), $$1, $$5, (float)$$3);
      }

      int $$7 = ayz.c(ayz.a((double)$$2 * $$3, 0.0, 2.147483647E9));
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

      if ($$4 instanceof bvg $$9) {
         $$9.B($$1);
      }

      boolean $$10 = $$1.aq() == bur.O;
      int $$11 = $$1.aG();
      if (this.bY() && !$$10) {
         $$1.d(5.0F);
      }

      if ($$1.b($$5, (float)$$7)) {
         if ($$10) {
            return;
         }

         if ($$1 instanceof bvg $$12) {
            if (!this.dW().C && this.z() <= 0) {
               $$12.o($$12.eU() + 1);
            }

            this.a($$12, $$5);
            if (this.dW() instanceof arc $$13) {
               ddb.a($$13, $$12, $$5, this.ea());
            }

            this.a($$12);
            if ($$12 != $$4 && $$12 instanceof cox && $$4 instanceof ard && !this.bb()) {
               ((ard)$$4).f.b(new acs(acs.h, 0.0F));
            }

            if (!$$1.bL() && this.r != null) {
               this.r.add($$12);
            }

            if (!this.dW().C && $$4 instanceof ard $$14) {
               if (this.r != null) {
                  ap.H.a($$14, this.r, this.t);
               } else if (!$$1.bL()) {
                  ap.H.a($$14, List.of($$1), this.t);
               }
            }
         }

         this.a(this.p, 1.0F, 1.2F / (this.ae.i() * 0.2F + 0.9F));
         if (this.z() <= 0) {
            this.at();
         }
      } else {
         $$1.h($$11);
         this.a(cpr.b, $$1, this.p(), false);
         this.h(this.dz().c(0.2));
         if (this.dW() instanceof arc $$15 && this.dz().h() < 1.0E-7) {
            if (this.b == cpe.a.b) {
               this.a($$15, this.u(), 0.1F);
            }

            this.at();
         }
      }
   }

   protected void a(bvg $$0, bta $$1) {
      double $$3 = (double)(this.t != null && this.dW() instanceof arc $$2 ? ddb.d($$2, this.t, $$0, $$1, 0.0F) : 0.0F);
      if ($$3 > 0.0) {
         double $$4 = Math.max(0.0, 1.0 - $$0.h(bwo.p));
         fba $$5 = this.dz().d(1.0, 0.0, 1.0).d().c($$3 * 0.6 * $$4);
         if ($$5.h() > 0.0) {
            $$0.j($$5.d, 0.1, $$5.f);
         }
      }
   }

   @Override
   protected void a(faw $$0) {
      this.m = this.dW().a_($$0.b());
      super.a($$0);
      cwp $$1 = this.ea();
      if (this.dW() instanceof arc $$2 && $$1 != null) {
         this.a($$2, $$0, $$1);
      }

      fba $$3 = this.dz();
      fba $$4 = new fba(Math.signum($$3.d), Math.signum($$3.e), Math.signum($$3.f));
      fba $$5 = $$4.c(0.05F);
      this.b(this.du().d($$5));
      this.h(fba.c);
      this.a(this.t(), 1.0F, 1.2F / (this.ae.i() * 0.2F + 0.9F));
      this.a(true);
      this.c = 7;
      this.b(false);
      this.a((byte)0);
      this.b(awa.aE);
      this.H();
   }

   protected void a(arc $$0, faw $$1, cwp $$2) {
      fba $$3 = $$1.b().a($$1.g());
      ddb.a($$0, $$2, this.p() instanceof bvg $$4 ? $$4 : null, this, null, $$3, $$0.a_($$1.b()), $$0x -> this.t = null);
   }

   @Override
   public cwp ea() {
      return this.t;
   }

   protected avz s() {
      return awa.aE;
   }

   protected final avz t() {
      return this.p;
   }

   protected void a(bvg $$0) {
   }

   @Nullable
   protected fax c(fba $$0, fba $$1) {
      return cps.a(this.dW(), this, $$0, $$1, this.cR().b(this.dz()).g(1.0), this::b);
   }

   @Override
   protected boolean b(buk $$0) {
      return $$0 instanceof cox && this.p() instanceof cox $$1 && !$$1.a((cox)$$0) ? false : super.b($$0) && (this.q == null || !this.q.contains($$0.ar()));
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("life", (short)this.n);
      if (this.m != null) {
         $$0.a("inBlockState", uf.a(this.m));
      }

      $$0.a("shake", (byte)this.c);
      $$0.a("inGround", this.l());
      $$0.a("pickup", (byte)this.b.ordinal());
      $$0.a("damage", this.o);
      $$0.a("crit", this.y());
      $$0.a("PierceLevel", this.z());
      $$0.a("SoundEvent", mb.b.b(this.p).toString());
      $$0.a("item", this.s.a(this.dY()));
      if (this.t != null) {
         $$0.a("weapon", this.t.b(this.dY(), new tq()));
      }
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.n = $$0.g("life");
      if ($$0.b("inBlockState", 10)) {
         this.m = uf.a(this.dW().a(mc.f), $$0.p("inBlockState"));
      }

      this.c = $$0.f("shake") & 255;
      this.a($$0.q("inGround"));
      if ($$0.b("damage", 99)) {
         this.o = $$0.k("damage");
      }

      this.b = cpe.a.a($$0.f("pickup"));
      this.b($$0.q("crit"));
      this.a($$0.f("PierceLevel"));
      if ($$0.b("SoundEvent", 8)) {
         this.p = mb.b.b(aku.a($$0.l("SoundEvent"))).orElse(this.s());
      }

      if ($$0.b("item", 10)) {
         this.a(cwp.a(this.dY(), (un)$$0.p("item")).orElse(this.v()));
      } else {
         this.a(this.v());
      }

      if ($$0.b("weapon", 10)) {
         this.t = cwp.a(this.dY(), (un)$$0.p("weapon")).orElse(null);
      } else {
         this.t = null;
      }
   }

   @Override
   public void c(@Nullable buk $$0) {
      super.c($$0);

      this.b = switch ($$0) {
         case null, default -> this.b;
         case cox $$1 when this.b == cpe.a.a -> cpe.a.b;
         case bvm $$2 -> cpe.a.a;
      };
   }

   @Override
   public void a_(cox $$0) {
      if (!this.dW().C && (this.l() || this.B()) && this.c <= 0) {
         if (this.a($$0)) {
            $$0.a(this, 1);
            this.at();
         }
      }
   }

   protected boolean a(cox $$0) {
      return switch (this.b) {
         case a -> false;
         case b -> $$0.gi().f(this.u());
         case c -> $$0.fV();
      };
   }

   protected cwp u() {
      return this.s.v();
   }

   protected abstract cwp v();

   @Override
   protected buk.c bg() {
      return buk.c.a;
   }

   public cwp w() {
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
      return this.aq().a(awt.H);
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

   protected void a(cwp $$0) {
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
   public bvy a_(int $$0) {
      return $$0 == 0 ? bvy.a(this::w, this::a) : super.a_($$0);
   }

   @Override
   protected boolean C() {
      return true;
   }

   public static enum a {
      a,
      b,
      c;

      public static cpe.a a(int $$0) {
         if ($$0 < 0 || $$0 > values().length) {
            $$0 = 0;
         }

         return values()[$$0];
      }
   }
}
