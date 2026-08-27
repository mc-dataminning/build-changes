import com.mojang.serialization.Lifecycle;
import java.util.Locale;
import java.util.Set;
import javax.annotation.Nullable;

public interface ecg {
   int c = 19133;
   int d = 19132;

   cqu F();

   void a(cqu var1);

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
   qw G();

   void a(@Nullable qw var1);

   ecf K();

   cqf L();

   qw a(hr var1, @Nullable qw var2);

   boolean n();

   int z();

   String g();

   cpy m();

   void a(cpy var1);

   boolean o();

   bhb s();

   void a(bhb var1);

   boolean t();

   void d(boolean var1);

   cpx q();

   @Nullable
   qw y();

   dip.a E();

   void a(dip.a var1);

   dlk A();

   boolean B();

   boolean C();

   Lifecycle D();

   default cei M() {
      return this.F().b();
   }
}
