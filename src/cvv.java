import com.mojang.serialization.MapCodec;

public class cvv extends czc {
   public static final MapCodec<cvv> a = b(cvv::new);

   @Override
   public MapCodec<cvv> a() {
      return a;
   }

   public cvv(dgv.d $$0) {
      super($$0);
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, ato $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         ht $$4 = $$2.d();
         dgw $$5 = $$1.a_($$4);
         if (!a($$5.k($$1, $$4), hx.b)) {
            atl.a($$1, $$2, $$3, js.D);
         }
      }
   }
}
