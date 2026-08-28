import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public abstract class cqp extends crb {
   private static final double d = 2.0;
   private static final int e = 7;
   private static final float f = 0.6F;
   private static final float g = 0.99F;
   private static final akg<Byte> h = akk.a(cqp.class, aki.a);
   private static final akg<Byte> i = akk.a(cqp.class, aki.a);
   private static final akg<Boolean> j = akk.a(cqp.class, aki.k);
   private static final int k = 1;
   private static final int l = 2;
   @Nullable
   private dym m;
   protected int a;
   public cqp.a b = cqp.a.a;
   public int c;
   private int n;
   private double o = 2.0;
   private awj p = this.j();
   @Nullable
   private IntOpenHashSet q;
   @Nullable
   private List<bvs> r;
   private cxy s = this.o();
   @Nullable
   private cxy t = null;

   protected cqp(bwb<? extends cqp> $$0, dhp $$1) {
      super($$0, $$1);
   }

   protected cqp(bwb<? extends cqp> $$0, double $$1, double $$2, double $$3, dhp $$4, cxy $$5, @Nullable cxy $$6) {
      this($$0, $$4);
      this.s = $$5.v();
      this.c($$5);
      baq $$7 = $$5.e(kx.v);
      if ($$7 != null) {
         this.b = cqp.a.c;
      }

      this.a_($$1, $$2, $$3);
      if ($$6 != null && $$4 instanceof arn $$8) {
         if ($$6.f()) {
            throw new IllegalArgumentException("Invalid weapon firing an arrow");
         }

         this.t = $$6.v();
         int $$9 = dej.a($$8, $$6, this.s);
         if ($$9 > 0) {
            this.a((byte)$$9);
         }
      }
   }

   protected cqp(bwb<? extends cqp> $$0, bwr $$1, dhp $$2, cxy $$3, @Nullable cxy $$4) {
      this($$0, $$1.dA(), $$1.dE() - 0.1F, $$1.dG(), $$2, $$3, $$4);
      this.c($$1);
   }

   public void b(awj $$0) {
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
   protected void a(akk.a $$0) {
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
      if (this.f() && azk.f($$0, $$1, $$2) > 0.0) {
         this.a(false);
      }
   }

   @Override
   public void a(akg<?> $$0) {
      super.a($$0);
      if (!this.ak && this.c <= 0 && $$0.equals(j) && this.f()) {
         this.c = 7;
      }
   }

   @Override
   public void h() {
      boolean $$0 = !this.w();
      fcu $$1 = this.dy();
      jj $$2 = this.dv();
      dym $$3 = this.dV().a_($$2);
      if (!$$3.l() && $$0) {
         fdo $$4 = $$3.g(this.dV(), $$2);
         if (!$$4.c()) {
            fcu $$5 = this.dt();

            for (fcp $$6 : $$4.e()) {
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

      if (this.bl() || $$3.a(dkw.rt)) {
         this.aH();
      }

      if (this.f() && $$0) {
         if (!this.dV().w_()) {
            if (this.m != $$3 && this.y()) {
               this.B();
            } else {
               this.g();
            }
         }

         this.a++;
         if (this.bK()) {
            this.aK();
         }

         if (!this.dV().C) {
            this.c(this.aG() > 0);
         }
      } else {
         this.a = 0;
         fcu $$7 = this.dt();
         if (this.bj()) {
            this.b(this.v());
            this.a($$7);
         }

         if (this.t()) {
            for (int $$8 = 0; $$8 < 4; $$8++) {
               this.dV()
                  .a(
                     lv.f,
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
            $$9 = (float)(azk.d(-$$1.d, -$$1.f) * 180.0F / (float)Math.PI);
         } else {
            $$9 = (float)(azk.d($$1.d, $$1.f) * 180.0F / (float)Math.PI);
         }

         float $$11 = (float)(azk.d($$1.e, $$1.i()) * 180.0F / (float)Math.PI);
         this.x(f(this.dN(), $$11));
         this.w(f(this.dL(), $$9));
         if ($$0) {
            fcq $$12 = this.dV().b(new dgy($$7, $$7.e($$1), dgy.a.a, dgy.b.a, this));
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

   private void b(fcq $$0) {
      while (this.bK()) {
         fcu $$1 = this.dt();
         fcr $$2 = this.c($$1, $$0.g());
         fcu $$3 = Objects.requireNonNullElse($$2, $$0).g();
         this.b($$3);
         this.a($$1, $$3);
         if (this.as != null && this.as.e()) {
            this.bW();
         }

         if ($$2 == null) {
            if (this.bK() && $$0.d() != fcs.a.a) {
               this.b((fcs)$$0);
               this.ar = true;
            }
            break;
         } else if (this.bK() && !this.ad) {
            crc $$4 = this.b($$2);
            this.ar = true;
            if (this.u() > 0 && $$4 == crc.a) {
               continue;
            }
            break;
         }
      }
   }

   private void b(float $$0) {
      fcu $$1 = this.dy();
      this.i($$1.c((double)$$0));
   }

   private void a(fcu $$0) {
      fcu $$1 = this.dy();

      for (int $$2 = 0; $$2 < 4; $$2++) {
         float $$3 = 0.25F;
         this.dV().a(lv.d, $$0.d - $$1.d * 0.25, $$0.e - $$1.e * 0.25, $$0.f - $$1.f * 0.25, $$1.d, $$1.e, $$1.f);
      }
   }

   @Override
   protected double bd() {
      return 0.05;
   }

   private boolean y() {
      return this.f() && this.dV().b(new fcp(this.dt(), this.dt()).g(0.06));
   }

   private void B() {
      this.a(false);
      fcu $$0 = this.dy();
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
   public void a(bwv $$0, fcu $$1) {
      super.a($$0, $$1);
      if ($$0 != bwv.a && this.y()) {
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
   protected void b(cxu $$0) {
      this.t = null;
   }

   @Override
   public void a(boolean $$0, jj $$1) {
      if (!this.f()) {
         double $$2 = $$0 ? -0.03 : 0.1;
         this.i(this.dy().b(0.0, $$2, 0.0));
         this.f($$1);
      }
   }

   @Override
   public void l(boolean $$0) {
      if (!this.f()) {
         double $$1 = $$0 ? -0.03 : 0.06;
         this.i(this.dy().b(0.0, $$1, 0.0));
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
   protected void a(fcr $$0) {
      super.a($$0);
      bvs $$1 = $$0.a();
      float $$2 = (float)this.dy().g();
      double $$3 = this.o;
      bvs $$4 = this.q();
      buh $$5 = this.dW().a(this, (bvs)($$4 != null ? $$4 : this));
      if (this.dZ() != null && this.dV() instanceof arn $$6) {
         $$3 = (double)dej.a($$6, this.dZ(), $$1, $$5, (float)$$3);
      }

      int $$7 = azk.c(azk.a((double)$$2 * $$3, 0.0, 2.147483647E9));
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

      if ($$4 instanceof bwr $$9) {
         $$9.B($$1);
      }

      boolean $$10 = $$1.aq() == bwb.N;
      int $$11 = $$1.aG();
      if (this.bY() && !$$10) {
         $$1.e(5.0F);
      }

      if ($$1.b($$5, (float)$$7)) {
         if ($$10) {
            return;
         }

         if ($$1 instanceof bwr $$12) {
            if (!this.dV().C && this.u() <= 0) {
               $$12.o($$12.eV() + 1);
            }

            this.a($$12, $$5);
            if (this.dV() instanceof arn $$13) {
               dej.a($$13, $$12, $$5, this.dZ());
            }

            this.a($$12);
            if ($$12 instanceof cqi && $$4 instanceof aro $$14 && !this.bb()) {
               $$14.f.b(new acy(acy.h, 0.0F));
            }

            if (!$$1.bK() && this.r != null) {
               this.r.add($$12);
            }

            if (!this.dV().C && $$4 instanceof aro $$15) {
               if (this.r != null) {
                  ap.H.a($$15, this.r, this.t);
               } else if (!$$1.bK()) {
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
         this.a(crc.b, $$1, this.q(), false);
         this.i(this.dy().c(0.2));
         if (this.dV() instanceof arn $$16 && this.dy().h() < 1.0E-7) {
            if (this.b == cqp.a.b) {
               this.a($$16, this.n(), 0.1F);
            }

            this.at();
         }
      }
   }

   protected void a(bwr $$0, buh $$1) {
      double $$3 = (double)(this.t != null && this.dV() instanceof arn $$2 ? dej.d($$2, this.t, $$0, $$1, 0.0F) : 0.0F);
      if ($$3 > 0.0) {
         double $$4 = Math.max(0.0, 1.0 - $$0.h(bxx.p));
         fcu $$5 = this.dy().d(1.0, 0.0, 1.0).d().c($$3 * 0.6 * $$4);
         if ($$5.h() > 0.0) {
            $$0.j($$5.d, 0.1, $$5.f);
         }
      }
   }

   @Override
   protected void a(fcq $$0) {
      this.m = this.dV().a_($$0.b());
      super.a($$0);
      cxy $$1 = this.dZ();
      if (this.dV() instanceof arn $$2 && $$1 != null) {
         this.a($$2, $$0, $$1);
      }

      fcu $$3 = this.dy();
      fcu $$4 = new fcu(Math.signum($$3.d), Math.signum($$3.e), Math.signum($$3.f));
      fcu $$5 = $$4.c(0.05F);
      this.b(this.dt().d($$5));
      this.i(fcu.c);
      this.a(this.m(), 1.0F, 1.2F / (this.ae.i() * 0.2F + 0.9F));
      this.a(true);
      this.c = 7;
      this.b(false);
      this.a((byte)0);
      this.b(awk.aE);
      this.C();
   }

   protected void a(arn $$0, fcq $$1, cxy $$2) {
      fcu $$3 = $$1.b().a($$1.g());
      dej.a($$0, $$2, this.q() instanceof bwr $$4 ? $$4 : null, this, null, $$3, $$0.a_($$1.b()), $$0x -> this.t = null);
   }

   @Override
   public cxy dZ() {
      return this.t;
   }

   protected awj j() {
      return awk.aE;
   }

   protected final awj m() {
      return this.p;
   }

   protected void a(bwr $$0) {
   }

   @Nullable
   protected fcr c(fcu $$0, fcu $$1) {
      return crd.a(this.dV(), this, $$0, $$1, this.cR().b(this.dy()).g(1.0), this::b);
   }

   @Override
   protected boolean b(bvs $$0) {
      return $$0 instanceof cqi && this.q() instanceof cqi $$1 && !$$1.a((cqi)$$0) ? false : super.b($$0) && (this.q == null || !this.q.contains($$0.ar()));
   }

   @Override
   public void b(tw $$0) {
      super.b($$0);
      $$0.a("life", (short)this.n);
      if (this.m != null) {
         $$0.a("inBlockState", ul.a(this.m));
      }

      $$0.a("shake", (byte)this.c);
      $$0.a("inGround", this.f());
      $$0.a("pickup", (byte)this.b.ordinal());
      $$0.a("damage", this.o);
      $$0.a("crit", this.t());
      $$0.a("PierceLevel", this.u());
      $$0.a("SoundEvent", md.b.b(this.p).toString());
      $$0.a("item", this.s.a(this.dX()));
      if (this.t != null) {
         $$0.a("weapon", this.t.b(this.dX(), new tw()));
      }
   }

   @Override
   public void a(tw $$0) {
      super.a($$0);
      this.n = $$0.g("life");
      if ($$0.b("inBlockState", 10)) {
         this.m = ul.a(this.dV().a(me.f), $$0.p("inBlockState"));
      }

      this.c = $$0.f("shake") & 255;
      this.a($$0.q("inGround"));
      if ($$0.b("damage", 99)) {
         this.o = $$0.k("damage");
      }

      this.b = cqp.a.a($$0.f("pickup"));
      this.b($$0.q("crit"));
      this.a($$0.f("PierceLevel"));
      if ($$0.b("SoundEvent", 8)) {
         this.p = md.b.b(ald.a($$0.l("SoundEvent"))).orElse(this.j());
      }

      if ($$0.b("item", 10)) {
         this.a(cxy.a(this.dX(), (ut)$$0.p("item")).orElse(this.o()));
      } else {
         this.a(this.o());
      }

      if ($$0.b("weapon", 10)) {
         this.t = cxy.a(this.dX(), (ut)$$0.p("weapon")).orElse(null);
      } else {
         this.t = null;
      }
   }

   @Override
   public void c(@Nullable bvs $$0) {
      super.c($$0);

      this.b = switch ($$0) {
         case null, default -> this.b;
         case cqi $$1 when this.b == cqp.a.a -> cqp.a.b;
         case bwx $$2 -> cqp.a.a;
      };
   }

   @Override
   public void a_(cqi $$0) {
      if (!this.dV().C && (this.f() || this.w()) && this.c <= 0) {
         if (this.a($$0)) {
            $$0.a(this, 1);
            this.at();
         }
      }
   }

   protected boolean a(cqi $$0) {
      return switch (this.b) {
         case a -> false;
         case b -> $$0.gi().f(this.n());
         case c -> $$0.fU();
      };
   }

   protected cxy n() {
      return this.s.v();
   }

   protected abstract cxy o();

   @Override
   protected bvs.d bg() {
      return bvs.d.a;
   }

   public cxy s() {
      return this.s;
   }

   public void h(double $$0) {
      this.o = $$0;
   }

   @Override
   public boolean cB() {
      return this.aq().a(axd.H);
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

   protected void a(cxy $$0) {
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
      this.h((double)($$0 * 2.0F) + this.ae.a((double)this.dV().an().a() * 0.11, 0.57425));
   }

   protected float v() {
      return 0.6F;
   }

   public void q(boolean $$0) {
      this.ad = $$0;
      this.a(2, $$0);
   }

   public boolean w() {
      return !this.dV().C ? this.ad : (this.al.a(h) & 2) != 0;
   }

   @Override
   public boolean bG() {
      return super.bG() && !this.f();
   }

   @Override
   public bxi a_(int $$0) {
      return $$0 == 0 ? bxi.a(this::s, this::a) : super.a_($$0);
   }

   @Override
   protected boolean x() {
      return true;
   }

   public static enum a {
      a,
      b,
      c;

      public static cqp.a a(int $$0) {
         if ($$0 < 0 || $$0 > values().length) {
            $$0 = 0;
         }

         return values()[$$0];
      }
   }
}
