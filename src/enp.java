import com.mojang.serialization.MapCodec;

public class enp extends enh {
   public static final MapCodec<enp> a = awt.a(lu.f).fieldOf("tag").xmap(enp::new, $$0 -> $$0.b);
   private final awt<dfw> b;

   public enp(awt<dfw> $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dta $$0, ayv $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected eni<?> a() {
      return eni.d;
   }
}
