import com.mojang.logging.LogUtils;
import java.net.SocketAddress;
import java.nio.file.Path;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public interface bqa {
   bqa f = (bqa)(Runtime.class.getModule().getLayer().findModule("jdk.jfr").isPresent() ? bpz.a() : new bqa.a());

   boolean a(bpy var1);

   Path b();

   boolean c();

   boolean d();

   void a(float var1);

   void a(wq var1, aae<?> var2, SocketAddress var3, int var4);

   void b(wq var1, aae<?> var2, SocketAddress var3, int var4);

   void a(ebi var1, dgn var2, ebh var3, int var4);

   void b(ebi var1, dgn var2, ebh var3, int var4);

   @Nullable
   bqd e();

   @Nullable
   bqd a(dgn var1, aly<dhh> var2, String var3);

   public static class a implements bqa {
      private static final Logger b = LogUtils.getLogger();
      static final bqd a = () -> {
      };

      @Override
      public boolean a(bpy $$0) {
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
      public void a(ebi $$0, dgn $$1, ebh $$2, int $$3) {
      }

      @Override
      public void b(ebi $$0, dgn $$1, ebh $$2, int $$3) {
      }

      @Override
      public void a(float $$0) {
      }

      @Override
      public bqd e() {
         return a;
      }

      @Nullable
      @Override
      public bqd a(dgn $$0, aly<dhh> $$1, String $$2) {
         return null;
      }
   }
}
