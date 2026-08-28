import com.mojang.logging.LogUtils;
import java.net.SocketAddress;
import java.nio.file.Path;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public interface brj {
   brj f = (brj)(Runtime.class.getModule().getLayer().findModule("jdk.jfr").isPresent() ? bri.a() : new brj.a());

   boolean a(brh var1);

   Path b();

   boolean c();

   boolean d();

   void a(float var1);

   void a(vu var1, zj<?> var2, SocketAddress var3, int var4);

   void b(vu var1, zj<?> var2, SocketAddress var3, int var4);

   void a(eeu var1, djc var2, eet var3, int var4);

   void b(eeu var1, djc var2, eet var3, int var4);

   @Nullable
   brm e();

   @Nullable
   brm a(djc var1, alh<djx> var2, String var3);

   @Nullable
   brm a(djc var1, alh<djx> var2, jf<esb> var3);

   public static class a implements brj {
      private static final Logger b = LogUtils.getLogger();
      static final brm a = $$0 -> {
      };

      @Override
      public boolean a(brh $$0) {
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
      public void a(vu $$0, zj<?> $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void b(vu $$0, zj<?> $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void a(eeu $$0, djc $$1, eet $$2, int $$3) {
      }

      @Override
      public void b(eeu $$0, djc $$1, eet $$2, int $$3) {
      }

      @Override
      public void a(float $$0) {
      }

      @Override
      public brm e() {
         return a;
      }

      @Nullable
      @Override
      public brm a(djc $$0, alh<djx> $$1, String $$2) {
         return null;
      }

      @Override
      public brm a(djc $$0, alh<djx> $$1, jf<esb> $$2) {
         return a;
      }
   }
}
