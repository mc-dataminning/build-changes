import com.mojang.serialization.MapCodec;

public class ekm extends eld {
   public static final MapCodec<ekm> a = le.e.q().fieldOf("block").xmap(ekm::new, $$0 -> $$0.b);
   private final ddy b;

   public ekm(ddy $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(drb $$0, ayk $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected ele<?> a() {
      return ele.b;
   }
}
