import com.mojang.serialization.MapCodec;

public class erq extends eri {
   public static final MapCodec<erq> a = axf.a(mc.f).fieldOf("tag").xmap(erq::new, $$0 -> $$0.b);
   private final axf<djm> b;

   public erq(axf<djm> $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dwx $$0, azh $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected erj<?> a() {
      return erj.d;
   }
}
