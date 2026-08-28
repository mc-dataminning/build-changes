import com.mojang.logging.LogUtils;
import java.net.SocketAddress;
import java.nio.file.Path;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public interface bnn {
   bnn f = (bnn)(Runtime.class.getModule().getLayer().findModule("jdk.jfr").isPresent() ? bnm.a() : new bnn.a());

   boolean a(bnl var1);

   Path b();

   boolean c();

   boolean d();

   void a(float var1);

   void a(wk var1, zx<?> var2, SocketAddress var3, int var4);

   void b(wk var1, zx<?> var2, SocketAddress var3, int var4);

   void a(dvn var1, dbe var2, dvm var3, int var4);

   void b(dvn var1, dbe var2, dvm var3, int var4);

   @Nullable
   bnq e();

   @Nullable
   bnq a(dbe var1, ald<dbx> var2, String var3);

   public static class a implements bnn {
      private static final Logger b = LogUtils.getLogger();
      static final bnq a = () -> {
      };

      @Override
      public boolean a(bnl $$0) {
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
      public void a(wk $$0, zx<?> $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void b(wk $$0, zx<?> $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void a(dvn $$0, dbe $$1, dvm $$2, int $$3) {
      }

      @Override
      public void b(dvn $$0, dbe $$1, dvm $$2, int $$3) {
      }

      @Override
      public void a(float $$0) {
      }

      @Override
      public bnq e() {
         return a;
      }

      @Nullable
      @Override
      public bnq a(dbe $$0, ald<dbx> $$1, String $$2) {
         return null;
      }
   }
}
