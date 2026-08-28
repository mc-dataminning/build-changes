import com.mojang.logging.LogUtils;
import java.net.SocketAddress;
import java.nio.file.Path;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public interface bqj {
   bqj f = (bqj)(Runtime.class.getModule().getLayer().findModule("jdk.jfr").isPresent() ? bqi.a() : new bqj.a());

   boolean a(bqh var1);

   Path b();

   boolean c();

   boolean d();

   void a(float var1);

   void a(vp var1, ze<?> var2, SocketAddress var3, int var4);

   void b(vp var1, ze<?> var2, SocketAddress var3, int var4);

   void a(ecc var1, dgw var2, ecb var3, int var4);

   void b(ecc var1, dgw var2, ecb var3, int var4);

   @Nullable
   bqm e();

   @Nullable
   bqm a(dgw var1, alc<dhp> var2, String var3);

   @Nullable
   bqm a(dgw var1, alc<dhp> var2, js<epg> var3);

   public static class a implements bqj {
      private static final Logger b = LogUtils.getLogger();
      static final bqm a = $$0 -> {
      };

      @Override
      public boolean a(bqh $$0) {
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
      public void a(vp $$0, ze<?> $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void b(vp $$0, ze<?> $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void a(ecc $$0, dgw $$1, ecb $$2, int $$3) {
      }

      @Override
      public void b(ecc $$0, dgw $$1, ecb $$2, int $$3) {
      }

      @Override
      public void a(float $$0) {
      }

      @Override
      public bqm e() {
         return a;
      }

      @Nullable
      @Override
      public bqm a(dgw $$0, alc<dhp> $$1, String $$2) {
         return null;
      }

      @Override
      public bqm a(dgw $$0, alc<dhp> $$1, js<epg> $$2) {
         return a;
      }
   }
}
