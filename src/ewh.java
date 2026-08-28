import com.mojang.serialization.MapCodec;

public class ewh extends evz {
   public static final MapCodec<ewh> a = axv.a(mi.i).fieldOf("tag").xmap(ewh::new, $$0 -> $$0.b);
   private final axv<dne> b;

   public ewh(axv<dne> $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(ebg $$0, azz $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected ewa<?> a() {
      return ewa.d;
   }
}
