import com.mojang.serialization.Lifecycle;
import java.util.Locale;
import java.util.Set;
import javax.annotation.Nullable;

public interface eqa {
   int d = 19133;
   int e = 19132;

   dcq D();

   void a(dcq var1);

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

   epz I();

   dca J();

   ur a(jw var1, @Nullable ur var2);

   boolean l();

   int x();

   String e();

   dbt k();

   void a(dbt var1);

   boolean m();

   bqp q();

   void a(bqp var1);

   boolean r();

   void d(boolean var1);

   dbs o();

   @Nullable
   ur w();

   dvv.a C();

   void a(dvv.a var1);

   dyq y();

   boolean z();

   boolean A();

   Lifecycle B();

   default cpj K() {
      return this.D().b();
   }
}
