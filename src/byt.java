import java.util.EnumSet;
import javax.annotation.Nullable;

public class byt extends bzl {
   private final cfh a;
   @Nullable
   private cly b;
   private final dca c;
   private final float d;
   private int e;
   private final cde f;

   public byt(cfh $$0, float $$1) {
      this.a = $$0;
      this.c = $$0.dU();
      this.d = $$1;
      this.f = cde.b().a((double)$$1);
      this.a(EnumSet.of(bzl.a.b));
   }

   @Override
   public boolean a() {
      this.b = this.c.a(this.f, this.a);
      return this.b == null ? false : this.a(this.b);
   }

   @Override
   public boolean b() {
      if (!this.b.bI()) {
         return false;
      } else {
         return this.a.g((brv)this.b) > (double)(this.d * this.d) ? false : this.e > 0 && this.a(this.b);
      }
   }

   @Override
   public void c() {
      this.a.z(true);
      this.e = this.a(40 + this.a.et().a(40));
   }

   @Override
   public void d() {
      this.a.z(false);
      this.b = null;
   }

   @Override
   public void e() {
      this.a.F().a(this.b.dz(), this.b.dD(), this.b.dF(), 10.0F, (float)this.a.Z());
      this.e--;
   }

   private boolean a(cly $$0) {
      for (bpz $$1 : bpz.values()) {
         cuh $$2 = $$0.b($$1);
         if (this.a.r() && $$2.a(cuk.sW)) {
            return true;
         }

         if (this.a.o($$2)) {
            return true;
         }
      }

      return false;
   }
}
