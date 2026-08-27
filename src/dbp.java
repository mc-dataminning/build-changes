import com.mojang.serialization.MapCodec;

public class dbp extends dat {
   public static final MapCodec<dbp> a = b(dbp::new);
   private static final vg b = vg.c("container.loom");

   @Override
   public MapCodec<dbp> a() {
      return a;
   }

   protected dbp(djo.d $$0) {
      super($$0);
   }

   @Override
   public bkc a(djp $$0, ctx $$1, hx $$2, cfq $$3, ely $$4) {
      if ($$1.B) {
         return bkc.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(asd.ax);
         return bkc.b;
      }
   }

   @Override
   public bkg b(djp $$0, ctx $$1, hx $$2) {
      return new bkm(($$2x, $$3, $$4) -> new cjo($$2x, $$3, ciu.a($$1, $$2)), b);
   }

   @Override
   public djp a(cpp $$0) {
      return this.o().a(aE, $$0.g().g());
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(aE);
   }
}
