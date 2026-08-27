import com.mojang.logging.LogUtils;
import java.net.SocketAddress;
import java.nio.file.Path;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public interface bmu {
   bmu f = (bmu)(Runtime.class.getModule().getLayer().findModule("jdk.jfr").isPresent() ? bmt.a() : new bmu.a());

   boolean a(bms var1);

   Path b();

   boolean c();

   boolean d();

   void a(float var1);

   void a(wd var1, zn<?> var2, SocketAddress var3, int var4);

   void b(wd var1, zn<?> var2, SocketAddress var3, int var4);

   void a(dwo var1, dbh var2, dwn var3, int var4);

   void b(dwo var1, dbh var2, dwn var3, int var4);

   @Nullable
   bmx e();

   @Nullable
   bmx a(dbh var1, aks<dca> var2, String var3);

   public static class a implements bmu {
      private static final Logger b = LogUtils.getLogger();
      static final bmx a = () -> {
      };

      @Override
      public boolean a(bms $$0) {
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
      public void a(wd $$0, zn<?> $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void b(wd $$0, zn<?> $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void a(dwo $$0, dbh $$1, dwn $$2, int $$3) {
      }

      @Override
      public void b(dwo $$0, dbh $$1, dwn $$2, int $$3) {
      }

      @Override
      public void a(float $$0) {
      }

      @Override
      public bmx e() {
         return a;
      }

      @Nullable
      @Override
      public bmx a(dbh $$0, aks<dca> $$1, String $$2) {
         return null;
      }
   }
}
