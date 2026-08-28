import com.mojang.logging.LogUtils;
import java.net.SocketAddress;
import java.nio.file.Path;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public interface bqr {
   bqr f = (bqr)(Runtime.class.getModule().getLayer().findModule("jdk.jfr").isPresent() ? bqq.a() : new bqr.a());

   boolean a(bqp var1);

   Path b();

   boolean c();

   boolean d();

   void a(float var1);

   void a(vq var1, zf<?> var2, SocketAddress var3, int var4);

   void b(vq var1, zf<?> var2, SocketAddress var3, int var4);

   void a(ede var1, dhw var2, edd var3, int var4);

   void b(ede var1, dhw var2, edd var3, int var4);

   @Nullable
   bqu e();

   @Nullable
   bqu a(dhw var1, ald<dip> var2, String var3);

   @Nullable
   bqu a(dhw var1, ald<dip> var2, je<eqi> var3);

   public static class a implements bqr {
      private static final Logger b = LogUtils.getLogger();
      static final bqu a = $$0 -> {
      };

      @Override
      public boolean a(bqp $$0) {
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
      public void a(vq $$0, zf<?> $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void b(vq $$0, zf<?> $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void a(ede $$0, dhw $$1, edd $$2, int $$3) {
      }

      @Override
      public void b(ede $$0, dhw $$1, edd $$2, int $$3) {
      }

      @Override
      public void a(float $$0) {
      }

      @Override
      public bqu e() {
         return a;
      }

      @Nullable
      @Override
      public bqu a(dhw $$0, ald<dip> $$1, String $$2) {
         return null;
      }

      @Override
      public bqu a(dhw $$0, ald<dip> $$1, je<eqi> $$2) {
         return a;
      }
   }
}
