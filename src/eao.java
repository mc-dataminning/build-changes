import com.mojang.serialization.MapCodec;

class eao implements eac {
   public static eao a = new eao();
   public static final MapCodec<eao> e = MapCodec.unit(() -> a);

   private eao() {
   }

   public boolean a(ddq $$0, jd $$1) {
      return true;
   }

   @Override
   public ead<?> a() {
      return ead.l;
   }
}
