import com.mojang.serialization.Lifecycle;
import java.util.Locale;
import java.util.Set;
import javax.annotation.Nullable;

public interface eey {
   int d = 19133;
   int e = 19132;

   csy F();

   void a(csy var1);

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
   sd G();

   void a(@Nullable sd var1);

   eex K();

   csj L();

   sd a(it var1, @Nullable sd var2);

   boolean n();

   int z();

   String g();

   csc m();

   void a(csc var1);

   boolean o();

   biy s();

   void a(biy var1);

   boolean t();

   void d(boolean var1);

   csb q();

   @Nullable
   sd y();

   dkz.a E();

   void a(dkz.a var1);

   dnu A();

   boolean B();

   boolean C();

   Lifecycle D();

   default cgi M() {
      return this.F().b();
   }
}
