import java.util.Objects;
import javax.annotation.Nullable;

public interface ffc {
   static ffc a() {
      return ffh.a;
   }

   static ffc a(bwi $$0) {
      Objects.requireNonNull($$0);

      return (ffc)(switch ($$0) {
         case ctw $$1 -> ctw.b($$1.dU()) ? new ffl($$1, false) : new ffh($$0, false, false);
         default -> new ffh($$0, false, false);
      });
   }

   static ffc a(bwi $$0, boolean $$1) {
      return new ffh($$0, $$1, false);
   }

   static ffc b(@Nullable bwi $$0) {
      return new ffh(
         $$0 != null ? $$0.cf() : false,
         true,
         $$0 != null ? $$0.dB() : -Double.MAX_VALUE,
         $$0 instanceof bxj $$1 ? $$1.fa() : czk.k,
         $$0 instanceof bxj $$2 ? $$1 -> $$2.a($$1) : $$0x -> false,
         $$0
      );
   }

   boolean b();

   boolean a(ffr var1, iv var2, boolean var3);

   boolean a(czg var1);

   boolean a(ewv var1, ewv var2);

   ffr a(eao var1, dir var2, iv var3);

   default boolean c() {
      return false;
   }
}
