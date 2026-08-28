import com.mojang.serialization.MapCodec;

public class emy extends enn {
   public static final MapCodec<emy> a = bsj.b(0, 256).fieldOf("count").xmap(emy::new, $$0 -> $$0.c);
   private final bsj c;

   private emy(bsj $$0) {
      this.c = $$0;
   }

   public static emy a(bsj $$0) {
      return new emy($$0);
   }

   public static emy a(int $$0) {
      return a(bsg.a($$0));
   }

   @Override
   protected int a(bam $$0, jh $$1) {
      return this.c.a($$0);
   }

   @Override
   public enk<?> b() {
      return enk.f;
   }
}
