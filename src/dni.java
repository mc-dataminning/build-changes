import com.mojang.serialization.MapCodec;

public class dni extends djn implements dqt {
   public static final MapCodec<dni> a = b(dni::new);
   private static final fbv c = djn.a(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);
   public static final dxp b = dxo.J;

   public dni(dwx.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   public MapCodec<dni> a() {
      return a;
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(b);
   }

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, etb.c, etb.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected eta b_(dwy $$0) {
      return $$0.c(b) ? etb.c.a(false) : super.b_($$0);
   }

   @Override
   public dwy a(dah $$0) {
      eta $$1 = $$0.q().b_($$0.a());
      return this.m().b(b, Boolean.valueOf($$1.b(etb.c)));
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return c;
   }

   @Override
   protected boolean a(dwy $$0, etp $$1) {
      return false;
   }
}
