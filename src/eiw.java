import com.mojang.logging.LogUtils;
import java.io.File;
import java.io.IOException;
import java.util.function.BiFunction;
import java.util.function.Supplier;
import org.slf4j.Logger;

public abstract class eiw {
   private static final Logger a = LogUtils.getLogger();
   private boolean b;

   public abstract sy a(sy var1, in.a var2);

   public void c() {
      this.a(true);
   }

   public void a(boolean $$0) {
      this.b = $$0;
   }

   public boolean d() {
      return this.b;
   }

   public void a(File $$0, in.a $$1) {
      if (this.d()) {
         sy $$2 = new sy();
         $$2.a("data", this.a(new sy(), $$1));
         tn.g($$2);

         try {
            tl.a($$2, $$0.toPath());
         } catch (IOException var5) {
            a.error("Could not save data {}", this, var5);
         }

         this.a(false);
      }
   }

   public static record a<T extends eiw>(Supplier<T> a, BiFunction<sy, in.a, T> b, axs c) {
   }
}
