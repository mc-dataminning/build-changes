import com.mojang.serialization.MapCodec;

public class cxh extends cwq {
   public static final MapCodec<cxh> a = b(cxh::new);
   protected static final emm b = cwq.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);

   @Override
   public MapCodec<? extends cxh> a() {
      return a;
   }

   public cxh(djg.d $$0) {
      super($$0);
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      return b;
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      return !$$0.a($$3, $$4) ? cws.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(djh $$0, cts $$1, hx $$2) {
      return !$$1.u($$2.d());
   }
}
