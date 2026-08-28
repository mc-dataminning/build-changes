import com.mojang.serialization.MapCodec;

public class epm extends eqe {
   public static final MapCodec<epm> a = lz.e.q().fieldOf("block").xmap(epm::new, $$0 -> $$0.b);
   private final diq b;

   public epm(diq $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dvv $$0, azu $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected eqf<?> a() {
      return eqf.b;
   }
}
