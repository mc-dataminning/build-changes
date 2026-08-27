import java.util.List;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class cmj extends cmo implements cml {
   private static final ajr<cto> b = ajv.a(cmj.class, ajt.h);
   private static final ajr<OptionalInt> c = ajv.a(cmj.class, ajt.v);
   private static final ajr<Boolean> d = ajv.a(cmj.class, ajt.k);
   private int e;
   private int g;
   @Nullable
   private bso h;

   public cmj(bsa<? extends cmj> $$0, dax $$1) {
      super($$0, $$1);
   }

   public cmj(dax $$0, double $$1, double $$2, double $$3, cto $$4) {
      super(bsa.P, $$0);
      this.e = 0;
      this.a_($$1, $$2, $$3);
      this.ao.a(b, $$4.s());
      int $$5 = 1;
      cwi $$6 = $$4.a(kb.T);
      if ($$6 != null) {
         $$5 += $$6.a();
      }

      this.o(this.ah.a(0.0, 0.002297), 0.05, this.ah.a(0.0, 0.002297));
      this.g = 10 * $$5 + this.ah.a(6) + this.ah.a(7);
   }

   public cmj(dax $$0, @Nullable bru $$1, double $$2, double $$3, double $$4, cto $$5) {
      this($$0, $$2, $$3, $$4, $$5);
      this.c($$1);
   }

   public cmj(dax $$0, cto $$1, bso $$2) {
      this($$0, $$2, $$2.du(), $$2.dw(), $$2.dA(), $$1);
      this.ao.a(c, OptionalInt.of($$2.al()));
      this.h = $$2;
   }

   public cmj(dax $$0, cto $$1, double $$2, double $$3, double $$4, boolean $$5) {
      this($$0, $$2, $$3, $$4, $$1);
      this.ao.a(d, $$5);
   }

   public cmj(dax $$0, cto $$1, bru $$2, double $$3, double $$4, double $$5, boolean $$6) {
      this($$0, $$1, $$3, $$4, $$5, $$6);
      this.c($$2);
   }

   @Override
   protected void a(ajv.a $$0) {
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
            this.ao.a(c).ifPresent($$0x -> {
               bru $$1x = this.dP().a($$0x);
               if ($$1x instanceof bso) {
                  this.h = (bso)$$1x;
               }
            });
         }

         if (this.h != null) {
            euk $$4;
            if (this.h.fE()) {
               euk $$0 = this.h.bL();
               double $$1 = 1.5;
               double $$2 = 0.1;
               euk $$3 = this.h.ds();
               this.h.g($$3.b($$0.c * 0.1 + ($$0.c * 1.5 - $$3.c) * 0.5, $$0.d * 0.1 + ($$0.d * 1.5 - $$3.d) * 0.5, $$0.e * 0.1 + ($$0.e * 1.5 - $$3.e) * 0.5));
               $$4 = this.h.a(ctr.uu);
            } else {
               $$4 = euk.b;
            }

            this.a_(this.h.du() + $$4.c, this.h.dw() + $$4.d, this.h.dA() + $$4.e);
            this.g(this.h.ds());
         }
      } else {
         if (!this.u()) {
            double $$6 = this.Q ? 1.0 : 1.15;
            this.g(this.ds().d($$6, 1.0, $$6).b(0.0, 0.04, 0.0));
         }

         euk $$7 = this.ds();
         this.a(bst.a, $$7);
         this.g($$7);
      }

      eui $$8 = cmq.a(this, this::b);
      if (!this.ag) {
         this.a($$8);
         this.av = true;
      }

      this.J();
      if (this.e == 0 && !this.aW()) {
         this.dP().a(null, this.du(), this.dw(), this.dA(), avh.iP, avi.i, 3.0F, 1.0F);
      }

      this.e++;
      if (this.dP().B && this.e % 2 < 2) {
         this.dP().a(ky.D, this.du(), this.dw(), this.dA(), this.ah.k() * 0.05, -this.ds().d * 0.5, this.ah.k() * 0.05);
      }

      if (!this.dP().B && this.e > this.g) {
         this.v();
      }
   }

   private void v() {
      this.dP().a(this, (byte)17);
      this.a(dvu.w, this.s());
      this.x();
      this.ao();
   }

   @Override
   protected void a(euh $$0) {
      super.a($$0);
      if (!this.dP().B) {
         this.v();
      }
   }

   @Override
   protected void a(eug $$0) {
      io $$1 = new io($$0.a());
      this.dP().a_($$1).a(this.dP(), $$1, this);
      if (!this.dP().x_() && this.w()) {
         this.v();
      }

      super.a($$0);
   }

   private boolean w() {
      return !this.z().isEmpty();
   }

   private void x() {
      float $$0 = 0.0F;
      List<cwh> $$1 = this.z();
      if (!$$1.isEmpty()) {
         $$0 = 5.0F + (float)($$1.size() * 2);
      }

      if ($$0 > 0.0F) {
         if (this.h != null) {
            this.h.a(this.dQ().a(this, this.s()), 5.0F + (float)($$1.size() * 2));
         }

         double $$2 = 5.0;
         euk $$3 = this.dn();

         for (bso $$5 : this.dP().a(bso.class, this.cK().g(5.0))) {
            if ($$5 != this.h && !(this.g($$5) > 25.0)) {
               boolean $$6 = false;

               for (int $$7 = 0; $$7 < 2; $$7++) {
                  euk $$8 = new euk($$5.du(), $$5.e(0.5 * (double)$$7), $$5.dA());
                  eui $$9 = this.dP().a(new dag($$3, $$8, dag.a.a, dag.b.a, this));
                  if ($$9.c() == eui.a.a) {
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

   private boolean y() {
      return this.ao.a(c).isPresent();
   }

   @Override
   public boolean u() {
      return this.ao.a(d);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 17 && this.dP().B) {
         euk $$1 = this.ds();
         this.dP().a(this.du(), this.dw(), this.dA(), $$1.c, $$1.d, $$1.e, this.z());
      }

      super.b($$0);
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      $$0.a("Life", this.e);
      $$0.a("LifeTime", this.g);
      $$0.a("FireworksItem", this.p().a(this.dR()));
      $$0.a("ShotAtAngle", this.ao.a(d));
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      this.e = $$0.h("Life");
      this.g = $$0.h("LifeTime");
      if ($$0.b("FireworksItem", 10)) {
         this.ao.a(b, cto.a(this.dR(), (va)$$0.p("FireworksItem")).orElseGet(cmj::A));
      } else {
         this.ao.a(b, A());
      }

      if ($$0.e("ShotAtAngle")) {
         this.ao.a(d, $$0.q("ShotAtAngle"));
      }
   }

   private List<cwh> z() {
      cto $$0 = this.ao.a(b);
      cwi $$1 = $$0.a(kb.T);
      return $$1 != null ? $$1.b() : List.of();
   }

   @Override
   public cto p() {
      return this.ao.a(b);
   }

   @Override
   public boolean ct() {
      return false;
   }

   private static cto A() {
      return new cto(ctr.uu);
   }
}
