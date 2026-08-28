import com.mojang.serialization.MapCodec;

public class epe extends ept {
   public static final MapCodec<epe> a = btd.b(0, 256).fieldOf("count").xmap(epe::new, $$0 -> $$0.c);
   private final btd c;

   private epe(btd $$0) {
      this.c = $$0;
   }

   public static epe a(btd $$0) {
      return new epe($$0);
   }

   public static epe a(int $$0) {
      return a(bta.a($$0));
   }

   @Override
   protected int a(azt $$0, iu $$1) {
      return this.c.a($$0);
   }

   @Override
   public epq<?> b() {
      return epq.f;
   }
}
