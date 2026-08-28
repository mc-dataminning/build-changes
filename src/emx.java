import com.mojang.serialization.MapCodec;

public class emx extends emt {
   public static final MapCodec<emx> a = ayi.m.fieldOf("chance").xmap(emx::new, $$0 -> $$0.c);
   private final int c;

   private emx(int $$0) {
      this.c = $$0;
   }

   public static emx a(int $$0) {
      return new emx($$0);
   }

   @Override
   protected boolean a(ems $$0, azh $$1, ji $$2) {
      return $$1.i() < 1.0F / (float)this.c;
   }

   @Override
   public emv<?> b() {
      return emv.b;
   }
}
