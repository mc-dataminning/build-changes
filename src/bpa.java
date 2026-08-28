import com.mojang.logging.LogUtils;
import java.net.SocketAddress;
import java.nio.file.Path;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public interface bpa {
   bpa f = (bpa)(Runtime.class.getModule().getLayer().findModule("jdk.jfr").isPresent() ? boz.a() : new bpa.a());

   boolean a(boy var1);

   Path b();

   boolean c();

   boolean d();

   void a(float var1);

   void a(vj var1, yy<?> var2, SocketAddress var3, int var4);

   void b(vj var1, yy<?> var2, SocketAddress var3, int var4);

   void a(eak var1, dfn var2, eaj var3, int var4);

   void b(eak var1, dfn var2, eaj var3, int var4);

   @Nullable
   bpd e();

   @Nullable
   bpd a(dfn var1, aku<dgh> var2, String var3);

   @Nullable
   bpd a(dfn var1, aku<dgh> var2, jr<enl> var3);

   public static class a implements bpa {
      private static final Logger b = LogUtils.getLogger();
      static final bpd a = $$0 -> {
      };

      @Override
      public boolean a(boy $$0) {
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
      public void a(eak $$0, dfn $$1, eaj $$2, int $$3) {
      }

      @Override
      public void b(eak $$0, dfn $$1, eaj $$2, int $$3) {
      }

      @Override
      public void a(float $$0) {
      }

      @Override
      public bpd e() {
         return a;
      }

      @Nullable
      @Override
      public bpd a(dfn $$0, aku<dgh> $$1, String $$2) {
         return null;
      }

      @Override
      public bpd a(dfn $$0, aku<dgh> $$1, jr<enl> $$2) {
         return a;
      }
   }
}
