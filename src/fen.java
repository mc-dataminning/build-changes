import java.util.Objects;

public interface fen {
   static fen a() {
      return fes.a;
   }

   static fen a(bwd $$0) {
      Objects.requireNonNull($$0);

      return (fen)(switch ($$0) {
         case ctk $$1 -> ctk.b($$1.dV()) ? new few($$1, false) : new fes($$0, false);
         default -> new fes($$0, false);
      });
   }

   static fen a(bwd $$0, boolean $$1) {
      return new fes($$0, $$1);
   }

   boolean b();

   boolean a(ffc var1, iu var2, boolean var3);

   boolean a(cyu var1);

   boolean a(ewg var1, ewg var2);

   ffc a(dzz var1, dif var2, iu var3);
}
