import com.mojang.serialization.Lifecycle;
import java.util.Locale;
import java.util.Set;
import javax.annotation.Nullable;

public interface etb {
   int d = 19133;
   int e = 19132;

   dfc D();

   void a(dfc var1);

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
   uf E();

   void a(@Nullable uf var1);

   eta I();

   dek J();

   uf a(kb var1, @Nullable uf var2);

   boolean l();

   int x();

   String e();

   ded k();

   void a(ded var1);

   boolean m();

   brm q();

   void a(brm var1);

   boolean r();

   void d(boolean var1);

   dec o();

   @Nullable
   uf w();

   dyn.a C();

   void a(dyn.a var1);

   ebi y();

   boolean z();

   boolean A();

   Lifecycle B();

   default cqn K() {
      return this.D().b();
   }
}
