import com.mojang.serialization.Codec;

public class dxl extends dxm {
   public static final dxl a = new dxl(dpj.a(0));
   public static final Codec<dxl> b = atv.e(dpj.a, dpj.a.fieldOf("value").codec()).xmap(dxl::new, dxl::b);
   private final dpj d;

   public static dxl a(dpj $$0) {
      return new dxl($$0);
   }

   private dxl(dpj $$0) {
      this.d = $$0;
   }

   public dpj b() {
      return this.d;
   }

   @Override
   public int a(auu $$0, dpm $$1) {
      return this.d.a($$1);
   }

   @Override
   public dxn<?> a() {
      return dxn.a;
   }

   @Override
   public String toString() {
      return this.d.toString();
   }
}
