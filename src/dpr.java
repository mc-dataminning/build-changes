import com.mojang.serialization.MapCodec;

public class dpr extends dsg {
   public static final MapCodec<dpr> a = b(dpr::new);

   @Override
   public MapCodec<dpr> a() {
      return a;
   }

   public dpr(dxu.d $$0) {
      super($$0);
   }

   @Override
   public void a(dxv $$0, dhi $$1, jh $$2, bam $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         $$1.a(ls.aa, (double)$$2.u() + $$3.j(), (double)$$2.v() + 1.1, (double)$$2.w() + $$3.j(), 0.0, 0.0, 0.0);
      }
   }
}
