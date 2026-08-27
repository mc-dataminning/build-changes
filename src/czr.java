import com.mojang.serialization.MapCodec;

public class czr extends cyv {
   public static final MapCodec<czr> a = b(czr::new);
   private static final ur b = ur.c("container.loom");

   @Override
   public MapCodec<czr> a() {
      return a;
   }

   protected czr(dhh.d $$0) {
      super($$0);
   }

   @Override
   public bix a(dhi $$0, csa $$1, ht $$2, cdu $$3, biw $$4, ejq $$5) {
      if ($$1.B) {
         return bix.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(arb.ax);
         return bix.b;
      }
   }

   @Override
   public bja b(dhi $$0, csa $$1, ht $$2) {
      return new bjf(($$2x, $$3, $$4) -> new chr($$2x, $$3, cgx.a($$1, $$2)), b);
   }

   @Override
   public dhi a(cnr $$0) {
      return this.o().a(aE, $$0.g().g());
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(aE);
   }
}
