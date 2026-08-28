import java.util.Objects;

public interface fbg {
   static fbg a() {
      return fbl.a;
   }

   static fbg a(bum $$0) {
      Objects.requireNonNull($$0);

      return (fbg)(switch ($$0) {
         case cqx $$1 -> cqx.b($$1.dV()) ? new fbp($$1, false) : new fbl($$0, false);
         default -> new fbl($$0, false);
      });
   }

   static fbg a(bum $$0, boolean $$1) {
      return new fbl($$0, $$1);
   }

   boolean b();

   boolean a(fbv var1, ji var2, boolean var3);

   boolean a(cwm var1);

   boolean a(eta var1, eta var2);

   fbv a(dwy var1, dfs var2, ji var3);
}
