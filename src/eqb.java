import com.mojang.serialization.MapCodec;

public class eqb extends ept {
   public static final MapCodec<eqb> a = axq.a(lz.f).fieldOf("tag").xmap(eqb::new, $$0 -> $$0.b);
   private final axq<die> b;

   public eqb(axq<die> $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dvj $$0, azs $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected epu<?> a() {
      return epu.d;
   }
}
