import com.mojang.serialization.MapCodec;

public class doh extends dnl {
   public static final MapCodec<doh> a = b(doh::new);
   private static final wp b = wp.c("container.loom");

   @Override
   public MapCodec<doh> a() {
      return a;
   }

   protected doh(dwx.d $$0) {
      super($$0);
   }

   @Override
   protected bsl a(dwy $$0, dgj $$1, ji $$2, coy $$3, fax $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(awk.ax);
      }

      return bsl.a;
   }

   @Override
   protected bsn b(dwy $$0, dgj $$1, ji $$2) {
      return new bst(($$2x, $$3, $$4) -> new ctk($$2x, $$3, csq.a($$1, $$2)), b);
   }

   @Override
   public dwy a(dah $$0) {
      return this.m().b(aF, $$0.g().g());
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(aF);
   }
}
