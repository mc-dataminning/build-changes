import java.util.EnumSet;

public class bos extends bov {
   private final bgv a;
   private bfz b;
   private int c;

   public bos(bgv $$0) {
      super($$0, false);
      this.a = $$0;
      this.a(EnumSet.of(bmv.a.d));
   }

   @Override
   public boolean a() {
      if (this.a.q() && !this.a.fY()) {
         bfz $$0 = this.a.I_();
         if ($$0 == null) {
            return false;
         } else {
            this.b = $$0.ed();
            int $$1 = $$0.ee();
            return $$1 != this.c && this.a(this.b, bqm.a) && this.a.a(this.b, $$0);
         }
      } else {
         return false;
      }
   }

   @Override
   public void c() {
      this.e.h(this.b);
      bfz $$0 = this.a.I_();
      if ($$0 != null) {
         this.c = $$0.ee();
      }

      super.c();
   }
}
