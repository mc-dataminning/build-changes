import com.mojang.serialization.MapCodec;

public abstract class dcq extends dch {
   protected dcq(dph.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dcq> a();

   protected boolean b(dpi $$0, cym $$1, id $$2) {
      return $$0.a(ave.af) || $$0.a(dcj.cC);
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      return !$$0.a($$3, $$4) ? dcj.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dpi $$0, czj $$1, id $$2) {
      id $$3 = $$2.d();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   protected boolean a_(dpi $$0, cym $$1, id $$2) {
      return $$0.u().c();
   }

   @Override
   protected boolean a(dpi $$0, elq $$1) {
      return $$1 == elq.c && !this.aG ? true : super.a($$0, $$1);
   }
}
