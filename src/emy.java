import com.mojang.logging.LogUtils;
import java.io.File;
import java.io.IOException;
import java.util.function.BiFunction;
import java.util.function.Supplier;
import org.slf4j.Logger;

public abstract class emy {
   private static final Logger a = LogUtils.getLogger();
   private boolean b;

   public abstract ty a(ty var1, ix.a var2);

   public void c() {
      this.a(true);
   }

   public void a(boolean $$0) {
      this.b = $$0;
   }

   public boolean d() {
      return this.b;
   }

   public void a(File $$0, ix.a $$1) {
      if (this.d()) {
         ty $$2 = new ty();
         $$2.a("data", this.a(new ty(), $$1));
         un.e($$2);

         try {
            ul.a($$2, $$0.toPath());
         } catch (IOException var5) {
            a.error("Could not save data {}", this, var5);
         }

         this.a(false);
      }
   }

   public static record a<T extends emy>(Supplier<T> a, BiFunction<ty, ix.a, T> b, azc c) {
   }
}
