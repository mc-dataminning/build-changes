import java.util.EnumSet;

public class bri extends bqd {
   private final bkd a;

   public bri(bkd $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bqd.a.c, bqd.a.a));
   }

   @Override
   public boolean b() {
      return this.a.gd();
   }

   @Override
   public boolean a() {
      if (!this.a.s()) {
         return false;
      } else if (this.a.ba()) {
         return false;
      } else if (!this.a.aA()) {
         return false;
      } else {
         bji $$0 = this.a.O_();
         if ($$0 == null) {
            return true;
         } else {
            return this.a.f($$0) < 144.0 && $$0.eg() != null ? false : this.a.gd();
         }
      }
   }

   @Override
   public void c() {
      this.a.L().n();
      this.a.y(true);
   }

   @Override
   public void d() {
      this.a.y(false);
   }
}
