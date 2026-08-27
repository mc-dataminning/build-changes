import com.mojang.serialization.MapCodec;

public abstract class cwy extends cwp {
   protected cwy(djf.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends cwy> a();

   protected boolean b(djg $$0, csu $$1, hx $$2) {
      return $$0.a(asg.af) || $$0.a(cwr.cC);
   }

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      return !$$0.a($$3, $$4) ? cwr.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(djg $$0, ctr $$1, hx $$2) {
      hx $$3 = $$2.d();
      return this.b($$1.a_($$3), $$1, $$3);
   }

   @Override
   public boolean a_(djg $$0, csu $$1, hx $$2) {
      return $$0.u().c();
   }

   @Override
   public boolean a(djg $$0, csu $$1, hx $$2, efg $$3) {
      return $$3 == efg.c && !this.aG ? true : super.a($$0, $$1, $$2, $$3);
   }
}
