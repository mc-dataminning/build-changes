import com.mojang.logging.LogUtils;
import java.net.SocketAddress;
import java.nio.file.Path;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public interface bpb {
   bpb f = (bpb)(Runtime.class.getModule().getLayer().findModule("jdk.jfr").isPresent() ? bpa.a() : new bpb.a());

   boolean a(boz var1);

   Path b();

   boolean c();

   boolean d();

   void a(float var1);

   void a(vj var1, yy<?> var2, SocketAddress var3, int var4);

   void b(vj var1, yy<?> var2, SocketAddress var3, int var4);

   void a(eal var1, dfo var2, eak var3, int var4);

   void b(eal var1, dfo var2, eak var3, int var4);

   @Nullable
   bpe e();

   @Nullable
   bpe a(dfo var1, aku<dgi> var2, String var3);

   @Nullable
   bpe a(dfo var1, aku<dgi> var2, jr<enm> var3);

   public static class a implements bpb {
      private static final Logger b = LogUtils.getLogger();
      static final bpe a = $$0 -> {
      };

      @Override
      public boolean a(boz $$0) {
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
      public void a(eal $$0, dfo $$1, eak $$2, int $$3) {
      }

      @Override
      public void b(eal $$0, dfo $$1, eak $$2, int $$3) {
      }

      @Override
      public void a(float $$0) {
      }

      @Override
      public bpe e() {
         return a;
      }

      @Nullable
      @Override
      public bpe a(dfo $$0, aku<dgi> $$1, String $$2) {
         return null;
      }

      @Override
      public bpe a(dfo $$0, aku<dgi> $$1, jr<enm> $$2) {
         return a;
      }
   }
}
