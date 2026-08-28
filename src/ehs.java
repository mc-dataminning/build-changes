import com.mojang.serialization.MapCodec;

public class ehs extends eht {
   public static final ehs a = new ehs(dzp.a(0));
   public static final MapCodec<ehs> b = dzp.a.fieldOf("value").xmap(ehs::new, ehs::b);
   private final dzp d;

   public static ehs a(dzp $$0) {
      return new ehs($$0);
   }

   private ehs(dzp $$0) {
      this.d = $$0;
   }

   public dzp b() {
      return this.d;
   }

   @Override
   public int a(ayv $$0, dzs $$1) {
      return this.d.a($$1);
   }

   @Override
   public ehu<?> a() {
      return ehu.a;
   }

   @Override
   public String toString() {
      return this.d.toString();
   }
}
