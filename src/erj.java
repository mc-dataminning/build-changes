import com.mojang.serialization.Lifecycle;
import java.util.Locale;
import java.util.Set;
import javax.annotation.Nullable;

public interface erj {
   int d = 19133;
   int e = 19132;

   ddr D();

   void a(ddr var1);

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
   ub E();

   void a(@Nullable ub var1);

   eri I();

   dda J();

   ub a(ka var1, @Nullable ub var2);

   boolean l();

   int x();

   String e();

   dct k();

   void a(dct var1);

   boolean m();

   bqo q();

   void a(bqo var1);

   boolean r();

   void d(boolean var1);

   dcs o();

   @Nullable
   ub w();

   dxb.a C();

   void a(dxb.a var1);

   dzw y();

   boolean z();

   boolean A();

   Lifecycle B();

   default cpl K() {
      return this.D().b();
   }
}
