import com.mojang.serialization.Lifecycle;
import java.util.Locale;
import java.util.Set;
import javax.annotation.Nullable;

public interface ehb {
   int d = 19133;
   int e = 19132;

   cur F();

   void a(cur var1);

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
   so G();

   void a(@Nullable so var1);

   eha K();

   cub L();

   so a(iu var1, @Nullable so var2);

   boolean n();

   int z();

   String g();

   ctu m();

   void a(ctu var1);

   boolean o();

   bjz s();

   void a(bjz var1);

   boolean t();

   void d(boolean var1);

   ctt q();

   @Nullable
   so y();

   dnb.a E();

   void a(dnb.a var1);

   dpw A();

   boolean B();

   boolean C();

   Lifecycle D();

   default cia M() {
      return this.F().b();
   }
}
