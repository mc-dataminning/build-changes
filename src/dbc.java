import com.mojang.serialization.MapCodec;

public class dbc extends dej {
   public static final MapCodec<dbc> a = b(dbc::new);

   @Override
   public MapCodec<dbc> a() {
      return a;
   }

   public dbc(dmy.d $$0) {
      super($$0);
   }

   @Override
   public void a(dmz $$0, cwz $$1, ib $$2, axd $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         ib $$4 = $$2.d();
         dmz $$5 = $$1.a_($$4);
         if (!a($$5.k($$1, $$4), ih.b)) {
            awz.a($$1, $$2, $$3, kc.G);
         }
      }
   }
}
