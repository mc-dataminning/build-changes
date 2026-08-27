import javax.annotation.Nullable;

public class czk extends csd implements czr {
   public static final dfv a = dfu.F;
   public static final dfv b = dfu.C;
   public static final dfv c = dfu.G;
   protected static final eib d = csq.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final double e = d.c(hc.a.b);

   public czk(dfd.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(a);
      $$0.a(b);
      $$0.a(c);
   }

   @Override
   public void a(cpq $$0, gw $$1, dfe $$2, bil $$3) {
      if ($$0 instanceof akn $$4) {
         ako $$5 = ddw.a($$3);
         if ($$5 != null) {
            $$4.a($$1, dcs.L).ifPresent($$2x -> $$2x.a($$4, $$5));
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, dfe $$3, boolean $$4) {
      if ($$1 instanceof akn $$5 && $$0.c(a) && !$$0.a($$3.b())) {
         $$5.a($$2, dcs.L).ifPresent($$1x -> $$1x.a($$5));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(dfe $$0, akn $$1, gw $$2, arx $$3) {
      if ($$0.c(a)) {
         $$1.a($$2, $$0.a(a, Boolean.valueOf(false)), 3);
         $$1.a($$2, dcs.L).ifPresent($$1x -> $$1x.a($$1));
      }
   }

   @Override
   public cyv b_(dfe $$0) {
      return cyv.c;
   }

   @Override
   public eib c(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      return d;
   }

   @Override
   public eib f(dfe $$0, cow $$1, gw $$2) {
      return d;
   }

   @Override
   public boolean g_(dfe $$0) {
      return true;
   }

   @Nullable
   @Override
   public dcq a(gw $$0, dfe $$1) {
      return new ddw($$0, $$1);
   }

   @Override
   public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, eai.c, eai.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dfe a(cli $$0) {
      return this.n().a(b, Boolean.valueOf($$0.q().b_($$0.a()).a() == eai.c));
   }

   @Override
   public eah c_(dfe $$0) {
      return $$0.c(b) ? eai.c.a(false) : super.c_($$0);
   }

   @Override
   public void a(dfe $$0, akn $$1, gw $$2, cja $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bfv.a(5));
      }
   }

   @Nullable
   @Override
   public <T extends dcq> dcr<T> a(cpq $$0, dfe $$1, dcs<T> $$2) {
      return !$$0.B ? csd.a($$2, dcs.L, ($$0x, $$1x, $$2x, $$3) -> djx.c.a($$0x, $$3.gc(), $$3.gd())) : null;
   }
}
