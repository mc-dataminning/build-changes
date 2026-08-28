import com.mojang.serialization.MapCodec;

public class dne extends dwd {
   public static final MapCodec<dne> a = b(dne::new);
   private static final ffw b = dmr.b(14.0, 0.0, 12.0);

   @Override
   public MapCodec<? extends dne> a() {
      return a;
   }

   public dne(eas.d $$0) {
      super($$0);
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return b;
   }

   @Override
   protected boolean b(eat $$0, diq $$1, iv $$2) {
      eat $$3 = $$1.a_($$2);
      return $$3.a(dmt.eg) || $$3.a($$1, $$2, jb.b, dvc.b);
   }
}
