import com.mojang.logging.LogUtils;
import java.net.SocketAddress;
import java.nio.file.Path;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public interface bpw {
   bpw f = (bpw)(Runtime.class.getModule().getLayer().findModule("jdk.jfr").isPresent() ? bpv.a() : new bpw.a());

   boolean a(bpu var1);

   Path b();

   boolean c();

   boolean d();

   void a(float var1);

   void a(wq var1, aae<?> var2, SocketAddress var3, int var4);

   void b(wq var1, aae<?> var2, SocketAddress var3, int var4);

   void a(ebb var1, dgg var2, eba var3, int var4);

   void b(ebb var1, dgg var2, eba var3, int var4);

   @Nullable
   bpz e();

   @Nullable
   bpz a(dgg var1, aly<dha> var2, String var3);

   public static class a implements bpw {
      private static final Logger b = LogUtils.getLogger();
      static final bpz a = () -> {
      };

      @Override
      public boolean a(bpu $$0) {
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
      public void a(wq $$0, aae<?> $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void b(wq $$0, aae<?> $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void a(ebb $$0, dgg $$1, eba $$2, int $$3) {
      }

      @Override
      public void b(ebb $$0, dgg $$1, eba $$2, int $$3) {
      }

      @Override
      public void a(float $$0) {
      }

      @Override
      public bpz e() {
         return a;
      }

      @Nullable
      @Override
      public bpz a(dgg $$0, aly<dha> $$1, String $$2) {
         return null;
      }
   }
}
