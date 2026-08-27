import com.mojang.serialization.Lifecycle;
import java.util.Locale;
import java.util.Set;
import javax.annotation.Nullable;

public interface enw {
   int d = 19133;
   int e = 19132;

   dao D();

   void a(dao var1);

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
   ty E();

   void a(@Nullable ty var1);

   env I();

   czy J();

   ty a(jj var1, @Nullable ty var2);

   boolean l();

   int x();

   String e();

   czr k();

   void a(czr var1);

   boolean m();

   bon q();

   void a(bon var1);

   boolean r();

   void d(boolean var1);

   czq o();

   @Nullable
   ty w();

   dtt.a C();

   void a(dtt.a var1);

   dwo y();

   boolean z();

   boolean A();

   Lifecycle B();

   default cmy K() {
      return this.D().b();
   }
}
