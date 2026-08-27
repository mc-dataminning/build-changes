import com.mojang.logging.LogUtils;
import java.io.File;
import java.io.IOException;
import java.util.function.Function;
import java.util.function.Supplier;
import org.slf4j.Logger;

public abstract class eec {
   private static final Logger a = LogUtils.getLogger();
   private boolean b;

   public abstract sd a(sd var1);

   public void c() {
      this.a(true);
   }

   public void a(boolean $$0) {
      this.b = $$0;
   }

   public boolean d() {
      return this.b;
   }

   public void a(File $$0) {
      if (this.d()) {
         sd $$1 = new sd();
         $$1.a("data", this.a(new sd()));
         ss.g($$1);

         try {
            sq.a($$1, $$0.toPath());
         } catch (IOException var4) {
            a.error("Could not save data {}", this, var4);
         }

         this.a(false);
      }
   }

   public static record a<T extends eec>(Supplier<T> a, Function<sd, T> b, auw c) {
   }
}
