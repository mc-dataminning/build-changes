import javax.annotation.Nullable;

public abstract class crm extends csi {
   private final cht a;

   protected crm(cht $$0, dfi.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public boolean a(dfj $$0) {
      return true;
   }

   @Override
   public dcv a(gw $$0, dfj $$1) {
      return new dcl($$0, $$1, this.a);
   }

   @Override
   public void a(cpv $$0, gw $$1, dfj $$2, @Nullable bjg $$3, cjf $$4) {
      if ($$0.B) {
         $$0.a($$1, dcx.t).ifPresent($$1x -> $$1x.b($$4));
      } else if ($$4.A()) {
         $$0.a($$1, dcx.t).ifPresent($$1x -> $$1x.a($$4.y()));
      }
   }

   @Override
   public cjf a(cpb $$0, gw $$1, dfj $$2) {
      dcv $$3 = $$0.c_($$1);
      return $$3 instanceof dcl ? ((dcl)$$3).f() : super.a($$0, $$1, $$2);
   }

   public cht a() {
      return this.a;
   }
}
