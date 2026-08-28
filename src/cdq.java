import java.util.EnumSet;

public class cdq extends cdt {
   private final bvs a;
   private buv b;
   private int c;

   public cdq(bvs $$0) {
      super($$0, false);
      this.a = $$0;
      this.a(EnumSet.of(cbt.a.d));
   }

   @Override
   public boolean b() {
      if (this.a.q() && !this.a.gv()) {
         buv $$0 = this.a.T_();
         if ($$0 == null) {
            return false;
         } else {
            this.b = $$0.es();
            int $$1 = $$0.et();
            return $$1 != this.c && this.a(this.b, cfm.a) && this.a.a(this.b, $$0);
         }
      } else {
         return false;
      }
   }

   @Override
   public void d() {
      this.e.h(this.b);
      buv $$0 = this.a.T_();
      if ($$0 != null) {
         this.c = $$0.et();
      }

      super.d();
   }
}
