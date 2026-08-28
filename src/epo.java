import com.mojang.logging.LogUtils;
import java.io.File;
import java.io.IOException;
import java.util.function.BiFunction;
import java.util.function.Supplier;
import org.slf4j.Logger;

public abstract class epo {
   private static final Logger a = LogUtils.getLogger();
   private boolean b;

   public abstract tx a(tx var1, jl.a var2);

   public void c() {
      this.a(true);
   }

   public void a(boolean $$0) {
      this.b = $$0;
   }

   public boolean d() {
      return this.b;
   }

   public void a(File $$0, jl.a $$1) {
      if (this.d()) {
         tx $$2 = new tx();
         $$2.a("data", this.a(new tx(), $$1));
         um.e($$2);

         try {
            uk.a($$2, $$0.toPath());
         } catch (IOException var5) {
            a.error("Could not save data {}", this, var5);
         }

         this.a(false);
      }
   }

   public static record a<T extends epo>(Supplier<T> a, BiFunction<tx, jl.a, T> b, azo c) {
   }
}
