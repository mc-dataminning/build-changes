import com.mojang.serialization.Lifecycle;
import java.util.Locale;
import java.util.Set;
import javax.annotation.Nullable;

public interface ede {
   int c = 19133;
   int d = 19132;

   crs F();

   void a(crs var1);

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
   rt G();

   void a(@Nullable rt var1);

   edd K();

   crd L();

   rt a(ip var1, @Nullable rt var2);

   boolean n();

   int z();

   String g();

   cqw m();

   void a(cqw var1);

   boolean o();

   bhy s();

   void a(bhy var1);

   boolean t();

   void d(boolean var1);

   cqv q();

   @Nullable
   rt y();

   djn.a E();

   void a(djn.a var1);

   dmi A();

   boolean B();

   boolean C();

   Lifecycle D();

   default cfg M() {
      return this.F().b();
   }
}
