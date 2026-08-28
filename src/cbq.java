import java.util.EnumSet;

public class cbq extends cal {
   private final buk a;

   public cbq(buk $$0) {
      this.a = $$0;
      this.a(EnumSet.of(cal.a.c, cal.a.a));
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
         btn $$0 = this.a.P_();
         if ($$0 == null) {
            return true;
         } else {
            return this.a.g((bss)$$0) < 144.0 && $$0.em() != null ? false : this.a.gq();
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
