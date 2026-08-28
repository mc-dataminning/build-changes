import com.mojang.serialization.MapCodec;

public class eox extends epn {
   public static final MapCodec<eox> a = dvd.a.fieldOf("block_state").xmap(eox::new, $$0 -> $$0.b);
   private final dvd b;

   public eox(dvd $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dvd $$0, azr $$1) {
      return $$0 == this.b;
   }

   @Override
   protected epo<?> a() {
      return epo.c;
   }
}
