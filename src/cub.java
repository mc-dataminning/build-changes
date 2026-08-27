import javax.annotation.Nullable;

public class cub extends csd implements czr {
   public static final dfv a = dfu.C;
   private static final int c = 3;
   protected static final eib b = csq.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   public cub(dfd.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(a);
   }

   @Override
   public dcq a(gw $$0, dfe $$1) {
      return new ddc($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcq> dcr<T> a(cpq $$0, dfe $$1, dcs<T> $$2) {
      return a($$2, dcs.z, $$0.B ? ddc::a : ddc::b);
   }

   @Override
   public cyv b_(dfe $$0) {
      return cyv.b;
   }

   @Override
   public eah c_(dfe $$0) {
      return $$0.c(a) ? eai.c.a(false) : super.c_($$0);
   }

   @Override
   public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
      if ($$0.c(a)) {
         $$3.a($$4, eai.c, eai.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      return b;
   }

   @Override
   public void a(cpq $$0, gw $$1, dfe $$2, @Nullable bjb $$3, cja $$4) {
      if ($$4.A()) {
         dcq $$5 = $$0.c_($$1);
         if ($$5 instanceof dcl) {
            ((dcl)$$5).a($$4.y());
         }
      }
   }

   @Nullable
   @Override
   public dfe a(cli $$0) {
      eah $$1 = $$0.q().b_($$0.a());
      return this.n().a(a, Boolean.valueOf($$1.a(apt.a) && $$1.e() == 8));
   }

   @Override
   public boolean a(dfe $$0, cow $$1, gw $$2, eax $$3) {
      return false;
   }
}
