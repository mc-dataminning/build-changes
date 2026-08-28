import com.mojang.logging.LogUtils;
import java.net.SocketAddress;
import java.nio.file.Path;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public interface bno {
   bno f = (bno)(Runtime.class.getModule().getLayer().findModule("jdk.jfr").isPresent() ? bnn.a() : new bno.a());

   boolean a(bnm var1);

   Path b();

   boolean c();

   boolean d();

   void a(float var1);

   void a(wl var1, zy<?> var2, SocketAddress var3, int var4);

   void b(wl var1, zy<?> var2, SocketAddress var3, int var4);

   void a(dvo var1, dbf var2, dvn var3, int var4);

   void b(dvo var1, dbf var2, dvn var3, int var4);

   @Nullable
   bnr e();

   @Nullable
   bnr a(dbf var1, ale<dby> var2, String var3);

   public static class a implements bno {
      private static final Logger b = LogUtils.getLogger();
      static final bnr a = () -> {
      };

      @Override
      public boolean a(bnm $$0) {
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
      public void a(wl $$0, zy<?> $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void b(wl $$0, zy<?> $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void a(dvo $$0, dbf $$1, dvn $$2, int $$3) {
      }

      @Override
      public void b(dvo $$0, dbf $$1, dvn $$2, int $$3) {
      }

      @Override
      public void a(float $$0) {
      }

      @Override
      public bnr e() {
         return a;
      }

      @Nullable
      @Override
      public bnr a(dbf $$0, ale<dby> $$1, String $$2) {
         return null;
      }
   }
}
