import com.mojang.serialization.MapCodec;

public abstract class deh extends ddy {
   protected deh(dra.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends deh> a();

   protected boolean b(drb $$0, dad $$1, io $$2) {
      return $$0.a(avw.af) || $$0.a(dea.cC);
   }

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      return !$$0.a($$3, $$4) ? dea.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(drb $$0, dba $$1, io $$2) {
      io $$3 = $$2.d();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   protected boolean a_(drb $$0, dad $$1, io $$2) {
      return $$0.u().c();
   }

   @Override
   protected boolean a(drb $$0, enj $$1) {
      return $$1 == enj.c && !this.aG ? true : super.a($$0, $$1);
   }
}
