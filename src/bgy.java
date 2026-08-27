import com.mojang.logging.LogUtils;
import java.net.SocketAddress;
import java.nio.file.Path;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public interface bgy {
   bgy e = (bgy)(Runtime.class.getModule().getLayer().findModule("jdk.jfr").isPresent() ? bgx.a() : new bgy.a());

   boolean a(bgw var1);

   Path b();

   boolean c();

   boolean d();

   void a(float var1);

   void a(uh var1, int var2, SocketAddress var3, int var4);

   void b(uh var1, int var2, SocketAddress var3, int var4);

   @Nullable
   bhb e();

   @Nullable
   bhb a(csw var1, ahf<ctp> var2, String var3);

   public static class a implements bgy {
      private static final Logger b = LogUtils.getLogger();
      static final bhb a = () -> {
      };

      @Override
      public boolean a(bgw $$0) {
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
      public void a(uh $$0, int $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void b(uh $$0, int $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void a(float $$0) {
      }

      @Override
      public bhb e() {
         return a;
      }

      @Nullable
      @Override
      public bhb a(csw $$0, ahf<ctp> $$1, String $$2) {
         return null;
      }
   }
}
