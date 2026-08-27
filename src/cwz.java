import com.mojang.serialization.MapCodec;

public abstract class cwz extends cwq {
   protected cwz(djg.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends cwz> a();

   protected boolean b(djh $$0, csv $$1, hx $$2) {
      return $$0.a(ash.af) || $$0.a(cws.cC);
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      return !$$0.a($$3, $$4) ? cws.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(djh $$0, cts $$1, hx $$2) {
      hx $$3 = $$2.d();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   public boolean a_(djh $$0, csv $$1, hx $$2) {
      return $$0.u().c();
   }

   @Override
   public boolean a(djh $$0, csv $$1, hx $$2, efh $$3) {
      return $$3 == efh.c && !this.aG ? true : super.a($$0, $$1, $$2, $$3);
   }
}
