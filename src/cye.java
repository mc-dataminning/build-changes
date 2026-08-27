import com.mojang.serialization.MapCodec;

public abstract class cye extends cyo {
   protected static final int a = 2;
   protected static final eol b = cyo.a(6.0, 0.0, 6.0, 10.0, 10.0, 10.0);

   protected cye(dle.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends cye> a();

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return b;
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      return $$1 == ie.a && !this.a($$0, $$3, $$4) ? cyq.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dlf $$0, cvq $$1, hz $$2) {
      return a($$1, $$2.d(), ie.b);
   }
}
