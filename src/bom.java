import com.mojang.logging.LogUtils;
import java.net.SocketAddress;
import java.nio.file.Path;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public interface bom {
   bom f = (bom)(Runtime.class.getModule().getLayer().findModule("jdk.jfr").isPresent() ? bol.a() : new bom.a());

   boolean a(bok var1);

   Path b();

   boolean c();

   boolean d();

   void a(float var1);

   void a(vz var1, zn<?> var2, SocketAddress var3, int var4);

   void b(vz var1, zn<?> var2, SocketAddress var3, int var4);

   void a(dyh var1, ddp var2, dyg var3, int var4);

   void b(dyh var1, ddp var2, dyg var3, int var4);

   @Nullable
   bop e();

   @Nullable
   bop a(ddp var1, ald<dej> var2, String var3);

   public static class a implements bom {
      private static final Logger b = LogUtils.getLogger();
      static final bop a = () -> {
      };

      @Override
      public boolean a(bok $$0) {
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
      public void a(vz $$0, zn<?> $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void b(vz $$0, zn<?> $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void a(dyh $$0, ddp $$1, dyg $$2, int $$3) {
      }

      @Override
      public void b(dyh $$0, ddp $$1, dyg $$2, int $$3) {
      }

      @Override
      public void a(float $$0) {
      }

      @Override
      public bop e() {
         return a;
      }

      @Nullable
      @Override
      public bop a(ddp $$0, ald<dej> $$1, String $$2) {
         return null;
      }
   }
}
