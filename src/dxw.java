import com.mojang.serialization.Codec;

public class dxw extends dyk {
   public static final Codec<dxw> a = bja.b(0, 256).fieldOf("count").xmap(dxw::new, $$0 -> $$0.c).codec();
   private final bja c;

   private dxw(bja $$0) {
      this.c = $$0;
   }

   public static dxw a(bja $$0) {
      return new dxw($$0);
   }

   public static dxw a(int $$0) {
      return a(bix.a($$0));
   }

   @Override
   protected int a(aup $$0, hx $$1) {
      return this.c.a($$0);
   }

   @Override
   public dyh<?> b() {
      return dyh.f;
   }
}
