import java.util.EnumSet;

public class cfk extends cfn {
   private final bxn a;
   private bwr b;
   private int c;

   public cfk(bxn $$0) {
      super($$0, false);
      this.a = $$0;
      this.a(EnumSet.of(cdn.a.d));
   }

   @Override
   public boolean b() {
      if (this.a.q() && !this.a.gq()) {
         bwr $$0 = this.a.e();
         if ($$0 == null) {
            return false;
         } else {
            this.b = $$0.eq();
            int $$1 = $$0.es();
            return $$1 != this.c && this.a(this.b, chg.a) && this.a.a(this.b, $$0);
         }
      } else {
         return false;
      }
   }

   @Override
   public void d() {
      this.e.h(this.b);
      bwr $$0 = this.a.e();
      if ($$0 != null) {
         this.c = $$0.es();
      }

      super.d();
   }
}
