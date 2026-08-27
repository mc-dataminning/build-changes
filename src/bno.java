import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class bno extends bmp<bla> {
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

   public bno(float $$0) {
      super(ImmutableMap.of(btz.w, bua.a, btz.m, bua.b));
      this.g = $$0;
   }

   protected boolean a(ama $$0, bla $$1) {
      return $$1.n_() && this.b($$0, $$1);
   }

   protected void a(ama $$0, bla $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.a($$1).ifPresent($$2x -> {
         this.h = $$2x;
         this.i = 100;
         this.j = 3 + $$0.z.a(4);
         this.k = 0;
         this.a($$1, $$2x);
      });
   }

   protected void b(ama $$0, bla $$1, long $$2) {
      super.b($$0, $$1, $$2);
      this.h = null;
      this.i = 0;
      this.j = 0;
      this.k = 0;
   }

   protected boolean c(ama $$0, bla $$1, long $$2) {
      return $$1.n_() && this.h != null && this.a($$0, this.h) && !this.e($$0, $$1) && !this.f($$0, $$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected void d(ama $$0, bla $$1, long $$2) {
      if (!this.c($$0, $$1)) {
         this.i--;
      } else if (this.k > 0) {
         this.k--;
      } else {
         if (this.d($$0, $$1)) {
            $$1.K().a();
            this.j--;
            this.k = 5;
         }
      }
   }

   private void a(bla $$0, ht $$1) {
      $$0.dN().a(btz.m, new buc($$1, this.g, 0));
   }

   private boolean b(ama $$0, bla $$1) {
      return this.c($$0, $$1) || this.a($$1).isPresent();
   }

   private boolean c(ama $$0, bla $$1) {
      ht $$2 = $$1.dl();
      ht $$3 = $$2.d();
      return this.a($$0, $$2) || this.a($$0, $$3);
   }

   private boolean d(ama $$0, bla $$1) {
      return this.a($$0, $$1.dl());
   }

   private boolean a(ama $$0, ht $$1) {
      return $$0.a_($$1).a(arc.R);
   }

   private Optional<ht> a(bla $$0) {
      return $$0.dN().c(btz.w);
   }

   private boolean e(ama $$0, bla $$1) {
      return !this.c($$0, $$1) && this.i <= 0;
   }

   private boolean f(ama $$0, bla $$1) {
      return this.c($$0, $$1) && this.j <= 0;
   }
}
