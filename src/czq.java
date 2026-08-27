import com.mojang.serialization.MapCodec;

public class czq extends cut implements cuw {
   public static final MapCodec<czq> a = b(czq::new);

   @Override
   public MapCodec<czq> a() {
      return a;
   }

   public czq(dgv.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(crv $$0, ht $$1, dgw $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(crs $$0, ato $$1, ht $$2, dgw $$3) {
      return true;
   }

   @Override
   public void a(ama $$0, ato $$1, ht $$2, dgw $$3) {
      $$0.H_().c(jz.au).flatMap($$0x -> $$0x.b(ps.n)).ifPresent($$3x -> ((dow)$$3x.a()).a($$0, $$0.k().g(), $$1, $$2.c()));
   }
}
