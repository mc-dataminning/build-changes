import com.mojang.serialization.MapCodec;

public class dqy extends dlh {
   public static final MapCodec<dqy> b = b(dqy::new);
   private static final wp c = wp.c("container.upgrade");

   @Override
   public MapCodec<dqy> a() {
      return b;
   }

   protected dqy(dwx.d $$0) {
      super($$0);
   }

   @Override
   protected bsn b(dwy $$0, dgj $$1, ji $$2) {
      return new bst(($$2x, $$3, $$4) -> new cud($$2x, $$3, csq.a($$1, $$2)), c);
   }

   @Override
   protected bsl a(dwy $$0, dgj $$1, ji $$2, coy $$3, fax $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(awk.aF);
      }

      return bsl.a;
   }
}
