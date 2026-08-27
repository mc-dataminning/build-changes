import com.mojang.serialization.MapCodec;

public abstract class ddo extends ddy {
   protected static final int a = 2;
   protected static final evd b = ddy.a(6.0, 0.0, 6.0, 10.0, 10.0, 10.0);

   protected ddo(dra.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends ddo> a();

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      return b;
   }

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      return $$1 == it.a && !this.a($$0, $$3, $$4) ? dea.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(drb $$0, dba $$1, io $$2) {
      return a($$1, $$2.d(), it.b);
   }
}
