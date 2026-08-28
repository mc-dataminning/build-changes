import javax.annotation.Nullable;

@FunctionalInterface
public interface cqm {
   cqm a = ($$0, $$1, $$2) -> {
   };
   cqm b = ($$0, $$1, $$2) -> {
      float $$3 = 170.0F + $$2.i() * 20.0F;
      $$0.h($$0.dy().c(-0.5));
      $$0.v($$0.dL() + $$3);
      $$0.N += $$3;
      $$0.ar = true;
   };
   cqm c = ($$0, $$1, $$2) -> {
      if ($$1 != null) {
         fbs $$3 = $$1.bT().d();
         $$0.h($$3);
         $$0.ar = true;
      }
   };
   cqm d = ($$0, $$1, $$2) -> {
      if ($$1 != null) {
         fbs $$3 = $$1.dy().d();
         $$0.h($$3);
         $$0.ar = true;
      }
   };

   void deflect(cql var1, @Nullable bvf var2, bam var3);
}
