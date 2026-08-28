import com.mojang.serialization.Lifecycle;
import java.util.Locale;
import java.util.Set;
import javax.annotation.Nullable;

public interface esn {
   int d = 19133;
   int e = 19132;

   deo D();

   void a(deo var1);

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

   esm I();

   ddw J();

   uf a(kb var1, @Nullable uf var2);

   boolean l();

   int x();

   String e();

   ddp k();

   void a(ddp var1);

   boolean m();

   brh q();

   void a(brh var1);

   boolean r();

   void d(boolean var1);

   ddo o();

   @Nullable
   uf w();

   dxz.a C();

   void a(dxz.a var1);

   eau y();

   boolean z();

   boolean A();

   Lifecycle B();

   default cqh K() {
      return this.D().b();
   }
}
