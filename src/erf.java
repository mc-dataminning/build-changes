import com.mojang.serialization.Lifecycle;
import java.util.Locale;
import java.util.Set;
import javax.annotation.Nullable;

public interface erf {
   int d = 19133;
   int e = 19132;

   ddp D();

   void a(ddp var1);

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
   ua E();

   void a(@Nullable ua var1);

   ere I();

   dcy J();

   ua a(ka var1, @Nullable ua var2);

   boolean l();

   int x();

   String e();

   dcr k();

   void a(dcr var1);

   boolean m();

   bqn q();

   void a(bqn var1);

   boolean r();

   void d(boolean var1);

   dcq o();

   @Nullable
   ua w();

   dwy.a C();

   void a(dwy.a var1);

   dzt y();

   boolean z();

   boolean A();

   Lifecycle B();

   default cpj K() {
      return this.D().b();
   }
}
