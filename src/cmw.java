import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;

public class cmw extends cmv {
   private static final akj<cyy> e = akn.a(cmw.class, akl.h);
   private static final akj<Integer> f = akn.a(cmw.class, akl.b);
   public static final int d = 8;
   private static final float g = 0.0625F;
   private static final float h = 0.75F;
   private static final float i = 0.75F;
   private float j = 1.0F;
   private boolean k;

   public cmw(bwm<? extends cmw> $$0, div $$1) {
      super($$0, $$1);
   }

   public cmw(div $$0, iu $$1, ja $$2) {
      this(bwm.as, $$0, $$1, $$2);
   }

   public cmw(bwm<? extends cmw> $$0, div $$1, iu $$2, ja $$3) {
      super($$0, $$1, $$2);
      this.a($$3);
   }

   @Override
   protected void a(akn.a $$0) {
      $$0.a(e, cyy.k);
      $$0.a(f, 0);
   }

   @Override
   protected void a(ja $$0) {
      Validate.notNull($$0);
      this.c = $$0;
      if ($$0.o().d()) {
         this.x(0.0F);
         this.w((float)(this.c.e() * 90));
      } else {
         this.x((float)(-90 * $$0.f().a()));
         this.w(0.0F);
      }

      this.O = this.dN();
      this.N = this.dL();
      this.f();
   }

   @Override
   protected fed a(iu $$0, ja $$1) {
      float $$2 = 0.46875F;
      fei $$3 = fei.b($$0).a($$1, -0.46875);
      ja.a $$4 = $$1.o();
      double $$5 = $$4 == ja.a.a ? 0.0625 : 0.75;
      double $$6 = $$4 == ja.a.b ? 0.0625 : 0.75;
      double $$7 = $$4 == ja.a.c ? 0.0625 : 0.75;
      return fed.a($$3, $$5, $$6, $$7);
   }

   @Override
   public boolean g() {
      if (this.k) {
         return true;
      } else if (!this.dV().g(this)) {
         return false;
      } else {
         dzz $$0 = this.dV().a_(this.a.a(this.c.g()));
         return $$0.e() || this.c.o().d() && dod.n($$0) ? this.dV().a(this, this.cR(), b).isEmpty() : false;
      }
   }

   @Override
   public void a(bxg $$0, fei $$1) {
      if (!this.k) {
         super.a($$0, $$1);
      }
   }

   @Override
   public void j(double $$0, double $$1, double $$2) {
      if (!this.k) {
         super.j($$0, $$1, $$2);
      }
   }

   @Override
   public void c(arq $$0) {
      this.d(this.w());
      super.c($$0);
   }

   private boolean a(bus $$0) {
      return !$$0.a(axd.l) && !this.w().f();
   }

   private static boolean e(bus $$0) {
      return $$0.a(axd.d) || $$0.h();
   }

   @Override
   public boolean b(bus $$0) {
      return this.k && !e($$0) ? false : !this.d($$0);
   }

   @Override
   public boolean a(arq $$0, bus $$1, float $$2) {
      if (!this.k) {
         if (this.d($$1)) {
            return false;
         } else if (this.a($$1)) {
            this.a($$0, $$1.d(), false);
            this.a(eez.c, $$1.d());
            this.a(this.m(), 1.0F, 1.0F);
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      } else {
         return e($$1) && super.a($$0, $$1, $$2);
      }
   }

   public awm m() {
      return awn.od;
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = 16.0;
      $$1 *= 64.0 * cK();
      return $$0 < $$1 * $$1;
   }

   @Override
   public void a(arq $$0, @Nullable bwd $$1) {
      this.a(this.n(), 1.0F, 1.0F);
      this.a($$0, $$1, true);
      this.a(eez.c, $$1);
   }

   public awm n() {
      return awn.ob;
   }

   @Override
   public void v() {
      this.a(this.o(), 1.0F, 1.0F);
   }

   public awm o() {
      return awn.oc;
   }

   private void a(arq $$0, @Nullable bwd $$1, boolean $$2) {
      if (!this.k) {
         cyy $$3 = this.w();
         this.b(cyy.k);
         if (!$$0.O().c(dir.i)) {
            if ($$1 == null) {
               this.d($$3);
            }
         } else {
            if ($$1 instanceof cqy $$4 && $$4.fU()) {
               this.d($$3);
               return;
            }

            if ($$2) {
               this.a($$0, this.t());
            }

            if (!$$3.f()) {
               $$3 = $$3.v();
               this.d($$3);
               if (this.ae.i() < this.j) {
                  this.a($$0, $$3);
               }
            }
         }
      }
   }

   private void d(cyy $$0) {
      exz $$1 = this.a($$0);
      if ($$1 != null) {
         eyb $$2 = czl.a($$1, this.dV());
         if ($$2 != null) {
            $$2.a(this.a, this.ar());
         }
      }

      $$0.a(null);
   }

   public cyy w() {
      return this.au().a(e);
   }

   @Nullable
   public exz a(cyy $$0) {
      return $$0.a(kj.M);
   }

   public boolean x() {
      return this.w().c(kj.M);
   }

   public void b(cyy $$0) {
      this.a($$0, true);
   }

   public void a(cyy $$0, boolean $$1) {
      if (!$$0.f()) {
         $$0 = $$0.c(1);
      }

      this.e($$0);
      this.au().a(e, $$0);
      if (!$$0.f()) {
         this.a(this.q(), 1.0F, 1.0F);
      }

      if ($$1 && this.a != null) {
         this.dV().b(this.a, dmc.a);
      }
   }

   public awm q() {
      return awn.oa;
   }

   @Override
   public bxt a_(int $$0) {
      return $$0 == 0 ? bxt.a(this::w, this::b) : super.a_($$0);
   }

   @Override
   public void a(akj<?> $$0) {
      if ($$0.equals(e)) {
         this.e(this.w());
      }
   }

   private void e(cyy $$0) {
      if (!$$0.f() && $$0.I() != this) {
         $$0.a(this);
      }

      this.f();
   }

   public int y() {
      return this.au().a(f);
   }

   public void b(int $$0) {
      this.a($$0, true);
   }

   private void a(int $$0, boolean $$1) {
      this.au().a(f, $$0 % 8);
      if ($$1 && this.a != null) {
         this.dV().b(this.a, dmc.a);
      }
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      if (!this.w().f()) {
         $$0.a("Item", this.w().a(this.dX()));
         $$0.a("ItemRotation", (byte)this.y());
         $$0.a("ItemDropChance", this.j);
      }

      $$0.a("Facing", (byte)this.c.d());
      $$0.a("Invisible", this.cp());
      $$0.a("Fixed", this.k);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      cyy $$2;
      if ($$0.b("Item", 10)) {
         tz $$1 = $$0.p("Item");
         $$2 = cyy.a(this.dX(), (uw)$$1).orElse(cyy.k);
      } else {
         $$2 = cyy.k;
      }

      cyy $$4 = this.w();
      if (!$$4.f() && !cyy.a($$2, $$4)) {
         this.d($$4);
      }

      this.a($$2, false);
      if (!$$2.f()) {
         this.a($$0.f("ItemRotation"), false);
         if ($$0.b("ItemDropChance", 99)) {
            this.j = $$0.j("ItemDropChance");
         }
      }

      this.a(ja.a($$0.f("Facing")));
      this.k($$0.q("Invisible"));
      this.k = $$0.q("Fixed");
   }

   @Override
   public bub a(cqy $$0, bua $$1) {
      cyy $$2 = $$0.b($$1);
      boolean $$3 = !this.w().f();
      boolean $$4 = !$$2.f();
      if (this.k) {
         return bub.e;
      } else if (!$$0.dV().C) {
         if (!$$3) {
            if ($$4 && !this.dQ()) {
               eyb $$5 = czl.b($$2, this.dV());
               if ($$5 != null && $$5.a(256)) {
                  return bub.d;
               } else {
                  this.b($$2);
                  this.a(eez.c, $$0);
                  $$2.a(1, $$0);
                  return bub.a;
               }
            } else {
               return bub.e;
            }
         } else {
            this.a(this.s(), 1.0F, 1.0F);
            this.b(this.y() + 1);
            this.a(eez.c, $$0);
            return bub.a;
         }
      } else {
         return (bub)(!$$3 && !$$4 ? bub.e : bub.a);
      }
   }

   public awm s() {
      return awn.oe;
   }

   public int z() {
      return this.w().f() ? 0 : this.y() % 8 + 1;
   }

   @Override
   public zf<abu> a(aro $$0) {
      return new abv(this, this.c.d(), this.j());
   }

   @Override
   public void a(abv $$0) {
      super.a($$0);
      this.a(ja.a($$0.p()));
   }

   @Override
   public cyy dI() {
      cyy $$0 = this.w();
      return $$0.f() ? this.t() : $$0.v();
   }

   protected cyy t() {
      return new cyy(czc.vh);
   }

   @Override
   public float dM() {
      ja $$0 = this.cO();
      int $$1 = $$0.o().b() ? 90 * $$0.f().a() : 0;
      return (float)azm.b(180 + $$0.e() * 90 + this.y() * 45 + $$1);
   }
}
