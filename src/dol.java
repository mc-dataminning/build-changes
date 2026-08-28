import com.mojang.serialization.MapCodec;

public class dol extends dey {
   public static final MapCodec<dol> a = b(dol::new);

   @Override
   public MapCodec<dol> a() {
      return a;
   }

   public dol(dsa.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dsb $$0, dbx $$1, iz $$2, bst $$3) {
      evq $$4 = new evq(0.25, 0.05F, 0.25);
      if ($$3 instanceof bto $$5 && $$5.b(bsd.K)) {
         $$4 = new evq(0.5, 0.25, 0.5);
      }

      $$3.a($$0, $$4);
   }
}
