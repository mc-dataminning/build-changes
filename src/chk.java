import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;

public class chk extends chj {
   private static final Logger f = LogUtils.getLogger();
   private static final ajm<csz> g = ajq.a(chk.class, ajo.h);
   private static final ajm<Integer> h = ajq.a(chk.class, ajo.b);
   public static final int e = 8;
   private float i = 1.0F;
   private boolean j;

   public chk(brn<? extends chk> $$0, dad $$1) {
      super($$0, $$1);
   }

   public chk(dad $$0, in $$1, is $$2) {
      this(brn.ai, $$0, $$1, $$2);
   }

   public chk(brn<? extends chk> $$0, dad $$1, in $$2, is $$3) {
      super($$0, $$1, $$2);
      this.a($$3);
   }

   @Override
   protected void a(ajq.a $$0) {
      $$0.a(g, csz.i);
      $$0.a(h, 0);
   }

   @Override
   protected void a(is $$0) {
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
         is.a $$7 = this.d.o();
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
         this.a(new etk($$1 - $$4, $$2 - $$5, $$3 - $$6, $$1 + $$4, $$2 + $$5, $$3 + $$6));
      }
   }

   @Override
   public boolean z() {
      if (this.j) {
         return true;
      } else if (!this.dN().g(this)) {
         return false;
      } else {
         dqh $$0 = this.dN().a_(this.c.a(this.d.g()));
         return $$0.e() || this.d.o().d() && dfg.m($$0) ? this.dN().a(this, this.cI(), b).isEmpty() : false;
      }
   }

   @Override
   public void a(bsf $$0, etp $$1) {
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
   public boolean a(bqf $$0, float $$1) {
      if (this.j) {
         return !$$0.a(avt.e) && !$$0.g() ? false : super.a($$0, $$1);
      } else if (this.b($$0)) {
         return false;
      } else if (!$$0.a(avt.m) && !this.E().d()) {
         if (!this.dN().B) {
            this.b($$0.d(), false);
            this.a(dva.c, $$0.d());
            this.a(this.p(), 1.0F, 1.0F);
         }

         return true;
      } else {
         return super.a($$0, $$1);
      }
   }

   public avb p() {
      return avc.np;
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
   public void b(@Nullable brh $$0) {
      this.a(this.r(), 1.0F, 1.0F);
      this.b($$0, true);
      this.a(dva.c, $$0);
   }

   public avb r() {
      return avc.nn;
   }

   @Override
   public void C() {
      this.a(this.u(), 1.0F, 1.0F);
   }

   public avb u() {
      return avc.no;
   }

   private void b(@Nullable brh $$0, boolean $$1) {
      if (!this.j) {
         csz $$2 = this.E();
         this.a(csz.i);
         if (!this.dN().aa().b(czz.i)) {
            if ($$0 == null) {
               this.c($$2);
            }
         } else {
            if ($$0 instanceof clh $$3 && $$3.fN()) {
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

   private void c(csz $$0) {
      enn $$1 = this.G();
      if ($$1 != null) {
         enp $$2 = cth.a($$1, this.dN());
         if ($$2 != null) {
            $$2.a(this.c, this.aj());
            $$2.a(true);
         }
      }

      $$0.a(null);
   }

   public csz E() {
      return this.an().a(g);
   }

   @Nullable
   public enn G() {
      return this.E().a(ka.z);
   }

   public boolean H() {
      return this.E().b(ka.z);
   }

   public void a(csz $$0) {
      this.a($$0, true);
   }

   public void a(csz $$0, boolean $$1) {
      if (!$$0.d()) {
         $$0 = $$0.c(1);
      }

      this.d($$0);
      this.an().a(g, $$0);
      if (!$$0.d()) {
         this.a(this.v(), 1.0F, 1.0F);
      }

      if ($$1 && this.c != null) {
         this.dN().c(this.c, ddg.a);
      }
   }

   public avb v() {
      return avc.nm;
   }

   @Override
   public bsr a_(int $$0) {
      return $$0 == 0 ? new bsr() {
         @Override
         public csz a() {
            return chk.this.E();
         }

         @Override
         public boolean a(csz $$0) {
            chk.this.a($$0);
            return true;
         }
      } : super.a_($$0);
   }

   @Override
   public void a(ajm<?> $$0) {
      if ($$0.equals(g)) {
         this.d(this.E());
      }
   }

   private void d(csz $$0) {
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
         this.dN().c(this.c, ddg.a);
      }
   }

   @Override
   public void b(ua $$0) {
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
   public void a(ua $$0) {
      super.a($$0);
      csz $$2;
      if ($$0.b("Item", 10)) {
         ua $$1 = $$0.p("Item");
         $$2 = csz.a(this.dP(), (ux)$$1).orElse(csz.i);
      } else {
         $$2 = csz.i;
      }

      csz $$4 = this.E();
      if (!$$4.d() && !csz.a($$2, $$4)) {
         this.c($$4);
      }

      this.a($$2, false);
      if (!$$2.d()) {
         this.a($$0.f("ItemRotation"), false);
         if ($$0.b("ItemDropChance", 99)) {
            this.i = $$0.j("ItemDropChance");
         }
      }

      this.a(is.a($$0.f("Facing")));
      this.k($$0.q("Invisible"));
      this.j = $$0.q("Fixed");
   }

   @Override
   public bpm a(clh $$0, bpl $$1) {
      csz $$2 = $$0.b($$1);
      boolean $$3 = !this.E().d();
      boolean $$4 = !$$2.d();
      if (this.j) {
         return bpm.d;
      } else if (!this.dN().B) {
         if (!$$3) {
            if ($$4 && !this.dI()) {
               if ($$2.a(ctc.rU)) {
                  enp $$5 = cth.b($$2, this.dN());
                  if ($$5 != null && $$5.a(256)) {
                     return bpm.e;
                  }
               }

               this.a($$2);
               this.a(dva.c, $$0);
               $$2.a(1, $$0);
            }
         } else {
            this.a(this.w(), 1.0F, 1.0F);
            this.b(this.I() + 1);
            this.a(dva.c, $$0);
         }

         return bpm.b;
      } else {
         return !$$3 && !$$4 ? bpm.d : bpm.a;
      }
   }

   public avb w() {
      return avc.nq;
   }

   public int J() {
      return this.E().d() ? 0 : this.I() % 8 + 1;
   }

   @Override
   public zb<abm> dj() {
      return new abn(this, this.d.d(), this.D());
   }

   @Override
   public void a(abn $$0) {
      super.a($$0);
      this.a(is.a($$0.p()));
   }

   @Override
   public csz dA() {
      csz $$0 = this.E();
      return $$0.d() ? this.x() : $$0.r();
   }

   protected csz x() {
      return new csz(ctc.uc);
   }

   @Override
   public float dE() {
      is $$0 = this.cF();
      int $$1 = $$0.o().b() ? 90 * $$0.f().a() : 0;
      return (float)axz.b(180 + $$0.e() * 90 + this.I() * 45 + $$1);
   }
}
