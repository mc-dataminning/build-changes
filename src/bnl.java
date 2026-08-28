import com.mojang.logging.LogUtils;
import java.net.SocketAddress;
import java.nio.file.Path;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public interface bnl {
   bnl f = (bnl)(Runtime.class.getModule().getLayer().findModule("jdk.jfr").isPresent() ? bnk.a() : new bnl.a());

   boolean a(bnj var1);

   Path b();

   boolean c();

   boolean d();

   void a(float var1);

   void a(vu var1, zi<?> var2, SocketAddress var3, int var4);

   void b(vu var1, zi<?> var2, SocketAddress var3, int var4);

   void a(dws var1, dcd var2, dwr var3, int var4);

   void b(dws var1, dcd var2, dwr var3, int var4);

   @Nullable
   bno e();

   @Nullable
   bno a(dcd var1, akq<dcw> var2, String var3);

   public static class a implements bnl {
      private static final Logger b = LogUtils.getLogger();
      static final bno a = () -> {
      };

      @Override
      public boolean a(bnj $$0) {
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
      public void a(vu $$0, zi<?> $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void b(vu $$0, zi<?> $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void a(dws $$0, dcd $$1, dwr $$2, int $$3) {
      }

      @Override
      public void b(dws $$0, dcd $$1, dwr $$2, int $$3) {
      }

      @Override
      public void a(float $$0) {
      }

      @Override
      public bno e() {
         return a;
      }

      @Nullable
      @Override
      public bno a(dcd $$0, akq<dcw> $$1, String $$2) {
         return null;
      }
   }
}
