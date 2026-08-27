import com.mojang.serialization.Lifecycle;
import java.util.Locale;
import java.util.Set;
import javax.annotation.Nullable;

public interface eiy {
   int d = 19133;
   int e = 19132;

   cwl D();

   void a(cwl var1);

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
   sw E();

   void a(@Nullable sw var1);

   eix I();

   cvv J();

   sw a(iw var1, @Nullable sw var2);

   boolean l();

   int x();

   String e();

   cvo k();

   void a(cvo var1);

   boolean m();

   blt q();

   void a(blt var1);

   boolean r();

   void d(boolean var1);

   cvn o();

   @Nullable
   sw w();

   doy.a C();

   void a(doy.a var1);

   drt y();

   boolean z();

   boolean A();

   Lifecycle B();

   default cjw K() {
      return this.D().b();
   }
}
