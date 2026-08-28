import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;

public class ckv extends cku {
   private static final akm<cwm> e = akq.a(ckv.class, ako.h);
   private static final akm<Integer> f = akq.a(ckv.class, ako.b);
   public static final int d = 8;
   private static final float g = 0.0625F;
   private static final float h = 0.75F;
   private static final float i = 0.75F;
   private float j = 1.0F;
   private boolean k;

   public ckv(bus<? extends ckv> $$0, dfm $$1) {
      super($$0, $$1);
   }

   public ckv(dfm $$0, jh $$1, jm $$2) {
      this(bus.ar, $$0, $$1, $$2);
   }

   public ckv(bus<? extends ckv> $$0, dfm $$1, jh $$2, jm $$3) {
      super($$0, $$1, $$2);
      this.a($$3);
   }

   @Override
   protected void a(akq.a $$0) {
      $$0.a(e, cwm.k);
      $$0.a(f, 0);
   }

   @Override
   protected void a(jm $$0) {
      Validate.notNull($$0);
      this.c = $$0;
      if ($$0.o().d()) {
         this.w(0.0F);
         this.v((float)(this.c.e() * 90));
      } else {
         this.w((float)(-90 * $$0.f().a()));
         this.v(0.0F);
      }

      this.O = this.dN();
      this.N = this.dL();
      this.j();
   }

   @Override
   protected ezt a(jh $$0, jm $$1) {
      float $$2 = 0.46875F;
      ezy $$3 = ezy.b($$0).a($$1, -0.46875);
      jm.a $$4 = $$1.o();
      double $$5 = $$4 == jm.a.a ? 0.0625 : 0.75;
      double $$6 = $$4 == jm.a.b ? 0.0625 : 0.75;
      double $$7 = $$4 == jm.a.c ? 0.0625 : 0.75;
      return ezt.a($$3, $$5, $$6, $$7);
   }

   @Override
   public boolean l() {
      if (this.k) {
         return true;
      } else if (!this.dV().g(this)) {
         return false;
      } else {
         dvv $$0 = this.dV().a_(this.a.a(this.c.g()));
         return $$0.e() || this.c.o().d() && dks.n($$0) ? this.dV().a(this, this.cR(), b).isEmpty() : false;
      }
   }

   @Override
   public void a(bvl $$0, ezy $$1) {
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
   public void c(arp $$0) {
      this.c(this.z());
      super.c($$0);
   }

   private boolean a(btb $$0) {
      return !$$0.a(axe.l) && !this.z().f();
   }

   private static boolean e(btb $$0) {
      return $$0.a(axe.d) || $$0.h();
   }

   @Override
   public boolean b(btb $$0) {
      return this.k && !e($$0) ? false : !this.d($$0);
   }

   @Override
   public boolean a(arp $$0, btb $$1, float $$2) {
      if (!this.k) {
         if (this.d($$1)) {
            return false;
         } else if (this.a($$1)) {
            this.a($$0, $$1.d(), false);
            this.a(ear.c, $$1.d());
            this.a(this.q(), 1.0F, 1.0F);
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      } else {
         return e($$1) && super.a($$0, $$1, $$2);
      }
   }

   public awm q() {
      return awn.ny;
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = 16.0;
      $$1 *= 64.0 * cK();
      return $$0 < $$1 * $$1;
   }

   @Override
   public void a(arp $$0, @Nullable bul $$1) {
      this.a(this.s(), 1.0F, 1.0F);
      this.a($$0, $$1, true);
      this.a(ear.c, $$1);
   }

   public awm s() {
      return awn.nw;
   }

   @Override
   public void y() {
      this.a(this.t(), 1.0F, 1.0F);
   }

   public awm t() {
      return awn.nx;
   }

   private void a(arp $$0, @Nullable bul $$1, boolean $$2) {
      if (!this.k) {
         cwm $$3 = this.z();
         this.b(cwm.k);
         if (!$$0.N().b(dfi.i)) {
            if ($$1 == null) {
               this.c($$3);
            }
         } else {
            if ($$1 instanceof cou $$4 && $$4.fT()) {
               this.c($$3);
               return;
            }

            if ($$2) {
               this.a($$0, this.w());
            }

            if (!$$3.f()) {
               $$3 = $$3.v();
               this.c($$3);
               if (this.ae.i() < this.j) {
                  this.a($$0, $$3);
               }
            }
         }
      }
   }

   private void c(cwm $$0) {
      etn $$1 = this.a($$0);
      if ($$1 != null) {
         etp $$2 = cwz.a($$1, this.dV());
         if ($$2 != null) {
            $$2.a(this.a, this.ar());
         }
      }

      $$0.a(null);
   }

   public cwm z() {
      return this.au().a(e);
   }

   @Nullable
   public etn a(cwm $$0) {
      return $$0.a(ku.L);
   }

   public boolean A() {
      return this.z().b(ku.L);
   }

   public void b(cwm $$0) {
      this.a($$0, true);
   }

   public void a(cwm $$0, boolean $$1) {
      if (!$$0.f()) {
         $$0 = $$0.c(1);
      }

      this.d($$0);
      this.au().a(e, $$0);
      if (!$$0.f()) {
         this.a(this.u(), 1.0F, 1.0F);
      }

      if ($$1 && this.a != null) {
         this.dV().c(this.a, dis.a);
      }
   }

   public awm u() {
      return awn.nv;
   }

   @Override
   public bvz a_(int $$0) {
      return $$0 == 0 ? bvz.a(this::z, this::b) : super.a_($$0);
   }

   @Override
   public void a(akm<?> $$0) {
      if ($$0.equals(e)) {
         this.d(this.z());
      }
   }

   private void d(cwm $$0) {
      if (!$$0.f() && $$0.H() != this) {
         $$0.a(this);
      }

      this.j();
   }

   public int B() {
      return this.au().a(f);
   }

   public void b(int $$0) {
      this.a($$0, true);
   }

   private void a(int $$0, boolean $$1) {
      this.au().a(f, $$0 % 8);
      if ($$1 && this.a != null) {
         this.dV().c(this.a, dis.a);
      }
   }

   @Override
   public void b(ul $$0) {
      super.b($$0);
      if (!this.z().f()) {
         $$0.a("Item", this.z().a(this.dX()));
         $$0.a("ItemRotation", (byte)this.B());
         $$0.a("ItemDropChance", this.j);
      }

      $$0.a("Facing", (byte)this.c.d());
      $$0.a("Invisible", this.cp());
      $$0.a("Fixed", this.k);
   }

   @Override
   public void a(ul $$0) {
      super.a($$0);
      cwm $$2;
      if ($$0.b("Item", 10)) {
         ul $$1 = $$0.p("Item");
         $$2 = cwm.a(this.dX(), (vi)$$1).orElse(cwm.k);
      } else {
         $$2 = cwm.k;
      }

      cwm $$4 = this.z();
      if (!$$4.f() && !cwm.a($$2, $$4)) {
         this.c($$4);
      }

      this.a($$2, false);
      if (!$$2.f()) {
         this.a($$0.f("ItemRotation"), false);
         if ($$0.b("ItemDropChance", 99)) {
            this.j = $$0.j("ItemDropChance");
         }
      }

      this.a(jm.a($$0.f("Facing")));
      this.k($$0.q("Invisible"));
      this.k = $$0.q("Fixed");
   }

   @Override
   public bsk a(cou $$0, bsj $$1) {
      cwm $$2 = $$0.b($$1);
      boolean $$3 = !this.z().f();
      boolean $$4 = !$$2.f();
      if (this.k) {
         return bsk.e;
      } else if (!$$0.dV().C) {
         if (!$$3) {
            if ($$4 && !this.dQ()) {
               etp $$5 = cwz.b($$2, this.dV());
               if ($$5 != null && $$5.a(256)) {
                  return bsk.d;
               } else {
                  this.b($$2);
                  this.a(ear.c, $$0);
                  $$2.a(1, $$0);
                  return bsk.a;
               }
            } else {
               return bsk.e;
            }
         } else {
            this.a(this.v(), 1.0F, 1.0F);
            this.b(this.B() + 1);
            this.a(ear.c, $$0);
            return bsk.a;
         }
      } else {
         return (bsk)(!$$3 && !$$4 ? bsk.e : bsk.a);
      }
   }

   public awm v() {
      return awn.nz;
   }

   public int C() {
      return this.z().f() ? 0 : this.B() % 8 + 1;
   }

   @Override
   public zq<acf> a(arn $$0) {
      return new acg(this, this.c.d(), this.n());
   }

   @Override
   public void a(acg $$0) {
      super.a($$0);
      this.a(jm.a($$0.p()));
   }

   @Override
   public cwm dI() {
      cwm $$0 = this.z();
      return $$0.f() ? this.w() : $$0.v();
   }

   protected cwm w() {
      return new cwm(cwq.uu);
   }

   @Override
   public float dM() {
      jm $$0 = this.cO();
      int $$1 = $$0.o().b() ? 90 * $$0.f().a() : 0;
      return (float)azm.b(180 + $$0.e() * 90 + this.B() * 45 + $$1);
   }
}
