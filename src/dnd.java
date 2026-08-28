import com.mojang.serialization.MapCodec;

public class dnd extends djo {
   public static final MapCodec<dnd> a = b(dnd::new);

   @Override
   public MapCodec<dnd> a() {
      return a;
   }

   public dnd(dtb.d $$0) {
      super($$0);
   }

   @Override
   public void a(dcw $$0, dtc $$1, jd $$2, bsr $$3, float $$4) {
      if ($$3.bY()) {
         super.a($$0, $$1, $$2, $$3, $$4);
      } else {
         $$3.a($$4, 0.0F, $$0.aj().l());
      }
   }

   @Override
   public void a(dcc $$0, bsr $$1) {
      if ($$1.bY()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(bsr $$0) {
      exa $$1 = $$0.ds();
      if ($$1.d < 0.0) {
         double $$2 = $$0 instanceof btn ? 1.0 : 0.8;
         $$0.n($$1.c, -$$1.d * $$2, $$1.e);
      }
   }

   @Override
   public void a(dcw $$0, jd $$1, dtc $$2, bsr $$3) {
      double $$4 = Math.abs($$3.ds().d);
      if ($$4 < 0.1 && !$$3.bX()) {
         double $$5 = 0.4 + $$4 * 0.2;
         $$3.i($$3.ds().d($$5, 1.0, $$5));
      }

      super.a($$0, $$1, $$2, $$3);
   }
}
