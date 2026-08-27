import com.mojang.serialization.MapCodec;

public class cyj extends cwp {
   public static final MapCodec<cyj> a = b(cyj::new);
   private static final vf b = vf.c("container.crafting");

   @Override
   public MapCodec<? extends cyj> a() {
      return a;
   }

   protected cyj(djf.d $$0) {
      super($$0);
   }

   @Override
   public bka a(djg $$0, cto $$1, hx $$2, cfh $$3, bjz $$4, elo $$5) {
      if ($$1.B) {
         return bka.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(asb.an);
         return bka.b;
      }
   }

   @Override
   public bkd b(djg $$0, cto $$1, hx $$2) {
      return new bkj(($$2x, $$3, $$4) -> new cir($$2x, $$3, cil.a($$1, $$2)), b);
   }
}
