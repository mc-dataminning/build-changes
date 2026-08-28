import com.mojang.logging.LogUtils;
import java.net.SocketAddress;
import java.nio.file.Path;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public interface boj {
   boj f = (boj)(Runtime.class.getModule().getLayer().findModule("jdk.jfr").isPresent() ? boi.a() : new boj.a());

   boolean a(boh var1);

   Path b();

   boolean c();

   boolean d();

   void a(float var1);

   void a(vy var1, zm<?> var2, SocketAddress var3, int var4);

   void b(vy var1, zm<?> var2, SocketAddress var3, int var4);

   void a(dyd var1, ddm var2, dyc var3, int var4);

   void b(dyd var1, ddm var2, dyc var3, int var4);

   @Nullable
   bom e();

   @Nullable
   bom a(ddm var1, alb<deg> var2, String var3);

   public static class a implements boj {
      private static final Logger b = LogUtils.getLogger();
      static final bom a = () -> {
      };

      @Override
      public boolean a(boh $$0) {
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
      public void a(vy $$0, zm<?> $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void b(vy $$0, zm<?> $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void a(dyd $$0, ddm $$1, dyc $$2, int $$3) {
      }

      @Override
      public void b(dyd $$0, ddm $$1, dyc $$2, int $$3) {
      }

      @Override
      public void a(float $$0) {
      }

      @Override
      public bom e() {
         return a;
      }

      @Nullable
      @Override
      public bom a(ddm $$0, alb<deg> $$1, String $$2) {
         return null;
      }
   }
}
