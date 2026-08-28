import com.mojang.logging.LogUtils;
import java.net.SocketAddress;
import java.nio.file.Path;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public interface bqu {
   bqu f = (bqu)(Runtime.class.getModule().getLayer().findModule("jdk.jfr").isPresent() ? bqt.a() : new bqu.a());

   boolean a(bqs var1);

   Path b();

   boolean c();

   boolean d();

   void a(float var1);

   void a(vs var1, zh<?> var2, SocketAddress var3, int var4);

   void b(vs var1, zh<?> var2, SocketAddress var3, int var4);

   void a(edp var1, dic var2, edo var3, int var4);

   void b(edp var1, dic var2, edo var3, int var4);

   @Nullable
   bqx e();

   @Nullable
   bqx a(dic var1, alf<div> var2, String var3);

   @Nullable
   bqx a(dic var1, alf<div> var2, je<eqt> var3);

   public static class a implements bqu {
      private static final Logger b = LogUtils.getLogger();
      static final bqx a = $$0 -> {
      };

      @Override
      public boolean a(bqs $$0) {
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
      public void a(edp $$0, dic $$1, edo $$2, int $$3) {
      }

      @Override
      public void b(edp $$0, dic $$1, edo $$2, int $$3) {
      }

      @Override
      public void a(float $$0) {
      }

      @Override
      public bqx e() {
         return a;
      }

      @Nullable
      @Override
      public bqx a(dic $$0, alf<div> $$1, String $$2) {
         return null;
      }

      @Override
      public bqx a(dic $$0, alf<div> $$1, je<eqt> $$2) {
         return a;
      }
   }
}
