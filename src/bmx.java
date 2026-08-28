import com.mojang.logging.LogUtils;
import java.net.SocketAddress;
import java.nio.file.Path;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public interface bmx {
   bmx f = (bmx)(Runtime.class.getModule().getLayer().findModule("jdk.jfr").isPresent() ? bmw.a() : new bmx.a());

   boolean a(bmv var1);

   Path b();

   boolean c();

   boolean d();

   void a(float var1);

   void a(vq var1, zd<?> var2, SocketAddress var3, int var4);

   void b(vq var1, zd<?> var2, SocketAddress var3, int var4);

   void a(dvt var1, dbk var2, dvs var3, int var4);

   void b(dvt var1, dbk var2, dvs var3, int var4);

   @Nullable
   bna e();

   @Nullable
   bna a(dbk var1, akj<dcd> var2, String var3);

   public static class a implements bmx {
      private static final Logger b = LogUtils.getLogger();
      static final bna a = () -> {
      };

      @Override
      public boolean a(bmv $$0) {
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
      public void a(vq $$0, zd<?> $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void b(vq $$0, zd<?> $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void a(dvt $$0, dbk $$1, dvs $$2, int $$3) {
      }

      @Override
      public void b(dvt $$0, dbk $$1, dvs $$2, int $$3) {
      }

      @Override
      public void a(float $$0) {
      }

      @Override
      public bna e() {
         return a;
      }

      @Nullable
      @Override
      public bna a(dbk $$0, akj<dcd> $$1, String $$2) {
         return null;
      }
   }
}
