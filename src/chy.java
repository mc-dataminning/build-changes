import com.mojang.logging.LogUtils;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;

public abstract class chy extends bru {
   private static final Logger e = LogUtils.getLogger();
   protected static final Predicate<bru> b = $$0 -> $$0 instanceof chy;
   private int f;
   protected io c;
   protected it d;

   protected chy(bsa<? extends chy> $$0, dax $$1) {
      super($$0, $$1);
      this.d = it.d;
   }

   protected chy(bsa<? extends chy> $$0, dax $$1, io $$2) {
      this($$0, $$1);
      this.c = $$2;
   }

   @Override
   protected void a(ajv.a $$0) {
   }

   protected void a(it $$0) {
      Validate.notNull($$0);
      Validate.isTrue($$0.o().d());
      this.d = $$0;
      this.r((float)(this.d.e() * 90));
      this.O = this.dF();
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
         it $$6 = this.d.i();
         $$0 += $$4 * (double)$$6.j();
         $$2 += $$4 * (double)$$6.l();
         this.p($$0, $$1, $$2);
         double $$7 = (double)this.A();
         double $$8 = (double)this.B();
         double $$9 = (double)this.A();
         if (this.d.o() == it.a.c) {
            $$9 = 1.0;
         } else {
            $$7 = 1.0;
         }

         $$7 /= 32.0;
         $$8 /= 32.0;
         $$9 /= 32.0;
         this.a(new euf($$0 - $$7, $$1 - $$8, $$2 - $$9, $$0 + $$7, $$1 + $$8, $$2 + $$9));
      }
   }

   private double b(int $$0) {
      return $$0 % 32 == 0 ? 0.5 : 0.0;
   }

   @Override
   public void l() {
      if (!this.dP().B) {
         this.av();
         if (this.f++ == 100) {
            this.f = 0;
            if (!this.dK() && !this.z()) {
               this.ao();
               this.b(null);
            }
         }
      }
   }

   public boolean z() {
      if (!this.dP().g(this)) {
         return false;
      } else {
         int $$0 = Math.max(1, this.A() / 16);
         int $$1 = Math.max(1, this.B() / 16);
         io $$2 = this.c.a(this.d.g());
         it $$3 = this.d.i();
         io.a $$4 = new io.a();

         for (int $$5 = 0; $$5 < $$0; $$5++) {
            for (int $$6 = 0; $$6 < $$1; $$6++) {
               int $$7 = ($$0 - 1) / -2;
               int $$8 = ($$1 - 1) / -2;
               $$4.g($$2).c($$3, $$5 + $$7).c(it.b, $$6 + $$8);
               drb $$9 = this.dP().a_($$4);
               if (!$$9.e() && !dga.m($$9)) {
                  return false;
               }
            }
         }

         return this.dP().a(this, this.cK(), b).isEmpty();
      }
   }

   @Override
   public boolean bz() {
      return true;
   }

   @Override
   public boolean u(bru $$0) {
      if ($$0 instanceof clw $$1) {
         return !this.dP().a($$1, this.c) ? true : this.a(this.dQ().a($$1), 0.0F);
      } else {
         return false;
      }
   }

   @Override
   public it cH() {
      return this.d;
   }

   @Override
   public boolean a(bqn $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dK() && !this.dP().B) {
            this.an();
            this.bv();
            this.b($$0.d());
         }

         return true;
      }
   }

   @Override
   public void a(bst $$0, euk $$1) {
      if (!this.dP().B && !this.dK() && $$1.g() > 0.0) {
         this.an();
         this.b(null);
      }
   }

   @Override
   public void j(double $$0, double $$1, double $$2) {
      if (!this.dP().B && !this.dK() && $$0 * $$0 + $$1 * $$1 + $$2 * $$2 > 0.0) {
         this.an();
         this.b(null);
      }
   }

   @Override
   public void b(ud $$0) {
      io $$1 = this.D();
      $$0.a("TileX", $$1.u());
      $$0.a("TileY", $$1.v());
      $$0.a("TileZ", $$1.w());
   }

   @Override
   public void a(ud $$0) {
      io $$1 = new io($$0.h("TileX"), $$0.h("TileY"), $$0.h("TileZ"));
      if (!$$1.a(this.dp(), 16.0)) {
         e.error("Hanging entity at invalid position: {}", $$1);
      } else {
         this.c = $$1;
      }
   }

   public abstract int A();

   public abstract int B();

   public abstract void b(@Nullable bru var1);

   public abstract void C();

   @Override
   public cig a(cto $$0, float $$1) {
      cig $$2 = new cig(
         this.dP(), this.du() + (double)((float)this.d.j() * 0.15F), this.dw() + (double)$$1, this.dA() + (double)((float)this.d.l() * 0.15F), $$0
      );
      $$2.v();
      this.dP().b($$2);
      return $$2;
   }

   @Override
   protected boolean bB() {
      return false;
   }

   @Override
   public void a_(double $$0, double $$1, double $$2) {
      this.c = io.a($$0, $$1, $$2);
      this.y();
      this.av = true;
   }

   public io D() {
      return this.c;
   }

   @Override
   public float a(dkl $$0) {
      if (this.d.o() != it.a.b) {
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

      float $$1 = ayd.g(this.dF());
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
   public float a(div $$0) {
      return this.a($$0.a(this.d));
   }

   @Override
   public void a(aqm $$0, bsn $$1) {
   }

   @Override
   public void j_() {
   }
}
