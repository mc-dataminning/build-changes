import com.mojang.serialization.Lifecycle;
import java.util.Locale;
import java.util.Set;
import javax.annotation.Nullable;

public interface fad {
   int d = 19133;
   int e = 19132;

   dkx D();

   void a(dkx var1);

   boolean F();

   Set<String> G();

   Set<String> H();

   void a(String var1, boolean var2);

   default void a(q $$0) {
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
   ua E();

   void a(@Nullable ua var1);

   fac I();

   dkd J();

   ua a(ju var1, @Nullable ua var2);

   boolean l();

   int x();

   String e();

   djw k();

   void a(djw var1);

   boolean m();

   buq q();

   void a(buq var1);

   boolean r();

   void d(boolean var1);

   djv o();

   @Nullable
   ua w();

   efg.a C();

   void a(efg.a var1);

   eid y();

   boolean z();

   boolean A();

   Lifecycle B();

   default cvj K() {
      return this.D().b();
   }
}
