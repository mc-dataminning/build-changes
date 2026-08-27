import com.mojang.serialization.MapCodec;

public abstract class dcy extends cyt {
   protected static final float f = 6.0F;
   protected static final float g = 10.0F;
   protected static final emm h = cwq.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   protected static final emm i = cwq.a(6.0, 6.0, 0.0, 10.0, 10.0, 16.0);
   protected static final emm j = cwq.a(0.0, 6.0, 6.0, 16.0, 10.0, 10.0);

   protected dcy(djg.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dcy> a();

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      switch ($$0.c(a).o()) {
         case a:
         default:
            return j;
         case c:
            return i;
         case b:
            return h;
      }
   }

   @Override
   public djh a(djh $$0, ddc $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public djh a(djh $$0, dbm $$1) {
      return $$0.a(a, $$1.b($$0.c(a)));
   }

   @Override
   public boolean a(djh $$0, csv $$1, hx $$2, efh $$3) {
      return false;
   }
}
