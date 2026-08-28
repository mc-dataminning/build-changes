import java.util.EnumSet;

public class ccm extends ccp {
   private final buo a;
   private btr b;
   private int c;

   public ccm(buo $$0) {
      super($$0, false);
      this.a = $$0;
      this.a(EnumSet.of(cap.a.d));
   }

   @Override
   public boolean a() {
      if (this.a.s() && !this.a.gq()) {
         btr $$0 = this.a.P_();
         if ($$0 == null) {
            return false;
         } else {
            this.b = $$0.em();
            int $$1 = $$0.en();
            return $$1 != this.c && this.a(this.b, cei.a) && this.a.a(this.b, $$0);
         }
      } else {
         return false;
      }
   }

   @Override
   public void c() {
      this.e.h(this.b);
      btr $$0 = this.a.P_();
      if ($$0 != null) {
         this.c = $$0.en();
      }

      super.c();
   }
}
