import com.mojang.serialization.Codec;

public class dxz extends dyq {
   public static final Codec<dxz> a = jd.f.q().fieldOf("block").xmap(dxz::new, $$0 -> $$0.b).codec();
   private final csq b;

   public dxz(csq $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dfe $$0, arx $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected dyr<?> a() {
      return dyr.b;
   }
}
