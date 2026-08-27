import com.mojang.logging.LogUtils;
import java.io.File;
import java.io.IOException;
import java.util.function.Function;
import java.util.function.Supplier;
import org.slf4j.Logger;

public abstract class ebg {
   private static final Logger a = LogUtils.getLogger();
   private boolean b;

   public abstract qs a(qs var1);

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
         qs $$1 = new qs();
         $$1.a("data", this.a(new qs()));
         re.g($$1);

         try {
            rc.a($$1, $$0);
         } catch (IOException var4) {
            a.error("Could not save data {}", this, var4);
         }

         this.a(false);
      }
   }

   public static record a<T extends ebg>(Supplier<T> a, Function<qs, T> b, asq c) {
   }
}
