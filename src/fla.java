import java.nio.ByteBuffer;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public interface fla {
   fkz b();

   flh a(@Nullable Supplier<String> var1, fli var2, int var3, int var4, int var5);

   flh a(@Nullable String var1, fli var2, int var3, int var4, int var5);

   fig a(@Nullable Supplier<String> var1, fie var2, fif var3, int var4);

   fig a(@Nullable Supplier<String> var1, fie var2, fif var3, ByteBuffer var4);

   String c();

   List<String> d();

   boolean e();

   String g();

   String h();

   String i();

   String f();

   int j();

   default fjm b(fjp $$0) {
      return this.b($$0, null);
   }

   fjm b(fjp var1, @Nullable BiFunction<ali, fkw, String> var2);

   void k();

   List<String> l();
}
