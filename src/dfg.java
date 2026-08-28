import com.mojang.serialization.MapCodec;

public abstract class dfg extends dex {
   protected dfg(drz.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dfg> a();

   protected boolean b(dsa $$0, dbc $$1, iz $$2) {
      return $$0.a(awo.af) || $$0.a(dez.cC);
   }

   @Override
   protected dsa a(dsa $$0, je $$1, dsa $$2, dbx $$3, iz $$4, iz $$5) {
      return !$$0.a($$3, $$4) ? dez.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsa $$0, dbz $$1, iz $$2) {
      iz $$3 = $$2.d();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   protected boolean a_(dsa $$0, dbc $$1, iz $$2) {
      return $$0.u().c();
   }

   @Override
   protected boolean a(dsa $$0, eoi $$1) {
      return $$1 == eoi.c && !this.aG ? true : super.a($$0, $$1);
   }
}
