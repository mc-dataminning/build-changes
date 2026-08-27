import com.mojang.serialization.MapCodec;

public class dim extends dde implements ddh {
   public static final MapCodec<dim> a = b(dim::new);

   @Override
   public MapCodec<dim> a() {
      return a;
   }

   public dim(dqg.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(dag $$0, in $$1, dqh $$2) {
      if (!$$0.a_($$1.c()).a((czj)$$0, $$1)) {
         return false;
      } else {
         for (in $$3 : in.c($$1.b(-1, -1, -1), $$1.b(1, 1, 1))) {
            if ($$0.a_($$3).a(avr.aL)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean a(dad $$0, ayg $$1, in $$2, dqh $$3) {
      return true;
   }

   @Override
   public void a(aqh $$0, ayg $$1, in $$2, dqh $$3) {
      boolean $$4 = false;
      boolean $$5 = false;

      for (in $$6 : in.c($$2.b(-1, -1, -1), $$2.b(1, 1, 1))) {
         dqh $$7 = $$0.a_($$6);
         if ($$7.a(ddg.on)) {
            $$5 = true;
         }

         if ($$7.a(ddg.ow)) {
            $$4 = true;
         }

         if ($$5 && $$4) {
            break;
         }
      }

      if ($$5 && $$4) {
         $$0.a($$2, $$1.h() ? ddg.on.n() : ddg.ow.n(), 3);
      } else if ($$5) {
         $$0.a($$2, ddg.on.n(), 3);
      } else if ($$4) {
         $$0.a($$2, ddg.ow.n(), 3);
      }
   }

   @Override
   public ddh.a aq_() {
      return ddh.a.a;
   }
}
