import com.mojang.serialization.MapCodec;

public abstract class dlk extends dlu {
   private static final feq a = dlu.b(4.0, 0.0, 10.0);

   protected dlk(dzn.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dlk> a();

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return a;
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      return $$4 == ja.a && !this.a($$0, $$1, $$3) ? dlw.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dzo $$0, dis $$1, iu $$2) {
      return a($$1, $$2.e(), ja.b);
   }
}
