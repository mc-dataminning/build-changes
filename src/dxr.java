import com.mojang.serialization.Codec;

public class dxr implements dxw {
   public static final Codec<dxr> a = bmi.b(0, 256).fieldOf("count").xmap(dxr::new, dxr::a).codec();
   private final bmi b;

   public dxr(int $$0) {
      this.b = bmf.a($$0);
   }

   public dxr(bmi $$0) {
      this.b = $$0;
   }

   public bmi a() {
      return this.b;
   }
}
