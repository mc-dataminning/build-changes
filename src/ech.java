import com.mojang.serialization.Lifecycle;
import java.util.Locale;
import java.util.Set;
import javax.annotation.Nullable;

public interface ech {
   int c = 19133;
   int d = 19132;

   cqj F();

   void a(cqj var1);

   boolean H();

   Set<String> I();

   Set<String> J();

   void a(String var1, boolean var2);

   default void a(p $$0) {
      $$0.a("Known server brands", () -> String.join(", ", this.I()));
      $$0.a("Removed feature flags", () -> String.join(", ", this.J()));
      $$0.a("Level was modded", () -> Boolean.toString(this.H()));
      $$0.a("Level storage version", () -> {
         int $$0x = this.z();
         return String.format(Locale.ROOT, "0x%05X - %s", $$0x, this.i($$0x));
      });
   }

   default String i(int $$0) {
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
   qu G();

   void a(@Nullable qu var1);

   ecg K();

   cpu L();

   qu a(hu var1, @Nullable qu var2);

   boolean n();

   int z();

   String g();

   cpn m();

   void a(cpn var1);

   boolean o();

   bgq s();

   void a(bgq var1);

   boolean t();

   void d(boolean var1);

   cpm q();

   @Nullable
   qu y();

   diq.a E();

   void a(diq.a var1);

   dll A();

   boolean B();

   boolean C();

   Lifecycle D();

   default cdx M() {
      return this.F().b();
   }
}
