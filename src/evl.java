import com.mojang.serialization.Lifecycle;
import java.util.Locale;
import java.util.Set;
import javax.annotation.Nullable;

public interface evl {
   int d = 19133;
   int e = 19132;

   dhf D();

   void a(dhf var1);

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

   evk I();

   dgm J();

   tq a(kf var1, @Nullable tq var2);

   boolean l();

   int x();

   String e();

   dgf k();

   void a(dgf var1);

   boolean m();

   bsh q();

   void a(bsh var1);

   boolean r();

   void d(boolean var1);

   dge o();

   @Nullable
   tq w();

   eav.a C();

   void a(eav.a var1);

   edq y();

   boolean z();

   boolean A();

   Lifecycle B();

   default crt K() {
      return this.D().b();
   }
}
