import com.mojang.logging.LogUtils;
import java.net.SocketAddress;
import java.nio.file.Path;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public interface bnq {
   bnq f = (bnq)(Runtime.class.getModule().getLayer().findModule("jdk.jfr").isPresent() ? bnp.a() : new bnq.a());

   boolean a(bno var1);

   Path b();

   boolean c();

   boolean d();

   void a(float var1);

   void a(wl var1, zy<?> var2, SocketAddress var3, int var4);

   void b(wl var1, zy<?> var2, SocketAddress var3, int var4);

   void a(dvq var1, dbh var2, dvp var3, int var4);

   void b(dvq var1, dbh var2, dvp var3, int var4);

   @Nullable
   bnt e();

   @Nullable
   bnt a(dbh var1, ale<dca> var2, String var3);

   public static class a implements bnq {
      private static final Logger b = LogUtils.getLogger();
      static final bnt a = () -> {
      };

      @Override
      public boolean a(bno $$0) {
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
      public void a(wl $$0, zy<?> $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void b(wl $$0, zy<?> $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void a(dvq $$0, dbh $$1, dvp $$2, int $$3) {
      }

      @Override
      public void b(dvq $$0, dbh $$1, dvp $$2, int $$3) {
      }

      @Override
      public void a(float $$0) {
      }

      @Override
      public bnt e() {
         return a;
      }

      @Nullable
      @Override
      public bnt a(dbh $$0, ale<dca> $$1, String $$2) {
         return null;
      }
   }
}
