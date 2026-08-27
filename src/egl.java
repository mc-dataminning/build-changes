import com.mojang.serialization.Lifecycle;
import java.util.Locale;
import java.util.Set;
import javax.annotation.Nullable;

public interface egl {
   int d = 19133;
   int e = 19132;

   cuc F();

   void a(cuc var1);

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
   sl G();

   void a(@Nullable sl var1);

   egk K();

   ctm L();

   sl a(iu var1, @Nullable sl var2);

   boolean n();

   int z();

   String g();

   ctf m();

   void a(ctf var1);

   boolean o();

   bjs s();

   void a(bjs var1);

   boolean t();

   void d(boolean var1);

   cte q();

   @Nullable
   sl y();

   dmm.a E();

   void a(dmm.a var1);

   dph A();

   boolean B();

   boolean C();

   Lifecycle D();

   default chl M() {
      return this.F().b();
   }
}
