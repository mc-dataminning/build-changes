import com.mojang.serialization.MapCodec;

public class eqj extends eqk {
   public static final eqj a = new eqj(ehz.a(0));
   public static final MapCodec<eqj> b = ehz.a.fieldOf("value").xmap(eqj::new, eqj::b);
   private final ehz d;

   public static eqj a(ehz $$0) {
      return new eqj($$0);
   }

   private eqj(ehz $$0) {
      this.d = $$0;
   }

   public ehz b() {
      return this.d;
   }

   @Override
   public int a(azz $$0, eic $$1) {
      return this.d.a($$1);
   }

   @Override
   public eql<?> a() {
      return eql.a;
   }

   @Override
   public String toString() {
      return this.d.toString();
   }
}
