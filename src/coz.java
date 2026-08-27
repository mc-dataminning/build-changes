import javax.annotation.Nullable;

public class coz extends brv {
   public static final int b = 2;
   private static final ajy<iw> c = akc.a(coz.class, aka.q);
   private static final ajy<Float> d = akc.a(coz.class, aka.d);
   private final cpa e;
   @Nullable
   private cpe f;
   @Nullable
   private coz.a g;
   private int h;

   public coz(bsb<?> $$0, dca $$1) {
      super($$0, $$1);
      this.e = $$1.a(this);
      this.ay = true;
   }

   public void a(iw $$0, float $$1) {
      this.ap().a(c, $$0);
      this.ap().a(d, $$1);
      this.f = cpe.a(this.e.e(), $$0);
   }

   public void p() {
      this.ap().a(d, 0.0F);
      this.f = null;
   }

   public cpa r() {
      return this.e;
   }

   @Override
   public void a_(double $$0, double $$1, double $$2) {
      super.a_($$0, $$1, $$2);
      if (this.e != null) {
         this.e.a($$0, $$1, $$2);
      }
   }

   @Override
   public void l() {
      super.l();
      iw $$0 = this.x();
      this.e.e().a(this.dU(), this.ds(), $$0);
      if (this.dU().x_()) {
         this.t();
      } else {
         this.u();
      }
   }

   private void t() {
      if (this.g != null) {
         this.g.a(this);
         if (--this.g.a == 0) {
            this.g = null;
         }
      }
   }

   private void u() {
      iw $$0 = this.x();
      float $$1 = this.w();
      if (this.h == 0 && $$1 == 0.0F) {
         this.h = 2;
      }

      if (this.h > 0) {
         this.h--;
         if (this.h == 1) {
            this.e.e().a(this.du(), this.dU());
         } else if (this.h == 0) {
            this.ao();
         }
      } else if (this.f != null) {
         this.a(this.f, $$0, $$1);
      }
   }

   private void a(cpe $$0, iw $$1, float $$2) {
      ewu $$3 = this.ds();
      ewu $$4 = $$3.b((double)((float)$$1.j() * $$2), (double)((float)$$1.k() * $$2), (double)((float)$$1.l() * $$2));
      ir $$5 = this.a($$3, $$1);
      ir $$6 = this.a($$4, $$1);
      ir.a $$7 = $$5.j();

      while (!$$7.equals($$6)) {
         $$7.d($$1);
         if ($$0.a(this.dU(), $$7)) {
            ir $$8 = $$7.a($$1, -1);
            this.b(ewu.a($$8));
            this.p();
            this.h = 5;
            return;
         }
      }

      this.b($$4);
   }

   private ir a(ewu $$0, iw $$1) {
      ir $$2 = ir.a($$0);
      return $$1.f() == iw.b.a ? $$2.a($$1) : $$2;
   }

   @Override
   protected void a(akc.a $$0) {
      $$0.a(c, iw.c);
      $$0.a(d, 0.0F);
   }

   @Override
   protected void a(uk $$0) {
      this.e.a(cpb.a(this.dY().b(li.f), $$0.p("blocks")));
      if ($$0.b("biome", 8)) {
         this.dY().d(li.az).c(new akt($$0.l("biome"))).ifPresent(this.e::a);
      }

      if ($$0.b("movement_direction", 8)) {
         iw $$1 = iw.a($$0.l("movement_direction"));
         if ($$1 != null) {
            this.a($$1, $$0.j("movement_speed"));
         }
      } else {
         this.p();
      }
   }

   @Override
   protected void b(uk $$0) {
      $$0.a("blocks", this.e.e().e());
      this.e.g().e().ifPresent($$1 -> $$0.a("biome", $$1.a().toString()));
      $$0.a("movement_direction", this.x().c());
      $$0.a("movement_speed", this.w());
   }

   private float w() {
      return this.ap().a(d);
   }

   private iw x() {
      return this.ap().a(c);
   }

   @Override
   public zl<abw> dq() {
      return new abz(this);
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      this.g = new coz.a(2, $$0, $$1, $$2);
   }

   @Override
   public double c_() {
      return this.g != null ? this.g.b : this.dz();
   }

   @Override
   public double d_() {
      return this.g != null ? this.g.c : this.dB();
   }

   @Override
   public double M_() {
      return this.g != null ? this.g.d : this.dF();
   }

   static class a {
      int a;
      final double b;
      final double c;
      final double d;

      a(int $$0, double $$1, double $$2, double $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      void a(brv $$0) {
         $$0.a(this.a, this.b, this.c, this.d, 0.0, 0.0);
      }
   }
}
