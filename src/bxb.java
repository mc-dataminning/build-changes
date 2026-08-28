import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class bxb extends bwc<bum> {
   private static final int c = 100;
   private static final int d = 3;
   private static final int e = 6;
   private static final int f = 5;
   private final float g;
   @Nullable
   private je h;
   private int i;
   private int j;
   private int k;

   public bxb(float $$0) {
      super(ImmutableMap.of(cdn.w, cdo.a, cdn.m, cdo.b));
      this.g = $$0;
   }

   protected boolean a(arh $$0, bum $$1) {
      return $$1.o_() && this.b($$0, $$1);
   }

   protected void a(arh $$0, bum $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.a($$1).ifPresent($$2x -> {
         this.h = $$2x;
         this.i = 100;
         this.j = 3 + $$0.z.a(4);
         this.k = 0;
         this.a($$1, $$2x);
      });
   }

   protected void b(arh $$0, bum $$1, long $$2) {
      super.b($$0, $$1, $$2);
      this.h = null;
      this.i = 0;
      this.j = 0;
      this.k = 0;
   }

   protected boolean c(arh $$0, bum $$1, long $$2) {
      return $$1.o_() && this.h != null && this.a($$0, this.h) && !this.e($$0, $$1) && !this.f($$0, $$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected void d(arh $$0, bum $$1, long $$2) {
      if (!this.c($$0, $$1)) {
         this.i--;
      } else if (this.k > 0) {
         this.k--;
      } else {
         if (this.d($$0, $$1)) {
            $$1.O().a();
            this.j--;
            this.k = 5;
         }
      }
   }

   private void a(bum $$0, je $$1) {
      $$0.dX().a(cdn.m, new cdq($$1, this.g, 0));
   }

   private boolean b(arh $$0, bum $$1) {
      return this.c($$0, $$1) || this.a($$1).isPresent();
   }

   private boolean c(arh $$0, bum $$1) {
      je $$2 = $$1.ds();
      je $$3 = $$2.e();
      return this.a($$0, $$2) || this.a($$0, $$3);
   }

   private boolean d(arh $$0, bum $$1) {
      return this.a($$0, $$1.ds());
   }

   private boolean a(arh $$0, je $$1) {
      return $$0.a_($$1).a(awt.S);
   }

   private Optional<je> a(bum $$0) {
      return $$0.dX().c(cdn.w);
   }

   private boolean e(arh $$0, bum $$1) {
      return !this.c($$0, $$1) && this.i <= 0;
   }

   private boolean f(arh $$0, bum $$1) {
      return this.c($$0, $$1) && this.j <= 0;
   }
}
