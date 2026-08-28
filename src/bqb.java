import com.mojang.logging.LogUtils;
import java.net.SocketAddress;
import java.nio.file.Path;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public interface bqb {
   bqb f = (bqb)(Runtime.class.getModule().getLayer().findModule("jdk.jfr").isPresent() ? bqa.a() : new bqb.a());

   boolean a(bpz var1);

   Path b();

   boolean c();

   boolean d();

   void a(float var1);

   void a(wq var1, aae<?> var2, SocketAddress var3, int var4);

   void b(wq var1, aae<?> var2, SocketAddress var3, int var4);

   void a(ebj var1, dgo var2, ebi var3, int var4);

   void b(ebj var1, dgo var2, ebi var3, int var4);

   @Nullable
   bqe e();

   @Nullable
   bqe a(dgo var1, aly<dhi> var2, String var3);

   public static class a implements bqb {
      private static final Logger b = LogUtils.getLogger();
      static final bqe a = () -> {
      };

      @Override
      public boolean a(bpz $$0) {
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
      public void a(ebj $$0, dgo $$1, ebi $$2, int $$3) {
      }

      @Override
      public void b(ebj $$0, dgo $$1, ebi $$2, int $$3) {
      }

      @Override
      public void a(float $$0) {
      }

      @Override
      public bqe e() {
         return a;
      }

      @Nullable
      @Override
      public bqe a(dgo $$0, aly<dhi> $$1, String $$2) {
         return null;
      }
   }
}
