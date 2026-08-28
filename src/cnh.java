import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;

public class cnh extends cng {
   private static final akj<czk> e = akn.a(cnh.class, akl.h);
   private static final akj<Integer> f = akn.a(cnh.class, akl.b);
   public static final int d = 8;
   private static final float g = 0.0625F;
   private static final float h = 0.75F;
   private static final float i = 0.75F;
   private float j = 1.0F;
   private boolean k;

   public cnh(bwr<? extends cnh> $$0, djh $$1) {
      super($$0, $$1);
   }

   public cnh(djh $$0, iv $$1, jb $$2) {
      this(bwr.as, $$0, $$1, $$2);
   }

   public cnh(bwr<? extends cnh> $$0, djh $$1, iv $$2, jb $$3) {
      super($$0, $$1, $$2);
      this.a($$3);
   }

   @Override
   protected void a(akn.a $$0) {
      $$0.a(e, czk.k);
      $$0.a(f, 0);
   }

   @Override
   protected void a(jb $$0) {
      Validate.notNull($$0);
      this.c = $$0;
      if ($$0.o().d()) {
         this.x(0.0F);
         this.w((float)(this.c.e() * 90));
      } else {
         this.x((float)(-90 * $$0.f().a()));
         this.w(0.0F);
      }

      this.O = this.dM();
      this.N = this.dK();
      this.f();
   }

   @Override
   protected fes a(iv $$0, jb $$1) {
      float $$2 = 0.46875F;
      fex $$3 = fex.b($$0).a($$1, -0.46875);
      jb.a $$4 = $$1.o();
      double $$5 = $$4 == jb.a.a ? 0.0625 : 0.75;
      double $$6 = $$4 == jb.a.b ? 0.0625 : 0.75;
      double $$7 = $$4 == jb.a.c ? 0.0625 : 0.75;
      return fes.a($$3, $$5, $$6, $$7);
   }

   @Override
   public boolean g() {
      if (this.k) {
         return true;
      } else if (!this.dU().g(this)) {
         return false;
      } else {
         eao $$0 = this.dU().a_(this.a.a(this.c.g()));
         return $$0.e() || this.c.o().d() && dop.n($$0) ? this.dU().a(this, this.cQ(), b).isEmpty() : false;
      }
   }

   @Override
   public void a(bxn $$0, fex $$1) {
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

   private boolean a(bux $$0) {
      return !$$0.a(axd.l) && !this.w().f();
   }

   private static boolean e(bux $$0) {
      return $$0.a(axd.d) || $$0.h();
   }

   @Override
   public boolean b(bux $$0) {
      return this.k && !e($$0) ? false : !this.d($$0);
   }

   @Override
   public boolean a(arq $$0, bux $$1, float $$2) {
      if (!this.k) {
         if (this.d($$1)) {
            return false;
         } else if (this.a($$1)) {
            this.a($$0, $$1.d(), false);
            this.a(efo.c, $$1.d());
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
      $$1 *= 64.0 * cJ();
      return $$0 < $$1 * $$1;
   }

   @Override
   public void a(arq $$0, @Nullable bwi $$1) {
      this.a(this.n(), 1.0F, 1.0F);
      this.a($$0, $$1, true);
      this.a(efo.c, $$1);
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

   private void a(arq $$0, @Nullable bwi $$1, boolean $$2) {
      if (!this.k) {
         czk $$3 = this.w();
         this.b(czk.k);
         if (!$$0.O().c(djd.j)) {
            if ($$1 == null) {
               this.d($$3);
            }
         } else {
            if ($$1 instanceof crj $$4 && $$4.fU()) {
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

   private void d(czk $$0) {
      eyo $$1 = this.a($$0);
      if ($$1 != null) {
         eyq $$2 = czx.a($$1, this.dU());
         if ($$2 != null) {
            $$2.a(this.a, this.ao());
         }
      }

      $$0.a(null);
   }

   public czk w() {
      return this.ar().a(e);
   }

   @Nullable
   public eyo a(czk $$0) {
      return $$0.a(kk.M);
   }

   public boolean x() {
      return this.w().c(kk.M);
   }

   public void b(czk $$0) {
      this.a($$0, true);
   }

   public void a(czk $$0, boolean $$1) {
      if (!$$0.f()) {
         $$0 = $$0.c(1);
      }

      this.e($$0);
      this.ar().a(e, $$0);
      if (!$$0.f()) {
         this.a(this.q(), 1.0F, 1.0F);
      }

      if ($$1 && this.a != null) {
         this.dU().b(this.a, dmo.a);
      }
   }

   public awm q() {
      return awn.od;
   }

   @Override
   public bya a_(int $$0) {
      return $$0 == 0 ? bya.a(this::w, this::b) : super.a_($$0);
   }

   @Override
   public void a(akj<?> $$0) {
      if ($$0.equals(e)) {
         this.e(this.w());
      }
   }

   private void e(czk $$0) {
      if (!$$0.f() && $$0.I() != this) {
         $$0.a(this);
      }

      this.f();
   }

   public int y() {
      return this.ar().a(f);
   }

   public void b(int $$0) {
      this.a($$0, true);
   }

   private void a(int $$0, boolean $$1) {
      this.ar().a(f, $$0 % 8);
      if ($$1 && this.a != null) {
         this.dU().b(this.a, dmo.a);
      }
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      if (!this.w().f()) {
         ale<uw> $$1 = this.dW().a(un.a);
         $$0.a("Item", czk.b, $$1, this.w());
         $$0.a("ItemRotation", (byte)this.y());
         $$0.a("ItemDropChance", this.j);
      }

      $$0.a("Facing", jb.k, this.c);
      $$0.a("Invisible", this.cn());
      $$0.a("Fixed", this.k);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      ale<uw> $$1 = this.dW().a(un.a);
      czk $$2 = $$0.<czk>a("Item", czk.b, $$1).orElse(czk.k);
      czk $$3 = this.w();
      if (!$$3.f() && !czk.a($$2, $$3)) {
         this.d($$3);
      }

      this.a($$2, false);
      if (!$$2.f()) {
         this.a($$0.d("ItemRotation"), false);
         if ($$0.b("ItemDropChance", 99)) {
            this.j = $$0.h("ItemDropChance");
         }
      }

      this.a($$0.<jb>a("Facing", jb.k).orElse(jb.a));
      this.k($$0.o("Invisible"));
      this.k = $$0.o("Fixed");
   }

   @Override
   public bug a(crj $$0, buf $$1) {
      czk $$2 = $$0.b($$1);
      boolean $$3 = !this.w().f();
      boolean $$4 = !$$2.f();
      if (this.k) {
         return bug.e;
      } else if (!$$0.dU().C) {
         if (!$$3) {
            if ($$4 && !this.dP()) {
               eyq $$5 = czx.b($$2, this.dU());
               if ($$5 != null && $$5.a(256)) {
                  return bug.d;
               } else {
                  this.b($$2);
                  this.a(efo.c, $$0);
                  $$2.a(1, $$0);
                  return bug.a;
               }
            } else {
               return bug.e;
            }
         } else {
            this.a(this.s(), 1.0F, 1.0F);
            this.b(this.y() + 1);
            this.a(efo.c, $$0);
            return bug.a;
         }
      } else {
         return (bug)(!$$3 && !$$4 ? bug.e : bug.a);
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
      this.a(jb.a($$0.p()));
   }

   @Override
   public czk dH() {
      czk $$0 = this.w();
      return $$0.f() ? this.t() : $$0.v();
   }

   protected czk t() {
      return new czk(czo.vm);
   }

   @Override
   public float dL() {
      jb $$0 = this.cN();
      int $$1 = $$0.o().b() ? 90 * $$0.f().a() : 0;
      return (float)azm.b(180 + $$0.e() * 90 + this.y() * 45 + $$1);
   }
}
