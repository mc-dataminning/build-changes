import com.mojang.serialization.MapCodec;

public class dok extends dmf {
   public static final MapCodec<dok> a = b(dok::new);
   private static final ffk b = dmf.b(16.0, 0.0, 15.0);

   @Override
   public MapCodec<dok> a() {
      return a;
   }

   protected dok(eag.d $$0) {
      super($$0);
   }

   @Override
   protected boolean g_(eah $$0) {
      return true;
   }

   @Override
   public eah a(dcw $$0) {
      return !this.m().a((djd)$$0.q(), $$0.a()) ? dmf.a(this.m(), dmh.j.m(), $$0.q(), $$0.a()) : super.a($$0);
   }

   @Override
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      if ($$4 == ja.b && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(eah $$0, arq $$1, iu $$2, azv $$3) {
      dpe.a(null, $$0, $$1, $$2);
   }

   @Override
   protected boolean a(eah $$0, djd $$1, iu $$2) {
      eah $$3 = $$1.a_($$2.d());
      return !$$3.e() || $$3.b() instanceof dpg;
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return b;
   }

   @Override
   protected boolean a(eah $$0, exd $$1) {
      return false;
   }
}
