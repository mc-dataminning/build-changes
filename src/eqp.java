import com.mojang.serialization.MapCodec;

public class eqp extends erh {
   public static final MapCodec<eqp> a = mb.e.q().fieldOf("block").xmap(eqp::new, $$0 -> $$0.b);
   private final djl b;

   public eqp(djl $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dww $$0, azh $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected eri<?> a() {
      return eri.b;
   }
}
