import com.mojang.serialization.Lifecycle;
import java.util.Locale;
import java.util.Set;
import javax.annotation.Nullable;

public interface eet {
   int d = 19133;
   int e = 19132;

   cst F();

   void a(cst var1);

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
   rz G();

   void a(@Nullable rz var1);

   ees K();

   cse L();

   rz a(ip var1, @Nullable rz var2);

   boolean n();

   int z();

   String g();

   crx m();

   void a(crx var1);

   boolean o();

   biu s();

   void a(biu var1);

   boolean t();

   void d(boolean var1);

   crw q();

   @Nullable
   rz y();

   dku.a E();

   void a(dku.a var1);

   dnp A();

   boolean B();

   boolean C();

   Lifecycle D();

   default cgd M() {
      return this.F().b();
   }
}
