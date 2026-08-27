import javax.annotation.Nullable;

public abstract class crh extends csd {
   private final cho a;

   protected crh(cho $$0, dfd.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public boolean a(dfe $$0) {
      return true;
   }

   @Override
   public dcq a(gw $$0, dfe $$1) {
      return new dcg($$0, $$1, this.a);
   }

   @Override
   public void a(cpq $$0, gw $$1, dfe $$2, @Nullable bjb $$3, cja $$4) {
      if ($$0.B) {
         $$0.a($$1, dcs.t).ifPresent($$1x -> $$1x.b($$4));
      } else if ($$4.A()) {
         $$0.a($$1, dcs.t).ifPresent($$1x -> $$1x.a($$4.y()));
      }
   }

   @Override
   public cja a(cow $$0, gw $$1, dfe $$2) {
      dcq $$3 = $$0.c_($$1);
      return $$3 instanceof dcg ? ((dcg)$$3).f() : super.a($$0, $$1, $$2);
   }

   public cho a() {
      return this.a;
   }
}
