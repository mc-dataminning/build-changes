import com.mojang.serialization.Lifecycle;
import java.util.Locale;
import java.util.Set;
import javax.annotation.Nullable;

public interface dze {
   int c = 19133;
   int d = 19132;

   cnf F();

   void a(cnf var1);

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
   qr G();

   void a(@Nullable qr var1);

   dzd K();

   cmq L();

   qr a(hs var1, @Nullable qr var2);

   boolean n();

   int z();

   String g();

   cmj m();

   void a(cmj var1);

   boolean o();

   bdu s();

   void a(bdu var1);

   boolean t();

   void d(boolean var1);

   cmi q();

   @Nullable
   qr y();

   dfn.a E();

   void a(dfn.a var1);

   dii A();

   boolean B();

   boolean C();

   Lifecycle D();

   default caw M() {
      return this.F().b();
   }
}
