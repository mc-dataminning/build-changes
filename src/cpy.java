import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public abstract class cpy extends cqk {
   private static final double d = 2.0;
   private static final int e = 7;
   private static final float f = 0.6F;
   private static final float g = 0.99F;
   private static final ajx<Byte> h = akb.a(cpy.class, ajz.a);
   private static final ajx<Byte> i = akb.a(cpy.class, ajz.a);
   private static final ajx<Boolean> j = akb.a(cpy.class, ajz.k);
   private static final int k = 1;
   private static final int l = 2;
   @Nullable
   private dxq m;
   protected int a;
   public cpy.a b = cpy.a.a;
   public int c;
   private int n;
   private double o = 2.0;
   private avz p = this.j();
   @Nullable
   private IntOpenHashSet q;
   @Nullable
   private List<bva> r;
   private cxh s = this.o();
   @Nullable
   private cxh t = null;

   protected cpy(bvi<? extends cpy> $$0, dgz $$1) {
      super($$0, $$1);
   }

   protected cpy(bvi<? extends cpy> $$0, double $$1, double $$2, double $$3, dgz $$4, cxh $$5, @Nullable cxh $$6) {
      this($$0, $$4);
      this.s = $$5.v();
      this.b($$5.a(kv.g));
      baf $$7 = $$5.d(kv.v);
      if ($$7 != null) {
         this.b = cpy.a.c;
      }

      this.a_($$1, $$2, $$3);
      if ($$6 != null && $$4 instanceof ard $$8) {
         if ($$6.f()) {
            throw new IllegalArgumentException("Invalid weapon firing an arrow");
         }

         this.t = $$6.v();
         int $$9 = ddt.a($$8, $$6, this.s);
         if ($$9 > 0) {
            this.a((byte)$$9);
         }
      }
   }

   protected cpy(bvi<? extends cpy> $$0, bvy $$1, dgz $$2, cxh $$3, @Nullable cxh $$4) {
      this($$0, $$1.dz(), $$1.dD() - 0.1F, $$1.dF(), $$2, $$3, $$4);
      this.c($$1);
   }

   public void b(avz $$0) {
      this.p = $$0;
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = this.cQ().a() * 10.0;
      if (Double.isNaN($$1)) {
         $$1 = 1.0;
      }

      $$1 *= 64.0 * cJ();
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
   public void l(double $$0, double $$1, double $$2) {
      super.l($$0, $$1, $$2);
      this.n = 0;
      if (this.f() && ayz.f($$0, $$1, $$2) > 0.0) {
         this.a(false);
      }
   }

   @Override
   public void a(ajx<?> $$0) {
      super.a($$0);
      if (!this.ak && this.c <= 0 && $$0.equals(j) && this.f()) {
         this.c = 7;
      }
   }

   @Override
   public void h() {
      boolean $$0 = !this.w();
      fbx $$1 = this.dx();
      ji $$2 = this.du();
      dxq $$3 = this.dU().a_($$2);
      if (!$$3.l() && $$0) {
         fcr $$4 = $$3.g(this.dU(), $$2);
         if (!$$4.c()) {
            fbx $$5 = this.ds();

            for (fbs $$6 : $$4.e()) {
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

      if (this.bk() || $$3.a(dkg.rr)) {
         this.aH();
      }

      if (this.f() && $$0) {
         if (!this.dU().w_()) {
            if (this.m != $$3 && this.y()) {
               this.B();
            } else {
               this.g();
            }
         }

         this.a++;
         if (this.bJ()) {
            this.aK();
         }

         if (!this.dU().C) {
            this.c(this.aG() > 0);
         }
      } else {
         this.a = 0;
         fbx $$7 = this.ds();
         if (this.bj()) {
            this.b(this.v());
            this.a($$7);
         }

         if (this.t()) {
            for (int $$8 = 0; $$8 < 4; $$8++) {
               this.dU()
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
         this.x(f(this.dM(), $$11));
         this.w(f(this.dK(), $$9));
         if ($$0) {
            fbt $$12 = this.dU().b(new dgi($$7, $$7.e($$1), dgi.a.a, dgi.b.a, this));
            this.b($$12);
         } else {
            this.b($$7.e($$1));
            this.aK();
         }

         if (!this.bj()) {
            this.b(0.99F);
         }

         if ($$0 && !this.f()) {
            this.bf();
         }

         super.h();
      }
   }

   private void b(fbt $$0) {
      while (this.bJ()) {
         fbx $$1 = this.ds();
         fbu $$2 = this.c($$1, $$0.g());
         fbx $$3 = Objects.requireNonNullElse($$2, $$0).g();
         this.b($$3);
         this.a($$1, $$3);
         if (this.as != null && this.as.e()) {
            this.bV();
         }

         if ($$2 == null) {
            if (this.bJ() && $$0.d() != fbv.a.a) {
               this.b((fbv)$$0);
               this.ar = true;
            }
            break;
         } else if (this.bJ() && !this.ad) {
            cql $$4 = this.b($$2);
            this.ar = true;
            if (this.u() > 0 && $$4 == cql.a) {
               continue;
            }
            break;
         }
      }
   }

   private void b(float $$0) {
      fbx $$1 = this.dx();
      this.i($$1.c((double)$$0));
   }

   private void a(fbx $$0) {
      fbx $$1 = this.dx();

      for (int $$2 = 0; $$2 < 4; $$2++) {
         float $$3 = 0.25F;
         this.dU().a(lt.d, $$0.d - $$1.d * 0.25, $$0.e - $$1.e * 0.25, $$0.f - $$1.f * 0.25, $$1.d, $$1.e, $$1.f);
      }
   }

   @Override
   protected double bd() {
      return 0.05;
   }

   private boolean y() {
      return this.f() && this.dU().b(new fbs(this.ds(), this.ds()).g(0.06));
   }

   private void B() {
      this.a(false);
      fbx $$0 = this.dx();
      this.i($$0.d((double)(this.ae.i() * 0.2F), (double)(this.ae.i() * 0.2F), (double)(this.ae.i() * 0.2F)));
      this.n = 0;
   }

   protected boolean f() {
      return this.al.a(j);
   }

   protected void a(boolean $$0) {
      this.al.a(j, $$0);
   }

   @Override
   public void a(bwc $$0, fbx $$1) {
      super.a($$0, $$1);
      if ($$0 != bwc.a && this.y()) {
         this.B();
      }
   }

   protected void g() {
      this.n++;
      if (this.n >= 1200) {
         this.at();
      }
   }

   private void C() {
      if (this.r != null) {
         this.r.clear();
      }

      if (this.q != null) {
         this.q.clear();
      }
   }

   @Override
   protected void b(cxd $$0) {
      this.t = null;
   }

   @Override
   public void a(boolean $$0, ji $$1) {
      if (!this.f()) {
         double $$2 = $$0 ? -0.03 : 0.1;
         this.i(this.dx().b(0.0, $$2, 0.0));
         this.f($$1);
      }
   }

   @Override
   public void l(boolean $$0) {
      if (!this.f()) {
         double $$1 = $$0 ? -0.03 : 0.06;
         this.i(this.dx().b(0.0, $$1, 0.0));
         this.k();
      }
   }

   @Override
   public void j(double $$0, double $$1, double $$2) {
      if (!this.f()) {
         super.j($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(fbu $$0) {
      super.a($$0);
      bva $$1 = $$0.a();
      float $$2 = (float)this.dx().g();
      double $$3 = this.o;
      bva $$4 = this.q();
      btp $$5 = this.dV().a(this, (bva)($$4 != null ? $$4 : this));
      if (this.dY() != null && this.dU() instanceof ard $$6) {
         $$3 = (double)ddt.a($$6, this.dY(), $$1, $$5, (float)$$3);
      }

      int $$7 = ayz.c(ayz.a((double)$$2 * $$3, 0.0, 2.147483647E9));
      if (this.u() > 0) {
         if (this.q == null) {
            this.q = new IntOpenHashSet(5);
         }

         if (this.r == null) {
            this.r = Lists.newArrayListWithCapacity(5);
         }

         if (this.q.size() >= this.u() + 1) {
            this.at();
            return;
         }

         this.q.add($$1.ar());
      }

      if (this.t()) {
         long $$8 = (long)this.ae.a($$7 / 2 + 2);
         $$7 = (int)Math.min($$8 + (long)$$7, 2147483647L);
      }

      if ($$4 instanceof bvy $$9) {
         $$9.B($$1);
      }

      boolean $$10 = $$1.aq() == bvi.N;
      int $$11 = $$1.aG();
      if (this.bX() && !$$10) {
         $$1.e(5.0F);
      }

      if ($$1.b($$5, (float)$$7)) {
         if ($$10) {
            return;
         }

         if ($$1 instanceof bvy $$12) {
            if (!this.dU().C && this.u() <= 0) {
               $$12.o($$12.eU() + 1);
            }

            this.a($$12, $$5);
            if (this.dU() instanceof ard $$13) {
               ddt.a($$13, $$12, $$5, this.dY());
            }

            this.a($$12);
            if ($$12 instanceof cpr && $$4 instanceof are $$14 && !this.bb()) {
               $$14.f.b(new acs(acs.h, 0.0F));
            }

            if (!$$1.bJ() && this.r != null) {
               this.r.add($$12);
            }

            if (!this.dU().C && $$4 instanceof are $$15) {
               if (this.r != null) {
                  ap.H.a($$15, this.r, this.t);
               } else if (!$$1.bJ()) {
                  ap.H.a($$15, List.of($$1), this.t);
               }
            }
         }

         this.a(this.p, 1.0F, 1.2F / (this.ae.i() * 0.2F + 0.9F));
         if (this.u() <= 0) {
            this.at();
         }
      } else {
         $$1.h($$11);
         this.a(cql.b, $$1, this.q(), false);
         this.i(this.dx().c(0.2));
         if (this.dU() instanceof ard $$16 && this.dx().h() < 1.0E-7) {
            if (this.b == cpy.a.b) {
               this.a($$16, this.n(), 0.1F);
            }

            this.at();
         }
      }
   }

   protected void a(bvy $$0, btp $$1) {
      double $$3 = (double)(this.t != null && this.dU() instanceof ard $$2 ? ddt.d($$2, this.t, $$0, $$1, 0.0F) : 0.0F);
      if ($$3 > 0.0) {
         double $$4 = Math.max(0.0, 1.0 - $$0.h(bxg.p));
         fbx $$5 = this.dx().d(1.0, 0.0, 1.0).d().c($$3 * 0.6 * $$4);
         if ($$5.h() > 0.0) {
            $$0.j($$5.d, 0.1, $$5.f);
         }
      }
   }

   @Override
   protected void a(fbt $$0) {
      this.m = this.dU().a_($$0.b());
      super.a($$0);
      cxh $$1 = this.dY();
      if (this.dU() instanceof ard $$2 && $$1 != null) {
         this.a($$2, $$0, $$1);
      }

      fbx $$3 = this.dx();
      fbx $$4 = new fbx(Math.signum($$3.d), Math.signum($$3.e), Math.signum($$3.f));
      fbx $$5 = $$4.c(0.05F);
      this.b(this.ds().d($$5));
      this.i(fbx.c);
      this.a(this.m(), 1.0F, 1.2F / (this.ae.i() * 0.2F + 0.9F));
      this.a(true);
      this.c = 7;
      this.b(false);
      this.a((byte)0);
      this.b(awa.aE);
      this.C();
   }

   protected void a(ard $$0, fbt $$1, cxh $$2) {
      fbx $$3 = $$1.b().a($$1.g());
      ddt.a($$0, $$2, this.q() instanceof bvy $$4 ? $$4 : null, this, null, $$3, $$0.a_($$1.b()), $$0x -> this.t = null);
   }

   @Override
   public cxh dY() {
      return this.t;
   }

   protected avz j() {
      return awa.aE;
   }

   protected final avz m() {
      return this.p;
   }

   protected void a(bvy $$0) {
   }

   @Nullable
   protected fbu c(fbx $$0, fbx $$1) {
      return cqm.a(this.dU(), this, $$0, $$1, this.cQ().b(this.dx()).g(1.0), this::b);
   }

   @Override
   protected boolean b(bva $$0) {
      return $$0 instanceof cpr && this.q() instanceof cpr $$1 && !$$1.a((cpr)$$0) ? false : super.b($$0) && (this.q == null || !this.q.contains($$0.ar()));
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("life", (short)this.n);
      if (this.m != null) {
         $$0.a("inBlockState", uf.a(this.m));
      }

      $$0.a("shake", (byte)this.c);
      $$0.a("inGround", this.f());
      $$0.a("pickup", (byte)this.b.ordinal());
      $$0.a("damage", this.o);
      $$0.a("crit", this.t());
      $$0.a("PierceLevel", this.u());
      $$0.a("SoundEvent", mb.b.b(this.p).toString());
      $$0.a("item", this.s.a(this.dW()));
      if (this.t != null) {
         $$0.a("weapon", this.t.b(this.dW(), new tq()));
      }
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.n = $$0.g("life");
      if ($$0.b("inBlockState", 10)) {
         this.m = uf.a(this.dU().a(mc.f), $$0.p("inBlockState"));
      }

      this.c = $$0.f("shake") & 255;
      this.a($$0.q("inGround"));
      if ($$0.b("damage", 99)) {
         this.o = $$0.k("damage");
      }

      this.b = cpy.a.a($$0.f("pickup"));
      this.b($$0.q("crit"));
      this.a($$0.f("PierceLevel"));
      if ($$0.b("SoundEvent", 8)) {
         this.p = mb.b.b(aku.a($$0.l("SoundEvent"))).orElse(this.j());
      }

      if ($$0.b("item", 10)) {
         this.a(cxh.a(this.dW(), (un)$$0.p("item")).orElse(this.o()));
      } else {
         this.a(this.o());
      }

      if ($$0.b("weapon", 10)) {
         this.t = cxh.a(this.dW(), (un)$$0.p("weapon")).orElse(null);
      } else {
         this.t = null;
      }
   }

   @Override
   public void c(@Nullable bva $$0) {
      super.c($$0);

      this.b = switch ($$0) {
         case null, default -> this.b;
         case cpr $$1 when this.b == cpy.a.a -> cpy.a.b;
         case bwe $$2 -> cpy.a.a;
      };
   }

   @Override
   public void a_(cpr $$0) {
      if (!this.dU().C && (this.f() || this.w()) && this.c <= 0) {
         if (this.a($$0)) {
            $$0.a(this, 1);
            this.at();
         }
      }
   }

   protected boolean a(cpr $$0) {
      return switch (this.b) {
         case a -> false;
         case b -> $$0.gl().f(this.n());
         case c -> $$0.fX();
      };
   }

   protected cxh n() {
      return this.s.v();
   }

   protected abstract cxh o();

   @Override
   protected bva.c bg() {
      return bva.c.a;
   }

   public cxh s() {
      return this.s;
   }

   public void h(double $$0) {
      this.o = $$0;
   }

   @Override
   public boolean cA() {
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

   protected void a(cxh $$0) {
      if (!$$0.f()) {
         this.s = $$0;
      } else {
         this.s = this.o();
      }
   }

   public boolean t() {
      byte $$0 = this.al.a(h);
      return ($$0 & 1) != 0;
   }

   public byte u() {
      return this.al.a(i);
   }

   public void a(float $$0) {
      this.h((double)($$0 * 2.0F) + this.ae.a((double)this.dU().an().a() * 0.11, 0.57425));
   }

   protected float v() {
      return 0.6F;
   }

   public void q(boolean $$0) {
      this.ad = $$0;
      this.a(2, $$0);
   }

   public boolean w() {
      return !this.dU().C ? this.ad : (this.al.a(h) & 2) != 0;
   }

   @Override
   public boolean bF() {
      return super.bF() && !this.f();
   }

   @Override
   public bwq a_(int $$0) {
      return $$0 == 0 ? bwq.a(this::s, this::a) : super.a_($$0);
   }

   @Override
   protected boolean x() {
      return true;
   }

   public static enum a {
      a,
      b,
      c;

      public static cpy.a a(int $$0) {
         if ($$0 < 0 || $$0 > values().length) {
            $$0 = 0;
         }

         return values()[$$0];
      }
   }
}
