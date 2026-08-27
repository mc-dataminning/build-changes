import com.mojang.serialization.MapCodec;

public class czq extends dcx {
   public static final MapCodec<czq> a = b(czq::new);

   @Override
   public MapCodec<czq> a() {
      return a;
   }

   public czq(dle.d $$0) {
      super($$0);
   }

   @Override
   public void a(dlf $$0, cvn $$1, hz $$2, awo $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         hz $$4 = $$2.d();
         dlf $$5 = $$1.a_($$4);
         if (!a($$5.k($$1, $$4), ie.b)) {
            awk.a($$1, $$2, $$3, jz.F);
         }
      }
   }
}
