import com.mojang.serialization.MapCodec;

public class dlh extends djn {
   public static final MapCodec<dlh> a = b(dlh::new);
   private static final wp b = wp.c("container.crafting");

   @Override
   public MapCodec<? extends dlh> a() {
      return a;
   }

   protected dlh(dwx.d $$0) {
      super($$0);
   }

   @Override
   protected bsl a(dwy $$0, dgj $$1, ji $$2, coy $$3, fax $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(awk.an);
      }

      return bsl.a;
   }

   @Override
   protected bsn b(dwy $$0, dgj $$1, ji $$2) {
      return new bst(($$2x, $$3, $$4) -> new csw($$2x, $$3, csq.a($$1, $$2)), b);
   }
}
