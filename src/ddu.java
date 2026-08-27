import com.mojang.serialization.MapCodec;

public class ddu extends cyj {
   public static final MapCodec<ddu> b = b(ddu::new);
   private static final vf c = vf.c("container.upgrade");

   @Override
   public MapCodec<ddu> a() {
      return b;
   }

   protected ddu(djf.d $$0) {
      super($$0);
   }

   @Override
   public bkd b(djg $$0, cto $$1, hx $$2) {
      return new bkj(($$2x, $$3, $$4) -> new cjw($$2x, $$3, cil.a($$1, $$2)), c);
   }

   @Override
   public bka a(djg $$0, cto $$1, hx $$2, cfh $$3, bjz $$4, elo $$5) {
      if ($$1.B) {
         return bka.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(asb.aF);
         return bka.b;
      }
   }
}
