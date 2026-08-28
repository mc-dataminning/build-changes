import java.util.Objects;

public interface fcd {
   static fcd a() {
      return fci.a;
   }

   static fcd a(bvk $$0) {
      Objects.requireNonNull($$0);

      return (fcd)(switch ($$0) {
         case crw $$1 -> crw.b($$1.dW()) ? new fcm($$1, false) : new fci($$0, false);
         default -> new fci($$0, false);
      });
   }

   static fcd a(bvk $$0, boolean $$1) {
      return new fci($$0, $$1);
   }

   boolean b();

   boolean a(fcs var1, jh var2, boolean var3);

   boolean a(cxl var1);

   boolean a(etx var1, etx var2);

   fcs a(dxv var1, dgr var2, jh var3);
}
