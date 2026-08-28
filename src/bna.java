import com.mojang.logging.LogUtils;
import java.net.SocketAddress;
import java.nio.file.Path;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public interface bna {
   bna f = (bna)(Runtime.class.getModule().getLayer().findModule("jdk.jfr").isPresent() ? bmz.a() : new bna.a());

   boolean a(bmy var1);

   Path b();

   boolean c();

   boolean d();

   void a(float var1);

   void a(vq var1, zd<?> var2, SocketAddress var3, int var4);

   void b(vq var1, zd<?> var2, SocketAddress var3, int var4);

   void a(dvz var1, dbm var2, dvy var3, int var4);

   void b(dvz var1, dbm var2, dvy var3, int var4);

   @Nullable
   bnd e();

   @Nullable
   bnd a(dbm var1, akj<dcf> var2, String var3);

   public static class a implements bna {
      private static final Logger b = LogUtils.getLogger();
      static final bnd a = () -> {
      };

      @Override
      public boolean a(bmy $$0) {
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
      public void a(dvz $$0, dbm $$1, dvy $$2, int $$3) {
      }

      @Override
      public void b(dvz $$0, dbm $$1, dvy $$2, int $$3) {
      }

      @Override
      public void a(float $$0) {
      }

      @Override
      public bnd e() {
         return a;
      }

      @Nullable
      @Override
      public bnd a(dbm $$0, akj<dcf> $$1, String $$2) {
         return null;
      }
   }
}
