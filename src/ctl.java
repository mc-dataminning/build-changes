import com.mojang.serialization.MapCodec;

public abstract class ctl extends ctc {
   protected ctl(dfc.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends ctl> a();

   protected boolean d(dfd $$0, cph $$1, gw $$2) {
      return $$0.a(apv.af) || $$0.a(cte.cC);
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      return !$$0.a($$3, $$4) ? cte.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dfd $$0, cqe $$1, gw $$2) {
      gw $$3 = $$2.d();
      return this.d($$1.a_($$3), $$1, $$3);
   }

   @Override
   public boolean c(dfd $$0, cph $$1, gw $$2) {
      return $$0.u().c();
   }

   @Override
   public boolean a(dfd $$0, cph $$1, gw $$2, eaw $$3) {
      return $$3 == eaw.c && !this.aG ? true : super.a($$0, $$1, $$2, $$3);
   }
}
