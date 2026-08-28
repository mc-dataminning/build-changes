import java.util.EnumSet;
import javax.annotation.Nullable;

public class cdn extends cef {
   private final cki a;
   @Nullable
   private crj b;
   private final arq c;
   private final float d;
   private int e;
   private final chy f;

   public cdn(cki $$0, float $$1) {
      this.a = $$0;
      this.c = a($$0);
      this.d = $$1;
      this.f = chy.b().a((double)$$1);
      this.a(EnumSet.of(cef.a.b));
   }

   @Override
   public boolean b() {
      this.b = this.c.a(this.f, this.a);
      return this.b == null ? false : this.a(this.b);
   }

   @Override
   public boolean c() {
      if (!this.b.bI()) {
         return false;
      } else {
         return this.a.g(this.b) > (double)(this.d * this.d) ? false : this.e > 0 && this.a(this.b);
      }
   }

   @Override
   public void d() {
      this.a.z(true);
      this.e = this.a(40 + this.a.dX().a(40));
   }

   @Override
   public void e() {
      this.a.z(false);
      this.b = null;
   }

   @Override
   public void a() {
      this.a.J().a(this.b.dz(), this.b.dD(), this.b.dF(), 10.0F, (float)this.a.ad());
      this.e--;
   }

   private boolean a(crj $$0) {
      for (buf $$1 : buf.values()) {
         czk $$2 = $$0.b($$1);
         if ($$2.a(czo.sH) || this.a.i($$2)) {
            return true;
         }
      }

      return false;
   }
}
