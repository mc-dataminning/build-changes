import java.util.List;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class ckg extends ckl implements cki {
   private static final aiy<crj> b = ajc.a(ckg.class, aja.h);
   private static final aiy<OptionalInt> c = ajc.a(ckg.class, aja.u);
   private static final aiy<Boolean> d = ajc.a(ckg.class, aja.k);
   private int e;
   private int g;
   @Nullable
   private bqo h;

   public ckg(bqb<? extends ckg> $$0, cyx $$1) {
      super($$0, $$1);
   }

   public ckg(cyx $$0, double $$1, double $$2, double $$3, crj $$4) {
      super(bqb.P, $$0);
      this.e = 0;
      this.a_($$1, $$2, $$3);
      this.an.a(b, $$4.r());
      int $$5 = 1;
      cty $$6 = $$4.a(jp.K);
      if ($$6 != null) {
         $$5 += $$6.a();
      }

      this.o(this.ag.a(0.0, 0.002297), 0.05, this.ag.a(0.0, 0.002297));
      this.g = 10 * $$5 + this.ag.a(6) + this.ag.a(7);
   }

   public ckg(cyx $$0, @Nullable bpv $$1, double $$2, double $$3, double $$4, crj $$5) {
      this($$0, $$2, $$3, $$4, $$5);
      this.c($$1);
   }

   public ckg(cyx $$0, crj $$1, bqo $$2) {
      this($$0, $$2, $$2.dr(), $$2.dt(), $$2.dx(), $$1);
      this.an.a(c, OptionalInt.of($$2.aj()));
      this.h = $$2;
   }

   public ckg(cyx $$0, crj $$1, double $$2, double $$3, double $$4, boolean $$5) {
      this($$0, $$2, $$3, $$4, $$1);
      this.an.a(d, $$5);
   }

   public ckg(cyx $$0, crj $$1, bpv $$2, double $$3, double $$4, double $$5, boolean $$6) {
      this($$0, $$1, $$3, $$4, $$5, $$6);
      this.c($$2);
   }

   @Override
   protected void a(ajc.a $$0) {
      $$0.a(b, A());
      $$0.a(c, OptionalInt.empty());
      $$0.a(d, false);
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < 4096.0 && !this.y();
   }

   @Override
   public boolean k(double $$0, double $$1, double $$2) {
      return super.k($$0, $$1, $$2) && !this.y();
   }

   @Override
   public void l() {
      super.l();
      if (this.y()) {
         if (this.h == null) {
            this.an.a(c).ifPresent($$0x -> {
               bpv $$1x = this.dM().a($$0x);
               if ($$1x instanceof bqo) {
                  this.h = (bqo)$$1x;
               }
            });
         }

         if (this.h != null) {
            esa $$4;
            if (this.h.fB()) {
               esa $$0 = this.h.bI();
               double $$1 = 1.5;
               double $$2 = 0.1;
               esa $$3 = this.h.dp();
               this.h.g($$3.b($$0.c * 0.1 + ($$0.c * 1.5 - $$3.c) * 0.5, $$0.d * 0.1 + ($$0.d * 1.5 - $$3.d) * 0.5, $$0.e * 0.1 + ($$0.e * 1.5 - $$3.e) * 0.5));
               $$4 = this.h.a(crm.us);
            } else {
               $$4 = esa.b;
            }

            this.a_(this.h.dr() + $$4.c, this.h.dt() + $$4.d, this.h.dx() + $$4.e);
            this.g(this.h.dp());
         }
      } else {
         if (!this.r()) {
            double $$6 = this.P ? 1.0 : 1.15;
            this.g(this.dp().d($$6, 1.0, $$6).b(0.0, 0.04, 0.0));
         }

         esa $$7 = this.dp();
         this.a(bqt.a, $$7);
         this.g($$7);
      }

      ery $$8 = ckn.a(this, this::b);
      if (!this.af) {
         this.a($$8);
         this.au = true;
      }

      this.J();
      if (this.e == 0 && !this.aU()) {
         this.dM().a(null, this.dr(), this.dt(), this.dx(), aum.iK, aun.i, 3.0F, 1.0F);
      }

      this.e++;
      if (this.dM().B && this.e % 2 < 2) {
         this.dM().a(kl.D, this.dr(), this.dt(), this.dx(), this.ag.k() * 0.05, -this.dp().d * 0.5, this.ag.k() * 0.05);
      }

      if (!this.dM().B && this.e > this.g) {
         this.v();
      }
   }

   private void v() {
      this.dM().a(this, (byte)17);
      this.a(dts.w, this.u());
      this.x();
      this.am();
   }

   @Override
   protected void a(erx $$0) {
      super.a($$0);
      if (!this.dM().B) {
         this.v();
      }
   }

   @Override
   protected void a(erw $$0) {
      ib $$1 = new ib($$0.a());
      this.dM().a_($$1).a(this.dM(), $$1, this);
      if (!this.dM().x_() && this.w()) {
         this.v();
      }

      super.a($$0);
   }

   private boolean w() {
      return !this.z().isEmpty();
   }

   private void x() {
      float $$0 = 0.0F;
      List<ctx> $$1 = this.z();
      if (!$$1.isEmpty()) {
         $$0 = 5.0F + (float)($$1.size() * 2);
      }

      if ($$0 > 0.0F) {
         if (this.h != null) {
            this.h.a(this.dN().a(this, this.u()), 5.0F + (float)($$1.size() * 2));
         }

         double $$2 = 5.0;
         esa $$3 = this.dk();

         for (bqo $$5 : this.dM().a(bqo.class, this.cH().g(5.0))) {
            if ($$5 != this.h && !(this.g($$5) > 25.0)) {
               boolean $$6 = false;

               for (int $$7 = 0; $$7 < 2; $$7++) {
                  esa $$8 = new esa($$5.dr(), $$5.e(0.5 * (double)$$7), $$5.dx());
                  ery $$9 = this.dM().a(new cyg($$3, $$8, cyg.a.a, cyg.b.a, this));
                  if ($$9.c() == ery.a.a) {
                     $$6 = true;
                     break;
                  }
               }

               if ($$6) {
                  float $$10 = $$0 * (float)Math.sqrt((5.0 - (double)this.f($$5)) / 5.0);
                  $$5.a(this.dN().a(this, this.u()), $$10);
               }
            }
         }
      }
   }

   private boolean y() {
      return this.an.a(c).isPresent();
   }

   @Override
   public boolean r() {
      return this.an.a(d);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 17 && this.dM().B) {
         esa $$1 = this.dp();
         this.dM().a(this.dr(), this.dt(), this.dx(), $$1.c, $$1.d, $$1.e, this.z());
      }

      super.b($$0);
   }

   @Override
   public void b(tm $$0) {
      super.b($$0);
      $$0.a("Life", this.e);
      $$0.a("LifeTime", this.g);
      $$0.a("FireworksItem", this.p().a(this.dO()));
      $$0.a("ShotAtAngle", this.an.a(d));
   }

   @Override
   public void a(tm $$0) {
      super.a($$0);
      this.e = $$0.h("Life");
      this.g = $$0.h("LifeTime");
      if ($$0.b("FireworksItem", 10)) {
         this.an.a(b, crj.a(this.dO(), (uj)$$0.p("FireworksItem")).orElseGet(ckg::A));
      } else {
         this.an.a(b, A());
      }

      if ($$0.e("ShotAtAngle")) {
         this.an.a(d, $$0.q("ShotAtAngle"));
      }
   }

   private List<ctx> z() {
      crj $$0 = this.an.a(b);
      cty $$1 = $$0.a(jp.K);
      return $$1 != null ? $$1.b() : List.of();
   }

   @Override
   public crj p() {
      return this.an.a(b);
   }

   @Override
   public boolean cq() {
      return false;
   }

   private static crj A() {
      return new crj(crm.us);
   }
}
