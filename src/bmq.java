import com.mojang.logging.LogUtils;
import java.net.SocketAddress;
import java.nio.file.Path;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public interface bmq {
   bmq f = (bmq)(Runtime.class.getModule().getLayer().findModule("jdk.jfr").isPresent() ? bmp.a() : new bmq.a());

   boolean a(bmo var1);

   Path b();

   boolean c();

   boolean d();

   void a(float var1);

   void a(vw var1, zg<?> var2, SocketAddress var3, int var4);

   void b(vw var1, zg<?> var2, SocketAddress var3, int var4);

   void a(dup var1, dag var2, duo var3, int var4);

   void b(dup var1, dag var2, duo var3, int var4);

   @Nullable
   bmt e();

   @Nullable
   bmt a(dag var1, akm<daz> var2, String var3);

   public static class a implements bmq {
      private static final Logger b = LogUtils.getLogger();
      static final bmt a = () -> {
      };

      @Override
      public boolean a(bmo $$0) {
         b.warn("Attempted to start Flight Recorder, but it's not supported on this JVM");
         return false;
      }

      @Override
      public Path b() {
         throw new IllegalStateException("Attempted to stop Flight Recorder, but it's not supported on this JVM");
      }

      @Override
      public boolean c() {
         return false;
      }

      @Override
      public boolean d() {
         return false;
      }

      @Override
      public void a(vw $$0, zg<?> $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void b(vw $$0, zg<?> $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void a(dup $$0, dag $$1, duo $$2, int $$3) {
      }

      @Override
      public void b(dup $$0, dag $$1, duo $$2, int $$3) {
      }

      @Override
      public void a(float $$0) {
      }

      @Override
      public bmt e() {
         return a;
      }

      @Nullable
      @Override
      public bmt a(dag $$0, akm<daz> $$1, String $$2) {
         return null;
      }
   }
}
