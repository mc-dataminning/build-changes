import com.mojang.logging.LogUtils;
import java.net.SocketAddress;
import java.nio.file.Path;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public interface bdq {
   bdq e = (bdq)(Runtime.class.getModule().getLayer().findModule("jdk.jfr").isPresent() ? bdp.a() : new bdq.a());

   boolean a(bdo var1);

   Path b();

   boolean c();

   boolean d();

   void a(float var1);

   void a(sk var1, int var2, SocketAddress var3, int var4);

   void b(sk var1, int var2, SocketAddress var3, int var4);

   @Nullable
   bdt e();

   @Nullable
   bdt a(cox var1, aet<cpq> var2, String var3);

   public static class a implements bdq {
      private static final Logger b = LogUtils.getLogger();
      static final bdt a = () -> {
      };

      @Override
      public boolean a(bdo $$0) {
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
      public void a(sk $$0, int $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void b(sk $$0, int $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void a(float $$0) {
      }

      @Override
      public bdt e() {
         return a;
      }

      @Nullable
      @Override
      public bdt a(cox $$0, aet<cpq> $$1, String $$2) {
         return null;
      }
   }
}
