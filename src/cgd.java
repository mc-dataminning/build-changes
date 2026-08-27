import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;

public class cgd extends cgc {
   private static final Logger f = LogUtils.getLogger();
   private static final aja<crs> g = aje.a(cgd.class, ajc.h);
   private static final aja<Integer> h = aje.a(cgd.class, ajc.b);
   public static final int e = 8;
   private float i = 1.0F;
   private boolean j;

   public cgd(bqg<? extends cgd> $$0, czg $$1) {
      super($$0, $$1);
   }

   public cgd(czg $$0, id $$1, ij $$2) {
      this(bqg.ai, $$0, $$1, $$2);
   }

   public cgd(bqg<? extends cgd> $$0, czg $$1, id $$2, ij $$3) {
      super($$0, $$1, $$2);
      this.a($$3);
   }

   @Override
   protected void a(aje.a $$0) {
      $$0.a(g, crs.i);
      $$0.a(h, 0);
   }

   @Override
   protected void a(ij $$0) {
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
         ij.a $$7 = this.d.o();
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
         this.a(new ese($$1 - $$4, $$2 - $$5, $$3 - $$6, $$1 + $$4, $$2 + $$5, $$3 + $$6));
      }
   }

   @Override
   public boolean z() {
      if (this.j) {
         return true;
      } else if (!this.dM().g(this)) {
         return false;
      } else {
         dpi $$0 = this.dM().a_(this.c.a(this.d.g()));
         return $$0.e() || this.d.o().d() && dej.m($$0) ? this.dM().a(this, this.cH(), b).isEmpty() : false;
      }
   }

   @Override
   public void a(bqy $$0, esj $$1) {
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
   public boolean a(boy $$0, float $$1) {
      if (this.j) {
         return !$$0.a(avg.e) && !$$0.g() ? false : super.a($$0, $$1);
      } else if (this.b($$0)) {
         return false;
      } else if (!$$0.a(avg.m) && !this.E().d()) {
         if (!this.dM().B) {
            this.b($$0.d(), false);
            this.a(dub.c, $$0.d());
            this.a(this.p(), 1.0F, 1.0F);
         }

         return true;
      } else {
         return super.a($$0, $$1);
      }
   }

   public aun p() {
      return auo.nk;
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
   public void b(@Nullable bqa $$0) {
      this.a(this.r(), 1.0F, 1.0F);
      this.b($$0, true);
      this.a(dub.c, $$0);
   }

   public aun r() {
      return auo.ni;
   }

   @Override
   public void C() {
      this.a(this.u(), 1.0F, 1.0F);
   }

   public aun u() {
      return auo.nj;
   }

   private void b(@Nullable bqa $$0, boolean $$1) {
      if (!this.j) {
         crs $$2 = this.E();
         this.a(crs.i);
         if (!this.dM().aa().b(czc.i)) {
            if ($$0 == null) {
               this.c($$2);
            }
         } else {
            if ($$0 instanceof cka $$3 && $$3.fM()) {
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

   private void c(crs $$0) {
      emm $$1 = this.G();
      if ($$1 != null) {
         emo $$2 = crz.a($$1, this.dM());
         if ($$2 != null) {
            $$2.a(this.c, this.aj());
            $$2.a(true);
         }
      }

      $$0.a(null);
   }

   public crs E() {
      return this.an().a(g);
   }

   @Nullable
   public emm G() {
      return this.E().a(jr.s);
   }

   public boolean H() {
      return this.E().b(jr.s);
   }

   public void a(crs $$0) {
      this.a($$0, true);
   }

   public void a(crs $$0, boolean $$1) {
      if (!$$0.d()) {
         $$0 = $$0.c(1);
      }

      this.d($$0);
      this.an().a(g, $$0);
      if (!$$0.d()) {
         this.a(this.v(), 1.0F, 1.0F);
      }

      if ($$1 && this.c != null) {
         this.dM().c(this.c, dcj.a);
      }
   }

   public aun v() {
      return auo.nh;
   }

   @Override
   public brk a_(int $$0) {
      return $$0 == 0 ? new brk() {
         @Override
         public crs a() {
            return cgd.this.E();
         }

         @Override
         public boolean a(crs $$0) {
            cgd.this.a($$0);
            return true;
         }
      } : super.a_($$0);
   }

   @Override
   public void a(aja<?> $$0) {
      if ($$0.equals(g)) {
         this.d(this.E());
      }
   }

   private void d(crs $$0) {
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
         this.dM().c(this.c, dcj.a);
      }
   }

   @Override
   public void b(to $$0) {
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
   public void a(to $$0) {
      super.a($$0);
      crs $$2;
      if ($$0.b("Item", 10)) {
         to $$1 = $$0.p("Item");
         $$2 = crs.a(this.dO(), (ul)$$1).orElse(crs.i);
      } else {
         $$2 = crs.i;
      }

      crs $$4 = this.E();
      if (!$$4.d() && !crs.a($$2, $$4)) {
         this.c($$4);
      }

      this.a($$2, false);
      if (!$$2.d()) {
         this.a($$0.f("ItemRotation"), false);
         if ($$0.b("ItemDropChance", 99)) {
            this.i = $$0.j("ItemDropChance");
         }
      }

      this.a(ij.a($$0.f("Facing")));
      this.j($$0.q("Invisible"));
      this.j = $$0.q("Fixed");
   }

   @Override
   public bof a(cka $$0, boe $$1) {
      crs $$2 = $$0.b($$1);
      boolean $$3 = !this.E().d();
      boolean $$4 = !$$2.d();
      if (this.j) {
         return bof.d;
      } else if (!this.dM().B) {
         if (!$$3) {
            if ($$4 && !this.dH()) {
               if ($$2.a(crv.rT)) {
                  emo $$5 = crz.b($$2, this.dM());
                  if ($$5 != null && $$5.a(256)) {
                     return bof.e;
                  }
               }

               this.a($$2);
               this.a(dub.c, $$0);
               $$2.a(1, $$0);
            }
         } else {
            this.a(this.w(), 1.0F, 1.0F);
            this.b(this.I() + 1);
            this.a(dub.c, $$0);
         }

         return bof.b;
      } else {
         return !$$3 && !$$4 ? bof.d : bof.a;
      }
   }

   public aun w() {
      return auo.nl;
   }

   public int J() {
      return this.E().d() ? 0 : this.I() % 8 + 1;
   }

   @Override
   public yp<aba> di() {
      return new abb(this, this.d.d(), this.D());
   }

   @Override
   public void a(abb $$0) {
      super.a($$0);
      this.a(ij.a($$0.p()));
   }

   @Override
   public crs dz() {
      crs $$0 = this.E();
      return $$0.d() ? this.x() : $$0.r();
   }

   protected crs x() {
      return new crs(crv.ua);
   }

   @Override
   public float dD() {
      ij $$0 = this.cE();
      int $$1 = $$0.o().b() ? 90 * $$0.f().a() : 0;
      return (float)axm.b(180 + $$0.e() * 90 + this.I() * 45 + $$1);
   }
}
