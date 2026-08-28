import java.util.Objects;

public interface fbw {
   static fbw a() {
      return fcb.a;
   }

   static fbw a(bvb $$0) {
      Objects.requireNonNull($$0);

      return (fbw)(switch ($$0) {
         case crn $$1 -> crn.b($$1.dW()) ? new fcf($$1, false) : new fcb($$0, false);
         default -> new fcb($$0, false);
      });
   }

   static fbw a(bvb $$0, boolean $$1) {
      return new fcb($$0, $$1);
   }

   boolean b();

   boolean a(fcl var1, jh var2, boolean var3);

   boolean a(cxc var1);

   boolean a(etq var1, etq var2);

   fcl a(dxo var1, dgi var2, jh var3);
}
