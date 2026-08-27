import com.mojang.serialization.Lifecycle;
import java.util.Locale;
import java.util.Set;
import javax.annotation.Nullable;

public interface epd {
   int d = 19133;
   int e = 19132;

   dbt D();

   void a(dbt var1);

   boolean F();

   Set<String> G();

   Set<String> H();

   void a(String var1, boolean var2);

   default void a(p $$0) {
      $$0.a("Known server brands", () -> String.join(", ", this.G()));
      $$0.a("Removed feature flags", () -> String.join(", ", this.H()));
      $$0.a("Level was modded", () -> Boolean.toString(this.F()));
      $$0.a("Level storage version", () -> {
         int $$0x = this.x();
         return String.format(Locale.ROOT, "0x%05X - %s", $$0x, this.f($$0x));
      });
   }

   default String f(int $$0) {
      switch ($$0) {
         case 19132:
            return "McRegion";
         case 19133:
            return "Anvil";
         default:
            return "Unknown?";
      }
   }

   @Nullable
   ud E();

   void a(@Nullable ud var1);

   epc I();

   dbd J();

   ud a(jl var1, @Nullable ud var2);

   boolean l();

   int x();

   String e();

   daw k();

   void a(daw var1);

   boolean m();

   bpt q();

   void a(bpt var1);

   boolean r();

   void d(boolean var1);

   dav o();

   @Nullable
   ud w();

   duy.a C();

   void a(duy.a var1);

   dxt y();

   boolean z();

   boolean A();

   Lifecycle B();

   default col K() {
      return this.D().b();
   }
}
