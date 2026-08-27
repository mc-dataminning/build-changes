import com.mojang.serialization.MapCodec;

public abstract class cwf extends cwp {
   protected static final int a = 2;
   protected static final eml b = cwp.a(6.0, 0.0, 6.0, 10.0, 10.0, 10.0);

   protected cwf(djf.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends cwf> a();

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      return b;
   }

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      return $$1 == ic.a && !this.a($$0, $$3, $$4) ? cwr.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(djg $$0, ctr $$1, hx $$2) {
      return a($$1, $$2.d(), ic.b);
   }
}
