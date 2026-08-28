import com.mojang.serialization.MapCodec;

public class eht extends ehp {
   public static final MapCodec<eht> a = ayg.l.fieldOf("chance").xmap(eht::new, $$0 -> $$0.c);
   private final int c;

   private eht(int $$0) {
      this.c = $$0;
   }

   public static eht a(int $$0) {
      return new eht($$0);
   }

   @Override
   protected boolean a(eho $$0, azg $$1, iz $$2) {
      return $$1.i() < 1.0F / (float)this.c;
   }

   @Override
   public ehr<?> b() {
      return ehr.b;
   }
}
