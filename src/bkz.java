import com.mojang.logging.LogUtils;
import java.net.SocketAddress;
import java.nio.file.Path;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public interface bkz {
   bkz f = (bkz)(Runtime.class.getModule().getLayer().findModule("jdk.jfr").isPresent() ? bky.a() : new bkz.a());

   boolean a(bkx var1);

   Path b();

   boolean c();

   boolean d();

   void a(float var1);

   void a(vh var1, yr<?> var2, SocketAddress var3, int var4);

   void b(vh var1, yr<?> var2, SocketAddress var3, int var4);

   void a(dsu var1, cyn var2, dst var3, int var4);

   void b(dsu var1, cyn var2, dst var3, int var4);

   @Nullable
   blc e();

   @Nullable
   blc a(cyn var1, aju<czg> var2, String var3);

   public static class a implements bkz {
      private static final Logger b = LogUtils.getLogger();
      static final blc a = () -> {
      };

      @Override
      public boolean a(bkx $$0) {
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
      public void a(vh $$0, yr<?> $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void b(vh $$0, yr<?> $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void a(dsu $$0, cyn $$1, dst $$2, int $$3) {
      }

      @Override
      public void b(dsu $$0, cyn $$1, dst $$2, int $$3) {
      }

      @Override
      public void a(float $$0) {
      }

      @Override
      public blc e() {
         return a;
      }

      @Nullable
      @Override
      public blc a(cyn $$0, aju<czg> $$1, String $$2) {
         return null;
      }
   }
}
