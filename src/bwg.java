import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class bwg extends bvh<btp> {
   private static final int c = 100;
   private static final int d = 3;
   private static final int e = 6;
   private static final int f = 5;
   private final float g;
   @Nullable
   private jd h;
   private int i;
   private int j;
   private int k;

   public bwg(float $$0) {
      super(ImmutableMap.of(ccs.w, cct.a, ccs.m, cct.b));
      this.g = $$0;
   }

   protected boolean a(aqu $$0, btp $$1) {
      return $$1.o_() && this.b($$0, $$1);
   }

   protected void a(aqu $$0, btp $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.a($$1).ifPresent($$2x -> {
         this.h = $$2x;
         this.i = 100;
         this.j = 3 + $$0.z.a(4);
         this.k = 0;
         this.a($$1, $$2x);
      });
   }

   protected void b(aqu $$0, btp $$1, long $$2) {
      super.b($$0, $$1, $$2);
      this.h = null;
      this.i = 0;
      this.j = 0;
      this.k = 0;
   }

   protected boolean c(aqu $$0, btp $$1, long $$2) {
      return $$1.o_() && this.h != null && this.a($$0, this.h) && !this.e($$0, $$1) && !this.f($$0, $$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected void d(aqu $$0, btp $$1, long $$2) {
      if (!this.c($$0, $$1)) {
         this.i--;
      } else if (this.k > 0) {
         this.k--;
      } else {
         if (this.d($$0, $$1)) {
            $$1.L().a();
            this.j--;
            this.k = 5;
         }
      }
   }

   private void a(btp $$0, jd $$1) {
      $$0.dT().a(ccs.m, new ccv($$1, this.g, 0));
   }

   private boolean b(aqu $$0, btp $$1) {
      return this.c($$0, $$1) || this.a($$1).isPresent();
   }

   private boolean c(aqu $$0, btp $$1) {
      jd $$2 = $$1.do();
      jd $$3 = $$2.e();
      return this.a($$0, $$2) || this.a($$0, $$3);
   }

   private boolean d(aqu $$0, btp $$1) {
      return this.a($$0, $$1.do());
   }

   private boolean a(aqu $$0, jd $$1) {
      return $$0.a_($$1).a(awe.S);
   }

   private Optional<jd> a(btp $$0) {
      return $$0.dT().c(ccs.w);
   }

   private boolean e(aqu $$0, btp $$1) {
      return !this.c($$0, $$1) && this.i <= 0;
   }

   private boolean f(aqu $$0, btp $$1) {
      return this.c($$0, $$1) && this.j <= 0;
   }
}
