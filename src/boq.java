import com.mojang.logging.LogUtils;
import java.net.SocketAddress;
import java.nio.file.Path;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public interface boq {
   boq f = (boq)(Runtime.class.getModule().getLayer().findModule("jdk.jfr").isPresent() ? bop.a() : new boq.a());

   boolean a(boo var1);

   Path b();

   boolean c();

   boolean d();

   void a(float var1);

   void a(wc var1, zq<?> var2, SocketAddress var3, int var4);

   void b(wc var1, zq<?> var2, SocketAddress var3, int var4);

   void a(dys var1, deb var2, dyr var3, int var4);

   void b(dys var1, deb var2, dyr var3, int var4);

   @Nullable
   bot e();

   @Nullable
   bot a(deb var1, alg<dev> var2, String var3);

   public static class a implements boq {
      private static final Logger b = LogUtils.getLogger();
      static final bot a = () -> {
      };

      @Override
      public boolean a(boo $$0) {
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
      public void a(wc $$0, zq<?> $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void b(wc $$0, zq<?> $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void a(dys $$0, deb $$1, dyr $$2, int $$3) {
      }

      @Override
      public void b(dys $$0, deb $$1, dyr $$2, int $$3) {
      }

      @Override
      public void a(float $$0) {
      }

      @Override
      public bot e() {
         return a;
      }

      @Nullable
      @Override
      public bot a(deb $$0, alg<dev> $$1, String $$2) {
         return null;
      }
   }
}
