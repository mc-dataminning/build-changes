import com.mojang.serialization.MapCodec;

public class cxs extends cww {
   public static final MapCodec<cxs> a = b(cxs::new);
   private static final tl b = tl.c("container.loom");

   @Override
   public MapCodec<cxs> a() {
      return a;
   }

   protected cxs(dfc.d $$0) {
      super($$0);
   }

   @Override
   public bhe a(dfd $$0, cqb $$1, gw $$2, cca $$3, bhd $$4, ehd $$5) {
      if ($$1.B) {
         return bhe.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(apq.ax);
         return bhe.b;
      }
   }

   @Override
   public bhh b(dfd $$0, cqb $$1, gw $$2) {
      return new bhm(($$2x, $$3, $$4) -> new cfu($$2x, $$3, cfc.a($$1, $$2)), b);
   }

   @Override
   public dfd a(clt $$0) {
      return this.o().a(aE, $$0.g().g());
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(aE);
   }
}
