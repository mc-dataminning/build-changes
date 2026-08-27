import com.mojang.serialization.MapCodec;

public class das extends cyo {
   public static final MapCodec<das> a = b(das::new);
   protected static final eol b = dbl.c;

   @Override
   public MapCodec<das> a() {
      return a;
   }

   protected das(dle.d $$0) {
      super($$0);
   }

   @Override
   protected boolean g_(dlf $$0) {
      return true;
   }

   @Override
   public dlf a(crg $$0) {
      return !this.o().a((cvq)$$0.q(), $$0.a()) ? cyo.a(this.o(), cyq.j.o(), $$0.q(), $$0.a()) : super.a($$0);
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      if ($$1 == ie.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dlf $$0, aov $$1, hz $$2, awo $$3) {
      dbl.a(null, $$0, $$1, $$2);
   }

   @Override
   protected boolean a(dlf $$0, cvq $$1, hz $$2) {
      dlf $$3 = $$1.a_($$2.c());
      return !$$3.e() || $$3.b() instanceof dbn;
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return b;
   }

   @Override
   protected boolean a(dlf $$0, cut $$1, hz $$2, ehf $$3) {
      return false;
   }
}
