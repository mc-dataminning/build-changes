import javax.annotation.Nullable;

@FunctionalInterface
public interface cpl {
   cpl a = ($$0, $$1, $$2) -> {
   };
   cpl b = ($$0, $$1, $$2) -> {
      float $$3 = 170.0F + $$2.i() * 20.0F;
      $$0.h($$0.dB().c(-0.5));
      $$0.v($$0.dO() + $$3);
      $$0.O += $$3;
      $$0.as = true;
   };
   cpl c = ($$0, $$1, $$2) -> {
      if ($$1 != null) {
         ezr $$3 = $$1.bV().d();
         $$0.h($$3);
         $$0.as = true;
      }
   };
   cpl d = ($$0, $$1, $$2) -> {
      if ($$1 != null) {
         ezr $$3 = $$1.dB().d();
         $$0.h($$3);
         $$0.as = true;
      }
   };

   void deflect(cpk var1, @Nullable bui var2, azv var3);
}
