import com.mojang.serialization.Codec;

public class ebk extends ebl {
   public static final ebk a = new ebk(dti.a(0));
   public static final Codec<ebk> b = awe.e(dti.a, dti.a.fieldOf("value").codec()).xmap(ebk::new, ebk::b);
   private final dti d;

   public static ebk a(dti $$0) {
      return new ebk($$0);
   }

   private ebk(dti $$0) {
      this.d = $$0;
   }

   public dti b() {
      return this.d;
   }

   @Override
   public int a(axd $$0, dtl $$1) {
      return this.d.a($$1);
   }

   @Override
   public ebm<?> a() {
      return ebm.a;
   }

   @Override
   public String toString() {
      return this.d.toString();
   }
}
