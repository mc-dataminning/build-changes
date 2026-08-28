import java.util.Objects;

public interface fcc {
   static fcc a() {
      return fch.a;
   }

   static fcc a(bva $$0) {
      Objects.requireNonNull($$0);

      return (fcc)(switch ($$0) {
         case crq $$1 -> crq.b($$1.dU()) ? new fcl($$1, false) : new fch($$0, false);
         default -> new fch($$0, false);
      });
   }

   static fcc a(bva $$0, boolean $$1) {
      return new fch($$0, $$1);
   }

   boolean b();

   boolean a(fcr var1, ji var2, boolean var3);

   boolean a(cxd var1);

   boolean a(etw var1, etw var2);

   fcr a(dxq var1, dgj var2, ji var3);
}
