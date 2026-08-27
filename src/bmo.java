import com.mojang.logging.LogUtils;
import java.net.SocketAddress;
import java.nio.file.Path;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public interface bmo {
   bmo f = (bmo)(Runtime.class.getModule().getLayer().findModule("jdk.jfr").isPresent() ? bmn.a() : new bmo.a());

   boolean a(bmm var1);

   Path b();

   boolean c();

   boolean d();

   void a(float var1);

   void a(vw var1, zg<?> var2, SocketAddress var3, int var4);

   void b(vw var1, zg<?> var2, SocketAddress var3, int var4);

   void a(dun var1, dae var2, dum var3, int var4);

   void b(dun var1, dae var2, dum var3, int var4);

   @Nullable
   bmr e();

   @Nullable
   bmr a(dae var1, akl<dax> var2, String var3);

   public static class a implements bmo {
      private static final Logger b = LogUtils.getLogger();
      static final bmr a = () -> {
      };

      @Override
      public boolean a(bmm $$0) {
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
      public void a(vw $$0, zg<?> $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void b(vw $$0, zg<?> $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void a(dun $$0, dae $$1, dum $$2, int $$3) {
      }

      @Override
      public void b(dun $$0, dae $$1, dum $$2, int $$3) {
      }

      @Override
      public void a(float $$0) {
      }

      @Override
      public bmr e() {
         return a;
      }

      @Nullable
      @Override
      public bmr a(dae $$0, akl<dax> $$1, String $$2) {
         return null;
      }
   }
}
