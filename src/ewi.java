import com.mojang.serialization.Lifecycle;
import java.util.Locale;
import java.util.Set;
import javax.annotation.Nullable;

public interface ewi {
   int d = 19133;
   int e = 19132;

   die D();

   void a(die var1);

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

   ewh I();

   dhl J();

   ux a(ke var1, @Nullable ux var2);

   boolean l();

   int x();

   String e();

   dhe k();

   void a(dhe var1);

   boolean m();

   btf q();

   void a(btf var1);

   boolean r();

   void d(boolean var1);

   dhd o();

   @Nullable
   ux w();

   ebs.a C();

   void a(ebs.a var1);

   een y();

   boolean z();

   boolean A();

   Lifecycle B();

   default css K() {
      return this.D().b();
   }
}
