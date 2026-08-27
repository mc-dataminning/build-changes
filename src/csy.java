import com.mojang.serialization.MapCodec;

public class csy extends cua {
   public static final MapCodec<csy> a = b(csy::new);

   @Override
   public MapCodec<? extends csy> a() {
      return a;
   }

   public csy(dga.d $$0) {
      super($$0);
   }

   @Override
   public void a(cqz $$0, dgb $$1, eib $$2, cdp $$3) {
      if (!$$0.B) {
         ht $$4 = $$2.a();
         $$0.a(null, $$4, aqd.G, aqe.e, 1.0F, 0.5F + $$0.z.i() * 1.2F);
         $$0.a(null, $$4, aqd.E, aqe.e, 1.0F, 0.5F + $$0.z.i() * 1.2F);
      }
   }
}
