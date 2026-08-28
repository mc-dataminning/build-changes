import com.mojang.serialization.MapCodec;

public class eig extends ehz {
   public static final MapCodec<eig> b = dus.a.fieldOf("state").xmap(dur.a::b, dhm::n).xmap(eig::new, $$0 -> $$0.c);
   private final dhm c;

   public eig(dhm $$0) {
      this.c = $$0;
   }

   @Override
   protected eia<?> a() {
      return eia.f;
   }

   @Override
   public dus a(azn $$0, jf $$1) {
      jk.a $$2 = jk.a.a($$0);
      return this.c.n().c(dnz.i, $$2);
   }
}
