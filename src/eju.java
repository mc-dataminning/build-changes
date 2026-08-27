import com.mojang.serialization.Lifecycle;
import java.util.Locale;
import java.util.Set;
import javax.annotation.Nullable;

public interface eju {
   int d = 19133;
   int e = 19132;

   cwy D();

   void a(cwy var1);

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
   sy E();

   void a(@Nullable sy var1);

   ejt I();

   cwi J();

   sy a(iy var1, @Nullable sy var2);

   boolean l();

   int x();

   String e();

   cwb k();

   void a(cwb var1);

   boolean m();

   bmi q();

   void a(bmi var1);

   boolean r();

   void d(boolean var1);

   cwa o();

   @Nullable
   sy w();

   dpt.a C();

   void a(dpt.a var1);

   dso y();

   boolean z();

   boolean A();

   Lifecycle B();

   default ckl K() {
      return this.D().b();
   }
}
