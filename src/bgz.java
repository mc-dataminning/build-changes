import com.mojang.logging.LogUtils;
import java.net.SocketAddress;
import java.nio.file.Path;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public interface bgz {
   bgz e = (bgz)(Runtime.class.getModule().getLayer().findModule("jdk.jfr").isPresent() ? bgy.a() : new bgz.a());

   boolean a(bgx var1);

   Path b();

   boolean c();

   boolean d();

   void a(float var1);

   void a(ui var1, int var2, SocketAddress var3, int var4);

   void b(ui var1, int var2, SocketAddress var3, int var4);

   @Nullable
   bhc e();

   @Nullable
   bhc a(cte var1, ahg<ctx> var2, String var3);

   public static class a implements bgz {
      private static final Logger b = LogUtils.getLogger();
      static final bhc a = () -> {
      };

      @Override
      public boolean a(bgx $$0) {
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
      public void a(ui $$0, int $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void b(ui $$0, int $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void a(float $$0) {
      }

      @Override
      public bhc e() {
         return a;
      }

      @Nullable
      @Override
      public bhc a(cte $$0, ahg<ctx> $$1, String $$2) {
         return null;
      }
   }
}
