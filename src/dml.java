import com.mojang.serialization.MapCodec;

public class dml extends dmm {
   public static final MapCodec<dml> a = b(dml::new);
   private static final fgk c = dnc.b(12.0, 0.0, 15.0);

   @Override
   public MapCodec<dml> a() {
      return a;
   }

   protected dml(ebd.d $$0) {
      super($$0);
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return c;
   }
}
