import com.mojang.serialization.MapCodec;

public class evf extends eux {
   public static final MapCodec<evf> a = axr.a(mg.i).fieldOf("tag").xmap(evf::new, $$0 -> $$0.b);
   private final axr<dmf> b;

   public evf(axr<dmf> $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(eah $$0, azv $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected euy<?> a() {
      return euy.d;
   }
}
