import com.mojang.logging.LogUtils;
import java.net.SocketAddress;
import java.nio.file.Path;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public interface bgi {
   bgi e = (bgi)(Runtime.class.getModule().getLayer().findModule("jdk.jfr").isPresent() ? bgh.a() : new bgi.a());

   boolean a(bgg var1);

   Path b();

   boolean c();

   boolean d();

   void a(float var1);

   void a(ud var1, int var2, SocketAddress var3, int var4);

   void b(ud var1, int var2, SocketAddress var3, int var4);

   @Nullable
   bgl e();

   @Nullable
   bgl a(csf var1, ags<csy> var2, String var3);

   public static class a implements bgi {
      private static final Logger b = LogUtils.getLogger();
      static final bgl a = () -> {
      };

      @Override
      public boolean a(bgg $$0) {
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
      public void a(ud $$0, int $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void b(ud $$0, int $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void a(float $$0) {
      }

      @Override
      public bgl e() {
         return a;
      }

      @Nullable
      @Override
      public bgl a(csf $$0, ags<csy> $$1, String $$2) {
         return null;
      }
   }
}
