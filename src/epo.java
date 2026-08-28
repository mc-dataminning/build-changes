import com.mojang.serialization.MapCodec;

public class epo extends eqe {
   public static final MapCodec<epo> a = dvv.a.fieldOf("block_state").xmap(epo::new, $$0 -> $$0.b);
   private final dvv b;

   public epo(dvv $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dvv $$0, azu $$1) {
      return $$0 == this.b;
   }

   @Override
   protected eqf<?> a() {
      return eqf.c;
   }
}
