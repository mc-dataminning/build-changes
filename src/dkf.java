import com.mojang.serialization.MapCodec;

public class dkf extends dli {
   public static final MapCodec<dkf> a = b(dkf::new);
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
   public MapCodec<dkf> a() {
      return a;
   }

   public dkf(dww.d $$0) {
      super($$0);
   }

   @Override
   protected dgh d() {
      return cwt.ve;
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return b[this.h($$0)];
   }
}
