import com.mojang.serialization.MapCodec;

public class ell extends elh {
   public static final MapCodec<ell> a = ayw.m.fieldOf("chance").xmap(ell::new, $$0 -> $$0.c);
   private final int c;

   private ell(int $$0) {
      this.c = $$0;
   }

   public static ell a(int $$0) {
      return new ell($$0);
   }

   @Override
   protected boolean a(elg $$0, azv $$1, jh $$2) {
      return $$1.i() < 1.0F / (float)this.c;
   }

   @Override
   public elj<?> b() {
      return elj.b;
   }
}
