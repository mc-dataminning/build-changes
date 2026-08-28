import com.mojang.serialization.MapCodec;

public class dhc extends die {
   public static final MapCodec<dhc> a = b(dhc::new);

   @Override
   public MapCodec<? extends dhc> a() {
      return a;
   }

   public dhc(dvi.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dfb $$0, dvj $$1, ezj $$2, cpg $$3) {
      if (!$$0.C) {
         jh $$4 = $$2.b();
         $$0.a(null, $$4, awl.G, awm.e, 1.0F, 0.5F + $$0.A.i() * 1.2F);
         $$0.a(null, $$4, awl.E, awm.e, 1.0F, 0.5F + $$0.A.i() * 1.2F);
      }
   }
}
