import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class bsf extends brg<bpq> {
   private static final int c = 100;
   private static final int d = 3;
   private static final int e = 6;
   private static final int f = 5;
   private final float g;
   @Nullable
   private ib h;
   private int i;
   private int j;
   private int k;

   public bsf(float $$0) {
      super(ImmutableMap.of(byr.w, bys.a, byr.m, bys.b));
      this.g = $$0;
   }

   protected boolean a(apf $$0, bpq $$1) {
      return $$1.o_() && this.b($$0, $$1);
   }

   protected void a(apf $$0, bpq $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.a($$1).ifPresent($$2x -> {
         this.h = $$2x;
         this.i = 100;
         this.j = 3 + $$0.z.a(4);
         this.k = 0;
         this.a($$1, $$2x);
      });
   }

   protected void b(apf $$0, bpq $$1, long $$2) {
      super.b($$0, $$1, $$2);
      this.h = null;
      this.i = 0;
      this.j = 0;
      this.k = 0;
   }

   protected boolean c(apf $$0, bpq $$1, long $$2) {
      return $$1.o_() && this.h != null && this.a($$0, this.h) && !this.e($$0, $$1) && !this.f($$0, $$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected void d(apf $$0, bpq $$1, long $$2) {
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

   private void a(bpq $$0, ib $$1) {
      $$0.dP().a(byr.m, new byu($$1, this.g, 0));
   }

   private boolean b(apf $$0, bpq $$1) {
      return this.c($$0, $$1) || this.a($$1).isPresent();
   }

   private boolean c(apf $$0, bpq $$1) {
      ib $$2 = $$1.dm();
      ib $$3 = $$2.d();
      return this.a($$0, $$2) || this.a($$0, $$3);
   }

   private boolean d(apf $$0, bpq $$1) {
      return this.a($$0, $$1.dm());
   }

   private boolean a(apf $$0, ib $$1) {
      return $$0.a_($$1).a(aun.R);
   }

   private Optional<ib> a(bpq $$0) {
      return $$0.dP().c(byr.w);
   }

   private boolean e(apf $$0, bpq $$1) {
      return !this.c($$0, $$1) && this.i <= 0;
   }

   private boolean f(apf $$0, bpq $$1) {
      return this.c($$0, $$1) && this.j <= 0;
   }
}
