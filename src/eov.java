import com.mojang.serialization.MapCodec;

public class eov extends epn {
   public static final MapCodec<eov> a = lx.e.q().fieldOf("block").xmap(eov::new, $$0 -> $$0.b);
   private final dhy b;

   public eov(dhy $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dvd $$0, azr $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected epo<?> a() {
      return epo.b;
   }
}
