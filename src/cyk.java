import com.mojang.serialization.MapCodec;

public class cyk extends cwq {
   public static final MapCodec<cyk> a = b(cyk::new);
   private static final vf b = vf.c("container.crafting");

   @Override
   public MapCodec<? extends cyk> a() {
      return a;
   }

   protected cyk(djg.d $$0) {
      super($$0);
   }

   @Override
   public bkb a(djh $$0, ctp $$1, hx $$2, cfi $$3, bka $$4, elp $$5) {
      if ($$1.B) {
         return bkb.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(asc.an);
         return bkb.b;
      }
   }

   @Override
   public bke b(djh $$0, ctp $$1, hx $$2) {
      return new bkk(($$2x, $$3, $$4) -> new cis($$2x, $$3, cim.a($$1, $$2)), b);
   }
}
