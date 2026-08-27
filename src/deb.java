import com.mojang.serialization.MapCodec;

public class deb extends dch {
   public static final MapCodec<deb> a = b(deb::new);
   private static final wi b = wi.c("container.crafting");

   @Override
   public MapCodec<? extends deb> a() {
      return a;
   }

   protected deb(dph.d $$0) {
      super($$0);
   }

   @Override
   protected bof a(dpi $$0, czg $$1, id $$2, cka $$3, esf $$4) {
      if ($$1.B) {
         return bof.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(auz.an);
         return bof.b;
      }
   }

   @Override
   protected boj b(dpi $$0, czg $$1, id $$2) {
      return new bop(($$2x, $$3, $$4) -> new cnn($$2x, $$3, cnh.a($$1, $$2)), b);
   }
}
