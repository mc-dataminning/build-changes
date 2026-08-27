import com.mojang.serialization.MapCodec;

public class dbg extends dak {
   public static final MapCodec<dbg> a = b(dbg::new);
   private static final vf b = vf.c("container.loom");

   @Override
   public MapCodec<dbg> a() {
      return a;
   }

   protected dbg(djf.d $$0) {
      super($$0);
   }

   @Override
   public bka a(djg $$0, cto $$1, hx $$2, cfh $$3, bjz $$4, elo $$5) {
      if ($$1.B) {
         return bka.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(asb.ax);
         return bka.b;
      }
   }

   @Override
   public bkd b(djg $$0, cto $$1, hx $$2) {
      return new bkj(($$2x, $$3, $$4) -> new cjf($$2x, $$3, cil.a($$1, $$2)), b);
   }

   @Override
   public djg a(cpg $$0) {
      return this.o().a(aE, $$0.g().g());
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(aE);
   }
}
