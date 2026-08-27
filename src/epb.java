import com.mojang.serialization.Lifecycle;
import java.util.Locale;
import java.util.Set;
import javax.annotation.Nullable;

public interface epb {
   int d = 19133;
   int e = 19132;

   dbr D();

   void a(dbr var1);

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
   ud E();

   void a(@Nullable ud var1);

   epa I();

   dbb J();

   ud a(jl var1, @Nullable ud var2);

   boolean l();

   int x();

   String e();

   dau k();

   void a(dau var1);

   boolean m();

   bpr q();

   void a(bpr var1);

   boolean r();

   void d(boolean var1);

   dat o();

   @Nullable
   ud w();

   duw.a C();

   void a(duw.a var1);

   dxr y();

   boolean z();

   boolean A();

   Lifecycle B();

   default coj K() {
      return this.D().b();
   }
}
