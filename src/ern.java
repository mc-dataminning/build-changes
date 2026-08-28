import com.mojang.serialization.MapCodec;

public class ern extends erj {
   public static final MapCodec<ern> a = ayy.m.fieldOf("chance").xmap(ern::new, $$0 -> $$0.c);
   private final int c;

   private ern(int $$0) {
      this.c = $$0;
   }

   public static ern a(int $$0) {
      return new ern($$0);
   }

   @Override
   protected boolean a(eri $$0, azz $$1, iw $$2) {
      return $$1.i() < 1.0F / (float)this.c;
   }

   @Override
   public erl<?> b() {
      return erl.b;
   }
}
