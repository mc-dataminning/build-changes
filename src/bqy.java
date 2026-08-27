import java.util.EnumSet;

public class bqy extends bpt {
   private final bjt a;

   public bqy(bjt $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bpt.a.c, bpt.a.a));
   }

   @Override
   public boolean b() {
      return this.a.ga();
   }

   @Override
   public boolean a() {
      if (!this.a.p()) {
         return false;
      } else if (this.a.ba()) {
         return false;
      } else if (!this.a.aA()) {
         return false;
      } else {
         biy $$0 = this.a.I_();
         if ($$0 == null) {
            return true;
         } else {
            return this.a.f($$0) < 144.0 && $$0.ef() != null ? false : this.a.ga();
         }
      }
   }

   @Override
   public void c() {
      this.a.H().n();
      this.a.y(true);
   }

   @Override
   public void d() {
      this.a.y(false);
   }
}
