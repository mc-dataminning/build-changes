import java.util.EnumSet;
import javax.annotation.Nullable;

public class cdi extends cea {
   private final cke a;
   @Nullable
   private crc b;
   private final arq c;
   private final float d;
   private int e;
   private final cht f;

   public cdi(cke $$0, float $$1) {
      this.a = $$0;
      this.c = a($$0);
      this.d = $$1;
      this.f = cht.b().a((double)$$1);
      this.a(EnumSet.of(cea.a.b));
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

   private boolean a(crc $$0) {
      for (buc $$1 : buc.values()) {
         czd $$2 = $$0.b($$1);
         if ($$2.a(czh.sH) || this.a.i($$2)) {
            return true;
         }
      }

      return false;
   }
}
