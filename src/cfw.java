import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;

public class cfw extends cfv {
   private static final Logger f = LogUtils.getLogger();
   private static final aiy<crj> g = ajc.a(cfw.class, aja.h);
   private static final aiy<Integer> h = ajc.a(cfw.class, aja.b);
   public static final int e = 8;
   private float i = 1.0F;
   private boolean j;

   public cfw(bqb<? extends cfw> $$0, cyx $$1) {
      super($$0, $$1);
   }

   public cfw(cyx $$0, ib $$1, ih $$2) {
      this(bqb.ai, $$0, $$1, $$2);
   }

   public cfw(bqb<? extends cfw> $$0, cyx $$1, ib $$2, ih $$3) {
      super($$0, $$1, $$2);
      this.a($$3);
   }

   @Override
   protected void a(ajc.a $$0) {
      $$0.a(g, crj.i);
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
         this.a(new erv($$1 - $$4, $$2 - $$5, $$3 - $$6, $$1 + $$4, $$2 + $$5, $$3 + $$6));
      }
   }

   @Override
   public boolean z() {
      if (this.j) {
         return true;
      } else if (!this.dM().g(this)) {
         return false;
      } else {
         doz $$0 = this.dM().a_(this.c.a(this.d.g()));
         return $$0.e() || this.d.o().d() && dea.m($$0) ? this.dM().a(this, this.cH(), b).isEmpty() : false;
      }
   }

   @Override
   public void a(bqt $$0, esa $$1) {
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
   public boolean a(bot $$0, float $$1) {
      if (this.j) {
         return !$$0.a(ave.e) && !$$0.g() ? false : super.a($$0, $$1);
      } else if (this.b($$0)) {
         return false;
      } else if (!$$0.a(ave.m) && !this.E().d()) {
         if (!this.dM().B) {
            this.b($$0.d(), false);
            this.a(dts.c, $$0.d());
            this.a(this.p(), 1.0F, 1.0F);
         }

         return true;
      } else {
         return super.a($$0, $$1);
      }
   }

   public aul p() {
      return aum.nk;
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
   public void b(@Nullable bpv $$0) {
      this.a(this.r(), 1.0F, 1.0F);
      this.b($$0, true);
      this.a(dts.c, $$0);
   }

   public aul r() {
      return aum.ni;
   }

   @Override
   public void C() {
      this.a(this.u(), 1.0F, 1.0F);
   }

   public aul u() {
      return aum.nj;
   }

   private void b(@Nullable bpv $$0, boolean $$1) {
      if (!this.j) {
         crj $$2 = this.E();
         this.a(crj.i);
         if (!this.dM().aa().b(cyt.i)) {
            if ($$0 == null) {
               this.c($$2);
            }
         } else {
            if ($$0 instanceof cjt $$3 && $$3.fM()) {
               this.c($$2);
               return;
            }

            if ($$1) {
               this.b(this.x());
            }

            if (!$$2.d()) {
               $$2 = $$2.r();
               this.c($$2);
               if (this.ag.i() < this.i) {
                  this.b($$2);
               }
            }
         }
      }
   }

   private void c(crj $$0) {
      emd $$1 = this.G();
      if ($$1 != null) {
         emf $$2 = crq.a($$1, this.dM());
         if ($$2 != null) {
            $$2.a(this.c, this.aj());
            $$2.a(true);
         }
      }

      $$0.a(null);
   }

   public crj E() {
      return this.an().a(g);
   }

   @Nullable
   public emd G() {
      return this.E().a(jp.s);
   }

   public boolean H() {
      return this.E().b(jp.s);
   }

   public void a(crj $$0) {
      this.a($$0, true);
   }

   public void a(crj $$0, boolean $$1) {
      if (!$$0.d()) {
         $$0 = $$0.c(1);
      }

      this.d($$0);
      this.an().a(g, $$0);
      if (!$$0.d()) {
         this.a(this.v(), 1.0F, 1.0F);
      }

      if ($$1 && this.c != null) {
         this.dM().c(this.c, dca.a);
      }
   }

   public aul v() {
      return aum.nh;
   }

   @Override
   public brf a_(int $$0) {
      return $$0 == 0 ? new brf() {
         @Override
         public crj a() {
            return cfw.this.E();
         }

         @Override
         public boolean a(crj $$0) {
            cfw.this.a($$0);
            return true;
         }
      } : super.a_($$0);
   }

   @Override
   public void a(aiy<?> $$0) {
      if ($$0.equals(g)) {
         this.d(this.E());
      }
   }

   private void d(crj $$0) {
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
         this.dM().c(this.c, dca.a);
      }
   }

   @Override
   public void b(tm $$0) {
      super.b($$0);
      if (!this.E().d()) {
         $$0.a("Item", this.E().a(this.dO()));
         $$0.a("ItemRotation", (byte)this.I());
         $$0.a("ItemDropChance", this.i);
      }

      $$0.a("Facing", (byte)this.d.d());
      $$0.a("Invisible", this.ce());
      $$0.a("Fixed", this.j);
   }

   @Override
   public void a(tm $$0) {
      super.a($$0);
      crj $$2;
      if ($$0.b("Item", 10)) {
         tm $$1 = $$0.p("Item");
         $$2 = crj.a(this.dO(), (uj)$$1).orElse(crj.i);
      } else {
         $$2 = crj.i;
      }

      crj $$4 = this.E();
      if (!$$4.d() && !crj.a($$2, $$4)) {
         this.c($$4);
      }

      this.a($$2, false);
      if (!$$2.d()) {
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
   public boa a(cjt $$0, bnz $$1) {
      crj $$2 = $$0.b($$1);
      boolean $$3 = !this.E().d();
      boolean $$4 = !$$2.d();
      if (this.j) {
         return boa.d;
      } else if (!this.dM().B) {
         if (!$$3) {
            if ($$4 && !this.dH()) {
               if ($$2.a(crm.rT)) {
                  emf $$5 = crq.b($$2, this.dM());
                  if ($$5 != null && $$5.a(256)) {
                     return boa.e;
                  }
               }

               this.a($$2);
               this.a(dts.c, $$0);
               $$2.a(1, $$0);
            }
         } else {
            this.a(this.w(), 1.0F, 1.0F);
            this.b(this.I() + 1);
            this.a(dts.c, $$0);
         }

         return boa.b;
      } else {
         return !$$3 && !$$4 ? boa.d : boa.a;
      }
   }

   public aul w() {
      return aum.nl;
   }

   public int J() {
      return this.E().d() ? 0 : this.I() % 8 + 1;
   }

   @Override
   public yn<aay> di() {
      return new aaz(this, this.d.d(), this.D());
   }

   @Override
   public void a(aaz $$0) {
      super.a($$0);
      this.a(ih.a($$0.p()));
   }

   @Override
   public crj dz() {
      crj $$0 = this.E();
      return $$0.d() ? this.x() : $$0.r();
   }

   protected crj x() {
      return new crj(crm.ua);
   }

   @Override
   public float dD() {
      ih $$0 = this.cE();
      int $$1 = $$0.o().b() ? 90 * $$0.f().a() : 0;
      return (float)axk.b(180 + $$0.e() * 90 + this.I() * 45 + $$1);
   }
}
