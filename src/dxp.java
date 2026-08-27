import com.mojang.serialization.Codec;

public class dxp implements dxu {
   public static final Codec<dxp> a = bmh.b(0, 256).fieldOf("count").xmap(dxp::new, dxp::a).codec();
   private final bmh b;

   public dxp(int $$0) {
      this.b = bme.a($$0);
   }

   public dxp(bmh $$0) {
      this.b = $$0;
   }

   public bmh a() {
      return this.b;
   }
}
