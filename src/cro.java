import javax.annotation.Nullable;

public abstract class cro extends csk {
   private final chv a;

   protected cro(chv $$0, dfk.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public boolean a(dfl $$0) {
      return true;
   }

   @Override
   public dcx a(gw $$0, dfl $$1) {
      return new dcn($$0, $$1, this.a);
   }

   @Override
   public void a(cpx $$0, gw $$1, dfl $$2, @Nullable bji $$3, cjh $$4) {
      if ($$0.B) {
         $$0.a($$1, dcz.t).ifPresent($$1x -> $$1x.b($$4));
      } else if ($$4.A()) {
         $$0.a($$1, dcz.t).ifPresent($$1x -> $$1x.a($$4.y()));
      }
   }

   @Override
   public cjh a(cpd $$0, gw $$1, dfl $$2) {
      dcx $$3 = $$0.c_($$1);
      return $$3 instanceof dcn ? ((dcn)$$3).f() : super.a($$0, $$1, $$2);
   }

   public chv a() {
      return this.a;
   }
}
