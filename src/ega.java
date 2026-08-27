import com.mojang.serialization.Lifecycle;
import java.util.Locale;
import java.util.Set;
import javax.annotation.Nullable;

public interface ega {
   int d = 19133;
   int e = 19132;

   cts F();

   void a(cts var1);

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
   sj G();

   void a(@Nullable sj var1);

   efz K();

   ctc L();

   sj a(is var1, @Nullable sj var2);

   boolean n();

   int z();

   String g();

   csv m();

   void a(csv var1);

   boolean o();

   bji s();

   void a(bji var1);

   boolean t();

   void d(boolean var1);

   csu q();

   @Nullable
   sj y();

   dmb.a E();

   void a(dmb.a var1);

   dow A();

   boolean B();

   boolean C();

   Lifecycle D();

   default chb M() {
      return this.F().b();
   }
}
