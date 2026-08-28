import com.mojang.serialization.MapCodec;

public class enf extends enu {
   public static final MapCodec<enf> a = bsd.b(0, 256).fieldOf("count").xmap(enf::new, $$0 -> $$0.c);
   private final bsd c;

   private enf(bsd $$0) {
      this.c = $$0;
   }

   public static enf a(bsd $$0) {
      return new enf($$0);
   }

   public static enf a(int $$0) {
      return a(bsa.a($$0));
   }

   @Override
   protected int a(azh $$0, ji $$1) {
      return this.c.a($$0);
   }

   @Override
   public enr<?> b() {
      return enr.f;
   }
}
