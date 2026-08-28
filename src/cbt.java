import java.util.EnumSet;

public class cbt extends cao {
   private final bun a;

   public cbt(bun $$0) {
      this.a = $$0;
      this.a(EnumSet.of(cao.a.c, cao.a.a));
   }

   @Override
   public boolean b() {
      return this.a.gq();
   }

   @Override
   public boolean a() {
      if (!this.a.s()) {
         return false;
      } else if (this.a.bh()) {
         return false;
      } else if (!this.a.aE()) {
         return false;
      } else {
         btq $$0 = this.a.P_();
         if ($$0 == null) {
            return true;
         } else {
            return this.a.g((bsv)$$0) < 144.0 && $$0.em() != null ? false : this.a.gq();
         }
      }
   }

   @Override
   public void c() {
      this.a.K().n();
      this.a.x(true);
   }

   @Override
   public void d() {
      this.a.x(false);
   }
}
