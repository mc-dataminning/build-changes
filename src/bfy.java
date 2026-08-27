import com.mojang.logging.LogUtils;
import java.net.SocketAddress;
import java.nio.file.Path;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public interface bfy {
   bfy e = (bfy)(Runtime.class.getModule().getLayer().findModule("jdk.jfr").isPresent() ? bfx.a() : new bfy.a());

   boolean a(bfw var1);

   Path b();

   boolean c();

   boolean d();

   void a(float var1);

   void a(tx var1, int var2, SocketAddress var3, int var4);

   void b(tx var1, int var2, SocketAddress var3, int var4);

   @Nullable
   bgb e();

   @Nullable
   bgb a(crm var1, agl<csf> var2, String var3);

   public static class a implements bfy {
      private static final Logger b = LogUtils.getLogger();
      static final bgb a = () -> {
      };

      @Override
      public boolean a(bfw $$0) {
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
      public void a(tx $$0, int $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void b(tx $$0, int $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void a(float $$0) {
      }

      @Override
      public bgb e() {
         return a;
      }

      @Nullable
      @Override
      public bgb a(crm $$0, agl<csf> $$1, String $$2) {
         return null;
      }
   }
}
