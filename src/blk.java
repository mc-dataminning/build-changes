import com.mojang.logging.LogUtils;
import java.net.SocketAddress;
import java.nio.file.Path;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public interface blk {
   blk f = (blk)(Runtime.class.getModule().getLayer().findModule("jdk.jfr").isPresent() ? blj.a() : new blk.a());

   boolean a(bli var1);

   Path b();

   boolean c();

   boolean d();

   void a(float var1);

   void a(vr var1, zb<?> var2, SocketAddress var3, int var4);

   void b(vr var1, zb<?> var2, SocketAddress var3, int var4);

   void a(dtk var1, czb var2, dtj var3, int var4);

   void b(dtk var1, czb var2, dtj var3, int var4);

   @Nullable
   bln e();

   @Nullable
   bln a(czb var1, ake<czu> var2, String var3);

   public static class a implements blk {
      private static final Logger b = LogUtils.getLogger();
      static final bln a = () -> {
      };

      @Override
      public boolean a(bli $$0) {
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
      public void a(vr $$0, zb<?> $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void b(vr $$0, zb<?> $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void a(dtk $$0, czb $$1, dtj $$2, int $$3) {
      }

      @Override
      public void b(dtk $$0, czb $$1, dtj $$2, int $$3) {
      }

      @Override
      public void a(float $$0) {
      }

      @Override
      public bln e() {
         return a;
      }

      @Nullable
      @Override
      public bln a(czb $$0, ake<czu> $$1, String $$2) {
         return null;
      }
   }
}
