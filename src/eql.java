import com.mojang.logging.LogUtils;
import java.io.File;
import java.io.IOException;
import java.util.function.BiFunction;
import java.util.function.Supplier;
import org.slf4j.Logger;

public abstract class eql {
   private static final Logger a = LogUtils.getLogger();
   private boolean b;

   public abstract uk a(uk var1, jc.a var2);

   public void c() {
      this.a(true);
   }

   public void a(boolean $$0) {
      this.b = $$0;
   }

   public boolean d() {
      return this.b;
   }

   public void a(File $$0, jc.a $$1) {
      if (this.d()) {
         uk $$2 = new uk();
         $$2.a("data", this.a(new uk(), $$1));
         uz.e($$2);

         try {
            ux.a($$2, $$0.toPath());
         } catch (IOException var5) {
            a.error("Could not save data {}", this, var5);
         }

         this.a(false);
      }
   }

   public static record a<T extends eql>(Supplier<T> a, BiFunction<uk, jc.a, T> b, azs c) {
   }
}
