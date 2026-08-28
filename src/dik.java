import com.mojang.serialization.MapCodec;

public class dik extends djm {
   public static final MapCodec<dik> a = b(dik::new);

   @Override
   public MapCodec<? extends dik> a() {
      return a;
   }

   public dik(dww.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dgi $$0, dwx $$1, faw $$2, cpq $$3) {
      if (!$$0.C) {
         ji $$4 = $$2.b();
         $$0.a(null, $$4, awa.E, awb.e, 1.0F, 0.5F + $$0.A.i() * 1.2F);
      }
   }
}
