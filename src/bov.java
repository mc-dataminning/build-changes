import com.mojang.logging.LogUtils;
import java.net.SocketAddress;
import java.nio.file.Path;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public interface bov {
   bov f = (bov)(Runtime.class.getModule().getLayer().findModule("jdk.jfr").isPresent() ? bou.a() : new bov.a());

   boolean a(bot var1);

   Path b();

   boolean c();

   boolean d();

   void a(float var1);

   void a(wd var1, zr<?> var2, SocketAddress var3, int var4);

   void b(wd var1, zr<?> var2, SocketAddress var3, int var4);

   void a(dyy var1, deh var2, dyx var3, int var4);

   void b(dyy var1, deh var2, dyx var3, int var4);

   @Nullable
   boy e();

   @Nullable
   boy a(deh var1, alh<dfb> var2, String var3);

   public static class a implements bov {
      private static final Logger b = LogUtils.getLogger();
      static final boy a = () -> {
      };

      @Override
      public boolean a(bot $$0) {
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
      public void a(wd $$0, zr<?> $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void b(wd $$0, zr<?> $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void a(dyy $$0, deh $$1, dyx $$2, int $$3) {
      }

      @Override
      public void b(dyy $$0, deh $$1, dyx $$2, int $$3) {
      }

      @Override
      public void a(float $$0) {
      }

      @Override
      public boy e() {
         return a;
      }

      @Nullable
      @Override
      public boy a(deh $$0, alh<dfb> $$1, String $$2) {
         return null;
      }
   }
}
