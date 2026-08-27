import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class bnw extends bmx<bli> {
   private static final int c = 100;
   private static final int d = 3;
   private static final int e = 6;
   private static final int f = 5;
   private final float g;
   @Nullable
   private ht h;
   private int i;
   private int j;
   private int k;

   public bnw(float $$0) {
      super(ImmutableMap.of(buh.w, bui.a, buh.m, bui.b));
      this.g = $$0;
   }

   protected boolean a(ame $$0, bli $$1) {
      return $$1.n_() && this.b($$0, $$1);
   }

   protected void a(ame $$0, bli $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.a($$1).ifPresent($$2x -> {
         this.h = $$2x;
         this.i = 100;
         this.j = 3 + $$0.z.a(4);
         this.k = 0;
         this.a($$1, $$2x);
      });
   }

   protected void b(ame $$0, bli $$1, long $$2) {
      super.b($$0, $$1, $$2);
      this.h = null;
      this.i = 0;
      this.j = 0;
      this.k = 0;
   }

   protected boolean c(ame $$0, bli $$1, long $$2) {
      return $$1.n_() && this.h != null && this.a($$0, this.h) && !this.e($$0, $$1) && !this.f($$0, $$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected void d(ame $$0, bli $$1, long $$2) {
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

   private void a(bli $$0, ht $$1) {
      $$0.dP().a(buh.m, new buk($$1, this.g, 0));
   }

   private boolean b(ame $$0, bli $$1) {
      return this.c($$0, $$1) || this.a($$1).isPresent();
   }

   private boolean c(ame $$0, bli $$1) {
      ht $$2 = $$1.dn();
      ht $$3 = $$2.d();
      return this.a($$0, $$2) || this.a($$0, $$3);
   }

   private boolean d(ame $$0, bli $$1) {
      return this.a($$0, $$1.dn());
   }

   private boolean a(ame $$0, ht $$1) {
      return $$0.a_($$1).a(arg.R);
   }

   private Optional<ht> a(bli $$0) {
      return $$0.dP().c(buh.w);
   }

   private boolean e(ame $$0, bli $$1) {
      return !this.c($$0, $$1) && this.i <= 0;
   }

   private boolean f(ame $$0, bli $$1) {
      return this.c($$0, $$1) && this.j <= 0;
   }
}
