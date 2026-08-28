import com.mojang.serialization.Lifecycle;
import java.util.Locale;
import java.util.Set;
import javax.annotation.Nullable;

public interface euh {
   int d = 19133;
   int e = 19132;

   dgj D();

   void a(dgj var1);

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
   ul E();

   void a(@Nullable ul var1);

   eug I();

   dfq J();

   ul a(ke var1, @Nullable ul var2);

   boolean l();

   int x();

   String e();

   dfj k();

   void a(dfj var1);

   boolean m();

   bsh q();

   void a(bsh var1);

   boolean r();

   void d(boolean var1);

   dfi o();

   @Nullable
   ul w();

   dzt.a C();

   void a(dzt.a var1);

   eco y();

   boolean z();

   boolean A();

   Lifecycle B();

   default crq K() {
      return this.D().b();
   }
}
