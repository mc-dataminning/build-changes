import com.mojang.serialization.MapCodec;

public class des extends daa {
   public static final MapCodec<des> a = b(des::new);
   private static final int b = 20;

   @Override
   public MapCodec<des> a() {
      return a;
   }

   public des(dmy.d $$0) {
      super($$0);
   }

   @Override
   public void a(cwz $$0, ib $$1, dmz $$2, bow $$3) {
      if (!$$3.bT() && $$3 instanceof bpo && !cuv.j((bpo)$$3)) {
         $$3.a($$0.ah().e(), 1.0F);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dmz $$0, apf $$1, ib $$2, axd $$3) {
      dag.b($$1, $$2.c(), $$0);
   }

   @Override
   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      if ($$1 == ih.b && $$2.a(dac.G)) {
         $$3.a($$4, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(dmz $$0, cwz $$1, ib $$2, dmz $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }
}
