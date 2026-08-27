import com.mojang.logging.LogUtils;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;

public abstract class caf extends bkq {
   private static final Logger e = LogUtils.getLogger();
   protected static final Predicate<bkq> b = $$0 -> $$0 instanceof caf;
   private int f;
   protected ht c;
   protected hx d;

   protected caf(bku<? extends caf> $$0, csa $$1) {
      super($$0, $$1);
      this.d = hx.d;
   }

   protected caf(bku<? extends caf> $$0, csa $$1, ht $$2) {
      this($$0, $$1);
      this.c = $$2;
   }

   @Override
   protected void b_() {
   }

   protected void a(hx $$0) {
      Validate.notNull($$0);
      Validate.isTrue($$0.o().d());
      this.d = $$0;
      this.r((float)(this.d.e() * 90));
      this.N = this.dD();
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
         hx $$6 = this.d.i();
         $$0 += $$4 * (double)$$6.j();
         $$2 += $$4 * (double)$$6.l();
         this.p($$0, $$1, $$2);
         double $$7 = (double)this.B();
         double $$8 = (double)this.C();
         double $$9 = (double)this.B();
         if (this.d.o() == hx.a.c) {
            $$9 = 1.0;
         } else {
            $$7 = 1.0;
         }

         $$7 /= 32.0;
         $$8 /= 32.0;
         $$9 /= 32.0;
         this.a(new ejp($$0 - $$7, $$1 - $$8, $$2 - $$9, $$0 + $$7, $$1 + $$8, $$2 + $$9));
      }
   }

   private double b(int $$0) {
      return $$0 % 32 == 0 ? 0.5 : 0.0;
   }

   @Override
   public void l() {
      if (!this.dN().B) {
         this.at();
         if (this.f++ == 100) {
            this.f = 0;
            if (!this.dI() && !this.A()) {
               this.am();
               this.a(null);
            }
         }
      }
   }

   public boolean A() {
      if (!this.dN().g(this)) {
         return false;
      } else {
         int $$0 = Math.max(1, this.B() / 16);
         int $$1 = Math.max(1, this.C() / 16);
         ht $$2 = this.c.a(this.d.g());
         hx $$3 = this.d.i();
         ht.a $$4 = new ht.a();

         for (int $$5 = 0; $$5 < $$0; $$5++) {
            for (int $$6 = 0; $$6 < $$1; $$6++) {
               int $$7 = ($$0 - 1) / -2;
               int $$8 = ($$1 - 1) / -2;
               $$4.g($$2).c($$3, $$5 + $$7).c(hx.b, $$6 + $$8);
               dhi $$9 = this.dN().a_($$4);
               if (!$$9.e() && !cxc.h($$9)) {
                  return false;
               }
            }
         }

         return this.dN().a(this, this.cH(), b).isEmpty();
      }
   }

   @Override
   public boolean bt() {
      return true;
   }

   @Override
   public boolean u(bkq $$0) {
      if ($$0 instanceof cdu $$1) {
         return !this.dN().a($$1, this.c) ? true : this.a(this.dO().a($$1), 0.0F);
      } else {
         return false;
      }
   }

   @Override
   public hx cE() {
      return this.d;
   }

   @Override
   public boolean a(bjo $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dI() && !this.dN().B) {
            this.al();
            this.bq();
            this.a($$0.d());
         }

         return true;
      }
   }

   @Override
   public void a(blm $$0, eju $$1) {
      if (!this.dN().B && !this.dI() && $$1.g() > 0.0) {
         this.al();
         this.a(null);
      }
   }

   @Override
   public void j(double $$0, double $$1, double $$2) {
      if (!this.dN().B && !this.dI() && $$0 * $$0 + $$1 * $$1 + $$2 * $$2 > 0.0) {
         this.al();
         this.a(null);
      }
   }

   @Override
   public void b(rz $$0) {
      ht $$1 = this.E();
      $$0.a("TileX", $$1.u());
      $$0.a("TileY", $$1.v());
      $$0.a("TileZ", $$1.w());
   }

   @Override
   public void a(rz $$0) {
      ht $$1 = new ht($$0.h("TileX"), $$0.h("TileY"), $$0.h("TileZ"));
      if (!$$1.a(this.dn(), 16.0)) {
         e.error("Hanging entity at invalid position: {}", $$1);
      } else {
         this.c = $$1;
      }
   }

   public abstract int B();

   public abstract int C();

   public abstract void a(@Nullable bkq var1);

   public abstract void D();

   @Override
   public can a(clj $$0, float $$1) {
      can $$2 = new can(
         this.dN(), this.ds() + (double)((float)this.d.j() * 0.15F), this.du() + (double)$$1, this.dy() + (double)((float)this.d.l() * 0.15F), $$0
      );
      $$2.u();
      this.dN().b($$2);
      return $$2;
   }

   @Override
   protected boolean bv() {
      return false;
   }

   @Override
   public void a_(double $$0, double $$1, double $$2) {
      this.c = ht.a($$0, $$1, $$2);
      this.z();
      this.au = true;
   }

   public ht E() {
      return this.c;
   }

   @Override
   public float a(dbm $$0) {
      if (this.d.o() != hx.a.b) {
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

      float $$1 = atm.g(this.dD());
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
   public float a(czw $$0) {
      return this.a($$0.a(this.d));
   }

   @Override
   public void a(ame $$0, blf $$1) {
   }

   @Override
   public void j_() {
   }
}
