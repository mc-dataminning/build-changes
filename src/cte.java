import javax.annotation.Nullable;

@FunctionalInterface
public interface cte {
   cte a = ($$0, $$1, $$2) -> {
   };
   cte b = ($$0, $$1, $$2) -> {
      float $$3 = 170.0F + $$2.i() * 20.0F;
      $$0.i($$0.dy().c(-0.5));
      $$0.w($$0.dL() + $$3);
      $$0.N += $$3;
      $$0.ar = true;
   };
   cte c = ($$0, $$1, $$2) -> {
      if ($$1 != null) {
         fgc $$3 = $$1.bS().d();
         $$0.i($$3);
         $$0.ar = true;
      }
   };
   cte d = ($$0, $$1, $$2) -> {
      if ($$1 != null) {
         fgc $$3 = $$1.dy().d();
         $$0.i($$3);
         $$0.ar = true;
      }
   };

   void deflect(ctd var1, @Nullable bxe var2, bai var3);
}
