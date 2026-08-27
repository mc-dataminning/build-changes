import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class biq extends bhr<bgb> {
   private static final int c = 100;
   private static final int d = 3;
   private static final int e = 6;
   private static final int f = 5;
   private final float g;
   @Nullable
   private gu h;
   private int i;
   private int j;
   private int k;

   public biq(float $$0) {
      super(ImmutableMap.of(bpb.w, bpc.a, bpb.m, bpc.b));
      this.g = $$0;
   }

   protected boolean a(aif $$0, bgb $$1) {
      return $$1.h_() && this.b($$0, $$1);
   }

   protected void a(aif $$0, bgb $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.a($$1).ifPresent($$2x -> {
         this.h = $$2x;
         this.i = 100;
         this.j = 3 + $$0.z.a(4);
         this.k = 0;
         this.a($$1, $$2x);
      });
   }

   protected void b(aif $$0, bgb $$1, long $$2) {
      super.b($$0, $$1, $$2);
      this.h = null;
      this.i = 0;
      this.j = 0;
      this.k = 0;
   }

   protected boolean c(aif $$0, bgb $$1, long $$2) {
      return $$1.h_() && this.h != null && this.a($$0, this.h) && !this.e($$0, $$1) && !this.f($$0, $$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected void d(aif $$0, bgb $$1, long $$2) {
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

   private void a(bgb $$0, gu $$1) {
      $$0.dK().a(bpb.m, new bpe($$1, this.g, 0));
   }

   private boolean b(aif $$0, bgb $$1) {
      return this.c($$0, $$1) || this.a($$1).isPresent();
   }

   private boolean c(aif $$0, bgb $$1) {
      gu $$2 = $$1.di();
      gu $$3 = $$2.d();
      return this.a($$0, $$2) || this.a($$0, $$3);
   }

   private boolean d(aif $$0, bgb $$1) {
      return this.a($$0, $$1.di());
   }

   private boolean a(aif $$0, gu $$1) {
      return $$0.a_($$1).a(amw.R);
   }

   private Optional<gu> a(bgb $$0) {
      return $$0.dK().c(bpb.w);
   }

   private boolean e(aif $$0, bgb $$1) {
      return !this.c($$0, $$1) && this.i <= 0;
   }

   private boolean f(aif $$0, bgb $$1) {
      return this.c($$0, $$1) && this.j <= 0;
   }
}
