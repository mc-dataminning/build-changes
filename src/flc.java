import java.nio.ByteBuffer;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public interface flc {
   flb b();

   flj a(@Nullable Supplier<String> var1, flk var2, int var3, int var4, int var5);

   flj a(@Nullable String var1, flk var2, int var3, int var4, int var5);

   fii a(@Nullable Supplier<String> var1, fig var2, fih var3, int var4);

   fii a(@Nullable Supplier<String> var1, fig var2, fih var3, ByteBuffer var4);

   String c();

   List<String> d();

   boolean e();

   String g();

   String h();

   String i();

   String f();

   int j();

   default fjo b(fjr $$0) {
      return this.b($$0, null);
   }

   fjo b(fjr var1, @Nullable BiFunction<alk, fky, String> var2);

   void k();

   List<String> l();
}
