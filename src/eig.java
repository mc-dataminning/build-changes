import com.mojang.serialization.MapCodec;

public class eig extends eic {
   public static final MapCodec<eig> a = axo.l.fieldOf("chance").xmap(eig::new, $$0 -> $$0.c);
   private final int c;

   private eig(int $$0) {
      this.c = $$0;
   }

   public static eig a(int $$0) {
      return new eig($$0);
   }

   @Override
   protected boolean a(eib $$0, ayo $$1, ja $$2) {
      return $$1.i() < 1.0F / (float)this.c;
   }

   @Override
   public eie<?> b() {
      return eie.b;
   }
}
