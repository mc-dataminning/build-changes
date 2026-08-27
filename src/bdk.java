import com.mojang.logging.LogUtils;
import java.net.SocketAddress;
import java.nio.file.Path;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public interface bdk {
   bdk e = (bdk)(Runtime.class.getModule().getLayer().findModule("jdk.jfr").isPresent() ? bdj.a() : new bdk.a());

   boolean a(bdi var1);

   Path b();

   boolean c();

   boolean d();

   void a(float var1);

   void a(sg var1, int var2, SocketAddress var3, int var4);

   void b(sg var1, int var2, SocketAddress var3, int var4);

   @Nullable
   bdn e();

   @Nullable
   bdn a(cor var1, aeo<cpk> var2, String var3);

   public static class a implements bdk {
      private static final Logger b = LogUtils.getLogger();
      static final bdn a = () -> {
      };

      @Override
      public boolean a(bdi $$0) {
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
      public void a(sg $$0, int $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void b(sg $$0, int $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void a(float $$0) {
      }

      @Override
      public bdn e() {
         return a;
      }

      @Nullable
      @Override
      public bdn a(cor $$0, aeo<cpk> $$1, String $$2) {
         return null;
      }
   }
}
