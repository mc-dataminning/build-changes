import com.mojang.serialization.Lifecycle;
import java.util.Locale;
import java.util.Set;
import javax.annotation.Nullable;

public interface eco {
   int c = 19133;
   int d = 19132;

   cqq F();

   void a(cqq var1);

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
   qy G();

   void a(@Nullable qy var1);

   ecn K();

   cqb L();

   qy a(hu var1, @Nullable qy var2);

   boolean n();

   int z();

   String g();

   cpu m();

   void a(cpu var1);

   boolean o();

   bgx s();

   void a(bgx var1);

   boolean t();

   void d(boolean var1);

   cpt q();

   @Nullable
   qy y();

   dix.a E();

   void a(dix.a var1);

   dls A();

   boolean B();

   boolean C();

   Lifecycle D();

   default cee M() {
      return this.F().b();
   }
}
