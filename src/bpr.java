import com.mojang.logging.LogUtils;
import java.net.SocketAddress;
import java.nio.file.Path;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public interface bpr {
   bpr f = (bpr)(Runtime.class.getModule().getLayer().findModule("jdk.jfr").isPresent() ? bpq.a() : new bpr.a());

   boolean a(bpp var1);

   Path b();

   boolean c();

   boolean d();

   void a(float var1);

   void a(wf var1, zt<?> var2, SocketAddress var3, int var4);

   void b(wf var1, zt<?> var2, SocketAddress var3, int var4);

   void a(ebc var1, dgf var2, ebb var3, int var4);

   void b(ebc var1, dgf var2, ebb var3, int var4);

   @Nullable
   bpu e();

   @Nullable
   bpu a(dgf var1, alo<dgz> var2, String var3);

   @Nullable
   bpu a(dgf var1, alo<dgz> var2, jq<eod> var3);

   public static class a implements bpr {
      private static final Logger b = LogUtils.getLogger();
      static final bpu a = $$0 -> {
      };

      @Override
      public boolean a(bpp $$0) {
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
      public void a(wf $$0, zt<?> $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void b(wf $$0, zt<?> $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void a(ebc $$0, dgf $$1, ebb $$2, int $$3) {
      }

      @Override
      public void b(ebc $$0, dgf $$1, ebb $$2, int $$3) {
      }

      @Override
      public void a(float $$0) {
      }

      @Override
      public bpu e() {
         return a;
      }

      @Nullable
      @Override
      public bpu a(dgf $$0, alo<dgz> $$1, String $$2) {
         return null;
      }

      @Override
      public bpu a(dgf $$0, alo<dgz> $$1, jq<eod> $$2) {
         return a;
      }
   }
}
