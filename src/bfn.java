import com.mojang.logging.LogUtils;
import java.net.SocketAddress;
import java.nio.file.Path;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public interface bfn {
   bfn e = (bfn)(Runtime.class.getModule().getLayer().findModule("jdk.jfr").isPresent() ? bfm.a() : new bfn.a());

   boolean a(bfl var1);

   Path b();

   boolean c();

   boolean d();

   void a(float var1);

   void a(tt var1, int var2, SocketAddress var3, int var4);

   void b(tt var1, int var2, SocketAddress var3, int var4);

   @Nullable
   bfq e();

   @Nullable
   bfq a(cqz var1, agf<crs> var2, String var3);

   public static class a implements bfn {
      private static final Logger b = LogUtils.getLogger();
      static final bfq a = () -> {
      };

      @Override
      public boolean a(bfl $$0) {
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
      public void a(tt $$0, int $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void b(tt $$0, int $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void a(float $$0) {
      }

      @Override
      public bfq e() {
         return a;
      }

      @Nullable
      @Override
      public bfq a(cqz $$0, agf<crs> $$1, String $$2) {
         return null;
      }
   }
}
