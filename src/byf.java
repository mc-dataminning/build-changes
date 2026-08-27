import java.util.EnumSet;
import javax.annotation.Nullable;

public class byf extends byx {
   private final ces a;
   @Nullable
   private clh b;
   private final dad c;
   private final float d;
   private int e;
   private final ccq f;

   public byf(ces $$0, float $$1) {
      this.a = $$0;
      this.c = $$0.dN();
      this.d = $$1;
      this.f = ccq.b().a((double)$$1);
      this.a(EnumSet.of(byx.a.b));
   }

   @Override
   public boolean a() {
      this.b = this.c.a(this.f, this.a);
      return this.b == null ? false : this.a(this.b);
   }

   @Override
   public boolean b() {
      if (!this.b.bB()) {
         return false;
      } else {
         return this.a.g((brh)this.b) > (double)(this.d * this.d) ? false : this.e > 0 && this.a(this.b);
      }
   }

   @Override
   public void c() {
      this.a.z(true);
      this.e = this.a(40 + this.a.ej().a(40));
   }

   @Override
   public void d() {
      this.a.z(false);
      this.b = null;
   }

   @Override
   public void e() {
      this.a.G().a(this.b.ds(), this.b.dw(), this.b.dy(), 10.0F, (float)this.a.Z());
      this.e--;
   }

   private boolean a(clh $$0) {
      for (bpl $$1 : bpl.values()) {
         csz $$2 = $$0.b($$1);
         if (this.a.r() && $$2.a(ctc.rz)) {
            return true;
         }

         if (this.a.o($$2)) {
            return true;
         }
      }

      return false;
   }
}
