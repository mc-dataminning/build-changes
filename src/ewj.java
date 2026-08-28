import com.mojang.serialization.Lifecycle;
import java.util.Locale;
import java.util.Set;
import javax.annotation.Nullable;

public interface ewj {
   int d = 19133;
   int e = 19132;

   dif D();

   void a(dif var1);

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
   ux E();

   void a(@Nullable ux var1);

   ewi I();

   dhm J();

   ux a(ke var1, @Nullable ux var2);

   boolean l();

   int x();

   String e();

   dhf k();

   void a(dhf var1);

   boolean m();

   btg q();

   void a(btg var1);

   boolean r();

   void d(boolean var1);

   dhe o();

   @Nullable
   ux w();

   ebt.a C();

   void a(ebt.a var1);

   eeo y();

   boolean z();

   boolean A();

   Lifecycle B();

   default cst K() {
      return this.D().b();
   }
}
