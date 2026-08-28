import java.util.EnumSet;

public class cfs extends cfv {
   private final bxv a;
   private bwz b;
   private int c;

   public cfs(bxv $$0) {
      super($$0, false);
      this.a = $$0;
      this.a(EnumSet.of(cdv.a.d));
   }

   @Override
   public boolean b() {
      if (this.a.q() && !this.a.gq()) {
         bwz $$0 = this.a.e();
         if ($$0 == null) {
            return false;
         } else {
            this.b = $$0.eq();
            int $$1 = $$0.es();
            return $$1 != this.c && this.a(this.b, cho.a) && this.a.a(this.b, $$0);
         }
      } else {
         return false;
      }
   }

   @Override
   public void d() {
      this.e.g(this.b);
      bwz $$0 = this.a.e();
      if ($$0 != null) {
         this.c = $$0.es();
      }

      super.d();
   }
}
