import com.mojang.serialization.MapCodec;

public class dca extends ctl {
   public static final MapCodec<dca> a = b(dca::new);
   protected static final eia b = ctc.a(1.0, 0.0, 1.0, 15.0, 1.5, 15.0);

   @Override
   public MapCodec<dca> a() {
      return a;
   }

   protected dca(dfc.d $$0) {
      super($$0);
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, biw $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$1 instanceof akt && $$3 instanceof cdt) {
         $$1.a(new gw($$2), true, $$3);
      }
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return b;
   }

   @Override
   protected boolean d(dfd $$0, cph $$1, gw $$2) {
      eag $$3 = $$1.b_($$2);
      eag $$4 = $$1.b_($$2.c());
      return ($$3.a() == eah.c || $$0.b() instanceof cwy) && $$4.a() == eah.a;
   }
}
