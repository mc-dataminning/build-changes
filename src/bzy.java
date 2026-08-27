import java.util.EnumSet;

public class bzy extends cab {
   private final bsa a;
   private bre b;
   private int c;

   public bzy(bsa $$0) {
      super($$0, false);
      this.a = $$0;
      this.a(EnumSet.of(byb.a.d));
   }

   @Override
   public boolean a() {
      if (this.a.r() && !this.a.gp()) {
         bre $$0 = this.a.P_();
         if ($$0 == null) {
            return false;
         } else {
            this.b = $$0.ek();
            int $$1 = $$0.el();
            return $$1 != this.c && this.a(this.b, cbu.a) && this.a.a(this.b, $$0);
         }
      } else {
         return false;
      }
   }

   @Override
   public void c() {
      this.e.h(this.b);
      bre $$0 = this.a.P_();
      if ($$0 != null) {
         this.c = $$0.el();
      }

      super.c();
   }
}
