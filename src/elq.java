import com.mojang.serialization.MapCodec;

public class elq extends elr {
   public static final elq a = new elq(edk.a(0));
   public static final MapCodec<elq> b = edk.a.fieldOf("value").xmap(elq::new, elq::b);
   private final edk d;

   public static elq a(edk $$0) {
      return new elq($$0);
   }

   private elq(edk $$0) {
      this.d = $$0;
   }

   public edk b() {
      return this.d;
   }

   @Override
   public int a(azg $$0, edn $$1) {
      return this.d.a($$1);
   }

   @Override
   public els<?> a() {
      return els.a;
   }

   @Override
   public String toString() {
      return this.d.toString();
   }
}
