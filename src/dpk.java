import com.mojang.serialization.MapCodec;

public class dpk extends dli {
   public static final MapCodec<dpk> a = b(dpk::new);
   private static final fbu[] b = new fbu[]{
      djm.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      djm.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0),
      djm.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      djm.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      djm.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      djm.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0),
      djm.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      djm.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0)
   };

   @Override
   public MapCodec<dpk> a() {
      return a;
   }

   public dpk(dww.d $$0) {
      super($$0);
   }

   @Override
   protected dgh d() {
      return cwt.vf;
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return b[this.h($$0)];
   }
}
