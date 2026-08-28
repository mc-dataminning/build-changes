import com.mojang.logging.LogUtils;
import java.net.SocketAddress;
import java.nio.file.Path;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public interface bqw {
   bqw f = (bqw)(Runtime.class.getModule().getLayer().findModule("jdk.jfr").isPresent() ? bqv.a() : new bqw.a());

   boolean a(bqu var1);

   Path b();

   boolean c();

   boolean d();

   void a(float var1);

   void a(vs var1, zh<?> var2, SocketAddress var3, int var4);

   void b(vs var1, zh<?> var2, SocketAddress var3, int var4);

   void a(edx var1, dih var2, edw var3, int var4);

   void b(edx var1, dih var2, edw var3, int var4);

   @Nullable
   bqz e();

   @Nullable
   bqz a(dih var1, alf<dja> var2, String var3);

   @Nullable
   bqz a(dih var1, alf<dja> var2, je<erb> var3);

   public static class a implements bqw {
      private static final Logger b = LogUtils.getLogger();
      static final bqz a = $$0 -> {
      };

      @Override
      public boolean a(bqu $$0) {
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
      public void a(edx $$0, dih $$1, edw $$2, int $$3) {
      }

      @Override
      public void b(edx $$0, dih $$1, edw $$2, int $$3) {
      }

      @Override
      public void a(float $$0) {
      }

      @Override
      public bqz e() {
         return a;
      }

      @Nullable
      @Override
      public bqz a(dih $$0, alf<dja> $$1, String $$2) {
         return null;
      }

      @Override
      public bqz a(dih $$0, alf<dja> $$1, je<erb> $$2) {
         return a;
      }
   }
}
