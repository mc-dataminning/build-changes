import java.util.EnumSet;

public class cbb extends bzw {
   private final btv a;

   public cbb(btv $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bzw.a.c, bzw.a.a));
   }

   @Override
   public boolean b() {
      return this.a.gn();
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
         bsy $$0 = this.a.P_();
         if ($$0 == null) {
            return true;
         } else {
            return this.a.g((bsd)$$0) < 144.0 && $$0.ei() != null ? false : this.a.gn();
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
