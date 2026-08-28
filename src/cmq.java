import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;

public class cmq extends cmp {
   private static final akh<cys> e = akl.a(cmq.class, akj.h);
   private static final akh<Integer> f = akl.a(cmq.class, akj.b);
   public static final int d = 8;
   private static final float g = 0.0625F;
   private static final float h = 0.75F;
   private static final float i = 0.75F;
   private float j = 1.0F;
   private boolean k;

   public cmq(bwj<? extends cmq> $$0, dip $$1) {
      super($$0, $$1);
   }

   public cmq(dip $$0, iu $$1, ja $$2) {
      this(bwj.as, $$0, $$1, $$2);
   }

   public cmq(bwj<? extends cmq> $$0, dip $$1, iu $$2, ja $$3) {
      super($$0, $$1, $$2);
      this.a($$3);
   }

   @Override
   protected void a(akl.a $$0) {
      $$0.a(e, cys.k);
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
   protected fdr a(iu $$0, ja $$1) {
      float $$2 = 0.46875F;
      fdw $$3 = fdw.b($$0).a($$1, -0.46875);
      ja.a $$4 = $$1.o();
      double $$5 = $$4 == ja.a.a ? 0.0625 : 0.75;
      double $$6 = $$4 == ja.a.b ? 0.0625 : 0.75;
      double $$7 = $$4 == ja.a.c ? 0.0625 : 0.75;
      return fdr.a($$3, $$5, $$6, $$7);
   }

   @Override
   public boolean g() {
      if (this.k) {
         return true;
      } else if (!this.dV().g(this)) {
         return false;
      } else {
         dzo $$0 = this.dV().a_(this.a.a(this.c.g()));
         return $$0.e() || this.c.o().d() && dnx.n($$0) ? this.dV().a(this, this.cR(), b).isEmpty() : false;
      }
   }

   @Override
   public void a(bxd $$0, fdw $$1) {
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
   public void c(aro $$0) {
      this.d(this.w());
      super.c($$0);
   }

   private boolean a(bup $$0) {
      return !$$0.a(axb.l) && !this.w().f();
   }

   private static boolean e(bup $$0) {
      return $$0.a(axb.d) || $$0.h();
   }

   @Override
   public boolean b(bup $$0) {
      return this.k && !e($$0) ? false : !this.d($$0);
   }

   @Override
   public boolean a(aro $$0, bup $$1, float $$2) {
      if (!this.k) {
         if (this.d($$1)) {
            return false;
         } else if (this.a($$1)) {
            this.a($$0, $$1.d(), false);
            this.a(eeo.c, $$1.d());
            this.a(this.m(), 1.0F, 1.0F);
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      } else {
         return e($$1) && super.a($$0, $$1, $$2);
      }
   }

   public awk m() {
      return awl.oc;
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = 16.0;
      $$1 *= 64.0 * cK();
      return $$0 < $$1 * $$1;
   }

   @Override
   public void a(aro $$0, @Nullable bwa $$1) {
      this.a(this.n(), 1.0F, 1.0F);
      this.a($$0, $$1, true);
      this.a(eeo.c, $$1);
   }

   public awk n() {
      return awl.oa;
   }

   @Override
   public void v() {
      this.a(this.o(), 1.0F, 1.0F);
   }

   public awk o() {
      return awl.ob;
   }

   private void a(aro $$0, @Nullable bwa $$1, boolean $$2) {
      if (!this.k) {
         cys $$3 = this.w();
         this.b(cys.k);
         if (!$$0.O().c(dil.i)) {
            if ($$1 == null) {
               this.d($$3);
            }
         } else {
            if ($$1 instanceof cqs $$4 && $$4.fU()) {
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

   private void d(cys $$0) {
      exn $$1 = this.a($$0);
      if ($$1 != null) {
         exp $$2 = czf.a($$1, this.dV());
         if ($$2 != null) {
            $$2.a(this.a, this.ar());
         }
      }

      $$0.a(null);
   }

   public cys w() {
      return this.au().a(e);
   }

   @Nullable
   public exn a(cys $$0) {
      return $$0.a(kj.M);
   }

   public boolean x() {
      return this.w().c(kj.M);
   }

   public void b(cys $$0) {
      this.a($$0, true);
   }

   public void a(cys $$0, boolean $$1) {
      if (!$$0.f()) {
         $$0 = $$0.c(1);
      }

      this.e($$0);
      this.au().a(e, $$0);
      if (!$$0.f()) {
         this.a(this.q(), 1.0F, 1.0F);
      }

      if ($$1 && this.a != null) {
         this.dV().b(this.a, dlw.a);
      }
   }

   public awk q() {
      return awl.nZ;
   }

   @Override
   public bxq a_(int $$0) {
      return $$0 == 0 ? bxq.a(this::w, this::b) : super.a_($$0);
   }

   @Override
   public void a(akh<?> $$0) {
      if ($$0.equals(e)) {
         this.e(this.w());
      }
   }

   private void e(cys $$0) {
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
         this.dV().b(this.a, dlw.a);
      }
   }

   @Override
   public void b(tx $$0) {
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
   public void a(tx $$0) {
      super.a($$0);
      cys $$2;
      if ($$0.b("Item", 10)) {
         tx $$1 = $$0.p("Item");
         $$2 = cys.a(this.dX(), (uu)$$1).orElse(cys.k);
      } else {
         $$2 = cys.k;
      }

      cys $$4 = this.w();
      if (!$$4.f() && !cys.a($$2, $$4)) {
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
   public bty a(cqs $$0, btx $$1) {
      cys $$2 = $$0.b($$1);
      boolean $$3 = !this.w().f();
      boolean $$4 = !$$2.f();
      if (this.k) {
         return bty.e;
      } else if (!$$0.dV().C) {
         if (!$$3) {
            if ($$4 && !this.dQ()) {
               exp $$5 = czf.b($$2, this.dV());
               if ($$5 != null && $$5.a(256)) {
                  return bty.d;
               } else {
                  this.b($$2);
                  this.a(eeo.c, $$0);
                  $$2.a(1, $$0);
                  return bty.a;
               }
            } else {
               return bty.e;
            }
         } else {
            this.a(this.s(), 1.0F, 1.0F);
            this.b(this.y() + 1);
            this.a(eeo.c, $$0);
            return bty.a;
         }
      } else {
         return (bty)(!$$3 && !$$4 ? bty.e : bty.a);
      }
   }

   public awk s() {
      return awl.od;
   }

   public int z() {
      return this.w().f() ? 0 : this.y() % 8 + 1;
   }

   @Override
   public zd<abs> a(arm $$0) {
      return new abt(this, this.c.d(), this.j());
   }

   @Override
   public void a(abt $$0) {
      super.a($$0);
      this.a(ja.a($$0.p()));
   }

   @Override
   public cys dI() {
      cys $$0 = this.w();
      return $$0.f() ? this.t() : $$0.v();
   }

   protected cys t() {
      return new cys(cyw.vf);
   }

   @Override
   public float dM() {
      ja $$0 = this.cO();
      int $$1 = $$0.o().b() ? 90 * $$0.f().a() : 0;
      return (float)azk.b(180 + $$0.e() * 90 + this.y() * 45 + $$1);
   }
}
