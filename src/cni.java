import java.util.List;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class cni extends cnn implements cnk {
   private static final akj<cun> b = akn.a(cni.class, akl.h);
   private static final akj<OptionalInt> c = akn.a(cni.class, akl.v);
   private static final akj<Boolean> d = akn.a(cni.class, akl.k);
   private int e;
   private int f;
   @Nullable
   private btn g;

   public cni(bsy<? extends cni> $$0, dbw $$1) {
      super($$0, $$1);
   }

   public cni(dbw $$0, double $$1, double $$2, double $$3, cun $$4) {
      super(bsy.P, $$0);
      this.e = 0;
      this.a_($$1, $$2, $$3);
      this.ao.a(b, $$4.s());
      int $$5 = 1;
      cxh $$6 = $$4.a(km.T);
      if ($$6 != null) {
         $$5 += $$6.a();
      }

      this.o(this.ah.a(0.0, 0.002297), 0.05, this.ah.a(0.0, 0.002297));
      this.f = 10 * $$5 + this.ah.a(6) + this.ah.a(7);
   }

   public cni(dbw $$0, @Nullable bss $$1, double $$2, double $$3, double $$4, cun $$5) {
      this($$0, $$2, $$3, $$4, $$5);
      this.c($$1);
   }

   public cni(dbw $$0, cun $$1, btn $$2) {
      this($$0, $$2, $$2.du(), $$2.dw(), $$2.dA(), $$1);
      this.ao.a(c, OptionalInt.of($$2.al()));
      this.g = $$2;
   }

   public cni(dbw $$0, cun $$1, double $$2, double $$3, double $$4, boolean $$5) {
      this($$0, $$2, $$3, $$4, $$1);
      this.ao.a(d, $$5);
   }

   public cni(dbw $$0, cun $$1, bss $$2, double $$3, double $$4, double $$5, boolean $$6) {
      this($$0, $$1, $$3, $$4, $$5, $$6);
      this.c($$2);
   }

   @Override
   protected void a(akn.a $$0) {
      $$0.a(b, B());
      $$0.a(c, OptionalInt.empty());
      $$0.a(d, false);
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
            this.ao.a(c).ifPresent($$0x -> {
               bss $$1x = this.dP().a($$0x);
               if ($$1x instanceof btn) {
                  this.g = (btn)$$1x;
               }
            });
         }

         if (this.g != null) {
            evp $$4;
            if (this.g.fE()) {
               evp $$0 = this.g.bL();
               double $$1 = 1.5;
               double $$2 = 0.1;
               evp $$3 = this.g.ds();
               this.g.h($$3.b($$0.c * 0.1 + ($$0.c * 1.5 - $$3.c) * 0.5, $$0.d * 0.1 + ($$0.d * 1.5 - $$3.d) * 0.5, $$0.e * 0.1 + ($$0.e * 1.5 - $$3.e) * 0.5));
               $$4 = this.g.a(cuq.uu);
            } else {
               $$4 = evp.b;
            }

            this.a_(this.g.du() + $$4.c, this.g.dw() + $$4.d, this.g.dA() + $$4.e);
            this.h(this.g.ds());
         }
      } else {
         if (!this.u()) {
            double $$6 = this.Q ? 1.0 : 1.15;
            this.h(this.ds().d($$6, 1.0, $$6).b(0.0, 0.04, 0.0));
         }

         evp $$7 = this.ds();
         this.a(bts.a, $$7);
         this.h($$7);
      }

      evn $$8 = cnp.a(this, this::b);
      if (!this.ag) {
         this.b($$8);
         this.av = true;
      }

      this.J();
      if (this.e == 0 && !this.aW()) {
         this.dP().a(null, this.du(), this.dw(), this.dA(), avz.iP, awa.i, 3.0F, 1.0F);
      }

      this.e++;
      if (this.dP().B && this.e % 2 < 2) {
         this.dP().a(li.D, this.du(), this.dw(), this.dA(), this.ah.k() * 0.05, -this.ds().d * 0.5, this.ah.k() * 0.05);
      }

      if (!this.dP().B && this.e > this.f) {
         this.v();
      }
   }

   private void v() {
      this.dP().a(this, (byte)17);
      this.a(dwt.w, this.s());
      this.x();
      this.ao();
   }

   @Override
   protected void a(evm $$0) {
      super.a($$0);
      if (!this.dP().B) {
         this.v();
      }
   }

   @Override
   protected void a(evl $$0) {
      iz $$1 = new iz($$0.a());
      this.dP().a_($$1).a(this.dP(), $$1, this);
      if (!this.dP().x_() && this.w()) {
         this.v();
      }

      super.a($$0);
   }

   private boolean w() {
      return !this.A().isEmpty();
   }

   private void x() {
      float $$0 = 0.0F;
      List<cxg> $$1 = this.A();
      if (!$$1.isEmpty()) {
         $$0 = 5.0F + (float)($$1.size() * 2);
      }

      if ($$0 > 0.0F) {
         if (this.g != null) {
            this.g.a(this.dQ().a(this, this.s()), 5.0F + (float)($$1.size() * 2));
         }

         double $$2 = 5.0;
         evp $$3 = this.dn();

         for (btn $$5 : this.dP().a(btn.class, this.cK().g(5.0))) {
            if ($$5 != this.g && !(this.g($$5) > 25.0)) {
               boolean $$6 = false;

               for (int $$7 = 0; $$7 < 2; $$7++) {
                  evp $$8 = new evp($$5.du(), $$5.e(0.5 * (double)$$7), $$5.dA());
                  evn $$9 = this.dP().a(new dbf($$3, $$8, dbf.a.a, dbf.b.a, this));
                  if ($$9.c() == evn.a.a) {
                     $$6 = true;
                     break;
                  }
               }

               if ($$6) {
                  float $$10 = $$0 * (float)Math.sqrt((5.0 - (double)this.f($$5)) / 5.0);
                  $$5.a(this.dQ().a(this, this.s()), $$10);
               }
            }
         }
      }
   }

   private boolean z() {
      return this.ao.a(c).isPresent();
   }

   @Override
   public boolean u() {
      return this.ao.a(d);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 17 && this.dP().B) {
         evp $$1 = this.ds();
         this.dP().a(this.du(), this.dw(), this.dA(), $$1.c, $$1.d, $$1.e, this.A());
      }

      super.b($$0);
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      $$0.a("Life", this.e);
      $$0.a("LifeTime", this.f);
      $$0.a("FireworksItem", this.p().a(this.dR()));
      $$0.a("ShotAtAngle", this.ao.a(d));
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      this.e = $$0.h("Life");
      this.f = $$0.h("LifeTime");
      if ($$0.b("FireworksItem", 10)) {
         this.ao.a(b, cun.a(this.dR(), (vo)$$0.p("FireworksItem")).orElseGet(cni::B));
      } else {
         this.ao.a(b, B());
      }

      if ($$0.e("ShotAtAngle")) {
         this.ao.a(d, $$0.q("ShotAtAngle"));
      }
   }

   private List<cxg> A() {
      cun $$0 = this.ao.a(b);
      cxh $$1 = $$0.a(km.T);
      return $$1 != null ? $$1.b() : List.of();
   }

   @Override
   public cun p() {
      return this.ao.a(b);
   }

   @Override
   public boolean ct() {
      return false;
   }

   private static cun B() {
      return new cun(cuq.uu);
   }
}
