import com.mojang.logging.LogUtils;
import java.net.SocketAddress;
import java.nio.file.Path;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public interface bku {
   bku f = (bku)(Runtime.class.getModule().getLayer().findModule("jdk.jfr").isPresent() ? bkt.a() : new bku.a());

   boolean a(bks var1);

   Path b();

   boolean c();

   boolean d();

   void a(float var1);

   void a(vf var1, yp<?> var2, SocketAddress var3, int var4);

   void b(vf var1, yp<?> var2, SocketAddress var3, int var4);

   void a(dsl var1, cye var2, dsk var3, int var4);

   void b(dsl var1, cye var2, dsk var3, int var4);

   @Nullable
   bkx e();

   @Nullable
   bkx a(cye var1, ajs<cyx> var2, String var3);

   public static class a implements bku {
      private static final Logger b = LogUtils.getLogger();
      static final bkx a = () -> {
      };

      @Override
      public boolean a(bks $$0) {
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
      public void a(vf $$0, yp<?> $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void b(vf $$0, yp<?> $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void a(dsl $$0, cye $$1, dsk $$2, int $$3) {
      }

      @Override
      public void b(dsl $$0, cye $$1, dsk $$2, int $$3) {
      }

      @Override
      public void a(float $$0) {
      }

      @Override
      public bkx e() {
         return a;
      }

      @Nullable
      @Override
      public bkx a(cye $$0, ajs<cyx> $$1, String $$2) {
         return null;
      }
   }
}
