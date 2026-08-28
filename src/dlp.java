import com.mojang.serialization.MapCodec;

public class dlp extends dlf implements dgy {
   public static final MapCodec<dlp> a = b(dlp::new);

   @Override
   public MapCodec<dlp> a() {
      return a;
   }

   public dlp(dtz.d $$0) {
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
      $$0.a($$2.e(), dlq.c(), 2);
   }

   @Override
   public je a(je $$0) {
      return $$0.e();
   }
}
