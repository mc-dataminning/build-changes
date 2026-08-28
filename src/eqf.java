import com.mojang.logging.LogUtils;
import java.io.File;
import java.io.IOException;
import java.util.function.BiFunction;
import java.util.function.Supplier;
import org.slf4j.Logger;

public abstract class eqf {
   private static final Logger a = LogUtils.getLogger();
   private boolean b;

   public abstract ua a(ua var1, jo.a var2);

   public void c() {
      this.a(true);
   }

   public void a(boolean $$0) {
      this.b = $$0;
   }

   public boolean d() {
      return this.b;
   }

   public void a(File $$0, jo.a $$1) {
      if (this.d()) {
         ua $$2 = new ua();
         $$2.a("data", this.a(new ua(), $$1));
         up.e($$2);

         try {
            un.a($$2, $$0.toPath());
         } catch (IOException var5) {
            a.error("Could not save data {}", this, var5);
         }

         this.a(false);
      }
   }

   public static record a<T extends eqf>(Supplier<T> a, BiFunction<ua, jo.a, T> b, azv c) {
   }
}
