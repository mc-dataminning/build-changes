import com.mojang.serialization.Codec;

public class dux extends dvl {
   public static final Codec<dux> a = bhg.b(0, 256).fieldOf("count").xmap(dux::new, $$0 -> $$0.c).codec();
   private final bhg c;

   private dux(bhg $$0) {
      this.c = $$0;
   }

   public static dux a(bhg $$0) {
      return new dux($$0);
   }

   public static dux a(int $$0) {
      return a(bhd.a($$0));
   }

   @Override
   protected int a(ate $$0, ht $$1) {
      return this.c.a($$0);
   }

   @Override
   public dvi<?> b() {
      return dvi.f;
   }
}
