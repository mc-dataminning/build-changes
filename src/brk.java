import java.util.EnumSet;

public class brk extends bqb {
   private final cbc a;

   public brk(cbc $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bqb.a.c, bqb.a.a));
   }

   @Override
   public boolean a() {
      if (!this.a.bw()) {
         return false;
      } else if (this.a.aY()) {
         return false;
      } else if (!this.a.aB()) {
         return false;
      } else if (this.a.T) {
         return false;
      } else {
         cbu $$0 = this.a.gd();
         if ($$0 == null) {
            return false;
         } else {
            return this.a.f($$0) > 16.0 ? false : $$0.bS != null;
         }
      }
   }

   @Override
   public void c() {
      this.a.L().n();
   }

   @Override
   public void d() {
      this.a.f(null);
   }
}
