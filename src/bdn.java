import com.mojang.logging.LogUtils;
import java.net.SocketAddress;
import java.nio.file.Path;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public interface bdn {
   bdn e = (bdn)(Runtime.class.getModule().getLayer().findModule("jdk.jfr").isPresent() ? bdm.a() : new bdn.a());

   boolean a(bdl var1);

   Path b();

   boolean c();

   boolean d();

   void a(float var1);

   void a(sh var1, int var2, SocketAddress var3, int var4);

   void b(sh var1, int var2, SocketAddress var3, int var4);

   @Nullable
   bdq e();

   @Nullable
   bdq a(cot var1, aeq<cpm> var2, String var3);

   public static class a implements bdn {
      private static final Logger b = LogUtils.getLogger();
      static final bdq a = () -> {
      };

      @Override
      public boolean a(bdl $$0) {
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
      public void a(sh $$0, int $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void b(sh $$0, int $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void a(float $$0) {
      }

      @Override
      public bdq e() {
         return a;
      }

      @Nullable
      @Override
      public bdq a(cot $$0, aeq<cpm> $$1, String $$2) {
         return null;
      }
   }
}
