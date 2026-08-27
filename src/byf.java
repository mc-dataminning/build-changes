import com.mojang.logging.LogUtils;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;

public abstract class byf extends biq {
   private static final Logger e = LogUtils.getLogger();
   protected static final Predicate<biq> b = $$0 -> $$0 instanceof byf;
   private int f;
   protected gw c;
   protected hc d;

   protected byf(biu<? extends byf> $$0, cpv $$1) {
      super($$0, $$1);
      this.d = hc.d;
   }

   protected byf(biu<? extends byf> $$0, cpv $$1, gw $$2) {
      this($$0, $$1);
      this.c = $$2;
   }

   @Override
   protected void a_() {
   }

   protected void a(hc $$0) {
      Validate.notNull($$0);
      Validate.isTrue($$0.o().d());
      this.d = $$0;
      this.r((float)(this.d.e() * 90));
      this.N = this.dB();
      this.y();
   }

   protected void y() {
      if (this.d != null) {
         double $$0 = (double)this.c.u() + 0.5;
         double $$1 = (double)this.c.v() + 0.5;
         double $$2 = (double)this.c.w() + 0.5;
         double $$3 = 0.46875;
         double $$4 = this.b(this.A());
         double $$5 = this.b(this.B());
         $$0 -= (double)this.d.j() * 0.46875;
         $$2 -= (double)this.d.l() * 0.46875;
         $$1 += $$5;
         hc $$6 = this.d.i();
         $$0 += $$4 * (double)$$6.j();
         $$2 += $$4 * (double)$$6.l();
         this.p($$0, $$1, $$2);
         double $$7 = (double)this.A();
         double $$8 = (double)this.B();
         double $$9 = (double)this.A();
         if (this.d.o() == hc.a.c) {
            $$9 = 1.0;
         } else {
            $$7 = 1.0;
         }

         $$7 /= 32.0;
         $$8 /= 32.0;
         $$9 /= 32.0;
         this.a(new ehi($$0 - $$7, $$1 - $$8, $$2 - $$9, $$0 + $$7, $$1 + $$8, $$2 + $$9));
      }
   }

   private double b(int $$0) {
      return $$0 % 32 == 0 ? 0.5 : 0.0;
   }

   @Override
   public void l() {
      if (!this.dL().B) {
         this.ar();
         if (this.f++ == 100) {
            this.f = 0;
            if (!this.dG() && !this.z()) {
               this.ak();
               this.a(null);
            }
         }
      }
   }

   public boolean z() {
      if (!this.dL().g(this)) {
         return false;
      } else {
         int $$0 = Math.max(1, this.A() / 16);
         int $$1 = Math.max(1, this.B() / 16);
         gw $$2 = this.c.a(this.d.g());
         hc $$3 = this.d.i();
         gw.a $$4 = new gw.a();

         for (int $$5 = 0; $$5 < $$0; $$5++) {
            for (int $$6 = 0; $$6 < $$1; $$6++) {
               int $$7 = ($$0 - 1) / -2;
               int $$8 = ($$1 - 1) / -2;
               $$4.g($$2).c($$3, $$5 + $$7).c(hc.b, $$6 + $$8);
               dfj $$9 = this.dL().a_($$4);
               if (!$$9.e() && !cut.h($$9)) {
                  return false;
               }
            }
         }

         return this.dL().a(this, this.cG(), b).isEmpty();
      }
   }

   @Override
   public boolean br() {
      return true;
   }

   @Override
   public boolean u(biq $$0) {
      if ($$0 instanceof cbu $$1) {
         return !this.dL().a($$1, this.c) ? true : this.a(this.dM().a($$1), 0.0F);
      } else {
         return false;
      }
   }

   @Override
   public hc cD() {
      return this.d;
   }

   @Override
   public boolean a(bho $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dG() && !this.dL().B) {
            this.aj();
            this.bo();
            this.a($$0.d());
         }

         return true;
      }
   }

   @Override
   public void a(bjm $$0, ehn $$1) {
      if (!this.dL().B && !this.dG() && $$1.g() > 0.0) {
         this.aj();
         this.a(null);
      }
   }

   @Override
   public void j(double $$0, double $$1, double $$2) {
      if (!this.dL().B && !this.dG() && $$0 * $$0 + $$1 * $$1 + $$2 * $$2 > 0.0) {
         this.aj();
         this.a(null);
      }
   }

   @Override
   public void b(qy $$0) {
      gw $$1 = this.E();
      $$0.a("TileX", $$1.u());
      $$0.a("TileY", $$1.v());
      $$0.a("TileZ", $$1.w());
   }

   @Override
   public void a(qy $$0) {
      gw $$1 = new gw($$0.h("TileX"), $$0.h("TileY"), $$0.h("TileZ"));
      if (!$$1.a(this.dl(), 16.0)) {
         e.error("Hanging entity at invalid position: {}", $$1);
      } else {
         this.c = $$1;
      }
   }

   public abstract int A();

   public abstract int B();

   public abstract void a(@Nullable biq var1);

   public abstract void C();

   @Override
   public byn a(cjf $$0, float $$1) {
      byn $$2 = new byn(
         this.dL(), this.dq() + (double)((float)this.d.j() * 0.15F), this.ds() + (double)$$1, this.dw() + (double)((float)this.d.l() * 0.15F), $$0
      );
      $$2.t();
      this.dL().b($$2);
      return $$2;
   }

   @Override
   protected boolean bt() {
      return false;
   }

   @Override
   public void e(double $$0, double $$1, double $$2) {
      this.c = gw.a($$0, $$1, $$2);
      this.y();
      this.au = true;
   }

   public gw E() {
      return this.c;
   }

   @Override
   public float a(czh $$0) {
      if (this.d.o() != hc.a.b) {
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

      float $$1 = arx.g(this.dB());
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
   public float a(cxq $$0) {
      return this.a($$0.a(this.d));
   }

   @Override
   public void a(akr $$0, bjf $$1) {
   }

   @Override
   public void i_() {
   }
}
