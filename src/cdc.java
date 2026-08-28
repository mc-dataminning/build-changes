import java.util.EnumSet;

public class cdc extends cbt {
   private final cno a;

   public cdc(cno $$0) {
      this.a = $$0;
      this.a(EnumSet.of(cbt.a.c, cbt.a.a));
   }

   @Override
   public boolean b() {
      if (!this.a.bM()) {
         return false;
      } else if (this.a.bk()) {
         return false;
      } else if (!this.a.aJ()) {
         return false;
      } else if (this.a.U) {
         return false;
      } else {
         coh $$0 = this.a.gv();
         if ($$0 == null) {
            return false;
         } else {
            return this.a.g($$0) > 16.0 ? false : $$0.ca != null;
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
