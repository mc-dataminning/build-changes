import java.util.EnumSet;
import javax.annotation.Nullable;

public class cbo extends ccg {
   private final cic a;
   @Nullable
   private coy b;
   private final ard c;
   private final float d;
   private int e;
   private final cfz f;

   public cbo(cic $$0, float $$1) {
      this.a = $$0;
      this.c = a($$0);
      this.d = $$1;
      this.f = cfz.b().a((double)$$1);
      this.a(EnumSet.of(ccg.a.b));
   }

   @Override
   public boolean b() {
      this.b = this.c.a(this.f, this.a);
      return this.b == null ? false : this.a(this.b);
   }

   @Override
   public boolean c() {
      if (!this.b.bL()) {
         return false;
      } else {
         return this.a.g(this.b) > (double)(this.d * this.d) ? false : this.e > 0 && this.a(this.b);
      }
   }

   @Override
   public void d() {
      this.a.A(true);
      this.e = this.a(40 + this.a.dY().a(40));
   }

   @Override
   public void e() {
      this.a.A(false);
      this.b = null;
   }

   @Override
   public void a() {
      this.a.L().a(this.b.dA(), this.b.dE(), this.b.dG(), 10.0F, (float)this.a.ad());
      this.e--;
   }

   private boolean a(coy $$0) {
      for (bsk $$1 : bsk.values()) {
         cwq $$2 = $$0.b($$1);
         if ($$2.a(cwu.sw) || this.a.j($$2)) {
            return true;
         }
      }

      return false;
   }
}
