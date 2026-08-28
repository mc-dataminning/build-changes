import com.mojang.serialization.MapCodec;

public class eph extends epi {
   public static final eph a = new eph(eha.a(0));
   public static final MapCodec<eph> b = eha.a.fieldOf("value").xmap(eph::new, eph::b);
   private final eha d;

   public static eph a(eha $$0) {
      return new eph($$0);
   }

   private eph(eha $$0) {
      this.d = $$0;
   }

   public eha b() {
      return this.d;
   }

   @Override
   public int a(azv $$0, ehd $$1) {
      return this.d.a($$1);
   }

   @Override
   public epj<?> a() {
      return epj.a;
   }

   @Override
   public String toString() {
      return this.d.toString();
   }
}
