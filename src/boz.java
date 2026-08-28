import com.mojang.logging.LogUtils;
import java.net.SocketAddress;
import java.nio.file.Path;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public interface boz {
   boz f = (boz)(Runtime.class.getModule().getLayer().findModule("jdk.jfr").isPresent() ? boy.a() : new boz.a());

   boolean a(box var1);

   Path b();

   boolean c();

   boolean d();

   void a(float var1);

   void a(wg var1, zu<?> var2, SocketAddress var3, int var4);

   void b(wg var1, zu<?> var2, SocketAddress var3, int var4);

   void a(dzc var1, del var2, dzb var3, int var4);

   void b(dzc var1, del var2, dzb var3, int var4);

   @Nullable
   bpc e();

   @Nullable
   bpc a(del var1, alk<dff> var2, String var3);

   public static class a implements boz {
      private static final Logger b = LogUtils.getLogger();
      static final bpc a = () -> {
      };

      @Override
      public boolean a(box $$0) {
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
      public void a(wg $$0, zu<?> $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void b(wg $$0, zu<?> $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void a(dzc $$0, del $$1, dzb $$2, int $$3) {
      }

      @Override
      public void b(dzc $$0, del $$1, dzb $$2, int $$3) {
      }

      @Override
      public void a(float $$0) {
      }

      @Override
      public bpc e() {
         return a;
      }

      @Nullable
      @Override
      public bpc a(del $$0, alk<dff> $$1, String $$2) {
         return null;
      }
   }
}
