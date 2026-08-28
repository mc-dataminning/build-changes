import com.mojang.serialization.MapCodec;

public class emm extends eme {
   public static final MapCodec<emm> a = axf.a(lq.f).fieldOf("tag").xmap(emm::new, $$0 -> $$0.b);
   private final axf<dez> b;

   public emm(axf<dez> $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dsc $$0, azh $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected emf<?> a() {
      return emf.d;
   }
}
