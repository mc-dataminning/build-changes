import com.mojang.logging.LogUtils;
import java.net.SocketAddress;
import java.nio.file.Path;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public interface bit {
   bit e = (bit)(Runtime.class.getModule().getLayer().findModule("jdk.jfr").isPresent() ? bis.a() : new bit.a());

   boolean a(bir var1);

   Path b();

   boolean c();

   boolean d();

   void a(float var1);

   void a(up var1, xz<?> var2, SocketAddress var3, int var4);

   void b(up var1, xz<?> var2, SocketAddress var3, int var4);

   @Nullable
   biw e();

   @Nullable
   biw a(cuy var1, aix<cvr> var2, String var3);

   public static class a implements bit {
      private static final Logger b = LogUtils.getLogger();
      static final biw a = () -> {
      };

      @Override
      public boolean a(bir $$0) {
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
      public void a(up $$0, xz<?> $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void b(up $$0, xz<?> $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void a(float $$0) {
      }

      @Override
      public biw e() {
         return a;
      }

      @Nullable
      @Override
      public biw a(cuy $$0, aix<cvr> $$1, String $$2) {
         return null;
      }
   }
}
