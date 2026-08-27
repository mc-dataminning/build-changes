import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class bvf extends bug<bsq> {
   private static final int c = 100;
   private static final int d = 3;
   private static final int e = 6;
   private static final int f = 5;
   private final float g;
   @Nullable
   private ir h;
   private int i;
   private int j;
   private int k;

   public bvf(float $$0) {
      super(ImmutableMap.of(cbr.w, cbs.a, cbr.m, cbs.b));
      this.g = $$0;
   }

   protected boolean a(aqt $$0, bsq $$1) {
      return $$1.o_() && this.b($$0, $$1);
   }

   protected void a(aqt $$0, bsq $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.a($$1).ifPresent($$2x -> {
         this.h = $$2x;
         this.i = 100;
         this.j = 3 + $$0.A.a(4);
         this.k = 0;
         this.a($$1, $$2x);
      });
   }

   protected void b(aqt $$0, bsq $$1, long $$2) {
      super.b($$0, $$1, $$2);
      this.h = null;
      this.i = 0;
      this.j = 0;
      this.k = 0;
   }

   protected boolean c(aqt $$0, bsq $$1, long $$2) {
      return $$1.o_() && this.h != null && this.a($$0, this.h) && !this.e($$0, $$1) && !this.f($$0, $$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected void d(aqt $$0, bsq $$1, long $$2) {
      if (!this.c($$0, $$1)) {
         this.i--;
      } else if (this.k > 0) {
         this.k--;
      } else {
         if (this.d($$0, $$1)) {
            $$1.I().a();
            this.j--;
            this.k = 5;
         }
      }
   }

   private void a(bsq $$0, ir $$1) {
      $$0.dZ().a(cbr.m, new cbu($$1, this.g, 0));
   }

   private boolean b(aqt $$0, bsq $$1) {
      return this.c($$0, $$1) || this.a($$1).isPresent();
   }

   private boolean c(aqt $$0, bsq $$1) {
      ir $$2 = $$1.du();
      ir $$3 = $$2.d();
      return this.a($$0, $$2) || this.a($$0, $$3);
   }

   private boolean d(aqt $$0, bsq $$1) {
      return this.a($$0, $$1.du());
   }

   private boolean a(aqt $$0, ir $$1) {
      return $$0.a_($$1).a(awe.R);
   }

   private Optional<ir> a(bsq $$0) {
      return $$0.dZ().c(cbr.w);
   }

   private boolean e(aqt $$0, bsq $$1) {
      return !this.c($$0, $$1) && this.i <= 0;
   }

   private boolean f(aqt $$0, bsq $$1) {
      return this.c($$0, $$1) && this.j <= 0;
   }
}
