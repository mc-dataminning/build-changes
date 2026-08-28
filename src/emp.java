import com.mojang.serialization.MapCodec;

public class emp extends emq {
   public static final emp a = new emp(eei.a(0));
   public static final MapCodec<emp> b = eei.a.fieldOf("value").xmap(emp::new, emp::b);
   private final eei d;

   public static emp a(eei $$0) {
      return new emp($$0);
   }

   private emp(eei $$0) {
      this.d = $$0;
   }

   public eei b() {
      return this.d;
   }

   @Override
   public int a(azh $$0, eel $$1) {
      return this.d.a($$1);
   }

   @Override
   public emr<?> a() {
      return emr.a;
   }

   @Override
   public String toString() {
      return this.d.toString();
   }
}
