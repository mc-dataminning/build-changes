import com.mojang.serialization.MapCodec;

public class eum extends eue {
   public static final MapCodec<eum> a = axp.a(mg.i).fieldOf("tag").xmap(eum::new, $$0 -> $$0.b);
   private final axp<dlu> b;

   public eum(axp<dlu> $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dzo $$0, azt $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected euf<?> a() {
      return euf.d;
   }
}
