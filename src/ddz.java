import com.mojang.serialization.MapCodec;

public class ddz extends dfc {
   public static final MapCodec<ddz> a = b(ddz::new);

   @Override
   public MapCodec<? extends ddz> a() {
      return a;
   }

   public ddz(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dca $$0, dtc $$1, ewq $$2, cms $$3) {
      if (!$$0.C) {
         ir $$4 = $$2.a();
         $$0.a(null, $$4, avo.L, avq.e, 1.0F, 0.5F + $$0.A.i() * 1.2F);
         $$0.a(null, $$4, avo.J, avq.e, 1.0F, 0.5F + $$0.A.i() * 1.2F);
      }
   }
}
