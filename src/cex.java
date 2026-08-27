import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;

public class cex extends cew {
   private static final Logger f = LogUtils.getLogger();
   private static final aim<cqm> g = aiq.a(cex.class, aio.h);
   private static final aim<Integer> h = aiq.a(cex.class, aio.b);
   public static final int e = 8;
   private float i = 1.0F;
   private boolean j;

   public cex(bpd<? extends cex> $$0, cxb $$1) {
      super($$0, $$1);
   }

   public cex(cxb $$0, ib $$1, ih $$2) {
      this(bpd.aj, $$0, $$1, $$2);
   }

   public cex(bpd<? extends cex> $$0, cxb $$1, ib $$2, ih $$3) {
      super($$0, $$1, $$2);
      this.a($$3);
   }

   @Override
   protected void a(aiq.a $$0) {
      $$0.a(g, cqm.h);
      $$0.a(h, 0);
   }

   @Override
   protected void a(ih $$0) {
      Validate.notNull($$0);
      this.d = $$0;
      if ($$0.o().d()) {
         this.s(0.0F);
         this.r((float)(this.d.e() * 90));
      } else {
         this.s((float)(-90 * $$0.f().a()));
         this.r(0.0F);
      }

      this.O = this.dE();
      this.N = this.dC();
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
         ih.a $$7 = this.d.o();
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
         this.a(new epo($$1 - $$4, $$2 - $$5, $$3 - $$6, $$1 + $$4, $$2 + $$5, $$3 + $$6));
      }
   }

   @Override
   public boolean z() {
      if (this.j) {
         return true;
      } else if (!this.dM().g(this)) {
         return false;
      } else {
         dnb $$0 = this.dM().a_(this.c.a(this.d.g()));
         return $$0.e() || this.d.o().d() && dce.m($$0) ? this.dM().a(this, this.cH(), b).isEmpty() : false;
      }
   }

   @Override
   public void a(bpu $$0, ept $$1) {
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
   public boolean a(bnw $$0, float $$1) {
      if (this.j) {
         return !$$0.a(aup.e) && !$$0.g() ? false : super.a($$0, $$1);
      } else if (this.b($$0)) {
         return false;
      } else if (!$$0.a(aup.m) && !this.E().b()) {
         if (!this.dM().B) {
            this.b($$0.d(), false);
            this.a(drp.c, $$0.d());
            this.a(this.p(), 1.0F, 1.0F);
         }

         return true;
      } else {
         return super.a($$0, $$1);
      }
   }

   public atx p() {
      return aty.ni;
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
      $$1 *= 64.0 * cA();
      return $$0 < $$1 * $$1;
   }

   @Override
   public void b(@Nullable box $$0) {
      this.a(this.r(), 1.0F, 1.0F);
      this.b($$0, true);
      this.a(drp.c, $$0);
   }

   public atx r() {
      return aty.ng;
   }

   @Override
   public void C() {
      this.a(this.s(), 1.0F, 1.0F);
   }

   public atx s() {
      return aty.nh;
   }

   private void b(@Nullable box $$0, boolean $$1) {
      if (!this.j) {
         cqm $$2 = this.E();
         this.a(cqm.h);
         if (!this.dM().Z().b(cwx.i)) {
            if ($$0 == null) {
               this.c($$2);
            }
         } else {
            if ($$0 instanceof ciu $$3 && $$3.fM()) {
               this.c($$2);
               return;
            }

            if ($$1) {
               this.b(this.x());
            }

            if (!$$2.b()) {
               $$2 = $$2.q();
               this.c($$2);
               if (this.ag.i() < this.i) {
                  this.b($$2);
               }
            }
         }
      }
   }

   private void c(cqm $$0) {
      ejy $$1 = this.G();
      if ($$1 != null) {
         eka $$2 = cqt.a($$1, this.dM());
         if ($$2 != null) {
            $$2.a(this.c, this.aj());
            $$2.a(true);
         }
      }

      $$0.a(null);
   }

   public cqm E() {
      return this.an().a(g);
   }

   @Nullable
   public ejy G() {
      return cqt.d(this.E());
   }

   public boolean H() {
      return this.G() != null;
   }

   public void a(cqm $$0) {
      this.a($$0, true);
   }

   public void a(cqm $$0, boolean $$1) {
      if (!$$0.b()) {
         $$0 = $$0.c(1);
      }

      this.d($$0);
      this.an().a(g, $$0);
      if (!$$0.b()) {
         this.a(this.v(), 1.0F, 1.0F);
      }

      if ($$1 && this.c != null) {
         this.dM().c(this.c, dae.a);
      }
   }

   public atx v() {
      return aty.nf;
   }

   @Override
   public bqg a_(int $$0) {
      return $$0 == 0 ? new bqg() {
         @Override
         public cqm a() {
            return cex.this.E();
         }

         @Override
         public boolean a(cqm $$0) {
            cex.this.a($$0);
            return true;
         }
      } : super.a_($$0);
   }

   @Override
   public void a(aim<?> $$0) {
      if ($$0.equals(g)) {
         this.d(this.E());
      }
   }

   private void d(cqm $$0) {
      if (!$$0.b() && $$0.H() != this) {
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
         this.dM().c(this.c, dae.a);
      }
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      if (!this.E().b()) {
         $$0.a("Item", this.E().b(new ta()));
         $$0.a("ItemRotation", (byte)this.I());
         $$0.a("ItemDropChance", this.i);
      }

      $$0.a("Facing", (byte)this.d.d());
      $$0.a("Invisible", this.ce());
      $$0.a("Fixed", this.j);
   }

   @Override
   public void a(ta $$0) {
      super.a($$0);
      ta $$1 = $$0.p("Item");
      if ($$1 != null && !$$1.g()) {
         cqm $$2 = cqm.a($$1);
         if ($$2.b()) {
            f.warn("Unable to load item from: {}", $$1);
         }

         cqm $$3 = this.E();
         if (!$$3.b() && !cqm.a($$2, $$3)) {
            this.c($$3);
         }

         this.a($$2, false);
         this.a($$0.f("ItemRotation"), false);
         if ($$0.b("ItemDropChance", 99)) {
            this.i = $$0.j("ItemDropChance");
         }
      }

      this.a(ih.a($$0.f("Facing")));
      this.j($$0.q("Invisible"));
      this.j = $$0.q("Fixed");
   }

   @Override
   public bnd a(ciu $$0, bnc $$1) {
      cqm $$2 = $$0.b($$1);
      boolean $$3 = !this.E().b();
      boolean $$4 = !$$2.b();
      if (this.j) {
         return bnd.d;
      } else if (!this.dM().B) {
         if (!$$3) {
            if ($$4 && !this.dH()) {
               if ($$2.a(cqp.rT)) {
                  eka $$5 = cqt.b($$2, this.dM());
                  if ($$5 != null && $$5.b(256)) {
                     return bnd.e;
                  }
               }

               this.a($$2);
               this.a(drp.c, $$0);
               $$2.a(1, $$0);
            }
         } else {
            this.a(this.w(), 1.0F, 1.0F);
            this.b(this.I() + 1);
            this.a(drp.c, $$0);
         }

         return bnd.b;
      } else {
         return !$$3 && !$$4 ? bnd.d : bnd.a;
      }
   }

   public atx w() {
      return aty.nj;
   }

   public int J() {
      return this.E().b() ? 0 : this.I() % 8 + 1;
   }

   @Override
   public yb<aam> di() {
      return new aan(this, this.d.d(), this.D());
   }

   @Override
   public void a(aan $$0) {
      super.a($$0);
      this.a(ih.a($$0.p()));
   }

   @Override
   public cqm dz() {
      cqm $$0 = this.E();
      return $$0.b() ? this.x() : $$0.q();
   }

   protected cqm x() {
      return new cqm(cqp.ua);
   }

   @Override
   public float dD() {
      ih $$0 = this.cE();
      int $$1 = $$0.o().b() ? 90 * $$0.f().a() : 0;
      return (float)aww.b(180 + $$0.e() * 90 + this.I() * 45 + $$1);
   }
}
