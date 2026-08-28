import java.util.Objects;

public interface ezs {
   static ezs a() {
      return ezx.a;
   }

   static ezs a(bue $$0) {
      Objects.requireNonNull($$0);

      return (ezs)(switch ($$0) {
         case cqk $$1 -> cqk.b($$1.dX()) ? new fab($$1, false) : new ezx($$0, false);
         default -> new ezx($$0, false);
      });
   }

   static ezs a(bue $$0, boolean $$1) {
      return new ezx($$0, $$1);
   }

   boolean b();

   boolean a(fah var1, jh var2, boolean var3);

   boolean a(cvx var1);

   boolean a(erk var1, erk var2);

   fah a(dvj var1, dek var2, jh var3);
}
