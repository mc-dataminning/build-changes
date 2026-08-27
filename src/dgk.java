import com.mojang.serialization.MapCodec;

public class dgk extends daz {
   public static final MapCodec<dgk> b = b(dgk::new);
   private static final vs c = vs.c("container.upgrade");

   @Override
   public MapCodec<dgk> a() {
      return b;
   }

   protected dgk(dmd.d $$0) {
      super($$0);
   }

   @Override
   protected bmp b(dme $$0, cwe $$1, ib $$2) {
      return new bmv(($$2x, $$3, $$4) -> new cmq($$2x, $$3, clf.a($$1, $$2)), c);
   }

   @Override
   protected bml a(dme $$0, cwe $$1, ib $$2, cia $$3, eor $$4) {
      if ($$1.B) {
         return bml.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(atz.aF);
         return bml.b;
      }
   }
}
