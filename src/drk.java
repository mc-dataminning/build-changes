import com.mojang.serialization.Codec;

public class drk extends drg {
   public static final Codec<drk> a = aoi.j.fieldOf("chance").xmap(drk::new, $$0 -> $$0.c).codec();
   private final int c;

   private drk(int $$0) {
      this.c = $$0;
   }

   public static drk a(int $$0) {
      return new drk($$0);
   }

   @Override
   protected boolean a(drf $$0, apf $$1, gu $$2) {
      return $$1.i() < 1.0F / (float)this.c;
   }

   @Override
   public dri<?> b() {
      return dri.b;
   }
}
