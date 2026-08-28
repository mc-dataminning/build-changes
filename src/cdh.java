import java.util.EnumSet;

public class cdh extends cby {
   private final cnt a;

   public cdh(cnt $$0) {
      this.a = $$0;
      this.a(EnumSet.of(cby.a.c, cby.a.a));
   }

   @Override
   public boolean b() {
      if (!this.a.bM()) {
         return false;
      } else if (this.a.bk()) {
         return false;
      } else if (!this.a.aK()) {
         return false;
      } else if (this.a.U) {
         return false;
      } else {
         com $$0 = this.a.gu();
         if ($$0 == null) {
            return false;
         } else {
            return this.a.g($$0) > 16.0 ? false : $$0.cd != null;
         }
      }
   }

   @Override
   public void d() {
      this.a.P().o();
   }

   @Override
   public void e() {
      this.a.a(null);
   }
}
