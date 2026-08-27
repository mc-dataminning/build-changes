import java.util.EnumSet;

public class brc extends bpt {
   private final cau a;

   public brc(cau $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bpt.a.c, bpt.a.a));
   }

   @Override
   public boolean a() {
      if (!this.a.bv()) {
         return false;
      } else if (this.a.aX()) {
         return false;
      } else if (!this.a.aA()) {
         return false;
      } else if (this.a.T) {
         return false;
      } else {
         cbm $$0 = this.a.ga();
         if ($$0 == null) {
            return false;
         } else {
            return this.a.f($$0) > 16.0 ? false : $$0.bQ != null;
         }
      }
   }

   @Override
   public void c() {
      this.a.H().n();
   }

   @Override
   public void d() {
      this.a.f(null);
   }
}
