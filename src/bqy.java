import com.mojang.logging.LogUtils;
import java.net.SocketAddress;
import java.nio.file.Path;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public interface bqy {
   bqy f = (bqy)(Runtime.class.getModule().getLayer().findModule("jdk.jfr").isPresent() ? bqx.a() : new bqy.a());

   boolean a(bqw var1);

   Path b();

   boolean c();

   boolean d();

   void a(float var1);

   void a(vs var1, zh<?> var2, SocketAddress var3, int var4);

   void b(vs var1, zh<?> var2, SocketAddress var3, int var4);

   void a(eej var1, dir var2, eei var3, int var4);

   void b(eej var1, dir var2, eei var3, int var4);

   @Nullable
   brb e();

   @Nullable
   brb a(dir var1, alf<djm> var2, String var3);

   @Nullable
   brb a(dir var1, alf<djm> var2, jf<ern> var3);

   public static class a implements bqy {
      private static final Logger b = LogUtils.getLogger();
      static final brb a = $$0 -> {
      };

      @Override
      public boolean a(bqw $$0) {
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
      public void a(eej $$0, dir $$1, eei $$2, int $$3) {
      }

      @Override
      public void b(eej $$0, dir $$1, eei $$2, int $$3) {
      }

      @Override
      public void a(float $$0) {
      }

      @Override
      public brb e() {
         return a;
      }

      @Nullable
      @Override
      public brb a(dir $$0, alf<djm> $$1, String $$2) {
         return null;
      }

      @Override
      public brb a(dir $$0, alf<djm> $$1, jf<ern> $$2) {
         return a;
      }
   }
}
