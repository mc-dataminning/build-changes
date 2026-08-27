import java.util.EnumSet;

public class bwk extends bvf {
   private final bpe a;

   public bwk(bpe $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bvf.a.c, bvf.a.a));
   }

   @Override
   public boolean b() {
      return this.a.gg();
   }

   @Override
   public boolean a() {
      if (!this.a.u()) {
         return false;
      } else if (this.a.bc()) {
         return false;
      } else if (!this.a.aC()) {
         return false;
      } else {
         boi $$0 = this.a.R_();
         if ($$0 == null) {
            return true;
         } else {
            return this.a.f($$0) < 144.0 && $$0.ei() != null ? false : this.a.gg();
         }
      }
   }

   @Override
   public void c() {
      this.a.N().n();
      this.a.y(true);
   }

   @Override
   public void d() {
      this.a.y(false);
   }
}
