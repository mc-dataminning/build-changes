import javax.annotation.Nullable;

@FunctionalInterface
public interface cqr {
   cqr a = ($$0, $$1, $$2) -> {
   };
   cqr b = ($$0, $$1, $$2) -> {
      float $$3 = 170.0F + $$2.i() * 20.0F;
      $$0.h($$0.dz().c(-0.5));
      $$0.v($$0.dM() + $$3);
      $$0.N += $$3;
      $$0.ar = true;
   };
   cqr c = ($$0, $$1, $$2) -> {
      if ($$1 != null) {
         fby $$3 = $$1.bT().d();
         $$0.h($$3);
         $$0.ar = true;
      }
   };
   cqr d = ($$0, $$1, $$2) -> {
      if ($$1 != null) {
         fby $$3 = $$1.dz().d();
         $$0.h($$3);
         $$0.ar = true;
      }
   };

   void deflect(cqq var1, @Nullable bvk var2, bam var3);
}
