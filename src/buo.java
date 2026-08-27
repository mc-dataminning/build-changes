import java.util.EnumSet;

public class buo extends bur {
   private final bmq a;
   private blv b;
   private int c;

   public buo(bmq $$0) {
      super($$0, false);
      this.a = $$0;
      this.a(EnumSet.of(bsr.a.d));
   }

   @Override
   public boolean a() {
      if (this.a.u() && !this.a.ge()) {
         blv $$0 = this.a.R_();
         if ($$0 == null) {
            return false;
         } else {
            this.b = $$0.eh();
            int $$1 = $$0.ei();
            return $$1 != this.c && this.a(this.b, bwj.a) && this.a.a(this.b, $$0);
         }
      } else {
         return false;
      }
   }

   @Override
   public void c() {
      this.e.h(this.b);
      blv $$0 = this.a.R_();
      if ($$0 != null) {
         this.c = $$0.ei();
      }

      super.c();
   }
}
