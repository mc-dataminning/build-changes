import com.mojang.serialization.MapCodec;

public class ekc extends ekr {
   public static final MapCodec<ekc> a = bqx.b(0, 256).fieldOf("count").xmap(ekc::new, $$0 -> $$0.c);
   private final bqx c;

   private ekc(bqx $$0) {
      this.c = $$0;
   }

   public static ekc a(bqx $$0) {
      return new ekc($$0);
   }

   public static ekc a(int $$0) {
      return a(bqu.a($$0));
   }

   @Override
   protected int a(azn $$0, jf $$1) {
      return this.c.a($$0);
   }

   @Override
   public eko<?> b() {
      return eko.f;
   }
}
