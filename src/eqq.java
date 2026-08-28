import com.mojang.serialization.MapCodec;

public class eqq extends eri {
   public static final MapCodec<eqq> a = mb.e.q().fieldOf("block").xmap(eqq::new, $$0 -> $$0.b);
   private final djm b;

   public eqq(djm $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dwx $$0, azh $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected erj<?> a() {
      return erj.b;
   }
}
