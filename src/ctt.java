import com.mojang.serialization.MapCodec;

public class ctt extends ctc {
   public static final MapCodec<ctt> a = b(ctt::new);
   protected static final eia b = ctc.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);

   @Override
   public MapCodec<? extends ctt> a() {
      return a;
   }

   public ctt(dfc.d $$0) {
      super($$0);
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return b;
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      return !$$0.a($$3, $$4) ? cte.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dfd $$0, cqe $$1, gw $$2) {
      return !$$1.t($$2.d());
   }
}
