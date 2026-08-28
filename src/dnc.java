import com.mojang.serialization.MapCodec;

public class dnc extends dfg implements dfa {
   public static final MapCodec<dnc> a = b(dnc::new);
   protected static final float b = 6.0F;
   protected static final ewi c = dex.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dnc> a() {
      return a;
   }

   protected dnc(drz.d $$0) {
      super($$0);
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      return c;
   }

   @Override
   public boolean b(dbz $$0, iz $$1, dsa $$2) {
      return true;
   }

   @Override
   public boolean a(dbw $$0, azf $$1, iz $$2, dsa $$3) {
      return true;
   }

   @Override
   public void a(are $$0, azf $$1, iz $$2, dsa $$3) {
      dhf $$4 = (dhf)($$3.a(dez.bu) ? dez.iI : dez.iH);
      if ($$4.o().a($$0, $$2) && $$0.u($$2.c())) {
         dhf.a($$0, $$4.o(), $$2, 2);
      }
   }
}
