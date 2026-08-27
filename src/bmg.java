import com.mojang.logging.LogUtils;
import java.net.SocketAddress;
import java.nio.file.Path;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public interface bmg {
   bmg f = (bmg)(Runtime.class.getModule().getLayer().findModule("jdk.jfr").isPresent() ? bmf.a() : new bmg.a());

   boolean a(bme var1);

   Path b();

   boolean c();

   boolean d();

   void a(float var1);

   void a(vt var1, zd<?> var2, SocketAddress var3, int var4);

   void b(vt var1, zd<?> var2, SocketAddress var3, int var4);

   void a(dtt var1, czk var2, dts var3, int var4);

   void b(dtt var1, czk var2, dts var3, int var4);

   @Nullable
   bmj e();

   @Nullable
   bmj a(czk var1, akg<dad> var2, String var3);

   public static class a implements bmg {
      private static final Logger b = LogUtils.getLogger();
      static final bmj a = () -> {
      };

      @Override
      public boolean a(bme $$0) {
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
      public void a(vt $$0, zd<?> $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void b(vt $$0, zd<?> $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void a(dtt $$0, czk $$1, dts $$2, int $$3) {
      }

      @Override
      public void b(dtt $$0, czk $$1, dts $$2, int $$3) {
      }

      @Override
      public void a(float $$0) {
      }

      @Override
      public bmj e() {
         return a;
      }

      @Nullable
      @Override
      public bmj a(czk $$0, akg<dad> $$1, String $$2) {
         return null;
      }
   }
}
