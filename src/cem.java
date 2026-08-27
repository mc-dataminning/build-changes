import java.util.OptionalInt;
import javax.annotation.Nullable;

public class cem extends cer implements ceo {
   private static final afs<clo> b = afv.a(cem.class, afu.h);
   private static final afs<OptionalInt> c = afv.a(cem.class, afu.u);
   private static final afs<Boolean> d = afv.a(cem.class, afu.k);
   private int e;
   private int f;
   @Nullable
   private bll g;

   public cem(bkz<? extends cem> $$0, csf $$1) {
      super($$0, $$1);
   }

   public cem(csf $$0, double $$1, double $$2, double $$3, clo $$4) {
      super(bkz.M, $$0);
      this.e = 0;
      this.a_($$1, $$2, $$3);
      int $$5 = 1;
      if (!$$4.b() && $$4.u()) {
         this.an.b(b, $$4.p());
         $$5 += $$4.a("Fireworks").f("Flight");
      }

      this.o(this.ag.a(0.0, 0.002297), 0.05, this.ag.a(0.0, 0.002297));
      this.f = 10 * $$5 + this.ag.a(6) + this.ag.a(7);
   }

   public cem(csf $$0, @Nullable bkv $$1, double $$2, double $$3, double $$4, clo $$5) {
      this($$0, $$2, $$3, $$4, $$5);
      this.b($$1);
   }

   public cem(csf $$0, clo $$1, bll $$2) {
      this($$0, $$2, $$2.ds(), $$2.du(), $$2.dy(), $$1);
      this.an.b(c, OptionalInt.of($$2.aj()));
      this.g = $$2;
   }

   public cem(csf $$0, clo $$1, double $$2, double $$3, double $$4, boolean $$5) {
      this($$0, $$2, $$3, $$4, $$1);
      this.an.b(d, $$5);
   }

   public cem(csf $$0, clo $$1, bkv $$2, double $$3, double $$4, double $$5, boolean $$6) {
      this($$0, $$1, $$3, $$4, $$5, $$6);
      this.b($$2);
   }

   @Override
   protected void c_() {
      this.an.a(b, clo.b);
      this.an.a(c, OptionalInt.empty());
      this.an.a(d, false);
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < 4096.0 && !this.z();
   }

   @Override
   public boolean k(double $$0, double $$1, double $$2) {
      return super.k($$0, $$1, $$2) && !this.z();
   }

   @Override
   public void l() {
      super.l();
      if (this.z()) {
         if (this.g == null) {
            this.an.b(c).ifPresent($$0x -> {
               bkv $$1x = this.dN().a($$0x);
               if ($$1x instanceof bll) {
                  this.g = (bll)$$1x;
               }
            });
         }

         if (this.g != null) {
            ejz $$4;
            if (this.g.fx()) {
               ejz $$0 = this.g.bF();
               double $$1 = 1.5;
               double $$2 = 0.1;
               ejz $$3 = this.g.dq();
               this.g.g($$3.b($$0.c * 0.1 + ($$0.c * 1.5 - $$3.c) * 0.5, $$0.d * 0.1 + ($$0.d * 1.5 - $$3.d) * 0.5, $$0.e * 0.1 + ($$0.e * 1.5 - $$3.e) * 0.5));
               $$4 = this.g.a(clr.um);
            } else {
               $$4 = ejz.b;
            }

            this.a_(this.g.ds() + $$4.c, this.g.du() + $$4.d, this.g.dy() + $$4.e);
            this.g(this.g.dq());
         }
      } else {
         if (!this.s()) {
            double $$6 = this.P ? 1.0 : 1.15;
            this.g(this.dq().d($$6, 1.0, $$6).b(0.0, 0.04, 0.0));
         }

         ejz $$7 = this.dq();
         this.a(blr.a, $$7);
         this.g($$7);
      }

      ejx $$8 = ces.a(this, this::a);
      if (!this.af) {
         this.a($$8);
         this.au = true;
      }

      this.J();
      if (this.e == 0 && !this.aU()) {
         this.dN().a(null, this.ds(), this.du(), this.dy(), aqv.ic, aqw.i, 3.0F, 1.0F);
      }

      this.e++;
      if (this.dN().B && this.e % 2 < 2) {
         this.dN().a(jw.A, this.ds(), this.du(), this.dy(), this.ag.k() * 0.05, -this.dq().d * 0.5, this.ag.k() * 0.05);
      }

      if (!this.dN().B && this.e > this.f) {
         this.u();
      }
   }

   private void u() {
      this.dN().a(this, (byte)17);
      this.a(dlx.w, this.w());
      this.y();
      this.am();
   }

   @Override
   protected void a(ejw $$0) {
      super.a($$0);
      if (!this.dN().B) {
         this.u();
      }
   }

   @Override
   protected void a(ejv $$0) {
      hx $$1 = new hx($$0.a());
      this.dN().a_($$1).a(this.dN(), $$1, this);
      if (!this.dN().y_() && this.x()) {
         this.u();
      }

      super.a($$0);
   }

   private boolean x() {
      clo $$0 = this.an.b(b);
      sd $$1 = $$0.b() ? null : $$0.b("Fireworks");
      sj $$2 = $$1 != null ? $$1.c("Explosions", 10) : null;
      return $$2 != null && !$$2.isEmpty();
   }

   private void y() {
      float $$0 = 0.0F;
      clo $$1 = this.an.b(b);
      sd $$2 = $$1.b() ? null : $$1.b("Fireworks");
      sj $$3 = $$2 != null ? $$2.c("Explosions", 10) : null;
      if ($$3 != null && !$$3.isEmpty()) {
         $$0 = 5.0F + (float)($$3.size() * 2);
      }

      if ($$0 > 0.0F) {
         if (this.g != null) {
            this.g.a(this.dO().a(this, this.w()), 5.0F + (float)($$3.size() * 2));
         }

         double $$4 = 5.0;
         ejz $$5 = this.dl();

         for (bll $$7 : this.dN().a(bll.class, this.cH().g(5.0))) {
            if ($$7 != this.g && !(this.f($$7) > 25.0)) {
               boolean $$8 = false;

               for (int $$9 = 0; $$9 < 2; $$9++) {
                  ejz $$10 = new ejz($$7.ds(), $$7.e(0.5 * (double)$$9), $$7.dy());
                  ejx $$11 = this.dN().a(new cro($$5, $$10, cro.a.a, cro.b.a, this));
                  if ($$11.c() == ejx.a.a) {
                     $$8 = true;
                     break;
                  }
               }

               if ($$8) {
                  float $$12 = $$0 * (float)Math.sqrt((5.0 - (double)this.e($$7)) / 5.0);
                  $$7.a(this.dO().a(this, this.w()), $$12);
               }
            }
         }
      }
   }

   private boolean z() {
      return this.an.b(c).isPresent();
   }

   @Override
   public boolean s() {
      return this.an.b(d);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 17 && this.dN().B) {
         if (!this.x()) {
            for (int $$1 = 0; $$1 < this.ag.a(3) + 2; $$1++) {
               this.dN().a(jw.W, this.ds(), this.du(), this.dy(), this.ag.k() * 0.05, 0.005, this.ag.k() * 0.05);
            }
         } else {
            clo $$2 = this.an.b(b);
            sd $$3 = $$2.b() ? null : $$2.b("Fireworks");
            ejz $$4 = this.dq();
            this.dN().a(this.ds(), this.du(), this.dy(), $$4.c, $$4.d, $$4.e, $$3);
         }
      }

      super.b($$0);
   }

   @Override
   public void b(sd $$0) {
      super.b($$0);
      $$0.a("Life", this.e);
      $$0.a("LifeTime", this.f);
      clo $$1 = this.an.b(b);
      if (!$$1.b()) {
         $$0.a("FireworksItem", $$1.b(new sd()));
      }

      $$0.a("ShotAtAngle", this.an.b(d));
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      this.e = $$0.h("Life");
      this.f = $$0.h("LifeTime");
      clo $$1 = clo.a($$0.p("FireworksItem"));
      if (!$$1.b()) {
         this.an.b(b, $$1);
      }

      if ($$0.e("ShotAtAngle")) {
         this.an.b(d, $$0.q("ShotAtAngle"));
      }
   }

   @Override
   public clo q() {
      clo $$0 = this.an.b(b);
      return $$0.b() ? new clo(clr.um) : $$0;
   }

   @Override
   public boolean cq() {
      return false;
   }
}
