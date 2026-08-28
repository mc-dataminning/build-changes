import com.mojang.logging.LogUtils;
import java.net.SocketAddress;
import java.nio.file.Path;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public interface bnj {
   bnj f = (bnj)(Runtime.class.getModule().getLayer().findModule("jdk.jfr").isPresent() ? bni.a() : new bnj.a());

   boolean a(bnh var1);

   Path b();

   boolean c();

   boolean d();

   void a(float var1);

   void a(wk var1, zu<?> var2, SocketAddress var3, int var4);

   void b(wk var1, zu<?> var2, SocketAddress var3, int var4);

   void a(dvj var1, dba var2, dvi var3, int var4);

   void b(dvj var1, dba var2, dvi var3, int var4);

   @Nullable
   bnm e();

   @Nullable
   bnm a(dba var1, ala<dbt> var2, String var3);

   public static class a implements bnj {
      private static final Logger b = LogUtils.getLogger();
      static final bnm a = () -> {
      };

      @Override
      public boolean a(bnh $$0) {
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
      public void a(wk $$0, zu<?> $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void b(wk $$0, zu<?> $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void a(dvj $$0, dba $$1, dvi $$2, int $$3) {
      }

      @Override
      public void b(dvj $$0, dba $$1, dvi $$2, int $$3) {
      }

      @Override
      public void a(float $$0) {
      }

      @Override
      public bnm e() {
         return a;
      }

      @Nullable
      @Override
      public bnm a(dba $$0, ala<dbt> $$1, String $$2) {
         return null;
      }
   }
}
