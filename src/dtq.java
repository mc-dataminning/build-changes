import com.mojang.serialization.Codec;

public class dtq extends dtr {
   public static final dtq a = new dtq(dlo.a(0));
   public static final Codec<dtq> b = arh.e(dlo.a, dlo.a.fieldOf("value").codec()).xmap(dtq::new, dtq::b);
   private final dlo d;

   public static dtq a(dlo $$0) {
      return new dtq($$0);
   }

   private dtq(dlo $$0) {
      this.d = $$0;
   }

   public dlo b() {
      return this.d;
   }

   @Override
   public int a(ase $$0, dlr $$1) {
      return this.d.a($$1);
   }

   @Override
   public dts<?> a() {
      return dts.a;
   }

   @Override
   public String toString() {
      return this.d.toString();
   }
}
