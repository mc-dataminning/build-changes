import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;

public class cgo extends cgn {
   private static final Logger f = LogUtils.getLogger();
   private static final ajk<csd> g = ajo.a(cgo.class, ajm.h);
   private static final ajk<Integer> h = ajo.a(cgo.class, ajm.b);
   public static final int e = 8;
   private float i = 1.0F;
   private boolean j;

   public cgo(bqr<? extends cgo> $$0, czu $$1) {
      super($$0, $$1);
   }

   public cgo(czu $$0, im $$1, ir $$2) {
      this(bqr.ai, $$0, $$1, $$2);
   }

   public cgo(bqr<? extends cgo> $$0, czu $$1, im $$2, ir $$3) {
      super($$0, $$1, $$2);
      this.a($$3);
   }

   @Override
   protected void a(ajo.a $$0) {
      $$0.a(g, csd.i);
      $$0.a(h, 0);
   }

   @Override
   protected void a(ir $$0) {
      Validate.notNull($$0);
      this.d = $$0;
      if ($$0.o().d()) {
         this.s(0.0F);
         this.r((float)(this.d.e() * 90));
      } else {
         this.s((float)(-90 * $$0.f().a()));
         this.r(0.0F);
      }

      this.P = this.dF();
      this.O = this.dD();
      this.y();
   }

   @Override
   protected void y() {
      if (this.d != null) {
         double $$0 = 0.46875;
         double $$1 = (double)this.c.u() + 0.5 - (double)this.d.j() * 0.46875;
         double $$2 = (double)this.c.v() + 0.5 - (double)this.d.k() * 0.46875;
         double $$3 = (double)this.c.w() + 0.5 - (double)this.d.l() * 0.46875;
         this.p($$1, $$2, $$3);
         double $$4 = (double)this.A();
         double $$5 = (double)this.B();
         double $$6 = (double)this.A();
         ir.a $$7 = this.d.o();
         switch ($$7) {
            case a:
               $$4 = 1.0;
               break;
            case b:
               $$5 = 1.0;
               break;
            case c:
               $$6 = 1.0;
         }

         $$4 /= 32.0;
         $$5 /= 32.0;
         $$6 /= 32.0;
         this.a(new eta($$1 - $$4, $$2 - $$5, $$3 - $$6, $$1 + $$4, $$2 + $$5, $$3 + $$6));
      }
   }

   @Override
   public boolean z() {
      if (this.j) {
         return true;
      } else if (!this.dN().g(this)) {
         return false;
      } else {
         dpy $$0 = this.dN().a_(this.c.a(this.d.g()));
         return $$0.e() || this.d.o().d() && dex.m($$0) ? this.dN().a(this, this.cI(), b).isEmpty() : false;
      }
   }

   @Override
   public void a(brj $$0, etf $$1) {
      if (!this.j) {
         super.a($$0, $$1);
      }
   }

   @Override
   public void j(double $$0, double $$1, double $$2) {
      if (!this.j) {
         super.j($$0, $$1, $$2);
      }
   }

   @Override
   public void al() {
      this.c(this.E());
      super.al();
   }

   @Override
   public boolean a(bpj $$0, float $$1) {
      if (this.j) {
         return !$$0.a(avq.e) && !$$0.g() ? false : super.a($$0, $$1);
      } else if (this.b($$0)) {
         return false;
      } else if (!$$0.a(avq.m) && !this.E().d()) {
         if (!this.dN().B) {
            this.b($$0.d(), false);
            this.a(dur.c, $$0.d());
            this.a(this.p(), 1.0F, 1.0F);
         }

         return true;
      } else {
         return super.a($$0, $$1);
      }
   }

   public auy p() {
      return auz.np;
   }

   @Override
   public int A() {
      return 12;
   }

   @Override
   public int B() {
      return 12;
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = 16.0;
      $$1 *= 64.0 * cB();
      return $$0 < $$1 * $$1;
   }

   @Override
   public void b(@Nullable bql $$0) {
      this.a(this.r(), 1.0F, 1.0F);
      this.b($$0, true);
      this.a(dur.c, $$0);
   }

   public auy r() {
      return auz.nn;
   }

   @Override
   public void C() {
      this.a(this.u(), 1.0F, 1.0F);
   }

   public auy u() {
      return auz.no;
   }

   private void b(@Nullable bql $$0, boolean $$1) {
      if (!this.j) {
         csd $$2 = this.E();
         this.a(csd.i);
         if (!this.dN().aa().b(czq.i)) {
            if ($$0 == null) {
               this.c($$2);
            }
         } else {
            if ($$0 instanceof ckl $$3 && $$3.fN()) {
               this.c($$2);
               return;
            }

            if ($$1) {
               this.b(this.x());
            }

            if (!$$2.d()) {
               $$2 = $$2.r();
               this.c($$2);
               if (this.ah.i() < this.i) {
                  this.b($$2);
               }
            }
         }
      }
   }

   private void c(csd $$0) {
      enc $$1 = this.G();
      if ($$1 != null) {
         ene $$2 = csl.a($$1, this.dN());
         if ($$2 != null) {
            $$2.a(this.c, this.aj());
            $$2.a(true);
         }
      }

      $$0.a(null);
   }

   public csd E() {
      return this.an().a(g);
   }

   @Nullable
   public enc G() {
      return this.E().a(jz.s);
   }

   public boolean H() {
      return this.E().b(jz.s);
   }

   public void a(csd $$0) {
      this.a($$0, true);
   }

   public void a(csd $$0, boolean $$1) {
      if (!$$0.d()) {
         $$0 = $$0.c(1);
      }

      this.d($$0);
      this.an().a(g, $$0);
      if (!$$0.d()) {
         this.a(this.v(), 1.0F, 1.0F);
      }

      if ($$1 && this.c != null) {
         this.dN().c(this.c, dcx.a);
      }
   }

   public auy v() {
      return auz.nm;
   }

   @Override
   public brv a_(int $$0) {
      return $$0 == 0 ? new brv() {
         @Override
         public csd a() {
            return cgo.this.E();
         }

         @Override
         public boolean a(csd $$0) {
            cgo.this.a($$0);
            return true;
         }
      } : super.a_($$0);
   }

   @Override
   public void a(ajk<?> $$0) {
      if ($$0.equals(g)) {
         this.d(this.E());
      }
   }

   private void d(csd $$0) {
      if (!$$0.d() && $$0.C() != this) {
         $$0.a(this);
      }

      this.y();
   }

   public int I() {
      return this.an().a(h);
   }

   public void b(int $$0) {
      this.a($$0, true);
   }

   private void a(int $$0, boolean $$1) {
      this.an().a(h, $$0 % 8);
      if ($$1 && this.c != null) {
         this.dN().c(this.c, dcx.a);
      }
   }

   @Override
   public void b(ty $$0) {
      super.b($$0);
      if (!this.E().d()) {
         $$0.a("Item", this.E().a(this.dP()));
         $$0.a("ItemRotation", (byte)this.I());
         $$0.a("ItemDropChance", this.i);
      }

      $$0.a("Facing", (byte)this.d.d());
      $$0.a("Invisible", this.cf());
      $$0.a("Fixed", this.j);
   }

   @Override
   public void a(ty $$0) {
      super.a($$0);
      csd $$2;
      if ($$0.b("Item", 10)) {
         ty $$1 = $$0.p("Item");
         $$2 = csd.a(this.dP(), (uv)$$1).orElse(csd.i);
      } else {
         $$2 = csd.i;
      }

      csd $$4 = this.E();
      if (!$$4.d() && !csd.a($$2, $$4)) {
         this.c($$4);
      }

      this.a($$2, false);
      if (!$$2.d()) {
         this.a($$0.f("ItemRotation"), false);
         if ($$0.b("ItemDropChance", 99)) {
            this.i = $$0.j("ItemDropChance");
         }
      }

      this.a(ir.a($$0.f("Facing")));
      this.k($$0.q("Invisible"));
      this.j = $$0.q("Fixed");
   }

   @Override
   public boq a(ckl $$0, bop $$1) {
      csd $$2 = $$0.b($$1);
      boolean $$3 = !this.E().d();
      boolean $$4 = !$$2.d();
      if (this.j) {
         return boq.d;
      } else if (!this.dN().B) {
         if (!$$3) {
            if ($$4 && !this.dI()) {
               if ($$2.a(csg.rU)) {
                  ene $$5 = csl.b($$2, this.dN());
                  if ($$5 != null && $$5.a(256)) {
                     return boq.e;
                  }
               }

               this.a($$2);
               this.a(dur.c, $$0);
               $$2.a(1, $$0);
            }
         } else {
            this.a(this.w(), 1.0F, 1.0F);
            this.b(this.I() + 1);
            this.a(dur.c, $$0);
         }

         return boq.b;
      } else {
         return !$$3 && !$$4 ? boq.d : boq.a;
      }
   }

   public auy w() {
      return auz.nq;
   }

   public int J() {
      return this.E().d() ? 0 : this.I() % 8 + 1;
   }

   @Override
   public yz<abk> dj() {
      return new abl(this, this.d.d(), this.D());
   }

   @Override
   public void a(abl $$0) {
      super.a($$0);
      this.a(ir.a($$0.p()));
   }

   @Override
   public csd dA() {
      csd $$0 = this.E();
      return $$0.d() ? this.x() : $$0.r();
   }

   protected csd x() {
      return new csd(csg.uc);
   }

   @Override
   public float dE() {
      ir $$0 = this.cF();
      int $$1 = $$0.o().b() ? 90 * $$0.f().a() : 0;
      return (float)axw.b(180 + $$0.e() * 90 + this.I() * 45 + $$1);
   }
}
