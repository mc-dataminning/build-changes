import java.util.Objects;
import javax.annotation.Nullable;

public interface ffh {
   static ffh a() {
      return ffm.a;
   }

   static ffh a(bwi $$0) {
      Objects.requireNonNull($$0);

      return (ffh)(switch ($$0) {
         case ctz $$1 -> ctz.b($$1.dU()) ? new ffq($$1, false) : new ffm($$0, false, false);
         default -> new ffm($$0, false, false);
      });
   }

   static ffh a(bwi $$0, boolean $$1) {
      return new ffm($$0, $$1, false);
   }

   static ffh b(@Nullable bwi $$0) {
      return new ffm(
         $$0 != null ? $$0.cf() : false,
         true,
         $$0 != null ? $$0.dB() : -Double.MAX_VALUE,
         $$0 instanceof bxj $$1 ? $$1.fa() : czn.k,
         $$0 instanceof bxj $$2 ? $$1 -> $$2.a($$1) : $$0x -> false,
         $$0
      );
   }

   boolean b();

   boolean a(ffw var1, iv var2, boolean var3);

   boolean a(czj var1);

   boolean a(exa var1, exa var2);

   ffw a(eat var1, diu var2, iv var3);

   default boolean c() {
      return false;
   }
}
