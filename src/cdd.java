import java.util.EnumSet;
import javax.annotation.Nullable;

public class cdd extends cdv {
   private final cju a;
   @Nullable
   private cqs b;
   private final aro c;
   private final float d;
   private int e;
   private final cho f;

   public cdd(cju $$0, float $$1) {
      this.a = $$0;
      this.c = a($$0);
      this.d = $$1;
      this.f = cho.b().a((double)$$1);
      this.a(EnumSet.of(cdv.a.b));
   }

   @Override
   public boolean b() {
      this.b = this.c.a(this.f, this.a);
      return this.b == null ? false : this.a(this.b);
   }

   @Override
   public boolean c() {
      if (!this.b.bK()) {
         return false;
      } else {
         return this.a.g(this.b) > (double)(this.d * this.d) ? false : this.e > 0 && this.a(this.b);
      }
   }

   @Override
   public void d() {
      this.a.z(true);
      this.e = this.a(40 + this.a.dY().a(40));
   }

   @Override
   public void e() {
      this.a.z(false);
      this.b = null;
   }

   @Override
   public void a() {
      this.a.J().a(this.b.dA(), this.b.dE(), this.b.dG(), 10.0F, (float)this.a.ac());
      this.e--;
   }

   private boolean a(cqs $$0) {
      for (btx $$1 : btx.values()) {
         cys $$2 = $$0.b($$1);
         if ($$2.a(cyw.sA) || this.a.k($$2)) {
            return true;
         }
      }

      return false;
   }
}
