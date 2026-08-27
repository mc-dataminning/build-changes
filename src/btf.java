import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class btf extends bsg<bqq> {
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

   public btf(float $$0) {
      super(ImmutableMap.of(bzr.w, bzs.a, bzr.m, bzs.b));
      this.g = $$0;
   }

   protected boolean a(aps $$0, bqq $$1) {
      return $$1.p_() && this.b($$0, $$1);
   }

   protected void a(aps $$0, bqq $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.a($$1).ifPresent($$2x -> {
         this.h = $$2x;
         this.i = 100;
         this.j = 3 + $$0.z.a(4);
         this.k = 0;
         this.a($$1, $$2x);
      });
   }

   protected void b(aps $$0, bqq $$1, long $$2) {
      super.b($$0, $$1, $$2);
      this.h = null;
      this.i = 0;
      this.j = 0;
      this.k = 0;
   }

   protected boolean c(aps $$0, bqq $$1, long $$2) {
      return $$1.p_() && this.h != null && this.a($$0, this.h) && !this.e($$0, $$1) && !this.f($$0, $$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected void d(aps $$0, bqq $$1, long $$2) {
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

   private void a(bqq $$0, ib $$1) {
      $$0.dP().a(bzr.m, new bzu($$1, this.g, 0));
   }

   private boolean b(aps $$0, bqq $$1) {
      return this.c($$0, $$1) || this.a($$1).isPresent();
   }

   private boolean c(aps $$0, bqq $$1) {
      ib $$2 = $$1.dm();
      ib $$3 = $$2.d();
      return this.a($$0, $$2) || this.a($$0, $$3);
   }

   private boolean d(aps $$0, bqq $$1) {
      return this.a($$0, $$1.dm());
   }

   private boolean a(aps $$0, ib $$1) {
      return $$0.a_($$1).a(avc.R);
   }

   private Optional<ib> a(bqq $$0) {
      return $$0.dP().c(bzr.w);
   }

   private boolean e(aps $$0, bqq $$1) {
      return !this.c($$0, $$1) && this.i <= 0;
   }

   private boolean f(aps $$0, bqq $$1) {
      return this.c($$0, $$1) && this.j <= 0;
   }
}
