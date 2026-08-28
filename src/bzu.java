import java.util.EnumSet;
import javax.annotation.Nullable;

public class bzu extends cam {
   private final cgh a;
   @Nullable
   private cmx b;
   private final dcw c;
   private final float d;
   private int e;
   private final cef f;

   public bzu(cgh $$0, float $$1) {
      this.a = $$0;
      this.c = $$0.dP();
      this.d = $$1;
      this.f = cef.b().a((double)$$1);
      this.a(EnumSet.of(cam.a.b));
   }

   @Override
   public boolean b() {
      this.b = this.c.a(this.f, this.a);
      return this.b == null ? false : this.a(this.b);
   }

   @Override
   public boolean c() {
      if (!this.b.bE()) {
         return false;
      } else {
         return this.a.g(this.b) > (double)(this.d * this.d) ? false : this.e > 0 && this.a(this.b);
      }
   }

   @Override
   public void d() {
      this.a.z(true);
      this.e = this.a(40 + this.a.dS().a(40));
   }

   @Override
   public void e() {
      this.a.z(false);
      this.b = null;
   }

   @Override
   public void a() {
      this.a.I().a(this.b.du(), this.b.dy(), this.b.dA(), 10.0F, (float)this.a.ac());
      this.e--;
   }

   private boolean a(cmx $$0) {
      for (bqq $$1 : bqq.values()) {
         cuq $$2 = $$0.b($$1);
         if ($$2.a(cut.rz) || this.a.o($$2)) {
            return true;
         }
      }

      return false;
   }
}
