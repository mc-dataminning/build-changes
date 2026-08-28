import com.mojang.serialization.MapCodec;

public class ekd extends eke {
   public static final ekd a = new ekd(ebz.a(0));
   public static final MapCodec<ekd> b = ebz.a.fieldOf("value").xmap(ekd::new, ekd::b);
   private final ebz d;

   public static ekd a(ebz $$0) {
      return new ekd($$0);
   }

   private ekd(ebz $$0) {
      this.d = $$0;
   }

   public ebz b() {
      return this.d;
   }

   @Override
   public int a(azs $$0, ecc $$1) {
      return this.d.a($$1);
   }

   @Override
   public ekf<?> a() {
      return ekf.a;
   }

   @Override
   public String toString() {
      return this.d.toString();
   }
}
