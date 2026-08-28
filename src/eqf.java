import com.mojang.serialization.MapCodec;

public class eqf extends epx {
   public static final MapCodec<eqf> a = axt.a(ma.f).fieldOf("tag").xmap(eqf::new, $$0 -> $$0.b);
   private final axt<dij> b;

   public eqf(axt<dij> $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dvo $$0, azv $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected epy<?> a() {
      return epy.d;
   }
}
