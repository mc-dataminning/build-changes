import com.mojang.serialization.Codec;

public class eco extends eck {
   public static final Codec<eco> a = awe.k.fieldOf("chance").xmap(eco::new, $$0 -> $$0.c).codec();
   private final int c;

   private eco(int $$0) {
      this.c = $$0;
   }

   public static eco a(int $$0) {
      return new eco($$0);
   }

   @Override
   protected boolean a(ecj $$0, axd $$1, ib $$2) {
      return $$1.i() < 1.0F / (float)this.c;
   }

   @Override
   public ecm<?> b() {
      return ecm.b;
   }
}
