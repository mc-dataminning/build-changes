import com.mojang.logging.LogUtils;
import java.net.SocketAddress;
import java.nio.file.Path;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public interface bnk {
   bnk f = (bnk)(Runtime.class.getModule().getLayer().findModule("jdk.jfr").isPresent() ? bnj.a() : new bnk.a());

   boolean a(bni var1);

   Path b();

   boolean c();

   boolean d();

   void a(float var1);

   void a(vt var1, zh<?> var2, SocketAddress var3, int var4);

   void b(vt var1, zh<?> var2, SocketAddress var3, int var4);

   void a(dwp var1, dcb var2, dwo var3, int var4);

   void b(dwp var1, dcb var2, dwo var3, int var4);

   @Nullable
   bnn e();

   @Nullable
   bnn a(dcb var1, akp<dcu> var2, String var3);

   public static class a implements bnk {
      private static final Logger b = LogUtils.getLogger();
      static final bnn a = () -> {
      };

      @Override
      public boolean a(bni $$0) {
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
      public void a(vt $$0, zh<?> $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void b(vt $$0, zh<?> $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void a(dwp $$0, dcb $$1, dwo $$2, int $$3) {
      }

      @Override
      public void b(dwp $$0, dcb $$1, dwo $$2, int $$3) {
      }

      @Override
      public void a(float $$0) {
      }

      @Override
      public bnn e() {
         return a;
      }

      @Nullable
      @Override
      public bnn a(dcb $$0, akp<dcu> $$1, String $$2) {
         return null;
      }
   }
}
