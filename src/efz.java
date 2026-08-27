import com.mojang.serialization.Codec;

public class efz extends efv {
   public static final Codec<efz> a = axh.j.fieldOf("chance").xmap(efz::new, $$0 -> $$0.c).codec();
   private final int c;

   private efz(int $$0) {
      this.c = $$0;
   }

   public static efz a(int $$0) {
      return new efz($$0);
   }

   @Override
   protected boolean a(efu $$0, ayg $$1, in $$2) {
      return $$1.i() < 1.0F / (float)this.c;
   }

   @Override
   public efx<?> b() {
      return efx.b;
   }
}
