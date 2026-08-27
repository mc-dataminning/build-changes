import com.mojang.serialization.MapCodec;

public abstract class cwg extends cwq {
   protected static final int a = 2;
   protected static final emm b = cwq.a(6.0, 0.0, 6.0, 10.0, 10.0, 10.0);

   protected cwg(djg.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends cwg> a();

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      return b;
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      return $$1 == ic.a && !this.a($$0, $$3, $$4) ? cws.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(djh $$0, cts $$1, hx $$2) {
      return a($$1, $$2.d(), ic.b);
   }
}
