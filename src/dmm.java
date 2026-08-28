import com.mojang.serialization.MapCodec;

public class dmm extends dno {
   public static final MapCodec<dmm> a = b(dmm::new);

   @Override
   public MapCodec<? extends dmm> a() {
      return a;
   }

   public dmm(ebp.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dkj $$0, ebq $$1, ffy $$2, ctd $$3) {
      if (!$$0.C) {
         iw $$4 = $$2.b();
         $$0.a(null, $$4, awy.E, awz.e, 1.0F, 0.5F + $$0.A.i() * 1.2F);
      }
   }
}
