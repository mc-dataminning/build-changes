import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class byp extends bxq<bvz> {
   private static final int c = 100;
   private static final int d = 3;
   private static final int e = 6;
   private static final int f = 5;
   private final float g;
   @Nullable
   private jh h;
   private int i;
   private int j;
   private int k;

   public byp(float $$0) {
      super(ImmutableMap.of(cfb.w, cfc.a, cfb.m, cfc.b));
      this.g = $$0;
   }

   protected boolean a(arx $$0, bvz $$1) {
      return $$1.e_() && this.b($$0, $$1);
   }

   protected void a(arx $$0, bvz $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.a($$1).ifPresent($$2x -> {
         this.h = $$2x;
         this.i = 100;
         this.j = 3 + $$0.A.a(4);
         this.k = 0;
         this.a($$1, $$2x);
      });
   }

   protected void b(arx $$0, bvz $$1, long $$2) {
      super.b($$0, $$1, $$2);
      this.h = null;
      this.i = 0;
      this.j = 0;
      this.k = 0;
   }

   protected boolean c(arx $$0, bvz $$1, long $$2) {
      return $$1.e_() && this.h != null && this.a($$0, this.h) && !this.e($$0, $$1) && !this.f($$0, $$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected void d(arx $$0, bvz $$1, long $$2) {
      if (!this.c($$0, $$1)) {
         this.i--;
      } else if (this.k > 0) {
         this.k--;
      } else {
         if (this.d($$0, $$1)) {
            $$1.J().a();
            this.j--;
            this.k = 5;
         }
      }
   }

   private void a(bvz $$0, jh $$1) {
      $$0.ec().a(cfb.m, new cfe($$1, this.g, 0));
   }

   private boolean b(arx $$0, bvz $$1) {
      return this.c($$0, $$1) || this.a($$1).isPresent();
   }

   private boolean c(arx $$0, bvz $$1) {
      jh $$2 = $$1.dw();
      jh $$3 = $$2.e();
      return this.a($$0, $$2) || this.a($$0, $$3);
   }

   private boolean d(arx $$0, bvz $$1) {
      return this.a($$0, $$1.dw());
   }

   private boolean a(arx $$0, jh $$1) {
      return $$0.a_($$1).a(axk.T);
   }

   private Optional<jh> a(bvz $$0) {
      return $$0.ec().c(cfb.w);
   }

   private boolean e(arx $$0, bvz $$1) {
      return !this.c($$0, $$1) && this.i <= 0;
   }

   private boolean f(arx $$0, bvz $$1) {
      return this.c($$0, $$1) && this.j <= 0;
   }
}
