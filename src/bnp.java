import com.mojang.logging.LogUtils;
import java.net.SocketAddress;
import java.nio.file.Path;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public interface bnp {
   bnp f = (bnp)(Runtime.class.getModule().getLayer().findModule("jdk.jfr").isPresent() ? bno.a() : new bnp.a());

   boolean a(bnn var1);

   Path b();

   boolean c();

   boolean d();

   void a(float var1);

   void a(wl var1, zy<?> var2, SocketAddress var3, int var4);

   void b(wl var1, zy<?> var2, SocketAddress var3, int var4);

   void a(dvp var1, dbg var2, dvo var3, int var4);

   void b(dvp var1, dbg var2, dvo var3, int var4);

   @Nullable
   bns e();

   @Nullable
   bns a(dbg var1, ale<dbz> var2, String var3);

   public static class a implements bnp {
      private static final Logger b = LogUtils.getLogger();
      static final bns a = () -> {
      };

      @Override
      public boolean a(bnn $$0) {
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
      public void a(dvp $$0, dbg $$1, dvo $$2, int $$3) {
      }

      @Override
      public void b(dvp $$0, dbg $$1, dvo $$2, int $$3) {
      }

      @Override
      public void a(float $$0) {
      }

      @Override
      public bns e() {
         return a;
      }

      @Nullable
      @Override
      public bns a(dbg $$0, ale<dbz> $$1, String $$2) {
         return null;
      }
   }
}
