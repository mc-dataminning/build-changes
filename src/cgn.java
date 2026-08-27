import com.mojang.logging.LogUtils;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;

public abstract class cgn extends bql {
   private static final Logger e = LogUtils.getLogger();
   protected static final Predicate<bql> b = $$0 -> $$0 instanceof cgn;
   private int f;
   protected im c;
   protected ir d;

   protected cgn(bqr<? extends cgn> $$0, czu $$1) {
      super($$0, $$1);
      this.d = ir.d;
   }

   protected cgn(bqr<? extends cgn> $$0, czu $$1, im $$2) {
      this($$0, $$1);
      this.c = $$2;
   }

   @Override
   protected void a(ajo.a $$0) {
   }

   protected void a(ir $$0) {
      Validate.notNull($$0);
      Validate.isTrue($$0.o().d());
      this.d = $$0;
      this.r((float)(this.d.e() * 90));
      this.O = this.dD();
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
         ir $$6 = this.d.i();
         $$0 += $$4 * (double)$$6.j();
         $$2 += $$4 * (double)$$6.l();
         this.p($$0, $$1, $$2);
         double $$7 = (double)this.A();
         double $$8 = (double)this.B();
         double $$9 = (double)this.A();
         if (this.d.o() == ir.a.c) {
            $$9 = 1.0;
         } else {
            $$7 = 1.0;
         }

         $$7 /= 32.0;
         $$8 /= 32.0;
         $$9 /= 32.0;
         this.a(new eta($$0 - $$7, $$1 - $$8, $$2 - $$9, $$0 + $$7, $$1 + $$8, $$2 + $$9));
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
            if (!this.dI() && !this.z()) {
               this.am();
               this.b(null);
            }
         }
      }
   }

   public boolean z() {
      if (!this.dN().g(this)) {
         return false;
      } else {
         int $$0 = Math.max(1, this.A() / 16);
         int $$1 = Math.max(1, this.B() / 16);
         im $$2 = this.c.a(this.d.g());
         ir $$3 = this.d.i();
         im.a $$4 = new im.a();

         for (int $$5 = 0; $$5 < $$0; $$5++) {
            for (int $$6 = 0; $$6 < $$1; $$6++) {
               int $$7 = ($$0 - 1) / -2;
               int $$8 = ($$1 - 1) / -2;
               $$4.g($$2).c($$3, $$5 + $$7).c(ir.b, $$6 + $$8);
               dpy $$9 = this.dN().a_($$4);
               if (!$$9.e() && !dex.m($$9)) {
                  return false;
               }
            }
         }

         return this.dN().a(this, this.cI(), b).isEmpty();
      }
   }

   @Override
   public boolean bx() {
      return true;
   }

   @Override
   public boolean u(bql $$0) {
      if ($$0 instanceof ckl $$1) {
         return !this.dN().a($$1, this.c) ? true : this.a(this.dO().a($$1), 0.0F);
      } else {
         return false;
      }
   }

   @Override
   public ir cF() {
      return this.d;
   }

   @Override
   public boolean a(bpj $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dI() && !this.dN().B) {
            this.al();
            this.bt();
            this.b($$0.d());
         }

         return true;
      }
   }

   @Override
   public void a(brj $$0, etf $$1) {
      if (!this.dN().B && !this.dI() && $$1.g() > 0.0) {
         this.al();
         this.b(null);
      }
   }

   @Override
   public void j(double $$0, double $$1, double $$2) {
      if (!this.dN().B && !this.dI() && $$0 * $$0 + $$1 * $$1 + $$2 * $$2 > 0.0) {
         this.al();
         this.b(null);
      }
   }

   @Override
   public void b(ty $$0) {
      im $$1 = this.D();
      $$0.a("TileX", $$1.u());
      $$0.a("TileY", $$1.v());
      $$0.a("TileZ", $$1.w());
   }

   @Override
   public void a(ty $$0) {
      im $$1 = new im($$0.h("TileX"), $$0.h("TileY"), $$0.h("TileZ"));
      if (!$$1.a(this.dn(), 16.0)) {
         e.error("Hanging entity at invalid position: {}", $$1);
      } else {
         this.c = $$1;
      }
   }

   public abstract int A();

   public abstract int B();

   public abstract void b(@Nullable bql var1);

   public abstract void C();

   @Override
   public cgv a(csd $$0, float $$1) {
      cgv $$2 = new cgv(
         this.dN(), this.ds() + (double)((float)this.d.j() * 0.15F), this.du() + (double)$$1, this.dy() + (double)((float)this.d.l() * 0.15F), $$0
      );
      $$2.v();
      this.dN().b($$2);
      return $$2;
   }

   @Override
   protected boolean bz() {
      return false;
   }

   @Override
   public void a_(double $$0, double $$1, double $$2) {
      this.c = im.a($$0, $$1, $$2);
      this.y();
      this.av = true;
   }

   public im D() {
      return this.c;
   }

   @Override
   public float a(dji $$0) {
      if (this.d.o() != ir.a.b) {
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

      float $$1 = axw.g(this.dD());
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
   public float a(dhs $$0) {
      return this.a($$0.a(this.d));
   }

   @Override
   public void a(aqe $$0, brd $$1) {
   }

   @Override
   public void j_() {
   }
}
