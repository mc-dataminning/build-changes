import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;

public class cmg extends cmf {
   private static final akg<cxy> e = akk.a(cmg.class, aki.h);
   private static final akg<Integer> f = akk.a(cmg.class, aki.b);
   public static final int d = 8;
   private static final float g = 0.0625F;
   private static final float h = 0.75F;
   private static final float i = 0.75F;
   private float j = 1.0F;
   private boolean k;

   public cmg(bwb<? extends cmg> $$0, dhp $$1) {
      super($$0, $$1);
   }

   public cmg(dhp $$0, jj $$1, jo $$2) {
      this(bwb.as, $$0, $$1, $$2);
   }

   public cmg(bwb<? extends cmg> $$0, dhp $$1, jj $$2, jo $$3) {
      super($$0, $$1, $$2);
      this.a($$3);
   }

   @Override
   protected void a(akk.a $$0) {
      $$0.a(e, cxy.k);
      $$0.a(f, 0);
   }

   @Override
   protected void a(jo $$0) {
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
   protected fcp a(jj $$0, jo $$1) {
      float $$2 = 0.46875F;
      fcu $$3 = fcu.b($$0).a($$1, -0.46875);
      jo.a $$4 = $$1.o();
      double $$5 = $$4 == jo.a.a ? 0.0625 : 0.75;
      double $$6 = $$4 == jo.a.b ? 0.0625 : 0.75;
      double $$7 = $$4 == jo.a.c ? 0.0625 : 0.75;
      return fcp.a($$3, $$5, $$6, $$7);
   }

   @Override
   public boolean g() {
      if (this.k) {
         return true;
      } else if (!this.dV().g(this)) {
         return false;
      } else {
         dym $$0 = this.dV().a_(this.a.a(this.c.g()));
         return $$0.e() || this.c.o().d() && dmx.n($$0) ? this.dV().a(this, this.cR(), b).isEmpty() : false;
      }
   }

   @Override
   public void a(bwv $$0, fcu $$1) {
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
   public void c(arn $$0) {
      this.d(this.w());
      super.c($$0);
   }

   private boolean a(buh $$0) {
      return !$$0.a(axb.l) && !this.w().f();
   }

   private static boolean e(buh $$0) {
      return $$0.a(axb.d) || $$0.h();
   }

   @Override
   public boolean b(buh $$0) {
      return this.k && !e($$0) ? false : !this.d($$0);
   }

   @Override
   public boolean a(arn $$0, buh $$1, float $$2) {
      if (!this.k) {
         if (this.d($$1)) {
            return false;
         } else if (this.a($$1)) {
            this.a($$0, $$1.d(), false);
            this.a(edm.c, $$1.d());
            this.a(this.m(), 1.0F, 1.0F);
            return true;
         } else {
            return super.a($$0, $$1, $$2);
         }
      } else {
         return e($$1) && super.a($$0, $$1, $$2);
      }
   }

   public awj m() {
      return awk.oc;
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = 16.0;
      $$1 *= 64.0 * cK();
      return $$0 < $$1 * $$1;
   }

   @Override
   public void a(arn $$0, @Nullable bvs $$1) {
      this.a(this.n(), 1.0F, 1.0F);
      this.a($$0, $$1, true);
      this.a(edm.c, $$1);
   }

   public awj n() {
      return awk.oa;
   }

   @Override
   public void v() {
      this.a(this.o(), 1.0F, 1.0F);
   }

   public awj o() {
      return awk.ob;
   }

   private void a(arn $$0, @Nullable bvs $$1, boolean $$2) {
      if (!this.k) {
         cxy $$3 = this.w();
         this.b(cxy.k);
         if (!$$0.O().c(dhl.i)) {
            if ($$1 == null) {
               this.d($$3);
            }
         } else {
            if ($$1 instanceof cqi $$4 && $$4.fU()) {
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

   private void d(cxy $$0) {
      ewl $$1 = this.a($$0);
      if ($$1 != null) {
         ewn $$2 = cyl.a($$1, this.dV());
         if ($$2 != null) {
            $$2.a(this.a, this.ar());
         }
      }

      $$0.a(null);
   }

   public cxy w() {
      return this.au().a(e);
   }

   @Nullable
   public ewl a(cxy $$0) {
      return $$0.a(kx.M);
   }

   public boolean x() {
      return this.w().c(kx.M);
   }

   public void b(cxy $$0) {
      this.a($$0, true);
   }

   public void a(cxy $$0, boolean $$1) {
      if (!$$0.f()) {
         $$0 = $$0.c(1);
      }

      this.e($$0);
      this.au().a(e, $$0);
      if (!$$0.f()) {
         this.a(this.q(), 1.0F, 1.0F);
      }

      if ($$1 && this.a != null) {
         this.dV().b(this.a, dkw.a);
      }
   }

   public awj q() {
      return awk.nZ;
   }

   @Override
   public bxi a_(int $$0) {
      return $$0 == 0 ? bxi.a(this::w, this::b) : super.a_($$0);
   }

   @Override
   public void a(akg<?> $$0) {
      if ($$0.equals(e)) {
         this.e(this.w());
      }
   }

   private void e(cxy $$0) {
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
         this.dV().b(this.a, dkw.a);
      }
   }

   @Override
   public void b(tw $$0) {
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
   public void a(tw $$0) {
      super.a($$0);
      cxy $$2;
      if ($$0.b("Item", 10)) {
         tw $$1 = $$0.p("Item");
         $$2 = cxy.a(this.dX(), (ut)$$1).orElse(cxy.k);
      } else {
         $$2 = cxy.k;
      }

      cxy $$4 = this.w();
      if (!$$4.f() && !cxy.a($$2, $$4)) {
         this.d($$4);
      }

      this.a($$2, false);
      if (!$$2.f()) {
         this.a($$0.f("ItemRotation"), false);
         if ($$0.b("ItemDropChance", 99)) {
            this.j = $$0.j("ItemDropChance");
         }
      }

      this.a(jo.a($$0.f("Facing")));
      this.k($$0.q("Invisible"));
      this.k = $$0.q("Fixed");
   }

   @Override
   public btq a(cqi $$0, btp $$1) {
      cxy $$2 = $$0.b($$1);
      boolean $$3 = !this.w().f();
      boolean $$4 = !$$2.f();
      if (this.k) {
         return btq.e;
      } else if (!$$0.dV().C) {
         if (!$$3) {
            if ($$4 && !this.dQ()) {
               ewn $$5 = cyl.b($$2, this.dV());
               if ($$5 != null && $$5.a(256)) {
                  return btq.d;
               } else {
                  this.b($$2);
                  this.a(edm.c, $$0);
                  $$2.a(1, $$0);
                  return btq.a;
               }
            } else {
               return btq.e;
            }
         } else {
            this.a(this.s(), 1.0F, 1.0F);
            this.b(this.y() + 1);
            this.a(edm.c, $$0);
            return btq.a;
         }
      } else {
         return (btq)(!$$3 && !$$4 ? btq.e : btq.a);
      }
   }

   public awj s() {
      return awk.od;
   }

   public int z() {
      return this.w().f() ? 0 : this.y() % 8 + 1;
   }

   @Override
   public zc<abr> a(arl $$0) {
      return new abs(this, this.c.d(), this.j());
   }

   @Override
   public void a(abs $$0) {
      super.a($$0);
      this.a(jo.a($$0.p()));
   }

   @Override
   public cxy dI() {
      cxy $$0 = this.w();
      return $$0.f() ? this.t() : $$0.v();
   }

   protected cxy t() {
      return new cxy(cyc.vf);
   }

   @Override
   public float dM() {
      jo $$0 = this.cO();
      int $$1 = $$0.o().b() ? 90 * $$0.f().a() : 0;
      return (float)azk.b(180 + $$0.e() * 90 + this.y() * 45 + $$1);
   }
}
