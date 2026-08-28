import java.util.EnumSet;

public class cda extends cdc {
   private final bvb a;
   private buf b;
   private int c;

   public cda(bvb $$0) {
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
            this.b = $$0.eo();
            int $$1 = $$0.ep();
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
         this.c = $$0.ep();
      }

      super.d();
   }
}
