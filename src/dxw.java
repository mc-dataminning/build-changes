import com.mojang.serialization.Codec;

public class dxw extends dyl {
   public static final Codec<dxw> a = dez.b.fieldOf("block_state").xmap(dxw::new, $$0 -> $$0.b).codec();
   private final dez b;

   public dxw(dez $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dez $$0, aru $$1) {
      return $$0 == this.b;
   }

   @Override
   protected dym<?> a() {
      return dym.c;
   }
}
