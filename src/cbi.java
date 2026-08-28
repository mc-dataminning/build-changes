import java.util.EnumSet;

public class cbi extends bzz {
   private final cls a;

   public cbi(cls $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bzz.a.c, bzz.a.a));
   }

   @Override
   public boolean a() {
      if (!this.a.bE()) {
         return false;
      } else if (this.a.bf()) {
         return false;
      } else if (!this.a.aF()) {
         return false;
      } else if (this.a.U) {
         return false;
      } else {
         cmk $$0 = this.a.go();
         if ($$0 == null) {
            return false;
         } else {
            return this.a.g($$0) > 16.0 ? false : $$0.cd != null;
         }
      }
   }

   @Override
   public void c() {
      this.a.K().n();
   }

   @Override
   public void d() {
      this.a.f(null);
   }
}
