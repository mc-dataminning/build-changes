import com.mojang.serialization.Lifecycle;
import java.util.Locale;
import java.util.Set;
import javax.annotation.Nullable;

public interface etf {
   int d = 19133;
   int e = 19132;

   dff D();

   void a(dff var1);

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
   ug E();

   void a(@Nullable ug var1);

   ete I();

   den J();

   ug a(kc var1, @Nullable ug var2);

   boolean l();

   int x();

   String e();

   deg k();

   void a(deg var1);

   boolean m();

   brp q();

   void a(brp var1);

   boolean r();

   void d(boolean var1);

   def o();

   @Nullable
   ug w();

   dyr.a C();

   void a(dyr.a var1);

   ebm y();

   boolean z();

   boolean A();

   Lifecycle B();

   default cqq K() {
      return this.D().b();
   }
}
