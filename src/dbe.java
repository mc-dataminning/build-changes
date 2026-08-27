import com.mojang.serialization.MapCodec;

public class dbe extends del {
   public static final MapCodec<dbe> a = b(dbe::new);

   @Override
   public MapCodec<dbe> a() {
      return a;
   }

   public dbe(dna.d $$0) {
      super($$0);
   }

   @Override
   public void a(dnb $$0, cxb $$1, ib $$2, axd $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3.a(10) == 0) {
         ib $$4 = $$2.d();
         dnb $$5 = $$1.a_($$4);
         if (!a($$5.k($$1, $$4), ih.b)) {
            awz.a($$1, $$2, $$3, kc.G);
         }
      }
   }
}
