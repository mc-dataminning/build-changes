import com.mojang.serialization.MapCodec;

public class ehp extends ehl {
   public static final MapCodec<ehp> a = ayc.l.fieldOf("chance").xmap(ehp::new, $$0 -> $$0.c);
   private final int c;

   private ehp(int $$0) {
      this.c = $$0;
   }

   public static ehp a(int $$0) {
      return new ehp($$0);
   }

   @Override
   protected boolean a(ehk $$0, azc $$1, iz $$2) {
      return $$1.i() < 1.0F / (float)this.c;
   }

   @Override
   public ehn<?> b() {
      return ehn.b;
   }
}
