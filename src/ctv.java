import com.mojang.serialization.MapCodec;

public class ctv extends cvc implements cuw {
   public static final MapCodec<ctv> a = b(ctv::new);
   private static final ekb b = ejy.a(cut.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0), cut.a(6.0, 0.0, 6.0, 10.0, 8.0, 10.0));

   @Override
   public MapCodec<ctv> a() {
      return a;
   }

   protected ctv(dgv.d $$0) {
      super($$0);
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return b;
   }

   @Override
   protected boolean d(dgw $$0, cqy $$1, ht $$2) {
      return $$0.a(cuv.dR) || super.d($$0, $$1, $$2);
   }

   @Override
   public boolean b(crv $$0, ht $$1, dgw $$2) {
      return $$0.b_($$1.c()).c();
   }

   @Override
   public boolean a(crs $$0, ato $$1, ht $$2, dgw $$3) {
      return (double)$$0.z.i() < 0.45;
   }

   @Override
   public void a(ama $$0, ato $$1, ht $$2, dgw $$3) {
      dgl.e.a($$0, $$0.k().g(), $$2, $$3, $$1);
   }
}
