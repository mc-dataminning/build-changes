import com.mojang.serialization.Lifecycle;
import java.util.Locale;
import java.util.Set;
import javax.annotation.Nullable;

public interface emx {
   int d = 19133;
   int e = 19132;

   czr D();

   void a(czr var1);

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
   tm E();

   void a(@Nullable tm var1);

   emw I();

   czb J();

   tm a(iz var1, @Nullable tm var2);

   boolean l();

   int x();

   String e();

   cyu k();

   void a(cyu var1);

   boolean m();

   bnx q();

   void a(bnx var1);

   boolean r();

   void d(boolean var1);

   cyt o();

   @Nullable
   tm w();

   dsu.a C();

   void a(dsu.a var1);

   dvp y();

   boolean z();

   boolean A();

   Lifecycle B();

   default cmg K() {
      return this.D().b();
   }
}
