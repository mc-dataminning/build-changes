import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class bur extends bts<bsc> {
   private static final int c = 100;
   private static final int d = 3;
   private static final int e = 6;
   private static final int f = 5;
   private final float g;
   @Nullable
   private in h;
   private int i;
   private int j;
   private int k;

   public bur(float $$0) {
      super(ImmutableMap.of(cbd.w, cbe.a, cbd.m, cbe.b));
      this.g = $$0;
   }

   protected boolean a(aqh $$0, bsc $$1) {
      return $$1.p_() && this.b($$0, $$1);
   }

   protected void a(aqh $$0, bsc $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.a($$1).ifPresent($$2x -> {
         this.h = $$2x;
         this.i = 100;
         this.j = 3 + $$0.z.a(4);
         this.k = 0;
         this.a($$1, $$2x);
      });
   }

   protected void b(aqh $$0, bsc $$1, long $$2) {
      super.b($$0, $$1, $$2);
      this.h = null;
      this.i = 0;
      this.j = 0;
      this.k = 0;
   }

   protected boolean c(aqh $$0, bsc $$1, long $$2) {
      return $$1.p_() && this.h != null && this.a($$0, this.h) && !this.e($$0, $$1) && !this.f($$0, $$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected void d(aqh $$0, bsc $$1, long $$2) {
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

   private void a(bsc $$0, in $$1) {
      $$0.dQ().a(cbd.m, new cbg($$1, this.g, 0));
   }

   private boolean b(aqh $$0, bsc $$1) {
      return this.c($$0, $$1) || this.a($$1).isPresent();
   }

   private boolean c(aqh $$0, bsc $$1) {
      in $$2 = $$1.dn();
      in $$3 = $$2.d();
      return this.a($$0, $$2) || this.a($$0, $$3);
   }

   private boolean d(aqh $$0, bsc $$1) {
      return this.a($$0, $$1.dn());
   }

   private boolean a(aqh $$0, in $$1) {
      return $$0.a_($$1).a(avr.R);
   }

   private Optional<in> a(bsc $$0) {
      return $$0.dQ().c(cbd.w);
   }

   private boolean e(aqh $$0, bsc $$1) {
      return !this.c($$0, $$1) && this.i <= 0;
   }

   private boolean f(aqh $$0, bsc $$1) {
      return this.c($$0, $$1) && this.j <= 0;
   }
}
