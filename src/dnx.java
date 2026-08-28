import com.mojang.serialization.MapCodec;

public class dnx extends dfd {
   public static final MapCodec<dnx> a = b(dnx::new);
   protected static final ewf b = deu.a(1.0, 0.0, 1.0, 15.0, 1.5, 15.0);

   @Override
   public MapCodec<dnx> a() {
      return a;
   }

   protected dnx(drw.d $$0) {
      super($$0);
   }

   @Override
   protected void a(drx $$0, dbt $$1, iz $$2, bsp $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$1 instanceof arb && $$3 instanceof coq) {
         $$1.a(new iz($$2), true, $$3);
      }
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      return b;
   }

   @Override
   protected boolean b(drx $$0, daz $$1, iz $$2) {
      enq $$3 = $$1.b_($$2);
      enq $$4 = $$1.b_($$2.c());
      return ($$3.a() == enr.c || $$0.b() instanceof dis) && $$4.a() == enr.a;
   }
}
