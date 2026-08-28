import com.mojang.serialization.MapCodec;

public class djx extends dml {
   public static final MapCodec<djx> a = b(djx::new);

   @Override
   public MapCodec<djx> a() {
      return a;
   }

   public djx(drw.d $$0) {
      super($$0);
   }

   @Override
   public void a(drx $$0, dbt $$1, iz $$2, azc $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         $$1.a(lj.Z, (double)$$2.u() + $$3.j(), (double)$$2.v() + 1.1, (double)$$2.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }
}
