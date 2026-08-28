import com.mojang.serialization.MapCodec;

public class dnd extends dfh implements dfb {
   public static final MapCodec<dnd> a = b(dnd::new);
   protected static final float b = 6.0F;
   protected static final ewj c = dey.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dnd> a() {
      return a;
   }

   protected dnd(dsa.d $$0) {
      super($$0);
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return c;
   }

   @Override
   public boolean b(dca $$0, iz $$1, dsb $$2) {
      return true;
   }

   @Override
   public boolean a(dbx $$0, azg $$1, iz $$2, dsb $$3) {
      return true;
   }

   @Override
   public void a(are $$0, azg $$1, iz $$2, dsb $$3) {
      dhg $$4 = (dhg)($$3.a(dfa.bu) ? dfa.iI : dfa.iH);
      if ($$4.o().a($$0, $$2) && $$0.u($$2.c())) {
         dhg.a($$0, $$4.o(), $$2, 2);
      }
   }
}
