import com.mojang.serialization.MapCodec;

public class dhd extends ddq {
   public static final MapCodec<dhd> a = b(dhd::new);

   @Override
   public MapCodec<dhd> a() {
      return a;
   }

   public dhd(dmy.d $$0) {
      super($$0);
   }

   @Override
   public void a(cwz $$0, dmz $$1, ib $$2, bow $$3, float $$4) {
      if ($$3.bU()) {
         super.a($$0, $$1, $$2, $$3, $$4);
      } else {
         $$3.a($$4, 0.0F, $$0.ah().k());
      }
   }

   @Override
   public void a(cwf $$0, bow $$1) {
      if ($$1.bU()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(bow $$0) {
      epr $$1 = $$0.dp();
      if ($$1.d < 0.0) {
         double $$2 = $$0 instanceof bpo ? 1.0 : 0.8;
         $$0.o($$1.c, -$$1.d * $$2, $$1.e);
      }
   }

   @Override
   public void a(cwz $$0, ib $$1, dmz $$2, bow $$3) {
      double $$4 = Math.abs($$3.dp().d);
      if ($$4 < 0.1 && !$$3.bT()) {
         double $$5 = 0.4 + $$4 * 0.2;
         $$3.g($$3.dp().d($$5, 1.0, $$5));
      }

      super.a($$0, $$1, $$2, $$3);
   }
}
