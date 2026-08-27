import com.mojang.serialization.Codec;

public class dxf extends dxg {
   public static final dxf a = new dxf(dpd.a(0));
   public static final Codec<dxf> b = atq.e(dpd.a, dpd.a.fieldOf("value").codec()).xmap(dxf::new, dxf::b);
   private final dpd d;

   public static dxf a(dpd $$0) {
      return new dxf($$0);
   }

   private dxf(dpd $$0) {
      this.d = $$0;
   }

   public dpd b() {
      return this.d;
   }

   @Override
   public int a(aup $$0, dpg $$1) {
      return this.d.a($$1);
   }

   @Override
   public dxh<?> a() {
      return dxh.a;
   }

   @Override
   public String toString() {
      return this.d.toString();
   }
}
