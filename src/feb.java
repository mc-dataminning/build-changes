import java.util.Objects;

public interface feb {
   static feb a() {
      return feg.a;
   }

   static feb a(bwa $$0) {
      Objects.requireNonNull($$0);

      return (feb)(switch ($$0) {
         case cte $$1 -> cte.b($$1.dV()) ? new fek($$1, false) : new feg($$0, false);
         default -> new feg($$0, false);
      });
   }

   static feb a(bwa $$0, boolean $$1) {
      return new feg($$0, $$1);
   }

   boolean b();

   boolean a(feq var1, iu var2, boolean var3);

   boolean a(cyo var1);

   boolean a(evv var1, evv var2);

   feq a(dzo var1, dhz var2, iu var3);
}
