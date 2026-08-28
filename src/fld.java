import java.util.Collection;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import org.joml.Matrix4f;

public interface fld extends AutoCloseable {
   void a(fjr var1);

   void a(String var1, flj var2);

   void a(String var1, int... var2);

   void a(String var1, float... var2);

   void a(String var1, Matrix4f var2);

   void a(fle var1);

   void a(int var1, int var2, int var3, int var4);

   void b();

   void a(int var1, fii var2);

   void a(fii var1, flu.b var2);

   void a(int var1, int var2);

   void a(Collection<fld.a> var1);

   void b(int var1, int var2);

   @Override
   void close();

   public static record a(int a, fii b, fii c, flu.b d, int e, int f, @Nullable Consumer<fld.b> g) {
      public a(int $$0, fii $$1, fii $$2, flu.b $$3, int $$4, int $$5) {
         this($$0, $$1, $$2, $$3, $$4, $$5, null);
      }
   }

   public interface b {
      void upload(String var1, float... var2);
   }
}
