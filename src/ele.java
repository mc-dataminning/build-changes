import com.mojang.serialization.MapCodec;

public class ele extends elt {
   public static final MapCodec<ele> a = brp.b(0, 256).fieldOf("count").xmap(ele::new, $$0 -> $$0.c);
   private final brp c;

   private ele(brp $$0) {
      this.c = $$0;
   }

   public static ele a(brp $$0) {
      return new ele($$0);
   }

   public static ele a(int $$0) {
      return a(brm.a($$0));
   }

   @Override
   protected int a(azu $$0, jh $$1) {
      return this.c.a($$0);
   }

   @Override
   public elq<?> b() {
      return elq.f;
   }
}
