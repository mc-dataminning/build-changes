import javax.annotation.Nullable;

@FunctionalInterface
public interface crn {
   crn a = ($$0, $$1, $$2) -> {
   };
   crn b = ($$0, $$1, $$2) -> {
      float $$3 = 170.0F + $$2.i() * 20.0F;
      $$0.i($$0.dy().c(-0.5));
      $$0.w($$0.dL() + $$3);
      $$0.N += $$3;
      $$0.ar = true;
   };
   crn c = ($$0, $$1, $$2) -> {
      if ($$1 != null) {
         fdw $$3 = $$1.bT().d();
         $$0.i($$3);
         $$0.ar = true;
      }
   };
   crn d = ($$0, $$1, $$2) -> {
      if ($$1 != null) {
         fdw $$3 = $$1.dy().d();
         $$0.i($$3);
         $$0.ar = true;
      }
   };

   void deflect(crm var1, @Nullable bwa var2, azt var3);
}
