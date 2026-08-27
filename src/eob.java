import com.mojang.logging.LogUtils;
import java.io.File;
import java.io.IOException;
import java.util.function.BiFunction;
import java.util.function.Supplier;
import org.slf4j.Logger;

public abstract class eob {
   private static final Logger a = LogUtils.getLogger();
   private boolean b;

   public abstract ud a(ud var1, iz.a var2);

   public void c() {
      this.a(true);
   }

   public void a(boolean $$0) {
      this.b = $$0;
   }

   public boolean d() {
      return this.b;
   }

   public void a(File $$0, iz.a $$1) {
      if (this.d()) {
         ud $$2 = new ud();
         $$2.a("data", this.a(new ud(), $$1));
         us.e($$2);

         try {
            uq.a($$2, $$0.toPath());
         } catch (IOException var5) {
            a.error("Could not save data {}", this, var5);
         }

         this.a(false);
      }
   }

   public static record a<T extends eob>(Supplier<T> a, BiFunction<ud, iz.a, T> b, azj c) {
   }
}
