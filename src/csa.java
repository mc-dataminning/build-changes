import com.mojang.serialization.MapCodec;

public class csa extends ctc {
   public static final MapCodec<csa> a = b(csa::new);

   @Override
   public MapCodec<? extends csa> a() {
      return a;
   }

   public csa(dfc.d $$0) {
      super($$0);
   }

   @Override
   public void a(cqb $$0, dfd $$1, ehd $$2, ccs $$3) {
      if (!$$0.B) {
         gw $$4 = $$2.a();
         $$0.a(null, $$4, apg.G, aph.e, 1.0F, 0.5F + $$0.z.i() * 1.2F);
         $$0.a(null, $$4, apg.E, aph.e, 1.0F, 0.5F + $$0.z.i() * 1.2F);
      }
   }
}
