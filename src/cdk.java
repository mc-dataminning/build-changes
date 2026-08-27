import com.mojang.logging.LogUtils;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;

public abstract class cdk extends bno {
   private static final Logger e = LogUtils.getLogger();
   protected static final Predicate<bno> b = $$0 -> $$0 instanceof cdk;
   private int f;
   protected hz c;
   protected ie d;

   protected cdk(bnu<? extends cdk> $$0, cvn $$1) {
      super($$0, $$1);
      this.d = ie.d;
   }

   protected cdk(bnu<? extends cdk> $$0, cvn $$1, hz $$2) {
      this($$0, $$1);
      this.c = $$2;
   }

   @Override
   protected void c_() {
   }

   protected void a(ie $$0) {
      Validate.notNull($$0);
      Validate.isTrue($$0.o().d());
      this.d = $$0;
      this.r((float)(this.d.e() * 90));
      this.M = this.dC();
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
         ie $$6 = this.d.i();
         $$0 += $$4 * (double)$$6.j();
         $$2 += $$4 * (double)$$6.l();
         this.p($$0, $$1, $$2);
         double $$7 = (double)this.B();
         double $$8 = (double)this.C();
         double $$9 = (double)this.B();
         if (this.d.o() == ie.a.c) {
            $$9 = 1.0;
         } else {
            $$7 = 1.0;
         }

         $$7 /= 32.0;
         $$8 /= 32.0;
         $$9 /= 32.0;
         this.a(new enn($$0 - $$7, $$1 - $$8, $$2 - $$9, $$0 + $$7, $$1 + $$8, $$2 + $$9));
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
         hz $$2 = this.c.a(this.d.g());
         ie $$3 = this.d.i();
         hz.a $$4 = new hz.a();

         for (int $$5 = 0; $$5 < $$0; $$5++) {
            for (int $$6 = 0; $$6 < $$1; $$6++) {
               int $$7 = ($$0 - 1) / -2;
               int $$8 = ($$1 - 1) / -2;
               $$4.g($$2).c($$3, $$5 + $$7).c(ie.b, $$6 + $$8);
               dlf $$9 = this.dM().a_($$4);
               if (!$$9.e() && !daq.m($$9)) {
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
   public boolean t(bno $$0) {
      if ($$0 instanceof chh $$1) {
         return !this.dM().a($$1, this.c) ? true : this.a(this.dN().a($$1), 0.0F);
      } else {
         return false;
      }
   }

   @Override
   public ie cE() {
      return this.d;
   }

   @Override
   public boolean a(bmn $$0, float $$1) {
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
   public void a(bol $$0, ens $$1) {
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
   public void b(sw $$0) {
      hz $$1 = this.E();
      $$0.a("TileX", $$1.u());
      $$0.a("TileY", $$1.v());
      $$0.a("TileZ", $$1.w());
   }

   @Override
   public void a(sw $$0) {
      hz $$1 = new hz($$0.h("TileX"), $$0.h("TileY"), $$0.h("TileZ"));
      if (!$$1.a(this.dm(), 16.0)) {
         e.error("Hanging entity at invalid position: {}", $$1);
      } else {
         this.c = $$1;
      }
   }

   public abstract int B();

   public abstract int C();

   public abstract void a(@Nullable bno var1);

   public abstract void D();

   @Override
   public cds a(coz $$0, float $$1) {
      cds $$2 = new cds(
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
      this.c = hz.a($$0, $$1, $$2);
      this.z();
      this.at = true;
   }

   public hz E() {
      return this.c;
   }

   @Override
   public float a(dfa $$0) {
      if (this.d.o() != ie.a.b) {
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

      float $$1 = awh.g(this.dC());
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
   public float a(ddk $$0) {
      return this.a($$0.a(this.d));
   }

   @Override
   public void a(aov $$0, bof $$1) {
   }

   @Override
   public void k_() {
   }
}
