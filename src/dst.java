import com.mojang.serialization.MapCodec;

public class dst extends djv {
   public static final MapCodec<dst> a = b(dst::new);
   protected static final fbt b = djl.a(1.0, 0.0, 1.0, 15.0, 1.5, 15.0);

   @Override
   public MapCodec<dst> a() {
      return a;
   }

   protected dst(dwv.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dww $$0, dgh $$1, ji $$2, buk $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$1 instanceof ard && $$3 instanceof cqt) {
         $$1.a(new ji($$2), true, $$3);
      }
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return b;
   }

   @Override
   protected boolean b(dww $$0, dfm $$1, ji $$2) {
      esy $$3 = $$1.b_($$2);
      esy $$4 = $$1.b_($$2.d());
      return ($$3.a() == esz.c || $$0.b() instanceof dnl) && $$4.a() == esz.a;
   }
}
