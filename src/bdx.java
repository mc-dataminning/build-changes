import com.mojang.logging.LogUtils;
import java.net.SocketAddress;
import java.nio.file.Path;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public interface bdx {
   bdx e = (bdx)(Runtime.class.getModule().getLayer().findModule("jdk.jfr").isPresent() ? bdw.a() : new bdx.a());

   boolean a(bdv var1);

   Path b();

   boolean c();

   boolean d();

   void a(float var1);

   void a(sp var1, int var2, SocketAddress var3, int var4);

   void b(sp var1, int var2, SocketAddress var3, int var4);

   @Nullable
   bea e();

   @Nullable
   bea a(cpe var1, aex<cpx> var2, String var3);

   public static class a implements bdx {
      private static final Logger b = LogUtils.getLogger();
      static final bea a = () -> {
      };

      @Override
      public boolean a(bdv $$0) {
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
      public void a(sp $$0, int $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void b(sp $$0, int $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void a(float $$0) {
      }

      @Override
      public bea e() {
         return a;
      }

      @Nullable
      @Override
      public bea a(cpe $$0, aex<cpx> $$1, String $$2) {
         return null;
      }
   }
}
