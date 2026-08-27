import com.mojang.serialization.MapCodec;

public class cyd extends cwj {
   public static final MapCodec<cyd> a = b(cyd::new);
   private static final vd b = vd.c("container.crafting");

   @Override
   public MapCodec<? extends cyd> a() {
      return a;
   }

   protected cyd(diz.d $$0) {
      super($$0);
   }

   @Override
   public bjv a(dja $$0, cti $$1, hx $$2, cfb $$3, bju $$4, eli $$5) {
      if ($$1.B) {
         return bjv.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(arw.an);
         return bjv.b;
      }
   }

   @Override
   public bjy b(dja $$0, cti $$1, hx $$2) {
      return new bke(($$2x, $$3, $$4) -> new cil($$2x, $$3, cif.a($$1, $$2)), b);
   }
}
