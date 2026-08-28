import com.mojang.serialization.MapCodec;

public class ekx extends elm {
   public static final MapCodec<ekx> a = brm.b(0, 256).fieldOf("count").xmap(ekx::new, $$0 -> $$0.c);
   private final brm c;

   private ekx(brm $$0) {
      this.c = $$0;
   }

   public static ekx a(brm $$0) {
      return new ekx($$0);
   }

   public static ekx a(int $$0) {
      return a(brj.a($$0));
   }

   @Override
   protected int a(azv $$0, jh $$1) {
      return this.c.a($$0);
   }

   @Override
   public elj<?> b() {
      return elj.f;
   }
}
