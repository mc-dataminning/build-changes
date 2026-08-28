import com.mojang.serialization.MapCodec;

public class dmz extends dfd implements dex {
   public static final MapCodec<dmz> a = b(dmz::new);
   protected static final float b = 6.0F;
   protected static final ewf c = deu.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dmz> a() {
      return a;
   }

   protected dmz(drw.d $$0) {
      super($$0);
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      return c;
   }

   @Override
   public boolean b(dbw $$0, iz $$1, drx $$2) {
      return true;
   }

   @Override
   public boolean a(dbt $$0, azc $$1, iz $$2, drx $$3) {
      return true;
   }

   @Override
   public void a(arb $$0, azc $$1, iz $$2, drx $$3) {
      dhc $$4 = (dhc)($$3.a(dew.bu) ? dew.iI : dew.iH);
      if ($$4.n().a($$0, $$2) && $$0.u($$2.c())) {
         dhc.a($$0, $$4.n(), $$2, 2);
      }
   }
}
