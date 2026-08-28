import com.mojang.serialization.MapCodec;

public class eih extends eid {
   public static final MapCodec<eih> a = axo.l.fieldOf("chance").xmap(eih::new, $$0 -> $$0.c);
   private final int c;

   private eih(int $$0) {
      this.c = $$0;
   }

   public static eih a(int $$0) {
      return new eih($$0);
   }

   @Override
   protected boolean a(eic $$0, ayo $$1, ja $$2) {
      return $$1.i() < 1.0F / (float)this.c;
   }

   @Override
   public eif<?> b() {
      return eif.b;
   }
}
