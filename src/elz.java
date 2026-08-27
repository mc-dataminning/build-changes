import com.mojang.logging.LogUtils;
import java.io.File;
import java.io.IOException;
import java.util.function.BiFunction;
import java.util.function.Supplier;
import org.slf4j.Logger;

public abstract class elz {
   private static final Logger a = LogUtils.getLogger();
   private boolean b;

   public abstract tm a(tm var1, in.a var2);

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
         tm $$2 = new tm();
         $$2.a("data", this.a(new tm(), $$1));
         ub.f($$2);

         try {
            tz.a($$2, $$0.toPath());
         } catch (IOException var5) {
            a.error("Could not save data {}", this, var5);
         }

         this.a(false);
      }
   }

   public static record a<T extends elz>(Supplier<T> a, BiFunction<tm, in.a, T> b, ayq c) {
   }
}
