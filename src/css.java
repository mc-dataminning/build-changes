import com.mojang.serialization.MapCodec;

public abstract class css extends ctc {
   protected static final int a = 2;
   protected static final eia b = ctc.a(6.0, 0.0, 6.0, 10.0, 10.0, 10.0);

   protected css(dfc.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends css> a();

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return b;
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      return $$1 == ha.a && !this.a($$0, $$3, $$4) ? cte.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dfd $$0, cqe $$1, gw $$2) {
      return a($$1, $$2.d(), ha.b);
   }
}
