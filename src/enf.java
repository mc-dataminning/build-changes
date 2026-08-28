import com.mojang.serialization.MapCodec;

public class enf extends eng {
   public static final MapCodec<enf> a = MapCodec.unit(() -> enf.b);
   public static final enf b = new enf();

   private enf() {
   }

   @Override
   public boolean a(jd $$0, jd $$1, jd $$2, ayw $$3) {
      return true;
   }

   @Override
   protected enh<?> a() {
      return enh.a;
   }
}
