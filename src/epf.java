import com.mojang.serialization.MapCodec;

public class epf extends epx {
   public static final MapCodec<epf> a = lz.e.q().fieldOf("block").xmap(epf::new, $$0 -> $$0.b);
   private final dij b;

   public epf(dij $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dvo $$0, azv $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected epy<?> a() {
      return epy.b;
   }
}
