import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class bxe extends bwf<bup> {
   private static final int c = 100;
   private static final int d = 3;
   private static final int e = 6;
   private static final int f = 5;
   private final float g;
   @Nullable
   private jf h;
   private int i;
   private int j;
   private int k;

   public bxe(float $$0) {
      super(ImmutableMap.of(cdq.w, cdr.a, cdq.m, cdr.b));
      this.g = $$0;
   }

   protected boolean a(arj $$0, bup $$1) {
      return $$1.p_() && this.b($$0, $$1);
   }

   protected void a(arj $$0, bup $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.a($$1).ifPresent($$2x -> {
         this.h = $$2x;
         this.i = 100;
         this.j = 3 + $$0.z.a(4);
         this.k = 0;
         this.a($$1, $$2x);
      });
   }

   protected void b(arj $$0, bup $$1, long $$2) {
      super.b($$0, $$1, $$2);
      this.h = null;
      this.i = 0;
      this.j = 0;
      this.k = 0;
   }

   protected boolean c(arj $$0, bup $$1, long $$2) {
      return $$1.p_() && this.h != null && this.a($$0, this.h) && !this.e($$0, $$1) && !this.f($$0, $$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected void d(arj $$0, bup $$1, long $$2) {
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

   private void a(bup $$0, jf $$1) {
      $$0.dY().a(cdq.m, new cdt($$1, this.g, 0));
   }

   private boolean b(arj $$0, bup $$1) {
      return this.c($$0, $$1) || this.a($$1).isPresent();
   }

   private boolean c(arj $$0, bup $$1) {
      jf $$2 = $$1.ds();
      jf $$3 = $$2.e();
      return this.a($$0, $$2) || this.a($$0, $$3);
   }

   private boolean d(arj $$0, bup $$1) {
      return this.a($$0, $$1.ds());
   }

   private boolean a(arj $$0, jf $$1) {
      return $$0.a_($$1).a(awv.S);
   }

   private Optional<jf> a(bup $$0) {
      return $$0.dY().c(cdq.w);
   }

   private boolean e(arj $$0, bup $$1) {
      return !this.c($$0, $$1) && this.i <= 0;
   }

   private boolean f(arj $$0, bup $$1) {
      return this.c($$0, $$1) && this.j <= 0;
   }
}
