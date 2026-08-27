import com.mojang.serialization.MapCodec;

public class dbu extends cwz {
   public static final MapCodec<dbu> a = b(dbu::new);
   protected static final emm b = cwq.a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0);

   @Override
   public MapCodec<dbu> a() {
      return a;
   }

   public dbu(djg.d $$0) {
      super($$0);
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      return b;
   }

   @Override
   protected boolean b(djh $$0, csv $$1, hx $$2) {
      return $$0.a(ash.aK) || $$0.a(cws.dX) || super.b($$0, $$1, $$2);
   }
}
