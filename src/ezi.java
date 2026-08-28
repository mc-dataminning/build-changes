import com.mojang.serialization.Lifecycle;
import java.util.Locale;
import java.util.Set;
import javax.annotation.Nullable;

public interface ezi {
   int d = 19133;
   int e = 19132;

   dkf D();

   void a(dkf var1);

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
   tz E();

   void a(@Nullable tz var1);

   ezh I();

   djl J();

   tz a(jt var1, @Nullable tz var2);

   boolean l();

   int x();

   String e();

   dje k();

   void a(dje var1);

   boolean m();

   bud q();

   void a(bud var1);

   boolean r();

   void d(boolean var1);

   djd o();

   @Nullable
   tz w();

   eeo.a C();

   void a(eeo.a var1);

   ehl y();

   boolean z();

   boolean A();

   Lifecycle B();

   default cut K() {
      return this.D().b();
   }
}
