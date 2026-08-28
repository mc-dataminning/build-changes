import com.mojang.serialization.Lifecycle;
import java.util.Locale;
import java.util.Set;
import javax.annotation.Nullable;

public interface etw {
   int d = 19133;
   int e = 19132;

   dfx D();

   void a(dfx var1);

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
   uk E();

   void a(@Nullable uk var1);

   etv I();

   dff J();

   uk a(ke var1, @Nullable uk var2);

   boolean l();

   int x();

   String e();

   dey k();

   void a(dey var1);

   boolean m();

   bsa q();

   void a(bsa var1);

   boolean r();

   void d(boolean var1);

   dex o();

   @Nullable
   uk w();

   dzi.a C();

   void a(dzi.a var1);

   ecd y();

   boolean z();

   boolean A();

   Lifecycle B();

   default crf K() {
      return this.D().b();
   }
}
