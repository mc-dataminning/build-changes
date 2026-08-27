import com.mojang.serialization.Lifecycle;
import java.util.Locale;
import java.util.Set;
import javax.annotation.Nullable;

public interface egs {
   int d = 19133;
   int e = 19132;

   cuj F();

   void a(cuj var1);

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
   sn G();

   void a(@Nullable sn var1);

   egr K();

   ctt L();

   sn a(iu var1, @Nullable sn var2);

   boolean n();

   int z();

   String g();

   ctm m();

   void a(ctm var1);

   boolean o();

   bjy s();

   void a(bjy var1);

   boolean t();

   void d(boolean var1);

   ctl q();

   @Nullable
   sn y();

   dmt.a E();

   void a(dmt.a var1);

   dpo A();

   boolean B();

   boolean C();

   Lifecycle D();

   default chs M() {
      return this.F().b();
   }
}
