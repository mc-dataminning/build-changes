import com.mojang.serialization.MapCodec;

public class daz extends czf {
   public static final MapCodec<daz> a = b(daz::new);
   private static final vs b = vs.c("container.crafting");

   @Override
   public MapCodec<? extends daz> a() {
      return a;
   }

   protected daz(dmd.d $$0) {
      super($$0);
   }

   @Override
   protected bml a(dme $$0, cwe $$1, ib $$2, cia $$3, eor $$4) {
      if ($$1.B) {
         return bml.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(atz.an);
         return bml.b;
      }
   }

   @Override
   protected bmp b(dme $$0, cwe $$1, ib $$2) {
      return new bmv(($$2x, $$3, $$4) -> new cll($$2x, $$3, clf.a($$1, $$2)), b);
   }
}
