import java.util.Objects;

public interface fbd {
   static fbd a() {
      return fbi.a;
   }

   static fbd a(buj $$0) {
      Objects.requireNonNull($$0);

      return (fbd)(switch ($$0) {
         case cqu $$1 -> cqu.b($$1.dW()) ? new fbm($$1, false) : new fbi($$0, false);
         default -> new fbi($$0, false);
      });
   }

   static fbd a(buj $$0, boolean $$1) {
      return new fbi($$0, $$1);
   }

   boolean b();

   boolean a(fbs var1, ji var2, boolean var3);

   boolean a(cwj var1);

   boolean a(esx var1, esx var2);

   fbs a(dwv var1, dfp var2, ji var3);
}
