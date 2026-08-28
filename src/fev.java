import java.util.Objects;

public interface fev {
   static fev a() {
      return ffa.a;
   }

   static fev a(bwf $$0) {
      Objects.requireNonNull($$0);

      return (fev)(switch ($$0) {
         case ctp $$1 -> ctp.b($$1.dV()) ? new ffe($$1, false) : new ffa($$0, false);
         default -> new ffa($$0, false);
      });
   }

   static fev a(bwf $$0, boolean $$1) {
      return new ffa($$0, $$1);
   }

   boolean b();

   boolean a(ffk var1, iu var2, boolean var3);

   boolean a(cyz var1);

   boolean a(ewo var1, ewo var2);

   ffk a(eah var1, dik var2, iu var3);
}
