import java.util.Objects;

public interface fad {
   static fad a() {
      return fai.a;
   }

   static fad a(bul $$0) {
      Objects.requireNonNull($$0);

      return (fad)(switch ($$0) {
         case cqt $$1 -> cqt.b($$1.dV()) ? new fam($$1, false) : new fai($$0, false);
         default -> new fai($$0, false);
      });
   }

   static fad a(bul $$0, boolean $$1) {
      return new fai($$0, $$1);
   }

   boolean b();

   boolean a(fas var1, jh var2, boolean var3);

   boolean a(cwi var1);

   boolean a(erv var1, erv var2);

   fas a(dvv var1, dev var2, jh var3);
}
