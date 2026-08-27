import com.mojang.serialization.MapCodec;

public class dah extends ddo {
   public static final MapCodec<dah> a = b(dah::new);

   @Override
   public MapCodec<dah> a() {
      return a;
   }

   public dah(dmd.d $$0) {
      super($$0);
   }

   @Override
   public void a(dme $$0, cwe $$1, ib $$2, awt $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         ib $$4 = $$2.d();
         dme $$5 = $$1.a_($$4);
         if (!a($$5.k($$1, $$4), ih.b)) {
            awp.a($$1, $$2, $$3, kb.F);
         }
      }
   }
}
