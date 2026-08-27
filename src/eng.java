import com.mojang.serialization.Lifecycle;
import java.util.Locale;
import java.util.Set;
import javax.annotation.Nullable;

public interface eng {
   int d = 19133;
   int e = 19132;

   daa D();

   void a(daa var1);

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
   to E();

   void a(@Nullable to var1);

   enf I();

   czk J();

   to a(jb var1, @Nullable to var2);

   boolean l();

   int x();

   String e();

   czd k();

   void a(czd var1);

   boolean m();

   boc q();

   void a(boc var1);

   boolean r();

   void d(boolean var1);

   czc o();

   @Nullable
   to w();

   dtd.a C();

   void a(dtd.a var1);

   dvy y();

   boolean z();

   boolean A();

   Lifecycle B();

   default cmn K() {
      return this.D().b();
   }
}
