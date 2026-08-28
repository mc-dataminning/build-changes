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

   void a(we var1, zs<?> var2, SocketAddress var3, int var4);

   void b(we var1, zs<?> var2, SocketAddress var3, int var4);

   void a(dzj var1, des var2, dzi var3, int var4);

   void b(dzj var1, des var2, dzi var3, int var4);

   @Nullable
   bpf e();

   @Nullable
   bpf a(des var1, ali<dfm> var2, String var3);

   public static class a implements bpc {
      private static final Logger b = LogUtils.getLogger();
      static final bpf a = () -> {
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
      public void a(we $$0, zs<?> $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void b(we $$0, zs<?> $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void a(dzj $$0, des $$1, dzi $$2, int $$3) {
      }

      @Override
      public void b(dzj $$0, des $$1, dzi $$2, int $$3) {
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
      public bpf a(des $$0, ali<dfm> $$1, String $$2) {
         return null;
      }
   }
}
