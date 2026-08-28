import com.mojang.logging.LogUtils;
import java.net.SocketAddress;
import java.nio.file.Path;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public interface boe {
   boe f = (boe)(Runtime.class.getModule().getLayer().findModule("jdk.jfr").isPresent() ? bod.a() : new boe.a());

   boolean a(boc var1);

   Path b();

   boolean c();

   boolean d();

   void a(float var1);

   void a(vy var1, zm<?> var2, SocketAddress var3, int var4);

   void b(vy var1, zm<?> var2, SocketAddress var3, int var4);

   void a(dxp var1, dcy var2, dxo var3, int var4);

   void b(dxp var1, dcy var2, dxo var3, int var4);

   @Nullable
   boh e();

   @Nullable
   boh a(dcy var1, ala<dds> var2, String var3);

   public static class a implements boe {
      private static final Logger b = LogUtils.getLogger();
      static final boh a = () -> {
      };

      @Override
      public boolean a(boc $$0) {
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
      public void a(vy $$0, zm<?> $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void b(vy $$0, zm<?> $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void a(dxp $$0, dcy $$1, dxo $$2, int $$3) {
      }

      @Override
      public void b(dxp $$0, dcy $$1, dxo $$2, int $$3) {
      }

      @Override
      public void a(float $$0) {
      }

      @Override
      public boh e() {
         return a;
      }

      @Nullable
      @Override
      public boh a(dcy $$0, ala<dds> $$1, String $$2) {
         return null;
      }
   }
}
