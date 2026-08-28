import com.mojang.serialization.MapCodec;

public class eqx extends erm {
   public static final MapCodec<eqx> a = btw.b(0, 256).fieldOf("count").xmap(eqx::new, $$0 -> $$0.c);
   private final btw c;

   private eqx(btw $$0) {
      this.c = $$0;
   }

   public static eqx a(btw $$0) {
      return new eqx($$0);
   }

   public static eqx a(int $$0) {
      return a(btt.a($$0));
   }

   @Override
   protected int a(azx $$0, iv $$1) {
      return this.c.a($$0);
   }

   @Override
   public erj<?> b() {
      return erj.f;
   }
}
