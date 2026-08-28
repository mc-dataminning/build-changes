import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;

public class cko extends ckn {
   private static final akl<cwb> f = akp.a(cko.class, akn.h);
   private static final akl<Integer> g = akp.a(cko.class, akn.b);
   public static final int e = 8;
   private static final float h = 0.0625F;
   private static final float i = 0.75F;
   private static final float j = 0.75F;
   private float k = 1.0F;
   private boolean l;

   public cko(bul<? extends cko> $$0, dfb $$1) {
      super($$0, $$1);
   }

   public cko(dfb $$0, jh $$1, jm $$2) {
      this(bul.ai, $$0, $$1, $$2);
   }

   public cko(bul<? extends cko> $$0, dfb $$1, jh $$2, jm $$3) {
      super($$0, $$1, $$2);
      this.a($$3);
   }

   @Override
   protected void a(akp.a $$0) {
      $$0.a(f, cwb.k);
      $$0.a(g, 0);
   }

   @Override
   protected void a(jm $$0) {
      Validate.notNull($$0);
      this.d = $$0;
      if ($$0.o().d()) {
         this.w(0.0F);
         this.v((float)(this.d.e() * 90));
      } else {
         this.w((float)(-90 * $$0.f().a()));
         this.v(0.0F);
      }

      this.P = this.dP();
      this.O = this.dN();
      this.m();
   }

   @Override
   protected ezi a(jh $$0, jm $$1) {
      float $$2 = 0.46875F;
      ezn $$3 = ezn.b($$0).a($$1, -0.46875);
      jm.a $$4 = $$1.o();
      double $$5 = $$4 == jm.a.a ? 0.0625 : 0.75;
      double $$6 = $$4 == jm.a.b ? 0.0625 : 0.75;
      double $$7 = $$4 == jm.a.c ? 0.0625 : 0.75;
      return ezi.a($$3, $$5, $$6, $$7);
   }

   @Override
   public boolean o() {
      if (this.l) {
         return true;
      } else if (!this.dX().g(this)) {
         return false;
      } else {
         dvj $$0 = this.dX().a_(this.b.a(this.d.g()));
         return $$0.e() || this.d.o().d() && dkg.n($$0) ? this.dX().a(this, this.cS(), c).isEmpty() : false;
      }
   }

   @Override
   public void a(bve $$0, ezn $$1) {
      if (!this.l) {
         super.a($$0, $$1);
      }
   }

   @Override
   public void j(double $$0, double $$1, double $$2) {
      if (!this.l) {
         super.j($$0, $$1, $$2);
      }
   }

   @Override
   public void au() {
      this.d(this.C());
      super.au();
   }

   @Override
   public boolean a(bsu $$0, float $$1) {
      if (this.l) {
         return !$$0.a(axc.d) && !$$0.h() ? false : super.a($$0, $$1);
      } else if (this.b($$0)) {
         return false;
      } else if (!$$0.a(axc.l) && !this.C().f()) {
         if (!this.dX().C) {
            this.b($$0.d(), false);
            this.a(eag.c, $$0.d());
            this.a(this.t(), 1.0F, 1.0F);
         }

         return true;
      } else {
         return super.a($$0, $$1);
      }
   }

   public awk t() {
      return awl.ny;
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = 16.0;
      $$1 *= 64.0 * cL();
      return $$0 < $$1 * $$1;
   }

   @Override
   public void b(@Nullable bue $$0) {
      this.a(this.v(), 1.0F, 1.0F);
      this.b($$0, true);
      this.a(eag.c, $$0);
   }

   public awk v() {
      return awl.nw;
   }

   @Override
   public void B() {
      this.a(this.w(), 1.0F, 1.0F);
   }

   public awk w() {
      return awl.nx;
   }

   private void b(@Nullable bue $$0, boolean $$1) {
      if (!this.l) {
         cwb $$2 = this.C();
         this.c(cwb.k);
         if (!this.dX().ac().b(dex.i)) {
            if ($$0 == null) {
               this.d($$2);
            }
         } else {
            if ($$0 instanceof com $$3 && $$3.fX()) {
               this.d($$2);
               return;
            }

            if ($$1) {
               this.b(this.z());
            }

            if (!$$2.f()) {
               $$2 = $$2.v();
               this.d($$2);
               if (this.af.i() < this.k) {
                  this.b($$2);
               }
            }
         }
      }
   }

   private void d(cwb $$0) {
      etc $$1 = this.a($$0);
      if ($$1 != null) {
         ete $$2 = cwo.a($$1, this.dX());
         if ($$2 != null) {
            $$2.a(this.b, this.as());
         }
      }

      $$0.a(null);
   }

   public cwb C() {
      return this.aw().a(f);
   }

   @Nullable
   public etc a(cwb $$0) {
      return $$0.a(ku.L);
   }

   public boolean D() {
      return this.C().b(ku.L);
   }

   public void c(cwb $$0) {
      this.a($$0, true);
   }

   public void a(cwb $$0, boolean $$1) {
      if (!$$0.f()) {
         $$0 = $$0.c(1);
      }

      this.e($$0);
      this.aw().a(f, $$0);
      if (!$$0.f()) {
         this.a(this.x(), 1.0F, 1.0F);
      }

      if ($$1 && this.b != null) {
         this.dX().c(this.b, dig.a);
      }
   }

   public awk x() {
      return awl.nv;
   }

   @Override
   public bvs a_(int $$0) {
      return $$0 == 0 ? bvs.a(this::C, this::c) : super.a_($$0);
   }

   @Override
   public void a(akl<?> $$0) {
      if ($$0.equals(f)) {
         this.e(this.C());
      }
   }

   private void e(cwb $$0) {
      if (!$$0.f() && $$0.H() != this) {
         $$0.a(this);
      }

      this.m();
   }

   public int E() {
      return this.aw().a(g);
   }

   public void b(int $$0) {
      this.a($$0, true);
   }

   private void a(int $$0, boolean $$1) {
      this.aw().a(g, $$0 % 8);
      if ($$1 && this.b != null) {
         this.dX().c(this.b, dig.a);
      }
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      if (!this.C().f()) {
         $$0.a("Item", this.C().a(this.dZ()));
         $$0.a("ItemRotation", (byte)this.E());
         $$0.a("ItemDropChance", this.k);
      }

      $$0.a("Facing", (byte)this.d.d());
      $$0.a("Invisible", this.cq());
      $$0.a("Fixed", this.l);
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      cwb $$2;
      if ($$0.b("Item", 10)) {
         uk $$1 = $$0.p("Item");
         $$2 = cwb.a(this.dZ(), (vh)$$1).orElse(cwb.k);
      } else {
         $$2 = cwb.k;
      }

      cwb $$4 = this.C();
      if (!$$4.f() && !cwb.a($$2, $$4)) {
         this.d($$4);
      }

      this.a($$2, false);
      if (!$$2.f()) {
         this.a($$0.f("ItemRotation"), false);
         if ($$0.b("ItemDropChance", 99)) {
            this.k = $$0.j("ItemDropChance");
         }
      }

      this.a(jm.a($$0.f("Facing")));
      this.k($$0.q("Invisible"));
      this.l = $$0.q("Fixed");
   }

   @Override
   public bsd a(com $$0, bsc $$1) {
      cwb $$2 = $$0.b($$1);
      boolean $$3 = !this.C().f();
      boolean $$4 = !$$2.f();
      if (this.l) {
         return bsd.e;
      } else if (!$$0.dX().C) {
         if (!$$3) {
            if ($$4 && !this.dS()) {
               ete $$5 = cwo.b($$2, this.dX());
               if ($$5 != null && $$5.a(256)) {
                  return bsd.d;
               } else {
                  this.c($$2);
                  this.a(eag.c, $$0);
                  $$2.a(1, $$0);
                  return bsd.a;
               }
            } else {
               return bsd.e;
            }
         } else {
            this.a(this.y(), 1.0F, 1.0F);
            this.b(this.E() + 1);
            this.a(eag.c, $$0);
            return bsd.a;
         }
      } else {
         return (bsd)(!$$3 && !$$4 ? bsd.e : bsd.a);
      }
   }

   public awk y() {
      return awl.nz;
   }

   public int F() {
      return this.C().f() ? 0 : this.E() % 8 + 1;
   }

   @Override
   public zp<ace> a(arm $$0) {
      return new acf(this, this.d.d(), this.q());
   }

   @Override
   public void a(acf $$0) {
      super.a($$0);
      this.a(jm.a($$0.p()));
   }

   @Override
   public cwb dK() {
      cwb $$0 = this.C();
      return $$0.f() ? this.z() : $$0.v();
   }

   protected cwb z() {
      return new cwb(cwf.ue);
   }

   @Override
   public float dO() {
      jm $$0 = this.cP();
      int $$1 = $$0.o().b() ? 90 * $$0.f().a() : 0;
      return (float)azk.b(180 + $$0.e() * 90 + this.E() * 45 + $$1);
   }
}
