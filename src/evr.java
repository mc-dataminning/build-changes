import com.mojang.serialization.MapCodec;

public class evr extends evj {
   public static final MapCodec<evr> a = axr.a(mh.i).fieldOf("tag").xmap(evr::new, $$0 -> $$0.b);
   private final axr<dmr> b;

   public evr(axr<dmr> $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(eat $$0, azv $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected evk<?> a() {
      return evk.d;
   }
}
