import java.util.EnumSet;

public class cau extends bzl {
   private final clg a;

   public cau(clg $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bzl.a.c, bzl.a.a));
   }

   @Override
   public boolean a() {
      if (!this.a.bI()) {
         return false;
      } else if (this.a.bi()) {
         return false;
      } else if (!this.a.aE()) {
         return false;
      } else if (this.a.V) {
         return false;
      } else {
         cly $$0 = this.a.gy();
         if ($$0 == null) {
            return false;
         } else {
            return this.a.g($$0) > 16.0 ? false : $$0.cq != null;
         }
      }
   }

   @Override
   public void c() {
      this.a.J().n();
   }

   @Override
   public void d() {
      this.a.f(null);
   }
}
