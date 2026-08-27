import com.mojang.logging.LogUtils;
import java.net.SocketAddress;
import java.nio.file.Path;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public interface bgs {
   bgs e = (bgs)(Runtime.class.getModule().getLayer().findModule("jdk.jfr").isPresent() ? bgr.a() : new bgs.a());

   boolean a(bgq var1);

   Path b();

   boolean c();

   boolean d();

   void a(float var1);

   void a(uf var1, int var2, SocketAddress var3, int var4);

   void b(uf var1, int var2, SocketAddress var3, int var4);

   @Nullable
   bgv e();

   @Nullable
   bgv a(csp var1, ahc<cti> var2, String var3);

   public static class a implements bgs {
      private static final Logger b = LogUtils.getLogger();
      static final bgv a = () -> {
      };

      @Override
      public boolean a(bgq $$0) {
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
      public void a(uf $$0, int $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void b(uf $$0, int $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void a(float $$0) {
      }

      @Override
      public bgv e() {
         return a;
      }

      @Nullable
      @Override
      public bgv a(csp $$0, ahc<cti> $$1, String $$2) {
         return null;
      }
   }
}
