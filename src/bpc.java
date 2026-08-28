import com.mojang.logging.LogUtils;
import java.net.SocketAddress;
import java.nio.file.Path;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public interface bpc {
   bpc f = (bpc)(Runtime.class.getModule().getLayer().findModule("jdk.jfr").isPresent() ? bpb.a() : new bpc.a());

   boolean a(bpa var1);

   Path b();

   boolean c();

   boolean d();

   void a(float var1);

   void a(vj var1, yy<?> var2, SocketAddress var3, int var4);

   void b(vj var1, yy<?> var2, SocketAddress var3, int var4);

   void a(eam var1, dfp var2, eal var3, int var4);

   void b(eam var1, dfp var2, eal var3, int var4);

   @Nullable
   bpf e();

   @Nullable
   bpf a(dfp var1, aku<dgj> var2, String var3);

   @Nullable
   bpf a(dfp var1, aku<dgj> var2, jr<enn> var3);

   public static class a implements bpc {
      private static final Logger b = LogUtils.getLogger();
      static final bpf a = $$0 -> {
      };

      @Override
      public boolean a(bpa $$0) {
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
      public void a(eam $$0, dfp $$1, eal $$2, int $$3) {
      }

      @Override
      public void b(eam $$0, dfp $$1, eal $$2, int $$3) {
      }

      @Override
      public void a(float $$0) {
      }

      @Override
      public bpf e() {
         return a;
      }

      @Nullable
      @Override
      public bpf a(dfp $$0, aku<dgj> $$1, String $$2) {
         return null;
      }

      @Override
      public bpf a(dfp $$0, aku<dgj> $$1, jr<enn> $$2) {
         return a;
      }
   }
}
