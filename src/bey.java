import com.mojang.logging.LogUtils;
import java.net.SocketAddress;
import java.nio.file.Path;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public interface bey {
   bey e = (bey)(Runtime.class.getModule().getLayer().findModule("jdk.jfr").isPresent() ? bex.a() : new bey.a());

   boolean a(bew var1);

   Path b();

   boolean c();

   boolean d();

   void a(float var1);

   void a(tk var1, int var2, SocketAddress var3, int var4);

   void b(tk var1, int var2, SocketAddress var3, int var4);

   @Nullable
   bfb e();

   @Nullable
   bfb a(cqg var1, afv<cqz> var2, String var3);

   public static class a implements bey {
      private static final Logger b = LogUtils.getLogger();
      static final bfb a = () -> {
      };

      @Override
      public boolean a(bew $$0) {
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
      public void a(tk $$0, int $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void b(tk $$0, int $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void a(float $$0) {
      }

      @Override
      public bfb e() {
         return a;
      }

      @Nullable
      @Override
      public bfb a(cqg $$0, afv<cqz> $$1, String $$2) {
         return null;
      }
   }
}
