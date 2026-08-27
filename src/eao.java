import com.mojang.serialization.Codec;

public class eao extends eak {
   public static final Codec<eao> a = avp.j.fieldOf("chance").xmap(eao::new, $$0 -> $$0.c).codec();
   private final int c;

   private eao(int $$0) {
      this.c = $$0;
   }

   public static eao a(int $$0) {
      return new eao($$0);
   }

   @Override
   protected boolean a(eaj $$0, awo $$1, hz $$2) {
      return $$1.i() < 1.0F / (float)this.c;
   }

   @Override
   public eam<?> b() {
      return eam.b;
   }
}
