import com.mojang.logging.LogUtils;
import java.net.SocketAddress;
import java.nio.file.Path;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public interface bjw {
   bjw f = (bjw)(Runtime.class.getModule().getLayer().findModule("jdk.jfr").isPresent() ? bjv.a() : new bjw.a());

   boolean a(bju var1);

   Path b();

   boolean c();

   boolean d();

   void a(float var1);

   void a(ut var1, yd<?> var2, SocketAddress var3, int var4);

   void b(ut var1, yd<?> var2, SocketAddress var3, int var4);

   void a(dqg var1, cwg var2, dqf var3, int var4);

   void b(dqg var1, cwg var2, dqf var3, int var4);

   @Nullable
   bjz e();

   @Nullable
   bjz a(cwg var1, ajg<cwz> var2, String var3);

   public static class a implements bjw {
      private static final Logger b = LogUtils.getLogger();
      static final bjz a = () -> {
      };

      @Override
      public boolean a(bju $$0) {
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
      public void a(ut $$0, yd<?> $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void b(ut $$0, yd<?> $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void a(dqg $$0, cwg $$1, dqf $$2, int $$3) {
      }

      @Override
      public void b(dqg $$0, cwg $$1, dqf $$2, int $$3) {
      }

      @Override
      public void a(float $$0) {
      }

      @Override
      public bjz e() {
         return a;
      }

      @Nullable
      @Override
      public bjz a(cwg $$0, ajg<cwz> $$1, String $$2) {
         return null;
      }
   }
}
