import com.mojang.serialization.MapCodec;

public class enf extends enu {
   public static final MapCodec<enf> a = bsn.b(0, 256).fieldOf("count").xmap(enf::new, $$0 -> $$0.c);
   private final bsn c;

   private enf(bsn $$0) {
      this.c = $$0;
   }

   public static enf a(bsn $$0) {
      return new enf($$0);
   }

   public static enf a(int $$0) {
      return a(bsk.a($$0));
   }

   @Override
   protected int a(bam $$0, jh $$1) {
      return this.c.a($$0);
   }

   @Override
   public enr<?> b() {
      return enr.f;
   }
}
