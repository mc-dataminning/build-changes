import com.mojang.serialization.MapCodec;

public class czf extends cyo {
   public static final MapCodec<czf> a = b(czf::new);
   protected static final eol b = cyo.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);

   @Override
   public MapCodec<? extends czf> a() {
      return a;
   }

   public czf(dle.d $$0) {
      super($$0);
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return b;
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      return !$$0.a($$3, $$4) ? cyq.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dlf $$0, cvq $$1, hz $$2) {
      return !$$1.u($$2.d());
   }
}
