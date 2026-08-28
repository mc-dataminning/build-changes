import com.mojang.logging.LogUtils;
import java.net.SocketAddress;
import java.nio.file.Path;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public interface brl {
   brl f = (brl)(Runtime.class.getModule().getLayer().findModule("jdk.jfr").isPresent() ? brk.a() : new brl.a());

   boolean a(brj var1);

   Path b();

   boolean c();

   boolean d();

   void a(float var1);

   void a(vw var1, zl<?> var2, SocketAddress var3, int var4);

   void b(vw var1, zl<?> var2, SocketAddress var3, int var4);

   void a(eew var1, dje var2, eev var3, int var4);

   void b(eew var1, dje var2, eev var3, int var4);

   @Nullable
   bro e();

   @Nullable
   bro a(dje var1, alj<djz> var2, String var3);

   @Nullable
   bro a(dje var1, alj<djz> var2, jg<esd> var3);

   public static class a implements brl {
      private static final Logger b = LogUtils.getLogger();
      static final bro a = $$0 -> {
      };

      @Override
      public boolean a(brj $$0) {
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
      public void a(vw $$0, zl<?> $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void b(vw $$0, zl<?> $$1, SocketAddress $$2, int $$3) {
      }

      @Override
      public void a(eew $$0, dje $$1, eev $$2, int $$3) {
      }

      @Override
      public void b(eew $$0, dje $$1, eev $$2, int $$3) {
      }

      @Override
      public void a(float $$0) {
      }

      @Override
      public bro e() {
         return a;
      }

      @Nullable
      @Override
      public bro a(dje $$0, alj<djz> $$1, String $$2) {
         return null;
      }

      @Override
      public bro a(dje $$0, alj<djz> $$1, jg<esd> $$2) {
         return a;
      }
   }
}
