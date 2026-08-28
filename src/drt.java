import com.mojang.serialization.MapCodec;

public class drt extends diz {
   public static final MapCodec<drt> a = b(drt::new);
   protected static final fas b = diq.a(1.0, 0.0, 1.0, 15.0, 1.5, 15.0);

   @Override
   public MapCodec<drt> a() {
      return a;
   }

   protected drt(dvu.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dvv $$0, dfm $$1, jh $$2, bul $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$1 instanceof arp && $$3 instanceof cqr) {
         $$1.a(new jh($$2), true, $$3);
      }
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      return b;
   }

   @Override
   protected boolean b(dvv $$0, der $$1, jh $$2) {
      erv $$3 = $$1.b_($$2);
      erv $$4 = $$1.b_($$2.d());
      return ($$3.a() == erw.c || $$0.b() instanceof dmn) && $$4.a() == erw.a;
   }
}
