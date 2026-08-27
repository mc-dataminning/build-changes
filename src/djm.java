import com.mojang.serialization.MapCodec;

public class djm extends deb {
   public static final MapCodec<djm> b = b(djm::new);
   private static final wi c = wi.c("container.upgrade");

   @Override
   public MapCodec<djm> a() {
      return b;
   }

   protected djm(dph.d $$0) {
      super($$0);
   }

   @Override
   protected boj b(dpi $$0, czg $$1, id $$2) {
      return new bop(($$2x, $$3, $$4) -> new cov($$2x, $$3, cnh.a($$1, $$2)), c);
   }

   @Override
   protected bof a(dpi $$0, czg $$1, id $$2, cka $$3, esf $$4) {
      if ($$1.B) {
         return bof.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(auz.aF);
         return bof.b;
      }
   }
}
