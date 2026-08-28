import java.util.EnumSet;

public class ccp extends cbk {
   private final bvj a;

   public ccp(bvj $$0) {
      this.a = $$0;
      this.a(EnumSet.of(cbk.a.c, cbk.a.a));
   }

   @Override
   public boolean c() {
      return this.a.go();
   }

   @Override
   public boolean b() {
      if (!this.a.q()) {
         return false;
      } else if (this.a.bl()) {
         return false;
      } else if (!this.a.aH()) {
         return false;
      } else {
         bun $$0 = this.a.S_();
         if ($$0 == null) {
            return true;
         } else {
            return this.a.g((btr)$$0) < 144.0 && $$0.en() != null ? false : this.a.go();
         }
      }
   }

   @Override
   public void d() {
      this.a.P().o();
      this.a.y(true);
   }

   @Override
   public void e() {
      this.a.y(false);
   }
}
