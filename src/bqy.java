import com.mojang.logging.LogUtils;
import java.net.SocketAddress;
import java.nio.file.Path;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public interface bqy {
   bqy f = (bqy)(Runtime.class.getModule().getLayer().findModule("jdk.jfr").isPresent() ? bqx.a() : new bqy.a());

   boolean a(bqw var1);

   Path b();

   boolean c();

   boolean d();

   void a(float var1);

   void a(vs var1, zh<?> var2, SocketAddress var3, int var4);

   void b(vs var1, zh<?> var2, SocketAddress var3, int var4);

   void a(eee var1, dio var2, eed var3, int var4);

   void b(eee var1, dio var2, eed var3, int var4);

   @Nullable
   brb e();

   @Nullable
   brb a(dio var1, alf<djh> var2, String var3);

   @Nullable
   brb a(dio var1, alf<djh> var2, jf<eri> var3);

   public static class a implements bqy {
      private static final Logger b = LogUtils.getLogger();
      static final brb a = $$0 -> {
      };

      @Override
      public boolean a(bqw $$0) {
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
      public void a(vs $$0, zh<?> $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void b(vs $$0, zh<?> $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void a(eee $$0, dio $$1, eed $$2, int $$3) {
      }

      @Override
      public void b(eee $$0, dio $$1, eed $$2, int $$3) {
      }

      @Override
      public void a(float $$0) {
      }

      @Override
      public brb e() {
         return a;
      }

      @Nullable
      @Override
      public brb a(dio $$0, alf<djh> $$1, String $$2) {
         return null;
      }

      @Override
      public brb a(dio $$0, alf<djh> $$1, jf<eri> $$2) {
         return a;
      }
   }
}
