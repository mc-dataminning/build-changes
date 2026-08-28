import java.util.EnumSet;
import javax.annotation.Nullable;

public class cbm extends cce {
   private final cia a;
   @Nullable
   private cox b;
   private final arc c;
   private final float d;
   private int e;
   private final cfx f;

   public cbm(cia $$0, float $$1) {
      this.a = $$0;
      this.c = a($$0);
      this.d = $$1;
      this.f = cfx.b().a((double)$$1);
      this.a(EnumSet.of(cce.a.b));
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
      this.e = this.a(40 + this.a.dZ().a(40));
   }

   @Override
   public void e() {
      this.a.A(false);
      this.b = null;
   }

   @Override
   public void a() {
      this.a.H().a(this.b.dB(), this.b.dF(), this.b.dH(), 10.0F, (float)this.a.aa());
      this.e--;
   }

   private boolean a(cox $$0) {
      for (bsi $$1 : bsi.values()) {
         cwp $$2 = $$0.b($$1);
         if ($$2.a(cwt.sw) || this.a.j($$2)) {
            return true;
         }
      }

      return false;
   }
}
