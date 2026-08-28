import java.util.EnumSet;

public class cck extends ccn {
   private final bum a;
   private btp b;
   private int c;

   public cck(bum $$0) {
      super($$0, false);
      this.a = $$0;
      this.a(EnumSet.of(can.a.d));
   }

   @Override
   public boolean a() {
      if (this.a.s() && !this.a.gq()) {
         btp $$0 = this.a.P_();
         if ($$0 == null) {
            return false;
         } else {
            this.b = $$0.em();
            int $$1 = $$0.en();
            return $$1 != this.c && this.a(this.b, ceg.a) && this.a.a(this.b, $$0);
         }
      } else {
         return false;
      }
   }

   @Override
   public void c() {
      this.e.h(this.b);
      btp $$0 = this.a.P_();
      if ($$0 != null) {
         this.c = $$0.en();
      }

      super.c();
   }
}
