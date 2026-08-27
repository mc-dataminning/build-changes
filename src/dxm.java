import com.mojang.serialization.Codec;

public class dxm extends dxn {
   public static final dxm a = new dxm(dpk.a(0));
   public static final Codec<dxm> b = atw.e(dpk.a, dpk.a.fieldOf("value").codec()).xmap(dxm::new, dxm::b);
   private final dpk d;

   public static dxm a(dpk $$0) {
      return new dxm($$0);
   }

   private dxm(dpk $$0) {
      this.d = $$0;
   }

   public dpk b() {
      return this.d;
   }

   @Override
   public int a(auv $$0, dpn $$1) {
      return this.d.a($$1);
   }

   @Override
   public dxo<?> a() {
      return dxo.a;
   }

   @Override
   public String toString() {
      return this.d.toString();
   }
}
