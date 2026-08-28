import com.mojang.serialization.MapCodec;

public class dtl extends dkn {
   public static final MapCodec<dtl> a = b(dtl::new);
   protected static final fcl b = dkd.a(1.0, 0.0, 1.0, 15.0, 1.5, 15.0);

   @Override
   public MapCodec<dtl> a() {
      return a;
   }

   protected dtl(dxn.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dxo $$0, dgz $$1, jh $$2, bvb $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$1 instanceof arx && $$3 instanceof crl) {
         $$1.a(new jh($$2), true, $$3);
      }
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return b;
   }

   @Override
   protected boolean b(dxo $$0, dge $$1, jh $$2) {
      etq $$3 = $$1.b_($$2);
      etq $$4 = $$1.b_($$2.d());
      return ($$3.a() == etr.c || $$0.b() instanceof dod) && $$4.a() == etr.a;
   }
}
