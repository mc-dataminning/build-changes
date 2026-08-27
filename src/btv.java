import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class btv extends bsw<brg> {
   private static final int c = 100;
   private static final int d = 3;
   private static final int e = 6;
   private static final int f = 5;
   private final float g;
   @Nullable
   private im h;
   private int i;
   private int j;
   private int k;

   public btv(float $$0) {
      super(ImmutableMap.of(cah.w, cai.a, cah.m, cai.b));
      this.g = $$0;
   }

   protected boolean a(aqe $$0, brg $$1) {
      return $$1.p_() && this.b($$0, $$1);
   }

   protected void a(aqe $$0, brg $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.a($$1).ifPresent($$2x -> {
         this.h = $$2x;
         this.i = 100;
         this.j = 3 + $$0.z.a(4);
         this.k = 0;
         this.a($$1, $$2x);
      });
   }

   protected void b(aqe $$0, brg $$1, long $$2) {
      super.b($$0, $$1, $$2);
      this.h = null;
      this.i = 0;
      this.j = 0;
      this.k = 0;
   }

   protected boolean c(aqe $$0, brg $$1, long $$2) {
      return $$1.p_() && this.h != null && this.a($$0, this.h) && !this.e($$0, $$1) && !this.f($$0, $$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected void d(aqe $$0, brg $$1, long $$2) {
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

   private void a(brg $$0, im $$1) {
      $$0.dQ().a(cah.m, new cak($$1, this.g, 0));
   }

   private boolean b(aqe $$0, brg $$1) {
      return this.c($$0, $$1) || this.a($$1).isPresent();
   }

   private boolean c(aqe $$0, brg $$1) {
      im $$2 = $$1.dn();
      im $$3 = $$2.d();
      return this.a($$0, $$2) || this.a($$0, $$3);
   }

   private boolean d(aqe $$0, brg $$1) {
      return this.a($$0, $$1.dn());
   }

   private boolean a(aqe $$0, im $$1) {
      return $$0.a_($$1).a(avo.R);
   }

   private Optional<im> a(brg $$0) {
      return $$0.dQ().c(cah.w);
   }

   private boolean e(aqe $$0, brg $$1) {
      return !this.c($$0, $$1) && this.i <= 0;
   }

   private boolean f(aqe $$0, brg $$1) {
      return this.c($$0, $$1) && this.j <= 0;
   }
}
