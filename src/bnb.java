import com.mojang.logging.LogUtils;
import java.net.SocketAddress;
import java.nio.file.Path;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public interface bnb {
   bnb f = (bnb)(Runtime.class.getModule().getLayer().findModule("jdk.jfr").isPresent() ? bna.a() : new bnb.a());

   boolean a(bmz var1);

   Path b();

   boolean c();

   boolean d();

   void a(float var1);

   void a(vq var1, zd<?> var2, SocketAddress var3, int var4);

   void b(vq var1, zd<?> var2, SocketAddress var3, int var4);

   void a(dwa var1, dbn var2, dvz var3, int var4);

   void b(dwa var1, dbn var2, dvz var3, int var4);

   @Nullable
   bne e();

   @Nullable
   bne a(dbn var1, akj<dcg> var2, String var3);

   public static class a implements bnb {
      private static final Logger b = LogUtils.getLogger();
      static final bne a = () -> {
      };

      @Override
      public boolean a(bmz $$0) {
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
      public void a(vq $$0, zd<?> $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void b(vq $$0, zd<?> $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void a(dwa $$0, dbn $$1, dvz $$2, int $$3) {
      }

      @Override
      public void b(dwa $$0, dbn $$1, dvz $$2, int $$3) {
      }

      @Override
      public void a(float $$0) {
      }

      @Override
      public bne e() {
         return a;
      }

      @Nullable
      @Override
      public bne a(dbn $$0, akj<dcg> $$1, String $$2) {
         return null;
      }
   }
}
