import com.mojang.serialization.Lifecycle;
import java.util.Locale;
import java.util.Set;
import javax.annotation.Nullable;

public interface exf {
   int d = 19133;
   int e = 19132;

   din D();

   void a(din var1);

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
   tw E();

   void a(@Nullable tw var1);

   exe I();

   dht J();

   tw a(kg var1, @Nullable tw var2);

   boolean l();

   int x();

   String e();

   dhm k();

   void a(dhm var1);

   boolean m();

   btn q();

   void a(btn var1);

   boolean r();

   void d(boolean var1);

   dhl o();

   @Nullable
   tw w();

   ecm.a C();

   void a(ecm.a var1);

   efj y();

   boolean z();

   boolean A();

   Lifecycle B();

   default cte K() {
      return this.D().b();
   }
}
