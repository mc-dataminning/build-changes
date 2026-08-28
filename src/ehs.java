import com.mojang.serialization.MapCodec;

public class ehs extends eho {
   public static final MapCodec<ehs> a = ayf.l.fieldOf("chance").xmap(ehs::new, $$0 -> $$0.c);
   private final int c;

   private ehs(int $$0) {
      this.c = $$0;
   }

   public static ehs a(int $$0) {
      return new ehs($$0);
   }

   @Override
   protected boolean a(ehn $$0, azf $$1, iz $$2) {
      return $$1.i() < 1.0F / (float)this.c;
   }

   @Override
   public ehq<?> b() {
      return ehq.b;
   }
}
