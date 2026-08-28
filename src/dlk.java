import com.mojang.serialization.MapCodec;

public class dlk extends dmm {
   public static final MapCodec<dlk> a = b(dlk::new);

   @Override
   public MapCodec<? extends dlk> a() {
      return a;
   }

   public dlk(ean.d $$0) {
      super($$0);
   }

   @Override
   protected void a(djh $$0, eao $$1, fet $$2, cse $$3) {
      if (!$$0.C) {
         iv $$4 = $$2.b();
         $$0.a(null, $$4, awn.E, awo.e, 1.0F, 0.5F + $$0.A.i() * 1.2F);
      }
   }
}
