import java.util.Objects;

public interface ezb {
   static ezb a() {
      return ezg.a;
   }

   static ezb a(btr $$0) {
      Objects.requireNonNull($$0);

      return (ezb)(switch ($$0) {
         case cpv $$1 -> cpv.b($$1.dS()) ? new ezk($$1, false) : new ezg($$0, false);
         default -> new ezg($$0, false);
      });
   }

   static ezb a(btr $$0, boolean $$1) {
      return new ezg($$0, $$1);
   }

   boolean b();

   boolean a(ezq var1, jf var2, boolean var3);

   boolean a(cvn var1);

   boolean a(eqt var1, eqt var2);

   ezq a(dus var1, dds var2, jf var3);
}
