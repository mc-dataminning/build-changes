import com.mojang.logging.LogUtils;
import java.net.SocketAddress;
import java.nio.file.Path;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public interface boz {
   boz f = (boz)(Runtime.class.getModule().getLayer().findModule("jdk.jfr").isPresent() ? boy.a() : new boz.a());

   boolean a(box var1);

   Path b();

   boolean c();

   boolean d();

   void a(float var1);

   void a(vj var1, yx<?> var2, SocketAddress var3, int var4);

   void b(vj var1, yx<?> var2, SocketAddress var3, int var4);

   void a(eaj var1, dfm var2, eai var3, int var4);

   void b(eaj var1, dfm var2, eai var3, int var4);

   @Nullable
   bpc e();

   @Nullable
   bpc a(dfm var1, akt<dgg> var2, String var3);

   @Nullable
   bpc a(dfm var1, akt<dgg> var2, jr<enk> var3);

   public static class a implements boz {
      private static final Logger b = LogUtils.getLogger();
      static final bpc a = $$0 -> {
      };

      @Override
      public boolean a(box $$0) {
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
      public void a(vj $$0, yx<?> $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void b(vj $$0, yx<?> $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void a(eaj $$0, dfm $$1, eai $$2, int $$3) {
      }

      @Override
      public void b(eaj $$0, dfm $$1, eai $$2, int $$3) {
      }

      @Override
      public void a(float $$0) {
      }

      @Override
      public bpc e() {
         return a;
      }

      @Nullable
      @Override
      public bpc a(dfm $$0, akt<dgg> $$1, String $$2) {
         return null;
      }

      @Override
      public bpc a(dfm $$0, akt<dgg> $$1, jr<enk> $$2) {
         return a;
      }
   }
}
