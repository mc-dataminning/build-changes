import com.mojang.serialization.MapCodec;

public class dqd extends dmf implements dtq {
   public static final MapCodec<dqd> a = b(dqd::new);
   public static final eay b = eax.I;
   private static final ffk c = dmf.b(8.0, 0.0, 8.0);

   public dqd(eag.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   public MapCodec<dqd> a() {
      return a;
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(b);
   }

   @Override
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, ewp.c, ewp.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected ewo b_(eah $$0) {
      return $$0.c(b) ? ewp.c.a(false) : super.b_($$0);
   }

   @Override
   public eah a(dcw $$0) {
      ewo $$1 = $$0.q().b_($$0.a());
      return this.m().b(b, Boolean.valueOf($$1.b(ewp.c)));
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return c;
   }

   @Override
   protected boolean a(eah $$0, exd $$1) {
      return false;
   }
}
