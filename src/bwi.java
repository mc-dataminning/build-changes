import javax.annotation.Nullable;

public class bwi extends bwg {
   public bwi(bik<? extends bwi> $$0, cpk $$1) {
      super($$0, $$1);
   }

   @Override
   protected aot r() {
      return aou.fZ;
   }

   @Override
   protected aot gy() {
      return aou.ga;
   }

   @Override
   protected aot h_() {
      return aou.gc;
   }

   @Nullable
   @Override
   protected aot gg() {
      return aou.gd;
   }

   @Override
   protected aot d(bhe $$0) {
      return aou.ge;
   }

   @Override
   public boolean a(bui $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof bwi) && !($$0 instanceof bwj) ? false : this.gH() && ((bwh)$$0).gH();
      }
   }

   @Nullable
   @Override
   public bib a(aki $$0, bib $$1) {
      bik<? extends bwh> $$2 = $$1 instanceof bwj ? bik.ap : bik.w;
      bwh $$3 = $$2.a((cpk)$$0);
      if ($$3 != null) {
         this.a($$1, $$3);
      }

      return $$3;
   }
}
