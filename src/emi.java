import com.mojang.logging.LogUtils;
import java.io.File;
import java.io.IOException;
import java.util.function.BiFunction;
import java.util.function.Supplier;
import org.slf4j.Logger;

public abstract class emi {
   private static final Logger a = LogUtils.getLogger();
   private boolean b;

   public abstract to a(to var1, ip.a var2);

   public void c() {
      this.a(true);
   }

   public void a(boolean $$0) {
      this.b = $$0;
   }

   public boolean d() {
      return this.b;
   }

   public void a(File $$0, ip.a $$1) {
      if (this.d()) {
         to $$2 = new to();
         $$2.a("data", this.a(new to(), $$1));
         ud.e($$2);

         try {
            ub.a($$2, $$0.toPath());
         } catch (IOException var5) {
            a.error("Could not save data {}", this, var5);
         }

         this.a(false);
      }
   }

   public static record a<T extends emi>(Supplier<T> a, BiFunction<to, ip.a, T> b, ays c) {
   }
}
