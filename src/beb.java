import com.mojang.logging.LogUtils;
import java.net.SocketAddress;
import java.nio.file.Path;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public interface beb {
   beb e = (beb)(Runtime.class.getModule().getLayer().findModule("jdk.jfr").isPresent() ? bea.a() : new beb.a());

   boolean a(bdz var1);

   Path b();

   boolean c();

   boolean d();

   void a(float var1);

   void a(sn var1, int var2, SocketAddress var3, int var4);

   void b(sn var1, int var2, SocketAddress var3, int var4);

   @Nullable
   bee e();

   @Nullable
   bee a(cpi var1, aey<cqb> var2, String var3);

   public static class a implements beb {
      private static final Logger b = LogUtils.getLogger();
      static final bee a = () -> {
      };

      @Override
      public boolean a(bdz $$0) {
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
      public void a(sn $$0, int $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void b(sn $$0, int $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void a(float $$0) {
      }

      @Override
      public bee e() {
         return a;
      }

      @Nullable
      @Override
      public bee a(cpi $$0, aey<cqb> $$1, String $$2) {
         return null;
      }
   }
}
