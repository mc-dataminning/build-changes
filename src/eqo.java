import com.mojang.serialization.Lifecycle;
import java.util.Locale;
import java.util.Set;
import javax.annotation.Nullable;

public interface eqo {
   int d = 19133;
   int e = 19132;

   dda D();

   void a(dda var1);

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

   eqn I();

   dcj J();

   tx a(jx var1, @Nullable tx var2);

   boolean l();

   int x();

   String e();

   dcc k();

   void a(dcc var1);

   boolean m();

   bqd q();

   void a(bqd var1);

   boolean r();

   void d(boolean var1);

   dcb o();

   @Nullable
   tx w();

   dwi.a C();

   void a(dwi.a var1);

   dzd y();

   boolean z();

   boolean A();

   Lifecycle B();

   default coy K() {
      return this.D().b();
   }
}
