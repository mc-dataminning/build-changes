import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class cak extends bzl<bxw> {
   private static final int c = 100;
   private static final int d = 3;
   private static final int e = 6;
   private static final int f = 5;
   private final float g;
   @Nullable
   private iv h;
   private int i;
   private int j;
   private int k;

   public cak(float $$0) {
      super(ImmutableMap.of(cgw.x, cgx.a, cgw.n, cgx.b));
      this.g = $$0;
   }

   protected boolean a(ars $$0, bxw $$1) {
      return $$1.n_() && this.b($$0, $$1);
   }

   protected void a(ars $$0, bxw $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.a($$1).ifPresent($$2x -> {
         this.h = $$2x;
         this.i = 100;
         this.j = 3 + $$0.A.a(4);
         this.k = 0;
         this.a($$1, $$2x);
      });
   }

   protected void b(ars $$0, bxw $$1, long $$2) {
      super.b($$0, $$1, $$2);
      this.h = null;
      this.i = 0;
      this.j = 0;
      this.k = 0;
   }

   protected boolean c(ars $$0, bxw $$1, long $$2) {
      return $$1.n_() && this.h != null && this.a($$0, this.h) && !this.e($$0, $$1) && !this.f($$0, $$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected void d(ars $$0, bxw $$1, long $$2) {
      if (!this.c($$0, $$1)) {
         this.i--;
      } else if (this.k > 0) {
         this.k--;
      } else {
         if (this.d($$0, $$1)) {
            $$1.N().a();
            this.j--;
            this.k = 5;
         }
      }
   }

   private void a(bxw $$0, iv $$1) {
      $$0.ec().a(cgw.n, new cgz($$1, this.g, 0));
   }

   private boolean b(ars $$0, bxw $$1) {
      return this.c($$0, $$1) || this.a($$1).isPresent();
   }

   private boolean c(ars $$0, bxw $$1) {
      iv $$2 = $$1.dv();
      iv $$3 = $$2.e();
      return this.a($$0, $$2) || this.a($$0, $$3);
   }

   private boolean d(ars $$0, bxw $$1) {
      return this.a($$0, $$1.dv());
   }

   private boolean a(ars $$0, iv $$1) {
      return $$0.a_($$1).a(axe.T);
   }

   private Optional<iv> a(bxw $$0) {
      return $$0.ec().c(cgw.x);
   }

   private boolean e(ars $$0, bxw $$1) {
      return !this.c($$0, $$1) && this.i <= 0;
   }

   private boolean f(ars $$0, bxw $$1) {
      return this.c($$0, $$1) && this.j <= 0;
   }
}
