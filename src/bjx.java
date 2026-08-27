import com.mojang.logging.LogUtils;
import java.net.SocketAddress;
import java.nio.file.Path;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public interface bjx {
   bjx f = (bjx)(Runtime.class.getModule().getLayer().findModule("jdk.jfr").isPresent() ? bjw.a() : new bjx.a());

   boolean a(bjv var1);

   Path b();

   boolean c();

   boolean d();

   void a(float var1);

   void a(ut var1, yd<?> var2, SocketAddress var3, int var4);

   void b(ut var1, yd<?> var2, SocketAddress var3, int var4);

   void a(dqi var1, cwi var2, dqh var3, int var4);

   void b(dqi var1, cwi var2, dqh var3, int var4);

   @Nullable
   bka e();

   @Nullable
   bka a(cwi var1, ajg<cxb> var2, String var3);

   public static class a implements bjx {
      private static final Logger b = LogUtils.getLogger();
      static final bka a = () -> {
      };

      @Override
      public boolean a(bjv $$0) {
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
      public void a(dqi $$0, cwi $$1, dqh $$2, int $$3) {
      }

      @Override
      public void b(dqi $$0, cwi $$1, dqh $$2, int $$3) {
      }

      @Override
      public void a(float $$0) {
      }

      @Override
      public bka e() {
         return a;
      }

      @Nullable
      @Override
      public bka a(cwi $$0, ajg<cxb> $$1, String $$2) {
         return null;
      }
   }
}
