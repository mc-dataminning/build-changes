import com.mojang.serialization.MapCodec;

public class ell extends eld {
   public static final MapCodec<ell> a = awl.a(lf.f).fieldOf("tag").xmap(ell::new, $$0 -> $$0.b);
   private final awl<ddy> b;

   public ell(awl<ddy> $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(drb $$0, ayk $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected ele<?> a() {
      return ele.d;
   }
}
