import com.mojang.serialization.MapCodec;

public class dam extends ctc {
   public static final MapCodec<dam> a = b(dam::new);
   protected static final eia b = ctc.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);
   private static final int c = 20;

   @Override
   public MapCodec<dam> a() {
      return a;
   }

   public dam(dfc.d $$0) {
      super($$0);
   }

   @Override
   public eia c(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return b;
   }

   @Override
   public eia b_(dfd $$0, cph $$1, gw $$2) {
      return ehx.b();
   }

   @Override
   public eia b(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return ehx.b();
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

   @Override
   public boolean a(dfd $$0, cph $$1, gw $$2, eaw $$3) {
      return false;
   }

   @Override
   public float b(dfd $$0, cph $$1, gw $$2) {
      return 0.2F;
   }
}
