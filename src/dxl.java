import com.mojang.serialization.Codec;

public class dxl extends dxz {
   public static final Codec<dxl> a = biq.b(0, 256).fieldOf("count").xmap(dxl::new, $$0 -> $$0.c).codec();
   private final biq c;

   private dxl(biq $$0) {
      this.c = $$0;
   }

   public static dxl a(biq $$0) {
      return new dxl($$0);
   }

   public static dxl a(int $$0) {
      return a(bin.a($$0));
   }

   @Override
   protected int a(auf $$0, hv $$1) {
      return this.c.a($$0);
   }

   @Override
   public dxw<?> b() {
      return dxw.f;
   }
}
