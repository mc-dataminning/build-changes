import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class bpe extends bof<bmq> {
   private static final int c = 100;
   private static final int d = 3;
   private static final int e = 6;
   private static final int f = 5;
   private final float g;
   @Nullable
   private hx h;
   private int i;
   private int j;
   private int k;

   public bpe(float $$0) {
      super(ImmutableMap.of(bvq.w, bvr.a, bvq.m, bvr.b));
      this.g = $$0;
   }

   protected boolean a(ane $$0, bmq $$1) {
      return $$1.o_() && this.b($$0, $$1);
   }

   protected void a(ane $$0, bmq $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.a($$1).ifPresent($$2x -> {
         this.h = $$2x;
         this.i = 100;
         this.j = 3 + $$0.z.a(4);
         this.k = 0;
         this.a($$1, $$2x);
      });
   }

   protected void b(ane $$0, bmq $$1, long $$2) {
      super.b($$0, $$1, $$2);
      this.h = null;
      this.i = 0;
      this.j = 0;
      this.k = 0;
   }

   protected boolean c(ane $$0, bmq $$1, long $$2) {
      return $$1.o_() && this.h != null && this.a($$0, this.h) && !this.e($$0, $$1) && !this.f($$0, $$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected void d(ane $$0, bmq $$1, long $$2) {
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

   private void a(bmq $$0, hx $$1) {
      $$0.dN().a(bvq.m, new bvt($$1, this.g, 0));
   }

   private boolean b(ane $$0, bmq $$1) {
      return this.c($$0, $$1) || this.a($$1).isPresent();
   }

   private boolean c(ane $$0, bmq $$1) {
      hx $$2 = $$1.dl();
      hx $$3 = $$2.d();
      return this.a($$0, $$2) || this.a($$0, $$3);
   }

   private boolean d(ane $$0, bmq $$1) {
      return this.a($$0, $$1.dl());
   }

   private boolean a(ane $$0, hx $$1) {
      return $$0.a_($$1).a(asi.R);
   }

   private Optional<hx> a(bmq $$0) {
      return $$0.dN().c(bvq.w);
   }

   private boolean e(ane $$0, bmq $$1) {
      return !this.c($$0, $$1) && this.i <= 0;
   }

   private boolean f(ane $$0, bmq $$1) {
      return this.c($$0, $$1) && this.j <= 0;
   }
}
