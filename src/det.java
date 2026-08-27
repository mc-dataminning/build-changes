import com.mojang.serialization.MapCodec;

public class det extends ddx {
   public static final MapCodec<det> a = b(det::new);
   private static final vu b = vu.c("container.loom");

   @Override
   public MapCodec<det> a() {
      return a;
   }

   protected det(dna.d $$0) {
      super($$0);
   }

   @Override
   protected bnd a(dnb $$0, cxb $$1, ib $$2, ciu $$3, epp $$4) {
      if ($$1.B) {
         return bnd.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(aui.ax);
         return bnd.b;
      }
   }

   @Override
   protected bnh b(dnb $$0, cxb $$1, ib $$2) {
      return new bnn(($$2x, $$3, $$4) -> new cmv($$2x, $$3, cmb.a($$1, $$2)), b);
   }

   @Override
   public dnb a(csu $$0) {
      return this.o().a(aE, $$0.g().g());
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(aE);
   }
}
