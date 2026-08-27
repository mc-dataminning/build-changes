import java.util.EnumSet;

public class bzj extends bzl {
   private final brk a;
   private bqo b;
   private int c;

   public bzj(brk $$0) {
      super($$0, false);
      this.a = $$0;
      this.a(EnumSet.of(bxl.a.d));
   }

   @Override
   public boolean a() {
      if (this.a.r() && !this.a.gn()) {
         bqo $$0 = this.a.P_();
         if ($$0 == null) {
            return false;
         } else {
            this.b = $$0.el();
            int $$1 = $$0.em();
            return $$1 != this.c && this.a(this.b, cbe.a) && this.a.a(this.b, $$0);
         }
      } else {
         return false;
      }
   }

   @Override
   public void c() {
      this.e.h(this.b);
      bqo $$0 = this.a.P_();
      if ($$0 != null) {
         this.c = $$0.em();
      }

      super.c();
   }
}
