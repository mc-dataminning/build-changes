import com.mojang.logging.LogUtils;
import java.net.SocketAddress;
import java.nio.file.Path;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public interface bgx {
   bgx e = (bgx)(Runtime.class.getModule().getLayer().findModule("jdk.jfr").isPresent() ? bgw.a() : new bgx.a());

   boolean a(bgv var1);

   Path b();

   boolean c();

   boolean d();

   void a(float var1);

   void a(uh var1, int var2, SocketAddress var3, int var4);

   void b(uh var1, int var2, SocketAddress var3, int var4);

   @Nullable
   bha e();

   @Nullable
   bha a(csv var1, ahf<cto> var2, String var3);

   public static class a implements bgx {
      private static final Logger b = LogUtils.getLogger();
      static final bha a = () -> {
      };

      @Override
      public boolean a(bgv $$0) {
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
      public bha e() {
         return a;
      }

      @Nullable
      @Override
      public bha a(csv $$0, ahf<cto> $$1, String $$2) {
         return null;
      }
   }
}
