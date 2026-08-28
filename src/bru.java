import com.mojang.logging.LogUtils;
import java.net.SocketAddress;
import java.nio.file.Path;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public interface bru {
   bru f = (bru)(Runtime.class.getModule().getLayer().findModule("jdk.jfr").isPresent() ? brt.a() : new bru.a());

   boolean a(brs var1);

   Path b();

   boolean c();

   boolean d();

   void a(float var1);

   void a(vw var1, zq<?> var2, SocketAddress var3, int var4);

   void b(vw var1, zq<?> var2, SocketAddress var3, int var4);

   void a(efg var1, djo var2, eff var3, int var4);

   void b(efg var1, djo var2, eff var3, int var4);

   @Nullable
   brx e();

   @Nullable
   brx a(djo var1, alq<dkj> var2, String var3);

   @Nullable
   brx a(djo var1, alq<dkj> var2, jg<esn> var3);

   public static class a implements bru {
      private static final Logger b = LogUtils.getLogger();
      static final brx a = $$0 -> {
      };

      @Override
      public boolean a(brs $$0) {
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
      public void a(vw $$0, zq<?> $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void b(vw $$0, zq<?> $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void a(efg $$0, djo $$1, eff $$2, int $$3) {
      }

      @Override
      public void b(efg $$0, djo $$1, eff $$2, int $$3) {
      }

      @Override
      public void a(float $$0) {
      }

      @Override
      public brx e() {
         return a;
      }

      @Nullable
      @Override
      public brx a(djo $$0, alq<dkj> $$1, String $$2) {
         return null;
      }

      @Override
      public brx a(djo $$0, alq<dkj> $$1, jg<esn> $$2) {
         return a;
      }
   }
}
