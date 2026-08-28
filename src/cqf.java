import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import java.util.List;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class cqf extends cqk implements cqh {
   private static final ajx<cxh> a = akb.a(cqf.class, ajz.h);
   private static final ajx<OptionalInt> b = akb.a(cqf.class, ajz.v);
   private static final ajx<Boolean> c = akb.a(cqf.class, ajz.k);
   private int d;
   private int e;
   @Nullable
   private bvy f;

   public cqf(bvi<? extends cqf> $$0, dgz $$1) {
      super($$0, $$1);
   }

   public cqf(dgz $$0, double $$1, double $$2, double $$3, cxh $$4) {
      super(bvi.Z, $$0);
      this.d = 0;
      this.a_($$1, $$2, $$3);
      this.al.a(a, $$4.v());
      int $$5 = 1;
      czv $$6 = $$4.a(kv.ah);
      if ($$6 != null) {
         $$5 += $$6.a();
      }

      this.n(this.ae.a(0.0, 0.002297), 0.05, this.ae.a(0.0, 0.002297));
      this.e = 10 * $$5 + this.ae.a(6) + this.ae.a(7);
   }

   public cqf(dgz $$0, @Nullable bva $$1, double $$2, double $$3, double $$4, cxh $$5) {
      this($$0, $$2, $$3, $$4, $$5);
      this.c($$1);
   }

   public cqf(dgz $$0, cxh $$1, bvy $$2) {
      this($$0, $$2, $$2.dz(), $$2.dB(), $$2.dF(), $$1);
      this.al.a(b, OptionalInt.of($$2.ar()));
      this.f = $$2;
   }

   public cqf(dgz $$0, cxh $$1, double $$2, double $$3, double $$4, boolean $$5) {
      this($$0, $$2, $$3, $$4, $$1);
      this.al.a(c, $$5);
   }

   public cqf(dgz $$0, cxh $$1, bva $$2, double $$3, double $$4, double $$5, boolean $$6) {
      this($$0, $$1, $$3, $$4, $$5, $$6);
      this.c($$2);
   }

   @Override
   protected void a(akb.a $$0) {
      $$0.a(a, o());
      $$0.a(b, OptionalInt.empty());
      $$0.a(c, false);
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < 4096.0 && !this.m();
   }

   @Override
   public boolean k(double $$0, double $$1, double $$2) {
      return super.k($$0, $$1, $$2) && !this.m();
   }

   @Override
   public void h() {
      super.h();
      fbv $$6;
      if (this.m()) {
         if (this.f == null) {
            this.al.a(b).ifPresent($$0x -> {
               bva $$1x = this.dU().a($$0x);
               if ($$1x instanceof bvy) {
                  this.f = (bvy)$$1x;
               }
            });
         }

         if (this.f != null) {
            fbx $$4;
            if (this.f.fL()) {
               fbx $$0 = this.f.bS();
               double $$1 = 1.5;
               double $$2 = 0.1;
               fbx $$3 = this.f.dx();
               this.f.i($$3.b($$0.d * 0.1 + ($$0.d * 1.5 - $$3.d) * 0.5, $$0.e * 0.1 + ($$0.e * 1.5 - $$3.e) * 0.5, $$0.f * 0.1 + ($$0.f * 1.5 - $$3.f) * 0.5));
               $$4 = this.f.a(cxl.vv);
            } else {
               $$4 = fbx.c;
            }

            this.a_(this.f.dz() + $$4.d, this.f.dB() + $$4.e, this.f.dF() + $$4.f);
            this.i(this.f.dx());
         }

         $$6 = cqm.a(this, this::b);
      } else {
         if (!this.g()) {
            double $$7 = this.P ? 1.0 : 1.15;
            this.i(this.dx().d($$7, 1.0, $$7).b(0.0, 0.04, 0.0));
         }

         fbx $$8 = this.dx();
         $$6 = cqm.a(this, this::b);
         this.a(bwc.a, $$8);
         this.aK();
         this.i($$8);
      }

      if (!this.ad && this.bJ() && $$6.d() != fbv.a.a) {
         this.b($$6);
         this.ar = true;
      }

      this.A();
      if (this.d == 0 && !this.bb()) {
         this.dU().a(null, this.dz(), this.dB(), this.dF(), awa.jp, awb.i, 3.0F, 1.0F);
      }

      this.d++;
      if (this.dU().C && this.d % 2 < 2) {
         this.dU().a(lt.D, this.dz(), this.dB(), this.dF(), this.ae.k() * 0.05, -this.dx().e * 0.5, this.ae.k() * 0.05);
      }

      if (this.d > this.e && this.dU() instanceof ard $$10) {
         this.b($$10);
      }
   }

   private void b(ard $$0) {
      $$0.a(this, (byte)17);
      this.a(ecp.w, this.q());
      this.e($$0);
      this.at();
   }

   @Override
   protected void a(fbu $$0) {
      super.a($$0);
      if (this.dU() instanceof ard $$1) {
         this.b($$1);
      }
   }

   @Override
   protected void a(fbt $$0) {
      ji $$1 = new ji($$0.b());
      this.dU().a_($$1).a(this.dU(), $$1, this);
      if (this.dU() instanceof ard $$2 && this.j()) {
         this.b($$2);
      }

      super.a($$0);
   }

   private boolean j() {
      return !this.n().isEmpty();
   }

   private void e(ard $$0) {
      float $$1 = 0.0F;
      List<czu> $$2 = this.n();
      if (!$$2.isEmpty()) {
         $$1 = 5.0F + (float)($$2.size() * 2);
      }

      if ($$1 > 0.0F) {
         if (this.f != null) {
            this.f.a($$0, this.dV().a(this, this.q()), 5.0F + (float)($$2.size() * 2));
         }

         double $$3 = 5.0;
         fbx $$4 = this.ds();

         for (bvy $$6 : this.dU().a(bvy.class, this.cQ().g(5.0))) {
            if ($$6 != this.f && !(this.g($$6) > 25.0)) {
               boolean $$7 = false;

               for (int $$8 = 0; $$8 < 2; $$8++) {
                  fbx $$9 = new fbx($$6.dz(), $$6.e(0.5 * (double)$$8), $$6.dF());
                  fbv $$10 = this.dU().a(new dgi($$4, $$9, dgi.a.a, dgi.b.a, this));
                  if ($$10.d() == fbv.a.a) {
                     $$7 = true;
                     break;
                  }
               }

               if ($$7) {
                  float $$11 = $$1 * (float)Math.sqrt((5.0 - (double)this.f($$6)) / 5.0);
                  $$6.a($$0, this.dV().a(this, this.q()), $$11);
               }
            }
         }
      }
   }

   private boolean m() {
      return this.al.a(b).isPresent();
   }

   @Override
   public boolean g() {
      return this.al.a(c);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 17 && this.dU().C) {
         fbx $$1 = this.dx();
         this.dU().a(this.dz(), this.dB(), this.dF(), $$1.d, $$1.e, $$1.f, this.n());
      }

      super.b($$0);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("Life", this.d);
      $$0.a("LifeTime", this.e);
      $$0.a("FireworksItem", this.f().a(this.dW()));
      $$0.a("ShotAtAngle", this.al.a(c));
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.d = $$0.h("Life");
      this.e = $$0.h("LifeTime");
      if ($$0.b("FireworksItem", 10)) {
         this.al.a(a, cxh.a(this.dW(), (un)$$0.p("FireworksItem")).orElseGet(cqf::o));
      } else {
         this.al.a(a, o());
      }

      if ($$0.e("ShotAtAngle")) {
         this.al.a(c, $$0.q("ShotAtAngle"));
      }
   }

   private List<czu> n() {
      cxh $$0 = this.al.a(a);
      czv $$1 = $$0.a(kv.ah);
      return $$1 != null ? $$1.b() : List.of();
   }

   @Override
   public cxh f() {
      return this.al.a(a);
   }

   @Override
   public boolean cA() {
      return false;
   }

   private static cxh o() {
      return new cxh(cxl.vv);
   }

   @Override
   public DoubleDoubleImmutablePair a_(bvy $$0, btp $$1) {
      double $$2 = $$0.ds().d - this.ds().d;
      double $$3 = $$0.ds().f - this.ds().f;
      return DoubleDoubleImmutablePair.of($$2, $$3);
   }
}
