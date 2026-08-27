import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class bob extends bnc<bln> {
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

   public bob(float $$0) {
      super(ImmutableMap.of(bum.w, bun.a, bum.m, bun.b));
      this.g = $$0;
   }

   protected boolean a(ami $$0, bln $$1) {
      return $$1.o_() && this.b($$0, $$1);
   }

   protected void a(ami $$0, bln $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.a($$1).ifPresent($$2x -> {
         this.h = $$2x;
         this.i = 100;
         this.j = 3 + $$0.z.a(4);
         this.k = 0;
         this.a($$1, $$2x);
      });
   }

   protected void b(ami $$0, bln $$1, long $$2) {
      super.b($$0, $$1, $$2);
      this.h = null;
      this.i = 0;
      this.j = 0;
      this.k = 0;
   }

   protected boolean c(ami $$0, bln $$1, long $$2) {
      return $$1.o_() && this.h != null && this.a($$0, this.h) && !this.e($$0, $$1) && !this.f($$0, $$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected void d(ami $$0, bln $$1, long $$2) {
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

   private void a(bln $$0, hx $$1) {
      $$0.dP().a(bum.m, new bup($$1, this.g, 0));
   }

   private boolean b(ami $$0, bln $$1) {
      return this.c($$0, $$1) || this.a($$1).isPresent();
   }

   private boolean c(ami $$0, bln $$1) {
      hx $$2 = $$1.dn();
      hx $$3 = $$2.d();
      return this.a($$0, $$2) || this.a($$0, $$3);
   }

   private boolean d(ami $$0, bln $$1) {
      return this.a($$0, $$1.dn());
   }

   private boolean a(ami $$0, hx $$1) {
      return $$0.a_($$1).a(ark.R);
   }

   private Optional<hx> a(bln $$0) {
      return $$0.dP().c(bum.w);
   }

   private boolean e(ami $$0, bln $$1) {
      return !this.c($$0, $$1) && this.i <= 0;
   }

   private boolean f(ami $$0, bln $$1) {
      return this.c($$0, $$1) && this.j <= 0;
   }
}
