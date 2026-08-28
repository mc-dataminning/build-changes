import java.util.EnumSet;

public class ccz extends cdc {
   private final bvb a;
   private buf b;
   private int c;

   public ccz(bvb $$0) {
      super($$0, false);
      this.a = $$0;
      this.a(EnumSet.of(cbc.a.d));
   }

   @Override
   public boolean b() {
      if (this.a.q() && !this.a.go()) {
         buf $$0 = this.a.R_();
         if ($$0 == null) {
            return false;
         } else {
            this.b = $$0.em();
            int $$1 = $$0.en();
            return $$1 != this.c && this.a(this.b, cev.a) && this.a.a(this.b, $$0);
         }
      } else {
         return false;
      }
   }

   @Override
   public void d() {
      this.e.h(this.b);
      buf $$0 = this.a.R_();
      if ($$0 != null) {
         this.c = $$0.en();
      }

      super.d();
   }
}
