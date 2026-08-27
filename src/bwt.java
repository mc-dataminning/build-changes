import java.util.EnumSet;
import javax.annotation.Nullable;

public class bwt extends bxl {
   private final cdg a;
   @Nullable
   private cjt b;
   private final cyx c;
   private final float d;
   private int e;
   private final cbe f;

   public bwt(cdg $$0, float $$1) {
      this.a = $$0;
      this.c = $$0.dM();
      this.d = $$1;
      this.f = cbe.b().a((double)$$1);
      this.a(EnumSet.of(bxl.a.b));
   }

   @Override
   public boolean a() {
      this.b = this.c.a(this.f, this.a);
      return this.b == null ? false : this.a(this.b);
   }

   @Override
   public boolean b() {
      if (!this.b.bA()) {
         return false;
      } else {
         return this.a.g((bpv)this.b) > (double)(this.d * this.d) ? false : this.e > 0 && this.a(this.b);
      }
   }

   @Override
   public void c() {
      this.a.z(true);
      this.e = this.a(40 + this.a.ei().a(40));
   }

   @Override
   public void d() {
      this.a.z(false);
      this.b = null;
   }

   @Override
   public void e() {
      this.a.G().a(this.b.dr(), this.b.dv(), this.b.dx(), 10.0F, (float)this.a.Z());
      this.e--;
   }

   private boolean a(cjt $$0) {
      for (bnz $$1 : bnz.values()) {
         crj $$2 = $$0.b($$1);
         if (this.a.r() && $$2.a(crm.ry)) {
            return true;
         }

         if (this.a.o($$2)) {
            return true;
         }
      }

      return false;
   }
}
