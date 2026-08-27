import javax.annotation.Nullable;

public class bzi extends bzg {
   public bzi(blj<? extends bzi> $$0, csy $$1) {
      super($$0, $$1);
   }

   @Override
   protected arb y() {
      return arc.gC;
   }

   @Override
   protected arb gD() {
      return arc.gD;
   }

   @Override
   protected arb n_() {
      return arc.gF;
   }

   @Nullable
   @Override
   protected arb gl() {
      return arc.gG;
   }

   @Override
   protected arb d(bkd $$0) {
      return arc.gH;
   }

   @Override
   public boolean a(bxi $$0) {
      if ($$0 == this) {
         return false;
      } else {
         return !($$0 instanceof bzi) && !($$0 instanceof bzj) ? false : this.gM() && ((bzh)$$0).gM();
      }
   }

   @Nullable
   @Override
   public bla a(amp $$0, bla $$1) {
      blj<? extends bzh> $$2 = $$1 instanceof bzj ? blj.aq : blj.x;
      bzh $$3 = $$2.a((csy)$$0);
      if ($$3 != null) {
         this.a($$1, $$3);
      }

      return $$3;
   }
}
