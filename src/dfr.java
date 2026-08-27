import com.mojang.serialization.MapCodec;

public class dfr extends cwz {
   public static final MapCodec<dfr> a = b(dfr::new);
   protected static final emm b = cwq.a(1.0, 0.0, 1.0, 15.0, 1.5, 15.0);

   @Override
   public MapCodec<dfr> a() {
      return a;
   }

   protected dfr(djg.d $$0) {
      super($$0);
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, blv $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$1 instanceof and && $$3 instanceof chc) {
         $$1.a(new hx($$2), true, $$3);
      }
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      return b;
   }

   @Override
   protected boolean b(djh $$0, csv $$1, hx $$2) {
      eer $$3 = $$1.b_($$2);
      eer $$4 = $$1.b_($$2.c());
      return ($$3.a() == ees.c || $$0.b() instanceof dan) && $$4.a() == ees.a;
   }
}
