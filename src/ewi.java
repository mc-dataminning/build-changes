import com.mojang.serialization.Lifecycle;
import java.util.Locale;
import java.util.Set;
import javax.annotation.Nullable;

public interface ewi {
   int d = 19133;
   int e = 19132;

   dhx D();

   void a(dhx var1);

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
   tq E();

   void a(@Nullable tq var1);

   ewh I();

   dhd J();

   tq a(kf var1, @Nullable tq var2);

   boolean l();

   int x();

   String e();

   dgw k();

   void a(dgw var1);

   boolean m();

   bsv q();

   void a(bsv var1);

   boolean r();

   void d(boolean var1);

   dgv o();

   @Nullable
   tq w();

   ebp.a C();

   void a(ebp.a var1);

   eem y();

   boolean z();

   boolean A();

   Lifecycle B();

   default csn K() {
      return this.D().b();
   }
}
