import com.mojang.serialization.MapCodec;

public abstract class diz extends diq {
   protected diz(dvu.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends diz> a();

   protected boolean b(dvv $$0, der $$1, jh $$2) {
      return $$0.a(axc.ag) || $$0.a(dis.cC);
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      return !$$0.a($$1, $$3) ? dis.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dvv $$0, dfp $$1, jh $$2) {
      jh $$3 = $$2.e();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   protected boolean e_(dvv $$0) {
      return $$0.y().c();
   }

   @Override
   protected boolean a(dvv $$0, esk $$1) {
      return $$1 == esk.c && !this.aH ? true : super.a($$0, $$1);
   }
}
