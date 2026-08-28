import com.mojang.serialization.Lifecycle;
import java.util.Locale;
import java.util.Set;
import javax.annotation.Nullable;

public interface eqd {
   int d = 19133;
   int e = 19132;

   dct D();

   void a(dct var1);

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
   us E();

   void a(@Nullable us var1);

   eqc I();

   dcd J();

   us a(jw var1, @Nullable us var2);

   boolean l();

   int x();

   String e();

   dbw k();

   void a(dbw var1);

   boolean m();

   bqs q();

   void a(bqs var1);

   boolean r();

   void d(boolean var1);

   dbv o();

   @Nullable
   us w();

   dvy.a C();

   void a(dvy.a var1);

   dyt y();

   boolean z();

   boolean A();

   Lifecycle B();

   default cpm K() {
      return this.D().b();
   }
}
