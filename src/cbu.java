import java.util.EnumSet;

public class cbu extends cbw {
   private final btv a;
   private bsy b;
   private int c;

   public cbu(btv $$0) {
      super($$0, false);
      this.a = $$0;
      this.a(EnumSet.of(bzw.a.d));
   }

   @Override
   public boolean a() {
      if (this.a.s() && !this.a.gn()) {
         bsy $$0 = this.a.P_();
         if ($$0 == null) {
            return false;
         } else {
            this.b = $$0.ek();
            int $$1 = $$0.el();
            return $$1 != this.c && this.a(this.b, cdp.a) && this.a.a(this.b, $$0);
         }
      } else {
         return false;
      }
   }

   @Override
   public void c() {
      this.e.h(this.b);
      bsy $$0 = this.a.P_();
      if ($$0 != null) {
         this.c = $$0.el();
      }

      super.c();
   }
}
