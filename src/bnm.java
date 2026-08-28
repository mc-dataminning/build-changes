import com.mojang.logging.LogUtils;
import java.net.SocketAddress;
import java.nio.file.Path;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public interface bnm {
   bnm f = (bnm)(Runtime.class.getModule().getLayer().findModule("jdk.jfr").isPresent() ? bnl.a() : new bnm.a());

   boolean a(bnk var1);

   Path b();

   boolean c();

   boolean d();

   void a(float var1);

   void a(wk var1, zx<?> var2, SocketAddress var3, int var4);

   void b(wk var1, zx<?> var2, SocketAddress var3, int var4);

   void a(dvm var1, dbd var2, dvl var3, int var4);

   void b(dvm var1, dbd var2, dvl var3, int var4);

   @Nullable
   bnp e();

   @Nullable
   bnp a(dbd var1, ald<dbw> var2, String var3);

   public static class a implements bnm {
      private static final Logger b = LogUtils.getLogger();
      static final bnp a = () -> {
      };

      @Override
      public boolean a(bnk $$0) {
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
      public void a(wk $$0, zx<?> $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void b(wk $$0, zx<?> $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void a(dvm $$0, dbd $$1, dvl $$2, int $$3) {
      }

      @Override
      public void b(dvm $$0, dbd $$1, dvl $$2, int $$3) {
      }

      @Override
      public void a(float $$0) {
      }

      @Override
      public bnp e() {
         return a;
      }

      @Nullable
      @Override
      public bnp a(dbd $$0, ald<dbw> $$1, String $$2) {
         return null;
      }
   }
}
