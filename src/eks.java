import com.mojang.serialization.Lifecycle;
import java.util.Locale;
import java.util.Set;
import javax.annotation.Nullable;

public interface eks {
   int d = 19133;
   int e = 19132;

   cxv D();

   void a(cxv var1);

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
   ta E();

   void a(@Nullable ta var1);

   ekr I();

   cxf J();

   ta a(iz var1, @Nullable ta var2);

   boolean l();

   int x();

   String e();

   cwy k();

   void a(cwy var1);

   boolean m();

   bna q();

   void a(bna var1);

   boolean r();

   void d(boolean var1);

   cwx o();

   @Nullable
   ta w();

   dqr.a C();

   void a(dqr.a var1);

   dtm y();

   boolean z();

   boolean A();

   Lifecycle B();

   default clh K() {
      return this.D().b();
   }
}
