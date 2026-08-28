import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class bzu extends byv<bxg> {
   private static final int c = 100;
   private static final int d = 3;
   private static final int e = 6;
   private static final int f = 5;
   private final float g;
   @Nullable
   private iu h;
   private int i;
   private int j;
   private int k;

   public bzu(float $$0) {
      super(ImmutableMap.of(cgg.x, cgh.a, cgg.n, cgh.b));
      this.g = $$0;
   }

   protected boolean a(arq $$0, bxg $$1) {
      return $$1.n_() && this.b($$0, $$1);
   }

   protected void a(arq $$0, bxg $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.a($$1).ifPresent($$2x -> {
         this.h = $$2x;
         this.i = 100;
         this.j = 3 + $$0.A.a(4);
         this.k = 0;
         this.a($$1, $$2x);
      });
   }

   protected void b(arq $$0, bxg $$1, long $$2) {
      super.b($$0, $$1, $$2);
      this.h = null;
      this.i = 0;
      this.j = 0;
      this.k = 0;
   }

   protected boolean c(arq $$0, bxg $$1, long $$2) {
      return $$1.n_() && this.h != null && this.a($$0, this.h) && !this.e($$0, $$1) && !this.f($$0, $$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected void d(arq $$0, bxg $$1, long $$2) {
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

   private void a(bxg $$0, iu $$1) {
      $$0.ec().a(cgg.n, new cgj($$1, this.g, 0));
   }

   private boolean b(arq $$0, bxg $$1) {
      return this.c($$0, $$1) || this.a($$1).isPresent();
   }

   private boolean c(arq $$0, bxg $$1) {
      iu $$2 = $$1.dv();
      iu $$3 = $$2.e();
      return this.a($$0, $$2) || this.a($$0, $$3);
   }

   private boolean d(arq $$0, bxg $$1) {
      return this.a($$0, $$1.dv());
   }

   private boolean a(arq $$0, iu $$1) {
      return $$0.a_($$1).a(axc.T);
   }

   private Optional<iu> a(bxg $$0) {
      return $$0.ec().c(cgg.x);
   }

   private boolean e(arq $$0, bxg $$1) {
      return !this.c($$0, $$1) && this.i <= 0;
   }

   private boolean f(arq $$0, bxg $$1) {
      return this.c($$0, $$1) && this.j <= 0;
   }
}
