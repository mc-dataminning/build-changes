import java.util.Objects;

public interface eyx {
   static eyx a() {
      return ezc.a;
   }

   static eyx a(bto $$0) {
      Objects.requireNonNull($$0);

      return (eyx)(switch ($$0) {
         case cps $$1 -> cps.b($$1.dS()) ? new ezg($$1, false) : new ezc($$0, false);
         default -> new ezc($$0, false);
      });
   }

   static eyx a(bto $$0, boolean $$1) {
      return new ezc($$0, $$1);
   }

   boolean b();

   boolean a(ezm var1, je var2, boolean var3);

   boolean a(cvk var1);

   boolean a(eqp var1, eqp var2);

   ezm a(duo var1, ddp var2, je var3);
}
