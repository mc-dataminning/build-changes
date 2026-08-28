import com.mojang.serialization.MapCodec;

public class eiu extends eiv {
   public static final eiu a = new eiu(eaq.a(0));
   public static final MapCodec<eiu> b = eaq.a.fieldOf("value").xmap(eiu::new, eiu::b);
   private final eaq d;

   public static eiu a(eaq $$0) {
      return new eiu($$0);
   }

   private eiu(eaq $$0) {
      this.d = $$0;
   }

   public eaq b() {
      return this.d;
   }

   @Override
   public int a(azk $$0, eat $$1) {
      return this.d.a($$1);
   }

   @Override
   public eiw<?> a() {
      return eiw.a;
   }

   @Override
   public String toString() {
      return this.d.toString();
   }
}
