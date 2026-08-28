import com.mojang.serialization.MapCodec;

public class dmb extends dij implements dpk {
   public static final MapCodec<dmb> a = b(dmb::new);
   private static final fal c = dij.a(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);
   public static final dwf b = dwe.C;

   public dmb(dvn.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   public MapCodec<dmb> a() {
      return a;
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(b);
   }

   @Override
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, erp.c, erp.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected ero b_(dvo $$0) {
      return $$0.c(b) ? erp.c.a(false) : super.b_($$0);
   }

   @Override
   public dvo a(czw $$0) {
      ero $$1 = $$0.q().b_($$0.a());
      return this.m().b(b, Boolean.valueOf($$1.b(erp.c)));
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return c;
   }

   @Override
   protected boolean a(dvo $$0, esd $$1) {
      return false;
   }
}
