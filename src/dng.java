import com.mojang.serialization.MapCodec;

public class dng extends dgv implements dgy {
   public static final MapCodec<dng> a = b(dng::new);

   @Override
   public MapCodec<dng> a() {
      return a;
   }

   public dng(dtz.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(ddv $$0, je $$1, dua $$2) {
      return $$0.a_($$1.e()).l();
   }

   @Override
   public boolean a(dds $$0, azk $$1, je $$2, dua $$3) {
      return true;
   }

   @Override
   public void a(arg $$0, azk $$1, je $$2, dua $$3) {
      $$0.b($$2.e(), dgx.sG.o());
   }

   @Override
   public je a(je $$0) {
      return $$0.e();
   }
}
