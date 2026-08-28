import com.mojang.serialization.MapCodec;

public class enn extends enj {
   public static final MapCodec<enn> a = azd.m.fieldOf("chance").xmap(enn::new, $$0 -> $$0.c);
   private final int c;

   private enn(int $$0) {
      this.c = $$0;
   }

   public static enn a(int $$0) {
      return new enn($$0);
   }

   @Override
   protected boolean a(eni $$0, bac $$1, jh $$2) {
      return $$1.i() < 1.0F / (float)this.c;
   }

   @Override
   public enl<?> b() {
      return enl.b;
   }
}
