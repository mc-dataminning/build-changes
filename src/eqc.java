import com.mojang.serialization.Lifecycle;
import java.util.Locale;
import java.util.Set;
import javax.annotation.Nullable;

public interface eqc {
   int d = 19133;
   int e = 19132;

   dcs D();

   void a(dcs var1);

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

   eqb I();

   dcc J();

   us a(jw var1, @Nullable us var2);

   boolean l();

   int x();

   String e();

   dbv k();

   void a(dbv var1);

   boolean m();

   bqr q();

   void a(bqr var1);

   boolean r();

   void d(boolean var1);

   dbu o();

   @Nullable
   us w();

   dvx.a C();

   void a(dvx.a var1);

   dys y();

   boolean z();

   boolean A();

   Lifecycle B();

   default cpl K() {
      return this.D().b();
   }
}
