import com.mojang.serialization.MapCodec;

public class eqm extends eqe {
   public static final MapCodec<eqm> a = axs.a(ma.f).fieldOf("tag").xmap(eqm::new, $$0 -> $$0.b);
   private final axs<diq> b;

   public eqm(axs<diq> $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dvv $$0, azu $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected eqf<?> a() {
      return eqf.d;
   }
}
