import com.mojang.serialization.MapCodec;

public class ddv extends cyk {
   public static final MapCodec<ddv> b = b(ddv::new);
   private static final vf c = vf.c("container.upgrade");

   @Override
   public MapCodec<ddv> a() {
      return b;
   }

   protected ddv(djg.d $$0) {
      super($$0);
   }

   @Override
   public bke b(djh $$0, ctp $$1, hx $$2) {
      return new bkk(($$2x, $$3, $$4) -> new cjx($$2x, $$3, cim.a($$1, $$2)), c);
   }

   @Override
   public bkb a(djh $$0, ctp $$1, hx $$2, cfi $$3, bka $$4, elp $$5) {
      if ($$1.B) {
         return bkb.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(asc.aF);
         return bkb.b;
      }
   }
}
