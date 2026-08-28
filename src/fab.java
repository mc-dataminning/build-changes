import com.mojang.serialization.Lifecycle;
import java.util.Locale;
import java.util.Set;
import javax.annotation.Nullable;

public interface fab {
   int d = 19133;
   int e = 19132;

   dkv D();

   void a(dkv var1);

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

   faa I();

   dkb J();

   tz a(jt var1, @Nullable tz var2);

   boolean l();

   int x();

   String e();

   dju k();

   void a(dju var1);

   boolean m();

   buo q();

   void a(buo var1);

   boolean r();

   void d(boolean var1);

   djt o();

   @Nullable
   tz w();

   efe.a C();

   void a(efe.a var1);

   eib y();

   boolean z();

   boolean A();

   Lifecycle B();

   default cvh K() {
      return this.D().b();
   }
}
