import com.mojang.logging.LogUtils;
import java.io.File;
import java.io.IOException;
import java.util.function.BiFunction;
import java.util.function.Supplier;
import org.slf4j.Logger;

public abstract class eox {
   private static final Logger a = LogUtils.getLogger();
   private boolean b;

   public abstract ur a(ur var1, jk.a var2);

   public void c() {
      this.a(true);
   }

   public void a(boolean $$0) {
      this.b = $$0;
   }

   public boolean d() {
      return this.b;
   }

   public void a(File $$0, jk.a $$1) {
      if (this.d()) {
         ur $$2 = new ur();
         $$2.a("data", this.a(new ur(), $$1));
         vg.e($$2);

         try {
            ve.a($$2, $$0.toPath());
         } catch (IOException var5) {
            a.error("Could not save data {}", this, var5);
         }

         this.a(false);
      }
   }

   public static record a<T extends eox>(Supplier<T> a, BiFunction<ur, jk.a, T> b, bab c) {
   }
}
