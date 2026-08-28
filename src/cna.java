import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;

public class cna extends cmz {
   private static final akj<czd> e = akn.a(cna.class, akl.h);
   private static final akj<Integer> f = akn.a(cna.class, akl.b);
   public static final int d = 8;
   private static final float g = 0.0625F;
   private static final float h = 0.75F;
   private static final float i = 0.75F;
   private float j = 1.0F;
   private boolean k;

   public cna(bwo<? extends cna> $$0, dja $$1) {
      super($$0, $$1);
   }

   public cna(dja $$0, iu $$1, ja $$2) {
      this(bwo.as, $$0, $$1, $$2);
   }

   public cna(bwo<? extends cna> $$0, dja $$1, iu $$2, ja $$3) {
      super($$0, $$1, $$2);
      this.a($$3);
   }

   @Override
   protected void a(akn.a $$0) {
      $$0.a(e, czd.k);
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
   protected fel a(iu $$0, ja $$1) {
      float $$2 = 0.46875F;
      feq $$3 = feq.b($$0).a($$1, -0.46875);
      ja.a $$4 = $$1.o();
      double $$5 = $$4 == ja.a.a ? 0.0625 : 0.75;
      double $$6 = $$4 == ja.a.b ? 0.0625 : 0.75;
      double $$7 = $$4 == ja.a.c ? 0.0625 : 0.75;
      return fel.a($$3, $$5, $$6, $$7);
   }

   @Override
   public boolean g() {
      if (this.k) {
         return true;
      } else if (!this.dV().g(this)) {
         return false;
      } else {
         eah $$0 = this.dV().a_(this.a.a(this.c.g()));
         return $$0.e() || this.c.o().d() && doi.n($$0) ? this.dV().a(this, this.cR(), b).isEmpty() : false;
      }
   }

   @Override
   public void a(bxi $$0, feq $$1) {
      if (!this.k) {
         super.a($$0, $$1);
      }
   }

   @Override
   public void i(double $$0, double $$1, double $$2) {
      if (!this.k) {
         super.i($$0, $$1, $$2);
      }
   }

   @Override
   public void c(arq $$0) {
      this.d(this.w());
      super.c($$0);
   }

   private boolean a(buu $$0) {
      return !$$0.a(axd.l) && !this.w().f();
   }

   private static boolean e(buu $$0) {
      return $$0.a(axd.d) || $$0.h();
   }

   @Override
   public boolean b(buu $$0) {
      return this.k && !e($$0) ? false : !this.d($$0);
   }

   @Override
   public boolean a(arq $$0, buu $$1, float $$2) {
      if (!this.k) {
         if (this.d($$1)) {
            return false;
         } else if (this.a($$1)) {
            this.a($$0, $$1.d(), false);
            this.a(efh.c, $$1.d());
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
      return awn.og;
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = 16.0;
      $$1 *= 64.0 * cK();
      return $$0 < $$1 * $$1;
   }

   @Override
   public void a(arq $$0, @Nullable bwf $$1) {
      this.a(this.n(), 1.0F, 1.0F);
      this.a($$0, $$1, true);
      this.a(efh.c, $$1);
   }

   public awm n() {
      return awn.oe;
   }

   @Override
   public void v() {
      this.a(this.o(), 1.0F, 1.0F);
   }

   public awm o() {
      return awn.of;
   }

   private void a(arq $$0, @Nullable bwf $$1, boolean $$2) {
      if (!this.k) {
         czd $$3 = this.w();
         this.b(czd.k);
         if (!$$0.O().c(diw.j)) {
            if ($$1 == null) {
               this.d($$3);
            }
         } else {
            if ($$1 instanceof crc $$4 && $$4.fV()) {
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

   private void d(czd $$0) {
      eyh $$1 = this.a($$0);
      if ($$1 != null) {
         eyj $$2 = czq.a($$1, this.dV());
         if ($$2 != null) {
            $$2.a(this.a, this.ar());
         }
      }

      $$0.a(null);
   }

   public czd w() {
      return this.au().a(e);
   }

   @Nullable
   public eyh a(czd $$0) {
      return $$0.a(kj.M);
   }

   public boolean x() {
      return this.w().c(kj.M);
   }

   public void b(czd $$0) {
      this.a($$0, true);
   }

   public void a(czd $$0, boolean $$1) {
      if (!$$0.f()) {
         $$0 = $$0.c(1);
      }

      this.e($$0);
      this.au().a(e, $$0);
      if (!$$0.f()) {
         this.a(this.q(), 1.0F, 1.0F);
      }

      if ($$1 && this.a != null) {
         this.dV().b(this.a, dmh.a);
      }
   }

   public awm q() {
      return awn.od;
   }

   @Override
   public bxv a_(int $$0) {
      return $$0 == 0 ? bxv.a(this::w, this::b) : super.a_($$0);
   }

   @Override
   public void a(akj<?> $$0) {
      if ($$0.equals(e)) {
         this.e(this.w());
      }
   }

   private void e(czd $$0) {
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
         this.dV().b(this.a, dmh.a);
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
      czd $$2;
      if ($$0.b("Item", 10)) {
         tz $$1 = $$0.p("Item");
         $$2 = czd.a(this.dX(), (uw)$$1).orElse(czd.k);
      } else {
         $$2 = czd.k;
      }

      czd $$4 = this.w();
      if (!$$4.f() && !czd.a($$2, $$4)) {
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
   public bud a(crc $$0, buc $$1) {
      czd $$2 = $$0.b($$1);
      boolean $$3 = !this.w().f();
      boolean $$4 = !$$2.f();
      if (this.k) {
         return bud.e;
      } else if (!$$0.dV().C) {
         if (!$$3) {
            if ($$4 && !this.dQ()) {
               eyj $$5 = czq.b($$2, this.dV());
               if ($$5 != null && $$5.a(256)) {
                  return bud.d;
               } else {
                  this.b($$2);
                  this.a(efh.c, $$0);
                  $$2.a(1, $$0);
                  return bud.a;
               }
            } else {
               return bud.e;
            }
         } else {
            this.a(this.s(), 1.0F, 1.0F);
            this.b(this.y() + 1);
            this.a(efh.c, $$0);
            return bud.a;
         }
      } else {
         return (bud)(!$$3 && !$$4 ? bud.e : bud.a);
      }
   }

   public awm s() {
      return awn.oh;
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
   public czd dI() {
      czd $$0 = this.w();
      return $$0.f() ? this.t() : $$0.v();
   }

   protected czd t() {
      return new czd(czh.vm);
   }

   @Override
   public float dM() {
      ja $$0 = this.cO();
      int $$1 = $$0.o().b() ? 90 * $$0.f().a() : 0;
      return (float)azm.b(180 + $$0.e() * 90 + this.y() * 45 + $$1);
   }
}
