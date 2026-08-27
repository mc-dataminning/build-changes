import com.mojang.serialization.Codec;

public class dvs extends dvt {
   public static final dvs a = new dvs(dnq.a(0));
   public static final Codec<dvs> b = asy.e(dnq.a, dnq.a.fieldOf("value").codec()).xmap(dvs::new, dvs::b);
   private final dnq d;

   public static dvs a(dnq $$0) {
      return new dvs($$0);
   }

   private dvs(dnq $$0) {
      this.d = $$0;
   }

   public dnq b() {
      return this.d;
   }

   @Override
   public int a(atw $$0, dnt $$1) {
      return this.d.a($$1);
   }

   @Override
   public dvu<?> a() {
      return dvu.a;
   }

   @Override
   public String toString() {
      return this.d.toString();
   }
}
