import com.mojang.serialization.Lifecycle;
import java.util.Locale;
import java.util.Set;
import javax.annotation.Nullable;

public interface eyh {
   int d = 19133;
   int e = 19132;

   djn D();

   void a(djn var1);

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
   tx E();

   void a(@Nullable tx var1);

   eyg I();

   dit J();

   tx a(js var1, @Nullable tx var2);

   boolean l();

   int x();

   String e();

   dim k();

   void a(dim var1);

   boolean m();

   btv q();

   void a(btv var1);

   boolean r();

   void d(boolean var1);

   dil o();

   @Nullable
   tx w();

   edo.a C();

   void a(edo.a var1);

   egl y();

   boolean z();

   boolean A();

   Lifecycle B();

   default cub K() {
      return this.D().b();
   }
}
