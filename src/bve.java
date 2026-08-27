import java.util.EnumSet;

public class bve extends bvh {
   private final bng a;
   private bml b;
   private int c;

   public bve(bng $$0) {
      super($$0, false);
      this.a = $$0;
      this.a(EnumSet.of(bth.a.d));
   }

   @Override
   public boolean a() {
      if (this.a.u() && !this.a.ge()) {
         bml $$0 = this.a.R_();
         if ($$0 == null) {
            return false;
         } else {
            this.b = $$0.eh();
            int $$1 = $$0.ei();
            return $$1 != this.c && this.a(this.b, bwz.a) && this.a.a(this.b, $$0);
         }
      } else {
         return false;
      }
   }

   @Override
   public void c() {
      this.e.h(this.b);
      bml $$0 = this.a.R_();
      if ($$0 != null) {
         this.c = $$0.ei();
      }

      super.c();
   }
}
