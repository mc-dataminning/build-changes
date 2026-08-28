import com.mojang.serialization.MapCodec;

public class emp extends emq {
   public static final emp a = new emp(eej.a(0));
   public static final MapCodec<emp> b = eej.a.fieldOf("value").xmap(emp::new, emp::b);
   private final eej d;

   public static emp a(eej $$0) {
      return new emp($$0);
   }

   private emp(eej $$0) {
      this.d = $$0;
   }

   public eej b() {
      return this.d;
   }

   @Override
   public int a(bam $$0, eem $$1) {
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
