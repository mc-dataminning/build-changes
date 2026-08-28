import com.mojang.serialization.Lifecycle;
import java.util.Locale;
import java.util.Set;
import javax.annotation.Nullable;

public interface epx {
   int d = 19133;
   int e = 19132;

   dcn D();

   void a(dcn var1);

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
   ur E();

   void a(@Nullable ur var1);

   epw I();

   dbx J();

   ur a(jw var1, @Nullable ur var2);

   boolean l();

   int x();

   String e();

   dbq k();

   void a(dbq var1);

   boolean m();

   bqm q();

   void a(bqm var1);

   boolean r();

   void d(boolean var1);

   dbp o();

   @Nullable
   ur w();

   dvs.a C();

   void a(dvs.a var1);

   dyn y();

   boolean z();

   boolean A();

   Lifecycle B();

   default cpg K() {
      return this.D().b();
   }
}
