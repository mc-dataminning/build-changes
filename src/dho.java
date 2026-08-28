import com.mojang.serialization.MapCodec;

public class dho extends diq {
   public static final MapCodec<dho> a = b(dho::new);

   @Override
   public MapCodec<? extends dho> a() {
      return a;
   }

   public dho(dvu.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dfm $$0, dvv $$1, ezu $$2, cpn $$3) {
      if (!$$0.C) {
         jh $$4 = $$2.b();
         $$0.a(null, $$4, awn.E, awo.e, 1.0F, 0.5F + $$0.A.i() * 1.2F);
      }
   }
}
