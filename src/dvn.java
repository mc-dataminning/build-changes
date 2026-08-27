import com.mojang.serialization.Codec;

public class dvn extends dvo {
   public static final dvn a = new dvn(dnl.a(0));
   public static final Codec<dvn> b = asu.e(dnl.a, dnl.a.fieldOf("value").codec()).xmap(dvn::new, dvn::b);
   private final dnl d;

   public static dvn a(dnl $$0) {
      return new dvn($$0);
   }

   private dvn(dnl $$0) {
      this.d = $$0;
   }

   public dnl b() {
      return this.d;
   }

   @Override
   public int a(ats $$0, dno $$1) {
      return this.d.a($$1);
   }

   @Override
   public dvp<?> a() {
      return dvp.a;
   }

   @Override
   public String toString() {
      return this.d.toString();
   }
}
