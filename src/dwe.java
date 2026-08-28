import com.mojang.serialization.MapCodec;

public class dwe extends dxa implements dnr {
   public static final MapCodec<dwe> a = b(dwe::new);
   private static final fgw b = dno.b(12.0, 0.0, 13.0);

   @Override
   public MapCodec<dwe> a() {
      return a;
   }

   protected dwe(ebp.d $$0) {
      super($$0);
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return b;
   }

   @Override
   public boolean a(dkm $$0, iw $$1, ebq $$2) {
      return o($$2).m().a($$0, $$1) && $$0.v($$1.d());
   }

   @Override
   public boolean a(dkj $$0, bai $$1, iw $$2, ebq $$3) {
      return true;
   }

   @Override
   public void a(asb $$0, bai $$1, iw $$2, ebq $$3) {
      dpx.a($$0, o($$3).m(), $$2, 2);
   }

   private static dpx o(ebq $$0) {
      return (dpx)($$0.a(dnq.bB) ? dnq.jk : dnq.jj);
   }
}
