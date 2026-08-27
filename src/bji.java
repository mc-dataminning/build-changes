import com.mojang.logging.LogUtils;
import java.net.SocketAddress;
import java.nio.file.Path;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public interface bji {
   bji e = (bji)(Runtime.class.getModule().getLayer().findModule("jdk.jfr").isPresent() ? bjh.a() : new bji.a());

   boolean a(bjg var1);

   Path b();

   boolean c();

   boolean d();

   void a(float var1);

   void a(ur var1, yb<?> var2, SocketAddress var3, int var4);

   void b(ur var1, yb<?> var2, SocketAddress var3, int var4);

   @Nullable
   bjl e();

   @Nullable
   bjl a(cvl var1, ajb<cwe> var2, String var3);

   public static class a implements bji {
      private static final Logger b = LogUtils.getLogger();
      static final bjl a = () -> {
      };

      @Override
      public boolean a(bjg $$0) {
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
      public void a(ur $$0, yb<?> $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void b(ur $$0, yb<?> $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void a(float $$0) {
      }

      @Override
      public bjl e() {
         return a;
      }

      @Nullable
      @Override
      public bjl a(cvl $$0, ajb<cwe> $$1, String $$2) {
         return null;
      }
   }
}
