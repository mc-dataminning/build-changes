import java.util.Objects;

public interface fbe {
   static fbe a() {
      return fbj.a;
   }

   static fbe a(buk $$0) {
      Objects.requireNonNull($$0);

      return (fbe)(switch ($$0) {
         case cqv $$1 -> cqv.b($$1.dV()) ? new fbn($$1, false) : new fbj($$0, false);
         default -> new fbj($$0, false);
      });
   }

   static fbe a(buk $$0, boolean $$1) {
      return new fbj($$0, $$1);
   }

   boolean b();

   boolean a(fbt var1, ji var2, boolean var3);

   boolean a(cwk var1);

   boolean a(esy var1, esy var2);

   fbt a(dww var1, dfq var2, ji var3);
}
