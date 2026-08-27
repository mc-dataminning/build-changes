import java.util.EnumSet;

public class btr extends btt {
   private final blt a;
   private bky b;
   private int c;

   public btr(blt $$0) {
      super($$0, false);
      this.a = $$0;
      this.a(EnumSet.of(brt.a.d));
   }

   @Override
   public boolean a() {
      if (this.a.s() && !this.a.ge()) {
         bky $$0 = this.a.P_();
         if ($$0 == null) {
            return false;
         } else {
            this.b = $$0.ei();
            int $$1 = $$0.ej();
            return $$1 != this.c && this.a(this.b, bvk.a) && this.a.a(this.b, $$0);
         }
      } else {
         return false;
      }
   }

   @Override
   public void c() {
      this.e.h(this.b);
      bky $$0 = this.a.P_();
      if ($$0 != null) {
         this.c = $$0.ej();
      }

      super.c();
   }
}
