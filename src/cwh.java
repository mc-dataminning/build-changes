import com.mojang.serialization.MapCodec;

public class cwh extends czo {
   public static final MapCodec<cwh> a = b(cwh::new);

   @Override
   public MapCodec<cwh> a() {
      return a;
   }

   public cwh(dhm.d $$0) {
      super($$0);
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, atw $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         hx $$4 = $$2.d();
         dhn $$5 = $$1.a_($$4);
         if (!a($$5.k($$1, $$4), ib.b)) {
            att.a($$1, $$2, $$3, jw.D);
         }
      }
   }
}
