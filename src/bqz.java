import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class bqz extends bqa<bok> {
   private static final int c = 100;
   private static final int d = 3;
   private static final int e = 6;
   private static final int f = 5;
   private final float g;
   @Nullable
   private hz h;
   private int i;
   private int j;
   private int k;

   public bqz(float $$0) {
      super(ImmutableMap.of(bxl.w, bxm.a, bxl.m, bxm.b));
      this.g = $$0;
   }

   protected boolean a(aow $$0, bok $$1) {
      return $$1.o_() && this.b($$0, $$1);
   }

   protected void a(aow $$0, bok $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.a($$1).ifPresent($$2x -> {
         this.h = $$2x;
         this.i = 100;
         this.j = 3 + $$0.z.a(4);
         this.k = 0;
         this.a($$1, $$2x);
      });
   }

   protected void b(aow $$0, bok $$1, long $$2) {
      super.b($$0, $$1, $$2);
      this.h = null;
      this.i = 0;
      this.j = 0;
      this.k = 0;
   }

   protected boolean c(aow $$0, bok $$1, long $$2) {
      return $$1.o_() && this.h != null && this.a($$0, this.h) && !this.e($$0, $$1) && !this.f($$0, $$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected void d(aow $$0, bok $$1, long $$2) {
      if (!this.c($$0, $$1)) {
         this.i--;
      } else if (this.k > 0) {
         this.k--;
      } else {
         if (this.d($$0, $$1)) {
            $$1.M().a();
            this.j--;
            this.k = 5;
         }
      }
   }

   private void a(bok $$0, hz $$1) {
      $$0.dO().a(bxl.m, new bxo($$1, this.g, 0));
   }

   private boolean b(aow $$0, bok $$1) {
      return this.c($$0, $$1) || this.a($$1).isPresent();
   }

   private boolean c(aow $$0, bok $$1) {
      hz $$2 = $$1.dm();
      hz $$3 = $$2.d();
      return this.a($$0, $$2) || this.a($$0, $$3);
   }

   private boolean d(aow $$0, bok $$1) {
      return this.a($$0, $$1.dm());
   }

   private boolean a(aow $$0, hz $$1) {
      return $$0.a_($$1).a(aua.R);
   }

   private Optional<hz> a(bok $$0) {
      return $$0.dO().c(bxl.w);
   }

   private boolean e(aow $$0, bok $$1) {
      return !this.c($$0, $$1) && this.i <= 0;
   }

   private boolean f(aow $$0, bok $$1) {
      return this.c($$0, $$1) && this.j <= 0;
   }
}
