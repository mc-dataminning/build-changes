import com.mojang.serialization.MapCodec;

public class ddo extends cyd {
   public static final MapCodec<ddo> b = b(ddo::new);
   private static final vd c = vd.c("container.upgrade");

   @Override
   public MapCodec<ddo> a() {
      return b;
   }

   protected ddo(diz.d $$0) {
      super($$0);
   }

   @Override
   public bjy b(dja $$0, cti $$1, hx $$2) {
      return new bke(($$2x, $$3, $$4) -> new cjq($$2x, $$3, cif.a($$1, $$2)), c);
   }

   @Override
   public bjv a(dja $$0, cti $$1, hx $$2, cfb $$3, bju $$4, eli $$5) {
      if ($$1.B) {
         return bjv.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(arw.aF);
         return bjv.b;
      }
   }
}
