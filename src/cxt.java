import com.mojang.serialization.MapCodec;

public class cxt extends ctc {
   public static final MapCodec<cxt> a = b(cxt::new);
   private static final int b = 20;

   @Override
   public MapCodec<cxt> a() {
      return a;
   }

   public cxt(dfc.d $$0) {
      super($$0);
   }

   @Override
   public void a(cqb $$0, gw $$1, dfd $$2, biw $$3) {
      if (!$$3.bS() && $$3 instanceof bjm && !cnw.j((bjm)$$3)) {
         $$3.a($$0.ag().e(), 1.0F);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dfd $$0, akt $$1, gw $$2, ash $$3) {
      cti.b($$1, $$2.c(), $$0);
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      if ($$1 == ha.b && $$2.a(cte.G)) {
         $$3.a($$4, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void b(dfd $$0, cqb $$1, gw $$2, dfd $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }
}
