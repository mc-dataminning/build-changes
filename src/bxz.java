import com.google.common.collect.ImmutableMap;
import java.util.Optional;
import javax.annotation.Nullable;

public class bxz extends bxa<bvj> {
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

   public bxz(float $$0) {
      super(ImmutableMap.of(cel.w, cem.a, cel.m, cem.b));
      this.g = $$0;
   }

   protected boolean a(arp $$0, bvj $$1) {
      return $$1.e_() && this.b($$0, $$1);
   }

   protected void a(arp $$0, bvj $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.a($$1).ifPresent($$2x -> {
         this.h = $$2x;
         this.i = 100;
         this.j = 3 + $$0.A.a(4);
         this.k = 0;
         this.a($$1, $$2x);
      });
   }

   protected void b(arp $$0, bvj $$1, long $$2) {
      super.b($$0, $$1, $$2);
      this.h = null;
      this.i = 0;
      this.j = 0;
      this.k = 0;
   }

   protected boolean c(arp $$0, bvj $$1, long $$2) {
      return $$1.e_() && this.h != null && this.a($$0, this.h) && !this.e($$0, $$1) && !this.f($$0, $$1);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected void d(arp $$0, bvj $$1, long $$2) {
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

   private void a(bvj $$0, jh $$1) {
      $$0.eb().a(cel.m, new ceo($$1, this.g, 0));
   }

   private boolean b(arp $$0, bvj $$1) {
      return this.c($$0, $$1) || this.a($$1).isPresent();
   }

   private boolean c(arp $$0, bvj $$1) {
      jh $$2 = $$1.dv();
      jh $$3 = $$2.e();
      return this.a($$0, $$2) || this.a($$0, $$3);
   }

   private boolean d(arp $$0, bvj $$1) {
      return this.a($$0, $$1.dv());
   }

   private boolean a(arp $$0, jh $$1) {
      return $$0.a_($$1).a(axc.S);
   }

   private Optional<jh> a(bvj $$0) {
      return $$0.eb().c(cel.w);
   }

   private boolean e(arp $$0, bvj $$1) {
      return !this.c($$0, $$1) && this.i <= 0;
   }

   private boolean f(arp $$0, bvj $$1) {
      return this.c($$0, $$1) && this.j <= 0;
   }
}
