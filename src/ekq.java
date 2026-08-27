import com.mojang.serialization.Lifecycle;
import java.util.Locale;
import java.util.Set;
import javax.annotation.Nullable;

public interface ekq {
   int d = 19133;
   int e = 19132;

   cxt D();

   void a(cxt var1);

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
   ta E();

   void a(@Nullable ta var1);

   ekp I();

   cxd J();

   ta a(iz var1, @Nullable ta var2);

   boolean l();

   int x();

   String e();

   cww k();

   void a(cww var1);

   boolean m();

   bmz q();

   void a(bmz var1);

   boolean r();

   void d(boolean var1);

   cwv o();

   @Nullable
   ta w();

   dqp.a C();

   void a(dqp.a var1);

   dtk y();

   boolean z();

   boolean A();

   Lifecycle B();

   default clf K() {
      return this.D().b();
   }
}
