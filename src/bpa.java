import com.mojang.logging.LogUtils;
import java.net.SocketAddress;
import java.nio.file.Path;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public interface bpa {
   bpa f = (bpa)(Runtime.class.getModule().getLayer().findModule("jdk.jfr").isPresent() ? boz.a() : new bpa.a());

   boolean a(boy var1);

   Path b();

   boolean c();

   boolean d();

   void a(float var1);

   void a(vj var1, yx<?> var2, SocketAddress var3, int var4);

   void b(vj var1, yx<?> var2, SocketAddress var3, int var4);

   void a(eal var1, dfo var2, eak var3, int var4);

   void b(eal var1, dfo var2, eak var3, int var4);

   @Nullable
   bpd e();

   @Nullable
   bpd a(dfo var1, akt<dgi> var2, String var3);

   @Nullable
   bpd a(dfo var1, akt<dgi> var2, jr<enm> var3);

   public static class a implements bpa {
      private static final Logger b = LogUtils.getLogger();
      static final bpd a = $$0 -> {
      };

      @Override
      public boolean a(boy $$0) {
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
      public void a(vj $$0, yx<?> $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void b(vj $$0, yx<?> $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void a(eal $$0, dfo $$1, eak $$2, int $$3) {
      }

      @Override
      public void b(eal $$0, dfo $$1, eak $$2, int $$3) {
      }

      @Override
      public void a(float $$0) {
      }

      @Override
      public bpd e() {
         return a;
      }

      @Nullable
      @Override
      public bpd a(dfo $$0, akt<dgi> $$1, String $$2) {
         return null;
      }

      @Override
      public bpd a(dfo $$0, akt<dgi> $$1, jr<enm> $$2) {
         return a;
      }
   }
}
