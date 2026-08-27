import java.util.List;
import javax.annotation.Nullable;

public class bzg extends bzl {
   private int a;
   private final bsw b;
   @Nullable
   private cly c;
   private byu d;

   public bzg(bsw $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a() {
      List<cny> $$0 = this.b.dU().a(cny.class, this.b.cP().g(5.0));
      boolean $$1 = false;

      for (cny $$2 : $$0) {
         brv $$3 = $$2.cV();
         if ($$3 instanceof cly && (aym.e(((cly)$$3).bz) > 0.0F || aym.e(((cly)$$3).bB) > 0.0F)) {
            $$1 = true;
            break;
         }
      }

      return this.c != null && (aym.e(this.c.bz) > 0.0F || aym.e(this.c.bB) > 0.0F) || $$1;
   }

   @Override
   public boolean R_() {
      return true;
   }

   @Override
   public boolean b() {
      return this.c != null && this.c.bW() && (aym.e(this.c.bz) > 0.0F || aym.e(this.c.bB) > 0.0F);
   }

   @Override
   public void c() {
      for (cny $$1 : this.b.dU().a(cny.class, this.b.cP().g(5.0))) {
         if ($$1.cV() instanceof cly $$2) {
            this.c = $$2;
            break;
         }
      }

      this.a = 0;
      this.d = byu.a;
   }

   @Override
   public void d() {
      this.c = null;
   }

   @Override
   public void e() {
      boolean $$0 = aym.e(this.c.bz) > 0.0F || aym.e(this.c.bB) > 0.0F;
      float $$1 = this.d == byu.b ? ($$0 ? 0.01F : 0.0F) : 0.015F;
      this.b.a($$1, new ewu((double)this.b.bz, (double)this.b.bA, (double)this.b.bB));
      this.b.a(bst.a, this.b.dx());
      if (--this.a <= 0) {
         this.a = this.a(10);
         if (this.d == byu.a) {
            ir $$2 = this.c.du().a(this.c.cM().g());
            $$2 = $$2.b(0, -1, 0);
            this.b.J().a((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 1.0);
            if (this.b.f(this.c) < 4.0F) {
               this.a = 0;
               this.d = byu.b;
            }
         } else if (this.d == byu.b) {
            iw $$3 = this.c.cN();
            ir $$4 = this.c.du().a($$3, 10);
            this.b.J().a((double)$$4.u(), (double)($$4.v() - 1), (double)$$4.w(), 1.0);
            if (this.b.f(this.c) > 12.0F) {
               this.a = 0;
               this.d = byu.a;
            }
         }
      }
   }
}
