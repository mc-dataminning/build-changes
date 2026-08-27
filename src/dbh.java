import com.mojang.serialization.MapCodec;

public class dbh extends cwp {
   public static final MapCodec<dbh> a = b(dbh::new);
   private static final int b = 20;

   @Override
   public MapCodec<dbh> a() {
      return a;
   }

   public dbh(djf.d $$0) {
      super($$0);
   }

   @Override
   public void a(cto $$0, hx $$1, djg $$2, blu $$3) {
      if (!$$3.bT() && $$3 instanceof bmk && !crk.j((bmk)$$3)) {
         $$3.a($$0.ai().e(), 1.0F);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(djg $$0, and $$1, hx $$2, auu $$3) {
      cwv.b($$1, $$2.c(), $$0);
   }

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      if ($$1 == ic.b && $$2.a(cwr.G)) {
         $$3.a($$4, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void b(djg $$0, cto $$1, hx $$2, djg $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }
}
