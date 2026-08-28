import java.util.Objects;

public interface fcz {
   static fcz a() {
      return fde.a;
   }

   static fcz a(bvs $$0) {
      Objects.requireNonNull($$0);

      return (fcz)(switch ($$0) {
         case csh $$1 -> csh.b($$1.dV()) ? new fdi($$1, false) : new fde($$0, false);
         default -> new fde($$0, false);
      });
   }

   static fcz a(bvs $$0, boolean $$1) {
      return new fde($$0, $$1);
   }

   boolean b();

   boolean a(fdo var1, jj var2, boolean var3);

   boolean a(cxu var1);

   boolean a(eut var1, eut var2);

   fdo a(dym var1, dgz var2, jj var3);
}
