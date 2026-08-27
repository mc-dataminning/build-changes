import com.mojang.logging.LogUtils;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;

public abstract class caw extends blf {
   private static final Logger e = LogUtils.getLogger();
   protected static final Predicate<blf> b = $$0 -> $$0 instanceof caw;
   private int f;
   protected hv c;
   protected ia d;

   protected caw(blj<? extends caw> $$0, csy $$1) {
      super($$0, $$1);
      this.d = ia.d;
   }

   protected caw(blj<? extends caw> $$0, csy $$1, hv $$2) {
      this($$0, $$1);
      this.c = $$2;
   }

   @Override
   protected void c_() {
   }

   protected void a(ia $$0) {
      Validate.notNull($$0);
      Validate.isTrue($$0.o().d());
      this.d = $$0;
      this.r((float)(this.d.e() * 90));
      this.N = this.dC();
      this.z();
   }

   @Override
   protected void z() {
      if (this.d != null) {
         double $$0 = (double)this.c.u() + 0.5;
         double $$1 = (double)this.c.v() + 0.5;
         double $$2 = (double)this.c.w() + 0.5;
         double $$3 = 0.46875;
         double $$4 = this.b(this.B());
         double $$5 = this.b(this.C());
         $$0 -= (double)this.d.j() * 0.46875;
         $$2 -= (double)this.d.l() * 0.46875;
         $$1 += $$5;
         ia $$6 = this.d.i();
         $$0 += $$4 * (double)$$6.j();
         $$2 += $$4 * (double)$$6.l();
         this.p($$0, $$1, $$2);
         double $$7 = (double)this.B();
         double $$8 = (double)this.C();
         double $$9 = (double)this.B();
         if (this.d.o() == ia.a.c) {
            $$9 = 1.0;
         } else {
            $$7 = 1.0;
         }

         $$7 /= 32.0;
         $$8 /= 32.0;
         $$9 /= 32.0;
         this.a(new ekw($$0 - $$7, $$1 - $$8, $$2 - $$9, $$0 + $$7, $$1 + $$8, $$2 + $$9));
      }
   }

   private double b(int $$0) {
      return $$0 % 32 == 0 ? 0.5 : 0.0;
   }

   @Override
   public void l() {
      if (!this.dM().B) {
         this.at();
         if (this.f++ == 100) {
            this.f = 0;
            if (!this.dH() && !this.A()) {
               this.am();
               this.a(null);
            }
         }
      }
   }

   public boolean A() {
      if (!this.dM().g(this)) {
         return false;
      } else {
         int $$0 = Math.max(1, this.B() / 16);
         int $$1 = Math.max(1, this.C() / 16);
         hv $$2 = this.c.a(this.d.g());
         ia $$3 = this.d.i();
         hv.a $$4 = new hv.a();

         for (int $$5 = 0; $$5 < $$0; $$5++) {
            for (int $$6 = 0; $$6 < $$1; $$6++) {
               int $$7 = ($$0 - 1) / -2;
               int $$8 = ($$1 - 1) / -2;
               $$4.g($$2).c($$3, $$5 + $$7).c(ia.b, $$6 + $$8);
               dip $$9 = this.dM().a_($$4);
               if (!$$9.e() && !cyb.h($$9)) {
                  return false;
               }
            }
         }

         return this.dM().a(this, this.cH(), b).isEmpty();
      }
   }

   @Override
   public boolean bt() {
      return true;
   }

   @Override
   public boolean u(blf $$0) {
      if ($$0 instanceof cer $$1) {
         return !this.dM().a($$1, this.c) ? true : this.a(this.dN().a($$1), 0.0F);
      } else {
         return false;
      }
   }

   @Override
   public ia cE() {
      return this.d;
   }

   @Override
   public boolean a(bkd $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dH() && !this.dM().B) {
            this.al();
            this.bq();
            this.a($$0.d());
         }

         return true;
      }
   }

   @Override
   public void a(bmb $$0, elb $$1) {
      if (!this.dM().B && !this.dH() && $$1.g() > 0.0) {
         this.al();
         this.a(null);
      }
   }

   @Override
   public void j(double $$0, double $$1, double $$2) {
      if (!this.dM().B && !this.dH() && $$0 * $$0 + $$1 * $$1 + $$2 * $$2 > 0.0) {
         this.al();
         this.a(null);
      }
   }

   @Override
   public void b(sj $$0) {
      hv $$1 = this.E();
      $$0.a("TileX", $$1.u());
      $$0.a("TileY", $$1.v());
      $$0.a("TileZ", $$1.w());
   }

   @Override
   public void a(sj $$0) {
      hv $$1 = new hv($$0.h("TileX"), $$0.h("TileY"), $$0.h("TileZ"));
      if (!$$1.a(this.dm(), 16.0)) {
         e.error("Hanging entity at invalid position: {}", $$1);
      } else {
         this.c = $$1;
      }
   }

   public abstract int B();

   public abstract int C();

   public abstract void a(@Nullable blf var1);

   public abstract void D();

   @Override
   public cbe a(cmh $$0, float $$1) {
      cbe $$2 = new cbe(
         this.dM(), this.dr() + (double)((float)this.d.j() * 0.15F), this.dt() + (double)$$1, this.dx() + (double)((float)this.d.l() * 0.15F), $$0
      );
      $$2.u();
      this.dM().b($$2);
      return $$2;
   }

   @Override
   protected boolean bv() {
      return false;
   }

   @Override
   public void a_(double $$0, double $$1, double $$2) {
      this.c = hv.a($$0, $$1, $$2);
      this.z();
      this.au = true;
   }

   public hv E() {
      return this.c;
   }

   @Override
   public float a(dcl $$0) {
      if (this.d.o() != ia.a.b) {
         switch ($$0) {
            case c:
               this.d = this.d.g();
               break;
            case d:
               this.d = this.d.i();
               break;
            case b:
               this.d = this.d.h();
         }
      }

      float $$1 = aty.g(this.dC());
      switch ($$0) {
         case c:
            return $$1 + 180.0F;
         case d:
            return $$1 + 90.0F;
         case b:
            return $$1 + 270.0F;
         default:
            return $$1;
      }
   }

   @Override
   public float a(dav $$0) {
      return this.a($$0.a(this.d));
   }

   @Override
   public void a(amp $$0, blu $$1) {
   }

   @Override
   public void k_() {
   }
}
