import java.util.Objects;

public interface fcc {
   static fcc a() {
      return fch.a;
   }

   static fcc a(bvj $$0) {
      Objects.requireNonNull($$0);

      return (fcc)(switch ($$0) {
         case crv $$1 -> crv.b($$1.dV()) ? new fcl($$1, false) : new fch($$0, false);
         default -> new fch($$0, false);
      });
   }

   static fcc a(bvj $$0, boolean $$1) {
      return new fch($$0, $$1);
   }

   boolean b();

   boolean a(fcr var1, jh var2, boolean var3);

   boolean a(cxk var1);

   boolean a(etw var1, etw var2);

   fcr a(dxu var1, dgq var2, jh var3);
}
