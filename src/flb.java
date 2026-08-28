import java.util.Collection;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import org.joml.Matrix4f;

public interface flb extends AutoCloseable {
   void a(fjp var1);

   void a(String var1, flh var2);

   void a(String var1, int... var2);

   void a(String var1, float... var2);

   void a(String var1, Matrix4f var2);

   void a(flc var1);

   void a(int var1, int var2, int var3, int var4);

   void b();

   void a(int var1, fig var2);

   void a(fig var1, fls.b var2);

   void a(int var1, int var2);

   void a(Collection<flb.a> var1);

   void b(int var1, int var2);

   @Override
   void close();

   public static record a(int a, fig b, fig c, fls.b d, int e, int f, @Nullable Consumer<flb.b> g) {
      public a(int $$0, fig $$1, fig $$2, fls.b $$3, int $$4, int $$5) {
         this($$0, $$1, $$2, $$3, $$4, $$5, null);
      }
   }

   public interface b {
      void upload(String var1, float... var2);
   }
}
