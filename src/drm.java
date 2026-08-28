import com.mojang.serialization.MapCodec;

public class drm extends dis {
   public static final MapCodec<drm> a = b(drm::new);
   protected static final fal b = dij.a(1.0, 0.0, 1.0, 15.0, 1.5, 15.0);

   @Override
   public MapCodec<drm> a() {
      return a;
   }

   protected drm(dvn.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dvo $$0, dff $$1, jh $$2, bui $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$1 instanceof arq && $$3 instanceof cqq) {
         $$1.a(new jh($$2), true, $$3);
      }
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return b;
   }

   @Override
   protected boolean b(dvo $$0, dek $$1, jh $$2) {
      ero $$3 = $$1.b_($$2);
      ero $$4 = $$1.b_($$2.d());
      return ($$3.a() == erp.c || $$0.b() instanceof dmg) && $$4.a() == erp.a;
   }
}
