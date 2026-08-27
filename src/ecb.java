import com.mojang.serialization.Lifecycle;
import java.util.Locale;
import java.util.Set;
import javax.annotation.Nullable;

public interface ecb {
   int c = 19133;
   int d = 19132;

   cqd F();

   void a(cqd var1);

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
   qs G();

   void a(@Nullable qs var1);

   eca K();

   cpo L();

   qs a(ht var1, @Nullable qs var2);

   boolean n();

   int z();

   String g();

   cph m();

   void a(cph var1);

   boolean o();

   bgl s();

   void a(bgl var1);

   boolean t();

   void d(boolean var1);

   cpg q();

   @Nullable
   qs y();

   dik.a E();

   void a(dik.a var1);

   dlf A();

   boolean B();

   boolean C();

   Lifecycle D();

   default cdt M() {
      return this.F().b();
   }
}
