import com.mojang.serialization.MapCodec;

public class dsr extends doo {
   public static final MapCodec<dsr> a = b(dsr::new);
   private static final ffw[] b = dmr.a(7, $$0 -> dmr.b(16.0, 0.0, (double)(2 + $$0)));

   @Override
   public MapCodec<dsr> a() {
      return a;
   }

   public dsr(eas.d $$0) {
      super($$0);
   }

   @Override
   protected djl d() {
      return czr.vq;
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return b[this.h($$0)];
   }
}
