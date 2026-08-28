import java.util.Objects;
import javax.annotation.Nullable;

public interface fgh {
   static fgh a() {
      return fgm.a;
   }

   static fgh a(bxe $$0) {
      Objects.requireNonNull($$0);

      return (fgh)(switch ($$0) {
         case cuv $$1 -> cuv.b($$1.dV()) ? new fgq($$1, false) : new fgm($$0, false, false);
         default -> new fgm($$0, false, false);
      });
   }

   static fgh a(bxe $$0, boolean $$1) {
      return new fgm($$0, $$1, false);
   }

   static fgh b(@Nullable bxe $$0) {
      return new fgm(
         $$0 != null ? $$0.cg() : false,
         true,
         $$0 != null ? $$0.dC() : -Double.MAX_VALUE,
         $$0 instanceof byf $$1 ? $$1.fb() : dak.l,
         $$0 instanceof byf $$2 ? $$1 -> $$2.a($$1) : $$0x -> false,
         $$0
      );
   }

   boolean b();

   boolean a(fgw var1, iw var2, boolean var3);

   boolean a(dag var1);

   boolean a(eya var1, eya var2);

   fgw a(ebq var1, djr var2, iw var3);

   default boolean c() {
      return false;
   }
}
