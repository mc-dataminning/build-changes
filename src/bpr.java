import com.mojang.logging.LogUtils;
import java.net.SocketAddress;
import java.nio.file.Path;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public interface bpr {
   bpr f = (bpr)(Runtime.class.getModule().getLayer().findModule("jdk.jfr").isPresent() ? bpq.a() : new bpr.a());

   boolean a(bpp var1);

   Path b();

   boolean c();

   boolean d();

   void a(float var1);

   void a(vj var1, yy<?> var2, SocketAddress var3, int var4);

   void b(vj var1, yy<?> var2, SocketAddress var3, int var4);

   void a(ebf var1, dgg var2, ebe var3, int var4);

   void b(ebf var1, dgg var2, ebe var3, int var4);

   @Nullable
   bpu e();

   @Nullable
   bpu a(dgg var1, akt<dgz> var2, String var3);

   @Nullable
   bpu a(dgg var1, akt<dgz> var2, jr<eoj> var3);

   public static class a implements bpr {
      private static final Logger b = LogUtils.getLogger();
      static final bpu a = $$0 -> {
      };

      @Override
      public boolean a(bpp $$0) {
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
      public void a(vj $$0, yy<?> $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void b(vj $$0, yy<?> $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void a(ebf $$0, dgg $$1, ebe $$2, int $$3) {
      }

      @Override
      public void b(ebf $$0, dgg $$1, ebe $$2, int $$3) {
      }

      @Override
      public void a(float $$0) {
      }

      @Override
      public bpu e() {
         return a;
      }

      @Nullable
      @Override
      public bpu a(dgg $$0, akt<dgz> $$1, String $$2) {
         return null;
      }

      @Override
      public bpu a(dgg $$0, akt<dgz> $$1, jr<eoj> $$2) {
         return a;
      }
   }
}
