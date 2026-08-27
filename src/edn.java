import com.mojang.serialization.Codec;

public class edn extends edo {
   public static final edn a = new edn(dvl.a(0));
   public static final Codec<edn> b = aws.e(dvl.a, dvl.a.fieldOf("value").codec()).xmap(edn::new, edn::b);
   private final dvl d;

   public static edn a(dvl $$0) {
      return new edn($$0);
   }

   private edn(dvl $$0) {
      this.d = $$0;
   }

   public dvl b() {
      return this.d;
   }

   @Override
   public int a(axr $$0, dvo $$1) {
      return this.d.a($$1);
   }

   @Override
   public edp<?> a() {
      return edp.a;
   }

   @Override
   public String toString() {
      return this.d.toString();
   }
}
