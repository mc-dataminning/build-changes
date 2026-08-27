import com.mojang.serialization.Lifecycle;
import java.util.Locale;
import java.util.Set;
import javax.annotation.Nullable;

public interface eeh {
   int d = 19133;
   int e = 19132;

   csl F();

   void a(csl var1);

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

   eeg K();

   crw L();

   rz a(ip var1, @Nullable rz var2);

   boolean n();

   int z();

   String g();

   crp m();

   void a(crp var1);

   boolean o();

   bin s();

   void a(bin var1);

   boolean t();

   void d(boolean var1);

   cro q();

   @Nullable
   rz y();

   dki.a E();

   void a(dki.a var1);

   dnd A();

   boolean B();

   boolean C();

   Lifecycle D();

   default cfv M() {
      return this.F().b();
   }
}
