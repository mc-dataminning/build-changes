import com.mojang.serialization.Lifecycle;
import java.util.Locale;
import java.util.Set;
import javax.annotation.Nullable;

public interface eqq {
   int d = 19133;
   int e = 19132;

   ddb D();

   void a(ddb var1);

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

   eqp I();

   dck J();

   tx a(jx var1, @Nullable tx var2);

   boolean l();

   int x();

   String e();

   dcd k();

   void a(dcd var1);

   boolean m();

   bqe q();

   void a(bqe var1);

   boolean r();

   void d(boolean var1);

   dcc o();

   @Nullable
   tx w();

   dwj.a C();

   void a(dwj.a var1);

   dze y();

   boolean z();

   boolean A();

   Lifecycle B();

   default coz K() {
      return this.D().b();
   }
}
